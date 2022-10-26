/* Admin.java
   Author: Nikiwe Mkontshwana(214236714)
   Service-Admin
   Date:10August2022
*/
package za.ac.cput.service;

import za.ac.cput.entity.Admin;
import za.ac.cput.entity.Department;

import java.util.List;

public interface AdminService extends IService<Admin, String>{
    public List<Admin> findAll();
}