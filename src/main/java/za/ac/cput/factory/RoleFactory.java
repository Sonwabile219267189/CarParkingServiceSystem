package za.ac.cput.factory;

/*RoleFactory.java
  Factory for Role
  Author: Zintle Zothe (216130565)
  Date: 07 April 2022
 */

import za.ac.cput.entity.Role;
import za.ac.cput.helper.GenerateID;


public class RoleFactory {
    public static Role createRole(String roleId, String roleName){

        String id= GenerateID.generateUUID();

        Role role= new Role.Builder().setRoleId(id)
                .setRoleName(roleName)
                .build();
        return role;
    }
}