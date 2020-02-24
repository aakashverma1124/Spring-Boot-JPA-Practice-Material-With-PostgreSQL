package com.necindia.rolemanagement.mappingmodels;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.necindia.rolemanagement.models.TopFeatures;

//=============================================================================
//	A Role Top Feature Entity will map the Top Features with the Role, i.e:
//	It answers which Role is related to which Top Feature(s).
//=============================================================================


@Entity
@Table(name = "role_top_features")
@JsonIgnoreProperties(ignoreUnknown = true, allowGetters = true)
public class RoleTopFeatures {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "role_top_feature_id", unique = true, nullable = false)
	private int roleTopFeatureId;
//	
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = Role.class)
	@JoinColumn(name = "fk_role_id", referencedColumnName = "role_id")
	private Role role;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "fk_top_feature_id", referencedColumnName = "top_feature_id")
	private TopFeatures topFeatures;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
	@JoinColumn(name = "fk_role_top_feature_id", referencedColumnName = "role_top_feature_id")
	List<RoleMidFeatures> listOfRoleMid;
	
	
	public RoleTopFeatures(int roleTopFeatureId, Role role, TopFeatures topFeatures,
			List<RoleMidFeatures> listOfRoleMid) {
		super();
		this.roleTopFeatureId = roleTopFeatureId;
		this.role = role;
		this.topFeatures = topFeatures;
		this.listOfRoleMid = listOfRoleMid;
	}

	public List<RoleMidFeatures> getListOfRoleMid() {
		return listOfRoleMid;
	}

	public void setListOfRoleMid(List<RoleMidFeatures> listOfRoleMid) {
		this.listOfRoleMid = listOfRoleMid;
	}

	public RoleTopFeatures() {
		
	}

	@JsonIgnore
	public int getRoleTopFeatureId() {
		return roleTopFeatureId;
	}

	public void setRoleTopFeatureId(int roleTopFeatureId) {
		this.roleTopFeatureId = roleTopFeatureId;
	}

	@JsonIgnore
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public TopFeatures getTopFeatures() {
		return topFeatures;
	}

	@Override
	public String toString() {
		return "RoleTopFeatures [roleTopFeatureId=" + roleTopFeatureId + ", role=" + role + ", topFeatures="
				+ topFeatures + ", listOfRoleMid=" + listOfRoleMid + "]";
	}

	public void setTopFeatures(TopFeatures topFeatures) {
		this.topFeatures = topFeatures;
	}

	
	
	
	

}
