/* DepartmentFactory.java
   Author: Nikiwe Mkontshwana (214236714)
   Factory-Department
   Date: 07April2022
 */

package za.ac.cput.factory;

import za.ac.cput.entity.Department;
import za.ac.cput.util.Helper;

public class DepartmentFactory {

    public static Department build(String departmentId, String departmentName, String campusLocation ) {
        String departmentID = Helper.generateUUID();
        return new Department.Builder().setDepartmentId(departmentId)
                .setDepartmentName(departmentName)
                .setCampusLocation(campusLocation)
                .build();

    }
}
