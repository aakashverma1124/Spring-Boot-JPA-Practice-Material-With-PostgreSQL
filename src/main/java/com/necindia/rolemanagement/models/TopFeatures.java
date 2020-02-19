package com.necindia.rolemanagement.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/*====================================================================================
	It has the list of all the Top Features.
	Also, it has OneToMany mapping with the Mid Features Entity which creates a 
	Foreign Key Column in Mid Features Entity.
====================================================================================
*/
@Entity
@Table(name = "top_features")
@JsonIgnoreProperties(ignoreUnknown = true, allowGetters = true)
public class TopFeatures {
	
	@Id
	@Column(name = "top_feature_id")
	private int topFeatureId;
	
	@Column(name = "top_feature_name")
	private String topFeatureName;
	
	@OneToMany(fetch = FetchType.LAZY)
	private List<MidFeatures> midFeatures;
	
	public TopFeatures() {
		super();
	}

//	public TopFeatures(int topFeatureId, String topFeatureName, List<MidFeatures> midFeatures) {
//		super(); 
//		this.topFeatureId = topFeatureId;
//		this.topFeatureName = topFeatureName;
//		//this.midFeatures = midFeatures;
//	}

	
	public int getTopFeatureId() {
		return topFeatureId;
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

	//@JsonIgnore
	public List<MidFeatures> getMidFeatures() {
		return midFeatures;
	}

	public void setMidFeatures(List<MidFeatures> midFeatures) {
		this.midFeatures = midFeatures;
	}

	@Override
	public String toString() {
		return "TopFeatures [topFeatureId=" + topFeatureId + ", topFeatureName=" + topFeatureName + ", midFeatures="
				+ " "+ "]";
	}
	
	
}
