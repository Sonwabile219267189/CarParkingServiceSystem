package za.ac.cput.repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Campus;
import za.ac.cput.factory.CampusFactory;

import static org.junit.jupiter.api.Assertions.*;

class CampusRepositoryTest {

    private static CampusRepository repository = CampusRepository.getRepository();
    private static Campus campus = CampusFactory.build("District 6","Cape Town");

    @Test
    void create() {
        Campus created = repository.create(campus);
        assertNotNull(created);
        assertEquals(campus.getCampusID(), created.getCampusID());
    }

    @Test
    void read() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    @Test
    void getAll() {
    }
}