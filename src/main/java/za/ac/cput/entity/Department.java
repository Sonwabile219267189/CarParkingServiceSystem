/* Department.java
   Author: Nikiwe Mkontshwana(214236714)
   Entity-Department
   Date: 06April2022
*/

package za.ac.cput.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


import java.io.Serializable;

@Entity
public class Department implements Serializable {

    @Id
    private String DepartmentId;

    private String departmentName;
    private String campusLocation;

    protected Department() {
    }

    public Department(Department.Builder builder) {
        this.departmentId = builder.departmentId;
        this.departmentName = builder.departmentName;
        this.campusLocation = builder.campusLocation;
    }
    public String getDepartmentID() {
        return departmentId;
    }
    
    public String getDepartmentName() {
        return departmentName;
    }

    public String getCampusLocation() {
        return campusLocation;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", campusLocation='" + campusLocation + '\'' +
                ", departmentID='" + departmentId + '\'' +
                '}';
    }

    public boolean getDepartmentId() {
        return false;
    }

    public static class Builder {
        private String departmentName;
        private String campusLocation;
        private String departmentID;

        public Department.Builder setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }

        public Department.Builder setCampusLocation(String campusLocation) {
            this.campusLocation = campusLocation;
            return this;
        }

        public Department.Builder setDepartmentID(String departmentID) {
            this.departmentID= departmentID;
            return this;
        }

        public Department.Builder copy(Department department) {
            this.departmentName = department.departmentName;
            this.campusLocation = department.campusLocation;
            this.departmentID = department.departmentID;
            return this;
        }

        public Department build() {
            return new Department(this);
        }
    }
}


