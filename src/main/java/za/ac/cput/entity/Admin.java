/* Admin.java
   author: Nikiwe Mkontshwana(214236714)
   Entity-Admin
   Date: 06April2022
 */

package za.ac.cput.entity;

public class Admin {
    private String adminID;
    private String firstName;
    private String lastName;

    private Admin(Builder builder) {
        this.adminID = builder.adminID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }
    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminID='" + adminID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
    public static class Builder {
        private String adminID;
        private String firstName;
        private String lastName;

        public Builder setAdminID(String adminID) {
            this.adminID = adminID;
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
            this.adminID = admin.adminID;
            this.firstName = admin.firstName;
            this.lastName = admin.lastName;
            return this;
        }

        public Admin build() {
            return new Admin(this);
        }
    }
}

