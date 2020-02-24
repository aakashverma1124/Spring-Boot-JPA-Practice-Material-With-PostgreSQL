package com.necindia.rolemanagement.dto;

public class BottomFeaturesDTO {

	private int bottomFeatureId;
	
	private String  bottomFeatureName;
	
	public String getBottomFeatureName() {
		return bottomFeatureName;
	}

	public void setBottomFeatureName(String bottomFeatureName) {
		this.bottomFeatureName = bottomFeatureName;
	}

	public BottomFeaturesDTO() {
	}

	public BottomFeaturesDTO(int bottomFeatureId, String bottomFeatureName) {
		super();
		this.bottomFeatureId = bottomFeatureId;
		this.bottomFeatureName = bottomFeatureName;
	}

	public int getBottomFeatureId() {
		return bottomFeatureId;
	}

	public void setBottomFeatureId(int bottomFeatureId) {
		this.bottomFeatureId = bottomFeatureId;
	}

	

	
}
