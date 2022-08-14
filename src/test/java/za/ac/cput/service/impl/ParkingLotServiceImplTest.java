package za.ac.cput.service.impl;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.entity.ParkingLot;
import za.ac.cput.factory.ParkingLotFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SpringBootTest
class ParkingLotServiceImplTest {

    @Autowired private ParkingLotServiceImpl service;

    private static ParkingLot pkl = ParkingLotFactory.build("District 6 Campus", "1");

    @BeforeAll
    @Test
    void create(){
        ParkingLot create = this.service.create(pkl);
        assertNotNull(create);
        System.out.println(create);
    }

    @Test
    @Order(2)
    void read(){
        ParkingLot read = this.service.read(pkl.getParkingLotID());
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    @Order(3)
    void update(){
        ParkingLot update = this.service.update(new ParkingLot.Builder().copy(pkl).setParkingLotNumber("2").build());
        assertNotNull(update);
        System.out.println(update);
    }

    @Test
    @Order(4)
    void findAll(){
        List<ParkingLot> findAll = this.service.findAll();
        assertNotNull(findAll);
        System.out.println(findAll);
    }

    @Test
    @Order(5)
    void delete(){
        boolean delete = this.service.delete(pkl.getParkingLotID());
        assertTrue(delete);
    }

}