package com.necindia.rolemanagement.mappingmodels;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


//===============================================================================
//	A Role Entity will contain all the Roles.
//===============================================================================

@Entity
@Table(name = "role")
@JsonIgnoreProperties(ignoreUnknown = true, allowGetters = true)
public class Role {
	
	@Id
	@Column(name = "role_id")
	private int roleId;
	
	@Column(name = "role_name")
	private String roleName;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "role", fetch = FetchType.EAGER)
	List<RoleTopFeatures> listOfRoleTop;
	

	public Role(int roleId, String roleName, List<RoleTopFeatures> listOfRoleTop) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.listOfRoleTop = listOfRoleTop;
	}


	public List<RoleTopFeatures> getListOfRoleTop() {
		return listOfRoleTop;
	}

	public void setListOfRoleTop(List<RoleTopFeatures> listOfRoleTop) {
		this.listOfRoleTop = listOfRoleTop;
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

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName + ", listOfRoleTop=" + listOfRoleTop + "]";
	}
	
	
	

}
