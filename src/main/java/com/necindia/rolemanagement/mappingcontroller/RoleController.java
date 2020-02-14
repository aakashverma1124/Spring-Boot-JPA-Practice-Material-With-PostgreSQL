package com.necindia.rolemanagement.mappingcontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.necindia.rolemanagement.mappingmodels.Role;
import com.necindia.rolemanagement.mappingmodels.RoleTopFeatures;
import com.necindia.rolemanagement.mappingrepository.RoleRepository;
import com.necindia.rolemanagement.mappingrepository.RoleTopFeaturesRepository;

@RestController
@RequestMapping("/roles")
public class RoleController {

	@Autowired
	private RoleRepository roleRepository;
	
	@GetMapping("/getRoles")
	public List<Role> getAllRoles() {
		return roleRepository.findAll();
	}
	
//	@GetMapping("/getRoles/{id}")
//    public ResponseEntity <RoleTopFeatures> getRoleById(
//        @PathVariable(value = "id") Integer roleId) throws Exception {
//        RoleTopFeatures roleTopFeature = roleTopFeatureRepository.findById(roleId)
//            .orElseThrow(() -> new Exception("Role is not found for Id:: " + roleId));
//        return ResponseEntity.ok().body(roleTopFeature);
//    }
	
//	@PostMapping("/addRoles")
//    public Role createRole(@Valid @RequestBody Role role) {
//        return roleRepository.save(role);
//    }
	
	
}
