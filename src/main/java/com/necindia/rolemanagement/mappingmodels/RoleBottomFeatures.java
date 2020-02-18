package com.necindia.rolemanagement.mappingmodels;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.necindia.rolemanagement.models.BottomFeatures;

@Entity
@Table(name = "role_bottom_features")
@JsonIgnoreProperties(ignoreUnknown = true, allowGetters = true)
public class RoleBottomFeatures {
	
	@Id
	@Column(name = "role_bottom_feature_id")
	private int roleBottomFeatureId;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_role_mid_feature_id", referencedColumnName = "role_mid_feature_id")
	private RoleMidFeatures roleMidFeature;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "fk_bottom_feature_id", referencedColumnName = "bottom_feature_id")
	private BottomFeatures bottomFeatures;
	
	public RoleBottomFeatures() {
		
	}

	@JsonIgnore
	public int getRoleBottomFeatureId() {
		return roleBottomFeatureId;
	}

	public void setRoleBottomFeatureId(int roleBottomFeatureId) {
		this.roleBottomFeatureId = roleBottomFeatureId;
	}

	
	public RoleMidFeatures getRoleMidFeature() {
		return roleMidFeature;
	}

	public void setRoleMidFeature(RoleMidFeatures roleMidFeature) {
		this.roleMidFeature = roleMidFeature;
	}

	public BottomFeatures getBottomFeatures() {
		return bottomFeatures;
	}

	public void setBottomFeatures(BottomFeatures BottomFeatures) {
		this.bottomFeatures = BottomFeatures;
	}

	@Override
	public String toString() {
		return "RoleBottomFeatures [roleBottomFeatureId=" + roleBottomFeatureId + ", roleMidFeature=" + roleMidFeature
				+ ", bottomFeatures=" + bottomFeatures + "]";
	}
	
}
