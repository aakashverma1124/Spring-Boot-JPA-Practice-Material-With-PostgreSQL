package com.necindia.rolemanagement.mappingmodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//=============================================================================
//	A Role Top Feature Entity will map the Top Features with the Role, i.e:
//	It answers which Role is related to which Top Feature(s).
//=============================================================================


@Entity
@Table(name = "role_top_features")
public class RoleTopFeatures {

	@Id
	@Column(name = "role_top_feature_id")
	private int roleTopFeatureId;
	
	public RoleTopFeatures() {
		
	}

	public int getRoleTopFeatureId() {
		return roleTopFeatureId;
	}

	public void setRoleTopFeatureId(int roleTopFeatureId) {
		this.roleTopFeatureId = roleTopFeatureId;
	}

	public RoleTopFeatures(int roleTopFeatureId) {
		super();
		this.roleTopFeatureId = roleTopFeatureId;
	}
}
