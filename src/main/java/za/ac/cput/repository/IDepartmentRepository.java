/* IDepartmentRepository.java
   Author: Nikiwe Mkontshwana(214236714)
   IDepartmentRepository
   Date: 08April2022
 */

package za.ac.cput.repository;

import za.ac.cput.entity.Department;

import java.util.Set;

public interface IDepartmentRepository extends IRepository<Department,String>{
    public Set<Department> getAll();
}