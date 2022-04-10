package za.ac.cput.factory;
/*
 *  Name: Abongile Tshopi
 *   Stdent Number: 214254151
 *  UserFactoryTes class
 */

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.User;
import static java.lang.Compiler.disable;
import static org.junit.jupiter.api.Assertions.*;

public class UserFactoryTest {
    @Test
    void testCreateUser0() {
               User user0 = UserFactory.build("Ludwe","Kona", "0815678910",
                "192 Voortrekker Parow","ludwew@gmail.com");
        assertNotNull(user0);
        System.out.println(user0.toString());
    }

    User user0 = UserFactory.build("Ludwe","Kona", "0815678910",
            "192 Voortrekker Parow","ludwew@gmail.com");

    User user1 = UserFactory.build("Fudwe","Kona", "0815678910",
            "192 Voortrekker Parow","fudwew@gmail.com");

    // This method will fail since the object created above is not the same
    @Test
    void testIdentity(){
        assertNotSame(user0, user1);
        System.out.println(user0);
        System.out.println(user1);
    }

    //This test fails
    @Test
    public void failTest(){
        try{
            fail("Test is failing");
        } catch (Exception e) {
            e.printStackTrace();
            assertTrue(true);
        }
    }

    //This method will stop/disable the program processing
    @Test
    @Disabled
    public void disabling(){
        System.out.println("Temporal technical issues");
        disable();

    }
}
