package organization.api;

import java.util.List;

import organization.domain.OrganizationUnit;

/**
 * Interface (API) for service Organization
 *  
 * @author hi
 *
 */
public interface Organization {
	/**
	 * Get the OrganizationUnit associated with a unique id
	 * 
	 * @param id
	 * @return OrganizationUnit associated with key id
	 */
	public OrganizationUnit getOrganizationUnit(long id);
	
	/**
	 * Get the children of the OrganizationUnit associated with a unique key
	 * 
	 * @param id
	 * @return List of OrganizationUnit
	 */
	public List<OrganizationUnit> getChildren(long id);
	
	/**
	 * Get all id's of children (all levels) of the OrganizationUnit associated with a unique key
	 * 
	 * @param id
	 * @return List of id's of (all) children
	 */
	public List<Long> getAllChildren(long id);
	
	/**
	 * Get all OrganizationUnit's witout parents (Top-level)
	 * 
	 * @return List of Top-level OrganizationUnits
	 */
	public List<OrganizationUnit> getAllOrganizationsWithoutParents();
	
	/**
	 * Get all OrganizationUnit's who's name contains the supplied search-string
	 * 
	 * @param search
	 * @return List of OrganizationUnit's containing search-string in name
	 */
	public List<OrganizationUnit> searchOrganization(String search);

}
