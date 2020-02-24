package com.necindia.rolemanagement.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.necindia.rolemanagement.SpringJPADao;
import com.necindia.rolemanagement.dto.TopFeaturesDTO;
//import com.necindia.rolemanagement.SpringJPADao;
import com.necindia.rolemanagement.models.TopFeatures;
import com.necindia.rolemanagement.repository.TopFeaturesRepository;

@RestController
@RequestMapping("/rolemanagement")
public class TopFeatureController {
	
	@Autowired
	private TopFeaturesRepository topFeatureRepository;	
	
	@Autowired
	private SpringJPADao springJPADao;
	
	@GetMapping("/features")
	public List<TopFeaturesDTO> getTopFeatures()  throws Exception {
		
		//springJPADao.getAllData();
		List<TopFeatures> data=topFeatureRepository.findAll();
		List<TopFeaturesDTO> dataDTO=new ArrayList<TopFeaturesDTO>(); 
		data.stream().forEach(obj->{
			TopFeaturesDTO topFeaturesDTO=springJPADao.getAllData(obj);
			dataDTO.add(topFeaturesDTO);
		});
		
		return dataDTO;
	}
	
	@GetMapping("/topfeatures/{id}")
    public ResponseEntity <TopFeatures> getTopFeatureById(
        @PathVariable(value = "id") Integer topFeatureId) throws Exception {
        TopFeatures topFeature = topFeatureRepository.findById(topFeatureId)
            .orElseThrow(() -> new Exception("Top Feature not found for Id:: " + topFeatureId));
        return ResponseEntity.ok().body(topFeature);
    }

	
}
