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
}