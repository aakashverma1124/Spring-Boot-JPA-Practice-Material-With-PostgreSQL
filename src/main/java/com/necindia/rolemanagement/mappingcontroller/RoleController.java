package com.necindia.rolemanagement.mappingcontroller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.necindia.rolemanagement.mappingmodels.Role;
import com.necindia.rolemanagement.mappingrepository.RoleRepository;

@RestController
@RequestMapping("/roles")
public class RoleController {

	@Autowired
	private RoleRepository roleRepository;
	
	@GetMapping("/getRoles")
	public List<Role> getAllRoles() {
		return roleRepository.findAll();
	}
	
	@GetMapping("/getRoles/{id}")
    public Role getRoleById(
        @PathVariable(value = "id") Integer roleId) throws Exception {
        Role role = roleRepository.findById(roleId)
            .orElseThrow(() -> new Exception("Role is not found for Id:: " + roleId));
        return role;
    }
	
	@PostMapping("/addRoles")
    public Role createRole(@Valid @RequestBody Role role) {
        return roleRepository.save(role);
    }
	
	
}
