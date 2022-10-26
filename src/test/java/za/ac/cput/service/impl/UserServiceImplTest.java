/*UserServiceTest.java
  Test for the UserService
  Author: Abongile Tshopi (214254151)
  Date: August 2022
 */
package za.ac.cput.service.impl;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;;
import za.ac.cput.entity.User;
import za.ac.cput.factory.UserFactory;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SpringBootTest

public class UserServiceImplTest {
    @Autowired
    private UserServiceImpl service;
    private static User usr = UserFactory.build("Sbaja","Kona", "194 Voortrekker Parow",
            "0815678910","sbajamail.com");

    @BeforeAll
    @Test
    @Order(1)
    void create(){
        System.out.println("---------------User created successfully-----------");
        User create = this.service.create(usr);
        assertNotNull(usr);
        System.out.println(create);

    }

    @Test
    @Order(3)
    void read(){
        System.out.println("-------User in the database------------");
        User read = this.service.read(usr.getUserID());
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    @Order(2)
    void update(){
        System.out.println("---------------------User updated---------------");
        User update = this.service.update(new User.Builder().copy(usr).setCellNumber("0811111111").build());
        assertNotNull(update);
        System.out.println(update);

    }

    @Test
    @Order(5)
    void findAll(){
        System.out.println("-------------------------show all users----------------------------");
        List<User> findAll = this.service.findAll();
        assertNotNull(findAll);
        System.out.println(findAll);
    }

    @Test
    @Order(4)
    void delete(){
        System.out.println("------------------------------Users deleted-----------------------------");
        boolean delete = this.service.delete(usr.getUserID());
        assertTrue(delete);

    }
}
