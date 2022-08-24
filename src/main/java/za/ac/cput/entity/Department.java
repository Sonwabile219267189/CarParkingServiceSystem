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
    private String departmentId;
    private String departmentName;
    private String campusLocation;

    protected Department() {
    }

    private Department(Builder builder) {
        this.departmentId = builder.departmentId;
        this.departmentName = builder.departmentName;
        this.campusLocation = builder.campusLocation;
    }

    public String getDepartmentId() {
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
                "departmentId=" + departmentId + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", campusLocation='" + campusLocation + '\'' +
                '}';
    }

    public static class Builder {
        private String departmentId;
        private String departmentName;
        private String campusLocation;


        public Builder setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }

        public Builder setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }

        public Builder setCampusLocation(String campusLocation) {
            this.campusLocation = campusLocation;
            return this;

        }

        public Builder copy(Department department) {
            this.departmentId = department.departmentId;
            this.departmentName = department.departmentName;
            this.campusLocation = department.campusLocation;

            return this;
        }

        public Department build() {
            return new Department(this);
        }
    }
}




