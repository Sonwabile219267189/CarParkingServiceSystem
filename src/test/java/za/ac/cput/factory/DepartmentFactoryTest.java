/* DepartmentFactoryTest.java
   Author: Nikiwe Mkontshwana (214236714)
   FactoryTest-Department
   Date: 10April2022
 */
package za.ac.cput.factory;


import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Department;


import static org.junit.jupiter.api.Assertions.*;

class DepartmentFactoryTest {

    @Test
    public void test(){
        Department department = DepartmentFactory.build("1003",
                "Finance", "District 6");
        System.out.println(department);
        assertNotNull(department);
    }
   /* @Test
    @DisplayName("Test Throwing an IllegalArgumentException for date of department name.")
    public void buildWithError(){
        Exception exception = assertThrows(IllegalArgumentException.class,() ->
                DepartmentFactory.build("1003","Finance","District 6"));
           System.out.println("Department Name: " +exception.getMessage());*/

    @Test
    public void testDepartmentNames(){
        Department department = DepartmentFactory.build("1003","Finance",
                "District 6");
        Department departmentOther = DepartmentFactory.build("1004","Engineering",
                        "District 6");
        assertNotSame(department,departmentOther);
        System.out.println(department.toString());
        System.out.println(departmentOther.toString());
}
}
