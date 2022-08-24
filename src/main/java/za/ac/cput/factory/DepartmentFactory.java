/* DepartmentFactory.java
   Author: Nikiwe Mkontshwana (214236714)
   Factory-Department
   Date: 07April2022
 */

package za.ac.cput.factory;

import za.ac.cput.entity.Department;

public class DepartmentFactory {

    public static Department createDepartment(String departmentId, String departmentName, String campusLocation ) {
        return new Department.Builder().setDepartmentId(departmentId)
                .setDepartmentName(departmentName)
                .setCampusLocation(campusLocation)
                .build();

    }
}
