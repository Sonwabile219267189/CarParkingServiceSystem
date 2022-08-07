package za.ac.cput.factory;

import static org.junit.jupiter.api.Assertions.*;

/*RoleFactoryTest.java
  Test for RoleFactory
  Author: Zintle Zothe (216130565)
  Date: 07 April 2022
 */
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Role;

import static org.junit.jupiter.api.Assertions.*;

class RoleFactoryTest {
    @Test
    public void createRole(){
        Role role= RoleFactory.createRole("Student");
        assertNotNull(role);
        System.out.println(role);

    }

    @Test
        // checks if the string in not null or empty and then throws
        // an IllegalArgumentException
    void CreateRoleWithAnError(){
        Exception exception=assertThrows(IllegalArgumentException.class, ()->
                RoleFactory.createRole(""));
        System.out.println(exception.getMessage()+": role name");

    }
}