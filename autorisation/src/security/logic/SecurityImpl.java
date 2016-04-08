package security.logic;

import java.util.List;
import java.util.Optional;

import organization.domain.OrganizationUnit;
import security.api.Security;
import security.domain.Permission;
import security.domain.User;
import security.domain.UserPermission;

public class SecurityImpl implements Security {
	SecurityDataImpl mapper = new SecurityDataImpl();

	@Override
	public boolean login(String userId, String encryptedPassword) {
		DataAccess da = new DataAccess();
		return new LogicTrans<Boolean>(da).transaction(()->checkUser(userid, encryptedPassword));
	}
	
	private Boolean checkUser(String userId, String encryptedPassword) {
		boolean rc = false;
		Optional<User> ouser = mapper.getUser(da, userId, encryptedPassword);
		if (ouser.isPresent()) {
			rc = true;
			User user = new User();
			user.setId(userId);
			UserLoggedInEager.instance().setUser(user);
		}
		return rc;
		
	}

	@Override
	public User getUser(String userId) {
		DataAccess da = new DataAccess();
		return new LogicTrans<User>(da).transaction(()->mapper.getUser(da, userId));
	}

	@Override
	public String getIdOfUserLoggedIn() {
		return UserLoggedInEager.instance().getUser().getId();
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
