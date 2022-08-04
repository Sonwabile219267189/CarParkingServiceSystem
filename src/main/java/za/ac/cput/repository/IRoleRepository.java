package za.ac.cput.repository;

/*IRoleRepository.java
  interface for the Role
  Author: Zintle Zothe (216130565)
  Date: 08 April 2022
 */

import za.ac.cput.entity.Role;
import java.util.Set;

public interface IRoleRepository extends IRepository<Role, String> {
    public Set<Role> getAll();
}
