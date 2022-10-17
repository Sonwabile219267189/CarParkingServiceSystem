package za.ac.cput.entity;

/*Role.java
  Entity for the Role
  Author: Zintle Zothe (216130565)
  Date: 07 April 2022
 */

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Role implements Serializable {
    @Id
    private String roleId;
    private String roleName;

    //**
    protected Role(){
    }



    //***
    private Role(Builder builder){
        this.roleId=builder.roleId;
        this.roleName=builder.roleName;
    }

    //****
    public String getRoleId() {
        return roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    //***
    public static class Builder{
        private String roleId;
        private String roleName;

        public Builder setRoleId(String roleId){
            this.roleId=roleId;
            return this;
        }

        public Builder setRoleName(String roleName){
            this.roleName=roleName;
            return this;
        }

        public Role build(){
            return new Role(this);
        }

        public Builder copy(Role role){
            this.roleId=role.roleId;
            this.roleName=role.roleName;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId='" + roleId + '\'' +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
