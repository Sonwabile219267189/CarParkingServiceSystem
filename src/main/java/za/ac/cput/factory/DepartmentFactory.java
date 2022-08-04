/* DepartmentFactory.java
   Author: Nikiwe Mkontshwana (214236714)
   Factory-Department
   Date: 07April2022
 */

package za.ac.cput.factory;

import za.ac.cput.entity.Department;

public class DepartmentFactory {

    public static Department createDepartment(String departmentName, String campusLocation, String departmentID) {
        return new Department.Builder().setDepartmentName(departmentName)
                .setCampusLocation(campusLocation)
                .setDepartmentID(departmentID)
                .build();

    }
}
