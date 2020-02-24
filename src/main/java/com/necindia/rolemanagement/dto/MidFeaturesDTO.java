package com.necindia.rolemanagement.dto;

import java.util.List;

public class MidFeaturesDTO {

	private int midFeatureId;

	private String midFeatureName;

	public MidFeaturesDTO() {
	}

	public MidFeaturesDTO(int midFeatureId, String midFeatureName,
			List<BottomFeaturesDTO> bottomFeatures) {
		super();
		this.midFeatureId = midFeatureId;
		this.midFeatureName = midFeatureName;
		//this.topFeatures = topFeatures;
		this.bottomFeatures = bottomFeatures;
	}

	public int getMidFeatureId() {
		return midFeatureId;
	}

	public void setMidFeatureId(int midFeatureId) {
		this.midFeatureId = midFeatureId;
	}

	public String getMidFeatureName() {
		return midFeatureName;
	}

	public void setMidFeatureName(String midFeatureName) {
		this.midFeatureName = midFeatureName;
	}



	public List<BottomFeaturesDTO> getBottomFeatures() {
		return bottomFeatures;
	}

	public void setBottomFeatures(List<BottomFeaturesDTO> bottomFeatures) {
		this.bottomFeatures = bottomFeatures;
	}



	private List<BottomFeaturesDTO> bottomFeatures;
}
