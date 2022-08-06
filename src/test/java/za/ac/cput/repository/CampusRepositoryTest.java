/**
 * CampusRepositoryTest.java
 * Test for CampusRepository.java
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 9 April 2022
 */
package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Campus;
import za.ac.cput.factory.CampusFactory;

import static org.junit.jupiter.api.Assertions.*;
@Deprecated
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CampusRepositoryTest {

    private static CampusRepository repository = CampusRepository.getRepository();
    private static Campus campus = CampusFactory.build("District 6","Cape Town");

    @Test
    @Order(1)
    void create() {
        Campus created = repository.create(campus);
        //assertNotNull(created);
        assertEquals(campus.getCampusID(), created.getCampusID());
        System.out.println("[Create]: \t" + created);
    }

    @Test
    @Order(2)
    void read() {
        Campus readCampus = repository.read(campus.getCampusID());
        assertNotNull(readCampus);
        System.out.println("[Read]: \t" + readCampus);
    }

    @Test
    @Order(3)
    void update() {
        Campus updatedCampus = null;
        Campus readCampus =repository.read(campus.getCampusID());
        if(readCampus != null){
            updatedCampus = new Campus.Builder().copy(campus)
                    .setCampusName("Bellvile Campus")
                    .setCampusLocation("Belville")
                    .build();
        }
        assertNotNull(repository.update(updatedCampus));
        System.out.println("[Update]: \t" + updatedCampus);
    }

    @Test
    @Order(5)
    void delete() {

        boolean deleteCampus = repository.delete(campus.getCampusID());
        assertTrue(deleteCampus);
        System.out.println("[Delete]: \t" + deleteCampus);
    }

    @Test
    @Order(4)
    void getAll() {
        System.out.println("[Show Repository]: \t");
        System.out.println(repository.getAll());

    }
}