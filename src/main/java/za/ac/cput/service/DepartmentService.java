/* Admin.java
   Author: Nikiwe Mkontshwana(214236714)
   Service-Department
   Date:10August2022
*/
package za.ac.cput.service;

import za.ac.cput.entity.Department;

import java.util.List;

public interface DepartmentService extends IService<Department, String> {
    public List<Department> findAll();
}
