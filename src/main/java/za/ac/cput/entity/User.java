package za.ac.cput.entity;

/**
 * Entity for the User
 * Author: Abongile Tshopi (214254151)
 * Date: 09 April 2022
 */

public class User {
    private String userID;
    private String firstName;
    private String lastName;
    private String address;
    private String cellNumber;
    private String emailAddress;

    //getters
    public String getUserID() {
        return userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    //Builder...

    private User(Builder builder){
        this.userID = builder.userID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.address = builder.address;
        this.cellNumber = builder.cellNumber;
        this.emailAddress = builder.emailAddress;

    }

    @Override
    public String toString() {
        return "Builder{" +
                "userID='" + userID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", cellNumber='" + cellNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    public static class Builder {
        private String userID;
        private String firstName;
        private String lastName;
        private String address;
        private String cellNumber;
        private String emailAddress;

        public Builder setUserID(String userID) {
            this.userID= userID;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName= lastName;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setCellNumber(String cellNumber) {
            this.cellNumber = cellNumber;
            return this;
        }

        public Builder setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;

        }

        public Builder copy(User user){
            this.userID = user.userID;
            this.firstName = user.firstName;
            this.lastName = user.lastName;
            this.address = user.address;
            this.cellNumber = user.cellNumber;
            this.emailAddress = user.emailAddress;
            return this;
        }
        public User build(){
            return new User(this);
        }


    }
}
