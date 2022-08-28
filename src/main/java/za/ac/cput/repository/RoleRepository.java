package za.ac.cput.repository;

/*RoleRepository.java
  interface for the Role
  Author: Zintle Zothe (216130565)
  Date: 08 April 2022
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.Role;
import za.ac.cput.entity.Vehicle;
import java.util.Set;



@Repository
public interface RoleRepository extends JpaRepository<Role, String> {
    public Set<Role> getAll();
}
