/* DepartmentFactoryTest.java
   Author: Nikiwe Mkontshwana (214236714)
   FactoryTest-Department
   Date: 10April2022
 */
package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Department;
import za.ac.cput.factory.DepartmentFactory;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentFactoryTest {

    @Test
    public void test(){
        Department department = DepartmentFactory.createDepartment("IT Department",
                "District six", "IT333");
        assertNotNull(department);
    }

}
