package com.necindia.rolemanagement.mappingmodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.necindia.rolemanagement.models.MidFeatures;

@Entity
@Table(name = "role_mid_features")
@JsonIgnoreProperties(ignoreUnknown = true, allowGetters = true)
public class RoleMidFeatures {
	
	@Id
	@Column(name = "role_mid_feature_id")
	private int roleMidFeatureId;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "fk_role_top_feature_id", referencedColumnName = "role_top_feature_id")
	private RoleTopFeatures roleTopFeature;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "fk_mid_feature_id", referencedColumnName = "mid_feature_id")
	private MidFeatures midFeatures;

	@JsonIgnore
	public int getRoleMidFeatureId() {
		return roleMidFeatureId;
	}

	public void setRoleMidFeatureId(int roleMidFeatureId) {
		this.roleMidFeatureId = roleMidFeatureId;
	}

	public RoleTopFeatures getRoleTopFeature() {
		return roleTopFeature;
	}

	public void setRoleTopFeature(RoleTopFeatures roleTopFeature) {
		this.roleTopFeature = roleTopFeature;
	}

	public MidFeatures getMidFeatures() {
		return midFeatures;
	}

	public void setMidFeatures(MidFeatures midFeatures) {
		this.midFeatures = midFeatures;
	}

	@Override
	public String toString() {
		return "RoleMidFeatures [roleMidFeatureId=" + roleMidFeatureId + ", roleTopFeature=" + roleTopFeature
				+ ", midFeatures=" + midFeatures + "]";
	}
	
	

}
