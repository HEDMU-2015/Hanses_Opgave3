package security.api;

import java.util.List;

import organization.domain.OrganizationUnit;
import security.domain.Permission;
import security.domain.User;
import security.domain.UserPermission;


/**
 * Interface (API) for service Security
 * 
 * @author hi
 *
 */
public interface Security {
	
	/**
	 * login
	 * 
	 * @param userId
	 * @param encryptedPassword
	 * @return true if userid and password is correct
	 */
	public boolean login(String userId, String encryptedPassword);
	
	/**
	 * 
	 * @param userId
	 * @return
	 */
	public User getUser(String userId);
	
	/**
	 * 
	 * @return The id of the user logged in, or null if no user is logged in
	 */
	public String getIdOfUserLoggedIn();
	
	public Permission getPermission(int permissionId);

	public Permission getPermission(String permissionName);
	
	public List<UserPermission> getAllPermissionsForUser(String userId);

	public OrganizationUnit getOrganizationUnitForUserPermission(String userId, int permissionId);
	
	public boolean hasUserAccessToOrganizationUnit(String userId, int permissionId, long organizationId);
	
}
