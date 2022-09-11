/*RoleService.java
  interface for the RoleService
  Author: Zintle Zothe (216130565)
  Date: August 2022
 */
package za.ac.cput.service;

import za.ac.cput.entity.Role;

import java.util.Set;

public interface RoleService extends IService<Role,String>{
    public Set<Role> getAll();
}
