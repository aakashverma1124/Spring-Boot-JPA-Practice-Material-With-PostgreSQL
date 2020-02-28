package com.necindia.rolemanagement.mappingrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.necindia.rolemanagement.mappingmodels.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

//	@Transactional
//	@Modifying
//	@Query("SELECT NEW com.necindia.rolemanagement.dto.Role(r.roleId, r.roleName) FROM Role r")
//	public List<Role> getAllRolesOnly();
}
