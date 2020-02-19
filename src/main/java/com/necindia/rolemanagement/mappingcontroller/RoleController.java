package com.necindia.rolemanagement.mappingcontroller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/getRole/{id}")
    public Role getRoleById(
        @PathVariable(value = "id") Integer roleId) throws Exception {
        Role role = roleRepository.findById(roleId)
            .orElseThrow(() -> new Exception("Role is not found for Id:: " + roleId));
        return role;
    }
	
	@PostMapping("/addRole")
    public Role createRole(@Valid @RequestBody Role role) {
        return roleRepository.save(role);
    }
	
	@PutMapping("/updateRole/{id}")
    public ResponseEntity<Role> updateRole(@PathVariable(value = "id") Integer roleId,
         @Valid @RequestBody Role roleDetails) throws Exception {
        Role role = roleRepository.findById(roleId)
        .orElseThrow(() -> new Exception("Role not found for id :: " + roleId));
       role.setRoleId(roleDetails.getRoleId());
       role.setRoleName(roleDetails.getRoleName());
       role.setListOfRoleTop(roleDetails.getListOfRoleTop());
       final Role updateRole = roleRepository.save(role);
       return ResponseEntity.ok(updateRole);
    }
	
	@DeleteMapping("/deleteRole/{id}")
    public Map<String, Boolean> deleteRole(@PathVariable(value = "id") Integer roleId)
         throws Exception {
        Role role = roleRepository.findById(roleId)
       .orElseThrow(() -> new Exception("Role not found for this id :: " + roleId));

        roleRepository.delete(role);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
	
}
