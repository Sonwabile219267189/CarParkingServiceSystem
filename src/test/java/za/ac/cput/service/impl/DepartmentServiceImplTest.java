/* DepartmentServiceTest.java
   Author: Nikiwe Mkontshwana (214236714)
   FactoryTest-Admin
   Date: 18August2022
 */

package za.ac.cput.service.impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.entity.Department;
import za.ac.cput.factory.DepartmentFactory;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest

public class DepartmentServiceImplTest {
    @Autowired
    private DepartmentServiceImpl SERVICE;

    private static Department department = DepartmentFactory.build("1009","Sales",
            "District 6");

    @Test
    void create(){
        Department create = this.SERVICE.create(department);
        assertNotNull(create);
        System.out.println(create);
    }

    @Test
    void read(){
        Department read = this.SERVICE.read(department.getDepartmentId());
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    void update(){
        Department update = this.SERVICE.update(new Department.Builder()
                .copy(department).setDepartmentId("1007").build());
        assertNotNull(update);
        System.out.println(update);
    }

    @Test
    void delete(){
        boolean delete = this.SERVICE.delete(department.getDepartmentId());
        assertTrue(delete);
    }

    @Test
    void findAll(){
        List<Department> findAll = this.SERVICE.findAll();
        assertNotNull(findAll);
        System.out.println(findAll);
    }
}

