package com.necindia.rolemanagement.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "mid_features")
public class MidFeatures {

	@Id
	@Column(name = "mid_feature_id")
	private int midFeatureId;
	
	@Column(name = "mid_feature_name")
	private String midFeatureName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_mid_feature_id", referencedColumnName = "mid_feature_id")
	private List<BottomFeatures> bottomFeatures;
	
	public List<BottomFeatures> getBottomFeatures() {
		return bottomFeatures;
	}

	public void setBottomFeatures(List<BottomFeatures> bottomFeatures) {
		this.bottomFeatures = bottomFeatures;
	}

	public MidFeatures() {
		
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

	public MidFeatures(int midFeatureId, String midFeatureName, List<BottomFeatures> bottomFeatures) {
		super();
		this.midFeatureId = midFeatureId;
		this.midFeatureName = midFeatureName;
		this.bottomFeatures = bottomFeatures;
	}
	
	
	
	
	

}
