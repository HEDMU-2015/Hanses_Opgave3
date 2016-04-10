package security.logic;

import java.util.List;
import java.util.Optional;

import organization.domain.OrganizationUnit;
import security.api.Security;
import security.data.SecurityDataMapperImpl;
import security.domain.Permission;
import security.domain.User;
import security.domain.UserPermission;
import util.DataAccess;
import util.LogicTrans;

public class SecurityImpl implements Security {
	SecurityDataMapperImpl mapper = new SecurityDataMapperImpl();

	@Override
	public boolean login(String userId, String encryptedPassword) {
		DataAccess da = new DataAccess();
		return new LogicTrans<Boolean>(da).transaction(()->checkUser(da, userId, encryptedPassword));
	}
	
	private Boolean checkUser(DataAccess da, String userId, String encryptedPassword) {
		boolean rc = false;
		Optional<User> user = mapper.getUser(da, userId, encryptedPassword);
		if (user.isPresent()) {
			rc = true;
			UserLoggedInEager.instance().setUserid(userId);
		}
		return rc;
		
	}

	@Override
	public User getUser(String userId) {
		DataAccess da = new DataAccess();
		Optional<User> user = new LogicTrans<Optional<User>>(da).transaction(()->mapper.getUser(da, userId));
		if (user.isPresent()) {
			return user.get();
		} else {
			throw new RuntimeException("User with id = " + userId + " not found");
		}
	}

	@Override
	public String getIdOfUserLoggedIn() {
		return UserLoggedInEager.instance().getUserid();
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
