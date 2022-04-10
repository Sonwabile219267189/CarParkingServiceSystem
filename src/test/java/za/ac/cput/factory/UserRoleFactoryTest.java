package za.ac.cput.factory;
/** UserFactoryTest.java
 *  Author: Abongile Tshopi (214254151)
 *  Student Number: 214254151
 *  Date: 09 April 2022
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserRoleFactoryTest {
    private UserRoleFactory userRole0;
    private UserRoleFactory userRole1;
    private UserRoleFactory userRole2;

    @BeforeEach
    void setUp() {
        userRole0 = new UserRoleFactory();
        userRole1 = new UserRoleFactory();
        userRole1 =  userRole0;
    }

    //Test object equality
    @Test
    void testEquality(){
        assertSame(userRole0, userRole1);
        System.out.println("Objects are equal");
    }
}
