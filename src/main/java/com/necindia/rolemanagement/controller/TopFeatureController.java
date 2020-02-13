package com.necindia.rolemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.necindia.rolemanagement.models.TopFeatures;
import com.necindia.rolemanagement.repository.TopFeaturesRepository;

@RestController
@RequestMapping("/role-management")
public class TopFeatureController {
	
	@Autowired
	private TopFeaturesRepository topFeatureRepository;	
	
	@GetMapping("/topFeatures")
	public List<TopFeatures> getTopFeatures() {
		return topFeatureRepository.findAll();
	}
	
	@PostMapping("/addTopFeatures")
	public TopFeatures addTopFeature(TopFeatures topFeature) {
		return topFeatureRepository.save(topFeature);
	}
	
	
	
}
