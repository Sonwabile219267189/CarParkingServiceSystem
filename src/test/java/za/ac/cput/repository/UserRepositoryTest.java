package za.ac.cput.repository;
/** UserRepositoryTest.java
 * Author: Abongile Tshopi (214254151)
 * Date: 09 April 2022
 */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.entity.User;
import za.ac.cput.factory.UserFactory;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UserRepositoryTest {

    @Autowired
    private UserRepository repository;

    private static User user0 = UserFactory.build("Sbaja","Kona", "194 Voortrekker Parow",
            "0815678910","sbajamail.com");
    private static User user1 = UserFactory.build("Aiman","Konka", "195 Voortrekker Parow",
            "0815678999","sbajamail.com");

    // Create test:
    @Order(1)
    @Test
    void createTest() {
        User created = repository.save(user0);
        assertEquals(created.getUserID(), user0.getUserID());
        System.out.println("Created: " + created);
    }

    // Read test:
    @Order(2)
    @Test
    void read(){
        User save0 = repository.save(user0);

        Optional<User> read = repository.findById(user0.getUserID());
        assertNotNull(read);
        System.out.println("[Read result]: " + read);
    }

    // Update test: Update surname
    @Order(3)
    @Test
    void updateTest() {
        User updateUser = new User.Builder().copy(user0).setFirstName("Boy").build();
        assertEquals(updateUser.getUserID(), user0.getUserID());
        System.out.println("Updated User: " + updateUser);
    }
    @Order(5)
    @Test
    void deleteTest() {
        User saveUser = repository.save(user0);

        assertNotNull(repository);
        repository.deleteAll();
        //System.out.println(repository.findAll());
        System.out.println("User is deleted");
    }

    @Order(4)
    @Test
    void getAll() {

        User saveUser = repository.save(user0);
        System.out.println("Users in the database");
        System.out.println(repository.findAll());
    }

}
