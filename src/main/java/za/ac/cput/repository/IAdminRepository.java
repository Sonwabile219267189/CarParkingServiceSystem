/* IAdminRepository.java
   Author: Nikiwe Mkontshwana(214236714)
   IAdminRepository
   Date: 08April2022
 */

package za.ac.cput.repository;

import za.ac.cput.entity.Admin;
import za.ac.cput.entity.Department;
import  java.util.*;

public interface IAdminRepository extends IRepository <Admin, String>{
    public Set<Admin> getAll();
}
