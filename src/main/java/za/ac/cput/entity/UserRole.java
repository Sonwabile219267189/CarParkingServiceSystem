package za.ac.cput.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
  * Name: Abongile Tshopi
  * Student Number: 214254151
  * UserRole entity
  */
@Entity
public class UserRole implements Serializable {

    @Id
    private String userID;
    private String roleID;

    public UserRole() {

    }

    public String getUserID() {
         return userID;
     }
     public String getRole() {
         return roleID;
     }

     private UserRole(Builder builder){
         this.userID = builder.userID;
         this.roleID = builder.roleID;
     }

    @Override
    public String toString() {
        return "UserRole{" +
                "userID='" + userID + '\'' +
                ", roleID='" + roleID + '\'' +
                '}';
    }

     public static class Builder{
         private String userID;
         private String roleID;

         public Builder setUserID(String userID){
             this.userID = userID;
             return this;
         }

         public Builder setRoleID(String roleID){
             this.roleID = roleID;
            return this;
         }

         public Builder copy(UserRole userRole){
             this.roleID = userRole.roleID;
             this.userID = userRole.userID;
             return this;
         }

         public UserRole build(){
             return new UserRole();
         }
     }
}
