package com.necindia.rolemanagement.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.necindia.rolemanagement.mappingmodels.RoleTopFeatures;

//====================================================================================
//	It has the list of all the Top Features.
//	Also, it has OneToMany mapping with the Mid Features Entity and Role Top Feature
//	Entity which creates a Foreign Key Column in Mid Features Entity and 
//	Role Top Feature Entity respectively.
//====================================================================================

@Entity
@Table(name = "top_features")
public class TopFeatures {
	
	@Id
	@Column(name = "top_feature_id")
	private int topFeatureId;
	
	@Column(name = "top_feature_name")
	private String topFeatureName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_top_feature_id", referencedColumnName = "top_feature_id")
	private List<MidFeatures> midFeatures;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_top_feature_id", referencedColumnName = "top_feature_id")
	private List<RoleTopFeatures> roleTopFeature;
	
	public TopFeatures() {
		super();
	}

	public TopFeatures(int topFeatureId, String topFeatureName, List<MidFeatures> midFeatures, List<RoleTopFeatures> roleTopFeature) {
		super(); 
		this.topFeatureId = topFeatureId;
		this.topFeatureName = topFeatureName;
		this.midFeatures = midFeatures;
		this.roleTopFeature = roleTopFeature;
	}

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

	public List<MidFeatures> getMidFeatures() {
		return midFeatures;
	}

	public void setMidFeatures(List<MidFeatures> midFeatures) {
		this.midFeatures = midFeatures;
	}

	public List<RoleTopFeatures> getRoleTopFeature() {
		return roleTopFeature;
	}

	public void setRoleTopFeature(List<RoleTopFeatures> roleTopFeature) {
		this.roleTopFeature = roleTopFeature;
	}	
	
}
