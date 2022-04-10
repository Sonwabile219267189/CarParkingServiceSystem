package za.ac.cput.repository;
/** UserRoleRepositoryTest.java
 * Author: Abongile Tshopi (214254151)
 * Date: 09 April 2022
 */
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.User;
import za.ac.cput.entity.UserRole;
import za.ac.cput.factory.UserFactory;
import za.ac.cput.factory.UserRoleFactory;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UserRoleRepositoryTest {
    private static UserRoleRepository repository = UserRoleRepository.getRepository();
    private static UserRole userR0 = UserRoleFactory.build();

    // Create test:
    @Order(1)
    @Test
    void createTest() {
        UserRole created = repository.create(userR0);
        assertEquals(created.getUserID(), userR0.getUserID());
        System.out.println("Created: " + created);
    }

    // Read test:
    @Order(2)
    @Test
    void readTest() {
        UserRole read = repository.read(userR0.getUserID());
        assertEquals(read.getUserID(), userR0.getUserID());
        System.out.println("Read: " + read);
    }

    // Update test: Update surname
    @Order(3)
    @Test
    void updateTest() {
        UserRole updateUser = new UserRole.Builder().copy(userR0).build();
        assertEquals(updateUser.getUserID(), userR0.getUserID());
        System.out.println("Updated User: " + updateUser);
    }

    @Order(4)
    @Test
    void deleteTest() {
        repository.delete(userR0.getUserID());
        assertNotNull(repository);
    }

    @Order(5)
    @Test
    void getAllTest() {
        System.out.println("UserRoles: \n" + repository.getAll());
    }

}
