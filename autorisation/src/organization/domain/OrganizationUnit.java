package organization.domain;

public class OrganizationUnit {
	private long id;
	private String name;
	private long parentId;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getParentId() {
		return parentId;
	}
	public void setParentId(long parentId) {
		this.parentId = parentId;
	}
	
	@Override
	public String toString() {
		return "OrganizationUnit [id=" + id + ", name=" + name + ", parentId=" + parentId + "]";
	}

}
