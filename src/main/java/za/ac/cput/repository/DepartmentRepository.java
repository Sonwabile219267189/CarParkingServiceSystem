/* DepartmentRepository.java
   Author: Nikiwe Mkontshwana(214236714)
   DepartmentRepository
   Date: 08April2022
 */
package za.ac.cput.repository;

import za.ac.cput.entity.Department;
import java.util.HashSet;
import java.util.Set;

public class DepartmentRepository implements IDepartmentRepository{
    private static DepartmentRepository departmentRepo = null;
    private Set<Department> departmentDB = null;

    private DepartmentRepository(){
        departmentDB = new HashSet<Department>();
    }

    public static DepartmentRepository getDepartmentRepository(){
        if (departmentRepo == null){
            departmentRepo = new DepartmentRepository();
        }
        return departmentRepo;
    }

    @Override
    public Department create(Department department){
        boolean success = departmentDB.add(department);
        if(!success)
            return null;
        return department;
    }

    @Override
    public Department read(String departmentId){
        for (Department e : departmentDB){
            if (e.getDepartmentID() == departmentId)
                return e;
        }
        return null;
    }

    @Override
    public Department update(Department department){
        Department oldDepartment = read(department.getDepartmentID());
        if (oldDepartment != null){
            departmentDB.remove(oldDepartment);
            departmentDB.add(department);
            return department;
        }
        return null;
    }

    @Override
    public boolean delete(String departmentId) {
        Department departmentToDelete = read(departmentId);
        if (departmentToDelete == null)
            return false;
        departmentDB.remove(departmentToDelete);
        return true;
    }

    @Override
    public Set<Department> getAll(){
        return departmentDB;
    }
}