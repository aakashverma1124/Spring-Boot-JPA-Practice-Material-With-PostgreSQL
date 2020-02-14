package com.necindia.rolemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.necindia.rolemanagement.models.TopFeatures;
import com.necindia.rolemanagement.repository.TopFeaturesRepository;

@RestController
@RequestMapping("/role-management")
public class TopFeatureController {
	
	@Autowired
	private TopFeaturesRepository topFeatureRepository;	
	
	@GetMapping("/topfeatures")
	public List<TopFeatures> getTopFeatures() {
		return topFeatureRepository.findAll();
	}
	
	@GetMapping("/topfeatures/{id}")
    public ResponseEntity <TopFeatures> getTopFeatureById(
        @PathVariable(value = "id") Integer topFeatureId) throws Exception {
        TopFeatures topFeature = topFeatureRepository.findById(topFeatureId)
            .orElseThrow(() -> new Exception("Top Feature not found for Id:: " + topFeatureId));
        return ResponseEntity.ok().body(topFeature);
    }
	
}
