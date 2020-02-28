package com.necindia.rolemanagement;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.necindia.rolemanagement.dto.RoleDTO;
import com.necindia.rolemanagement.dto.TopFeaturesDTO;
import com.necindia.rolemanagement.mappingmodels.Role;
import com.necindia.rolemanagement.models.TopFeatures;

@Service
public class SpringJPADao {

	@PersistenceContext
	private EntityManager em;
	
	@Autowired
	ModelMapper modelMapper;
	
	
	public TopFeaturesDTO getAllData(TopFeatures topFeatures){
		
		
		 TopFeaturesDTO topFeaturesDTO = modelMapper.map(topFeatures, TopFeaturesDTO.class);
		    return topFeaturesDTO;
	
		
	}
	
	public RoleDTO getAllRoles(Role obj) {
		RoleDTO roles = modelMapper.map(obj, RoleDTO.class);
		return roles;
	}
}
