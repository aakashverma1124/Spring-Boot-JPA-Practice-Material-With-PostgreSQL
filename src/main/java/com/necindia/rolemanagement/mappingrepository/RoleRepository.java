package com.necindia.rolemanagement.mappingrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.necindia.rolemanagement.mappingmodels.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
