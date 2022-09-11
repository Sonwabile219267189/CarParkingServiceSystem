/*RoleService.java
  class for the RoleService
  Author: Zintle Zothe (216130565)
  Date: August 2022
 */
package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.Role;
import za.ac.cput.repository.RoleRepository;
import za.ac.cput.service.RoleService;

import java.util.Set;
import java.util.stream.Collectors;



@Service
public class RoleServiceImpl implements RoleService {
    private static RoleServiceImpl service = null;

    @Autowired
    private RoleRepository repository;

    @Override
    public Role create(Role role) {
        return this.repository.save(role);
    }

    @Override
    public  Role read(String roleId) {
        return this.repository.findById(roleId).orElse(null);
    }

    @Override
    public Role update(Role role) {
        if (this.repository.existsById(role.getRoleId()))
            return this.repository.save(role);
        return null;
    }

    @Override
    public boolean delete(String roleId) {
        this.repository.deleteById(roleId);
        if (this.repository.existsById(roleId))
            return false;
        else
            return true;
    }

    @Override
    public Set<Role> getAll(){
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }
}
