/* Admin.java
   Author: Nikiwe Mkontshwana(214236714)
   Entity-Admin
   Date: 06April2022
*/

package za.ac.cput.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


import java.io.Serializable;

@Entity
public class Admin implements Serializable {

    @Id
    private String adminId;
    private String firstName;
    private String lastName;

    protected Admin() {
    }


    private Admin(Builder builder) {
        this.adminId = builder.adminId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    public String getAdminId() {
        return adminId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +'\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static class Builder {
        private String adminId;
        private String firstName;
        private String lastName;

        public Builder setAdminId(String adminId) {
            this.adminId = adminId;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder copy(Admin admin) {
            this.adminId = admin.adminId;
            this.firstName = admin.firstName;
            this.lastName = admin.lastName;
            return this;
        }


        public Admin build() {
            return new Admin(this);
        }
    }
}

