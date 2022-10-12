/* DepartmentService.java
   Author: Nikiwe Mkontshwana(214236714)
   Department-Service
   Date: 12August2022
 */

package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.Department;
import za.ac.cput.repository.IDepartmentRepository;
import za.ac.cput.service.DepartmentService;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private IDepartmentRepository repository;

    public DepartmentServiceImpl(IDepartmentRepository repository){
        this.repository = repository;
    }

    @Override
    public Department create(Department department) {
        return this.repository.save(department);
    }

    @Override
    public Department read(String department) {
        return this.repository.findById(department).orElse(null);

    }

    @Override
    public Department update(Department department) {

        if(this.repository.existsById(department.getDepartmentId())){
            return this.repository.save(department);
        }
        return null;
    }

    @Override
    public boolean delete(String departmentId) {
        if(this.repository.existsById(departmentId)) {
            this.repository.deleteById(departmentId);
            return true;
        }
        return false;
    }

    @Override
    public List<Department> findAll(){
        return this.repository.findAll();
    }
}

