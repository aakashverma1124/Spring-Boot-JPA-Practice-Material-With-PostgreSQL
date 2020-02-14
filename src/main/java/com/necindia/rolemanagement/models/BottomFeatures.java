package com.necindia.rolemanagement.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


//====================================================================================
//	It has the list of all the Bottom Features.
//	Also, it has Foreign Key column for Mid Features.
//====================================================================================


@Entity
@Table(name = "bottom_features")
public class BottomFeatures {

	@Id
	@Column(name = "bottom_feature_id")
	private int bottomFeatureId;
	
	@Column(name = "bpttom_feature_name")
	private String bottomFeatureName;
	
	public BottomFeatures() {
		
	}

	public int getBottomFeatureId() {
		return bottomFeatureId;
	}

	public void setBottomFeatureId(int bottomFeatureId) {
		this.bottomFeatureId = bottomFeatureId;
	}

	public String getBottomFeatureName() {
		return bottomFeatureName;
	}

	public void setBottomFeatureName(String bottomFeatureName) {
		this.bottomFeatureName = bottomFeatureName;
	}

	public BottomFeatures(int bottomFeatureId, String bottomFeatureName) {
		super();
		this.bottomFeatureId = bottomFeatureId;
		this.bottomFeatureName = bottomFeatureName;

	}
	
	


	
	
	

}
