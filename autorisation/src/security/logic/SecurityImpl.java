package security.logic;

import java.util.List;
import java.util.Optional;

import organization.domain.OrganizationUnit;
import security.api.Security;
import security.domain.Permission;
import security.domain.User;
import security.domain.UserPermission;

public class SecurityImpl implements Security {
	DataAcces da;
	SecurityDataImpl mapper = new SecurityDataImpl();

	@Override
	public boolean login(String userId, String encryptedPassword) {
		da = new DataAccess();
		return new LogicTrans<Boolean>.transaction(()->checkUser(userid, encryptedPassword));
	}
	
	private boolean checkUser(String userId, String encryptedPassword) {
		boolean rc = false;
		Optional<User> user = mapper.getUser(da, userId, encryptedPassword);
		if (user.isPresent()) {
			rc = true;
			UserLoggedInEager.instance().setId(userId);
		}
		return rc;
		
	}

	@Override
	public User getUser(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getIdOfUserLoggedIn() {
		return UserLoggedInEager.instance().getId();
	}

	@Override
	public Permission getPermission(int permissionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Permission getPermission(String permissionName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserPermission> getAllPermissionsForUser(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrganizationUnit getOrganizationUnitForUserPermission(String userId, int permissionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasUserAccessToOrganizationUnit(String userId, int permissionId, long organizationId) {
		// TODO Auto-generated method stub
		return false;
	}

}
