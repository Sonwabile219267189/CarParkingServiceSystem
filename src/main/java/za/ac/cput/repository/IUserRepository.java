package za.ac.cput.repository;
/** IUserRepository.java
 * Author: Abongile Tshopi (214254151)
 * Date: 09 April 2022
 */

import za.ac.cput.entity.User;

import java.util.List;

public interface IUserRepository extends IRepository<User, String> {
    public List<User> getAll();
}