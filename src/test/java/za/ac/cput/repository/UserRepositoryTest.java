package za.ac.cput.repository;
/** UserRepositoryTest.java
 * Author: Abongile Tshopi (214254151)
 * Date: 09 April 2022
 */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.User;
import za.ac.cput.factory.UserFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UserRepositoryTest {

    private static UserRepository repository = UserRepository.getRepository();
    private static User user0 = UserFactory.build("Sbaja","Kona", "0815678910",
            "194 Voortrekker Parow","sbajamail.com");

    // Create test:
    @Order(1)
    @Test
    void createTest() {
        User created = repository.create(user0);
        assertEquals(created.getUserID(), user0.getUserID());
        System.out.println("Created: " + created);
    }

    // Read test:
    @Order(2)
    @Test
    void readTest() {
        User read = repository.read(user0.getUserID());
        assertEquals(read.getUserID(), user0.getUserID());
        System.out.println("Read: " + read);
    }

    // Update test: Update surname
    @Order(3)
    @Test
    void updateTest() {
        User updateUser = new User.Builder().copy(user0).setFirstName("Boy").build();
        assertEquals(updateUser.getUserID(), user0.getUserID());
        System.out.println("Updated User: " + updateUser);
    }

    @Order(4)
    @Test
    void deleteTest() {
        repository.delete(user0.getUserID());
        assertNotNull(repository);
    }

    @Order(5)
    @Test
    void getAllTest() {
        System.out.println("Users: \n" + repository.getAll());
    }

}
