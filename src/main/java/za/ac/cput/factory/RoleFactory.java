package za.ac.cput.factory;

/*RoleFactory.java
  Factory for Role
  Author: Zintle Zothe (216130565)
  Date: 07 April 2022
 */

import za.ac.cput.entity.Role;
import za.ac.cput.util.Helper;


public class RoleFactory {
    public static Role createRole(String roleName){

        Helper.isEmptyOrNull(roleName);

        String roleId= Helper.generateUUID();

        Role role= new Role.Builder().setRoleId(roleId)
                .setRoleName(roleName)
                .build();
        return role;
    }
}