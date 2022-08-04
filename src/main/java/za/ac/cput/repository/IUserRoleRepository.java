package za.ac.cput.repository;
/** IUserRoleRepository.java
 * Author: Abongile Tshopi (214254151)
 * Date: 09 April 2022
 */
import za.ac.cput.entity.UserRole;

import java.util.List;

public interface IUserRoleRepository extends IRepository <UserRole, String>{
    List<UserRole> getAll();
}
