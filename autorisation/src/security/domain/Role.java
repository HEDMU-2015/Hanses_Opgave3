package security.domain;

import java.util.ArrayList;
import java.util.List;

public class Role {
	private int id;
	private String name;
	private List<Permission> permissions;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Permission> getPermissions() {
		if (permissions == null) {
			permissions = new ArrayList<>();
		}
		return permissions;
	}
	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", permissions=" + permissions + "]";
	}

}
