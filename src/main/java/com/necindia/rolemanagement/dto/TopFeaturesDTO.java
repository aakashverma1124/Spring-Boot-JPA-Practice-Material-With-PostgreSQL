package com.necindia.rolemanagement.dto;

import java.util.List;


public class TopFeaturesDTO {
	
	private int topFeatureId;
	
	private String topFeatureName;
	
	public TopFeaturesDTO() {
		
	}
	
	public int getTopFeatureId() {
		return topFeatureId;
	}

	public TopFeaturesDTO(int topFeatureId, String topFeatureName, List<MidFeaturesDTO> midFeatures) {
		super();
		this.topFeatureId = topFeatureId;
		this.topFeatureName = topFeatureName;
		this.midFeatures = midFeatures;
	}

	public void setTopFeatureId(int topFeatureId) {
		this.topFeatureId = topFeatureId;
	}

	public String getTopFeatureName() {
		return topFeatureName;
	}

	public void setTopFeatureName(String topFeatureName) {
		this.topFeatureName = topFeatureName;
	}

	public List<MidFeaturesDTO> getMidFeatures() {
		return midFeatures;
	}

	public void setMidFeatures(List<MidFeaturesDTO> midFeatures) {
		this.midFeatures = midFeatures;
	}

	private List<MidFeaturesDTO> midFeatures;
	
	
}
