package com.necindia.rolemanagement.mappingmodels;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


//===============================================================================
//	A Role Entity will contain all the Roles.
//	Also, it has OneToMany mapping with the Role Top Feature Entity which creates
//	a Foreign Key Column in Role Top Features Entity.
//===============================================================================

@Entity
@Table(name = "role")
public class Role {
	
	@Id
	@Column(name = "role_id")
	private int roleId;
	
	@Column(name = "role_name")
	private String roleName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_role_id", referencedColumnName = "role_id")
	private List<RoleTopFeatures> roleTopFeature;

	public Role(int roleId, String roleName, List<RoleTopFeatures> roleTopFeature) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.roleTopFeature = roleTopFeature;	
	}

	public Role() {
		
	}
	
	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<RoleTopFeatures> getRoleTopFeature() {
		return roleTopFeature;
	}

	public void setRoleTopFeature(List<RoleTopFeatures> roleTopFeature) {
		this.roleTopFeature = roleTopFeature;
	}	
	

}
