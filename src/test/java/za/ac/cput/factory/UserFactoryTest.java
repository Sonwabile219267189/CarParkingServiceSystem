package za.ac.cput.factory;
/*
 *  Name: Abongile Tshopi
 *   Stdent Number: 214254151
 *  UserFactoryTes class
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.User;
import za.ac.cput.factory.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserFactoryTest {
    private UserFactory user0;
    private UserFactory user1;

    @BeforeEach
    @Test
    public void createUser0(){
        User user0 = UserFactory.build("Ludwe","Kona", "0815678910",
                "192 Voortrekker Parow","ludwew@gmail.com");

        User user1 = UserFactory.build("Fudwe","Kona", "0815678910",
                "192 Voortrekker Parow","fudwew@gmail.com");

        System.out.println(user0.toString());
        assertNotNull(user0);

    }

    @Test
    @Disabled
    public void disabling(){
        System.out.println("Temporal technical issues");
        disabling();

    }
}
