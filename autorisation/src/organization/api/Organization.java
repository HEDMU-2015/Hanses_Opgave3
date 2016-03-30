package organization.api;

import java.util.List;

import organization.domain.OrganizationUnit;

public interface Organization {
	
	public OrganizationUnit getOrganizationUnit(long id);
	
	public List<OrganizationUnit> getChildren(long id);

	public List<Long> getAllChildren(long id);
	
}
