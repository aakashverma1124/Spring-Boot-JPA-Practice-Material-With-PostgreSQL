package com.necindia.rolemanagement.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/*====================================================================================
	It has the list of all the Mid Features.
	Also, it has Foreign Key column for Top Features.
	Also, it has OneToMany mapping with the Bottom Features Entity and Role Mid Feature
	Entity which creates a Foreign Key Column in Bottom Features Entity and 
	Role Bottom Feature Entity respectively.
====================================================================================
*/

@Entity
@Table(name = "mid_features")
@JsonIgnoreProperties(ignoreUnknown = true, allowGetters = true)
public class MidFeatures {

	@Id
	@Column(name = "mid_feature_id")
	private int midFeatureId;

	@Column(name = "mid_feature_name")
	private String midFeatureName;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_top_feature_id", referencedColumnName = "top_feature_id")
	private TopFeatures topFeatures;

	@OneToMany(fetch = FetchType.LAZY)
	private List<BottomFeatures> bottomFeatures;

	public TopFeatures getTopFeatures() {
		return topFeatures;
	}

	public void setTopFeatures(TopFeatures topFeatures) {
		this.topFeatures = topFeatures;
	}

	@JsonIgnore
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
 
	@Override
	public String toString() {
		return "MidFeatures [midFeatureId=" + midFeatureId + ", midFeatureName=" + midFeatureName + ", bottomFeatures="
				+ bottomFeatures + "]";
	}

}
