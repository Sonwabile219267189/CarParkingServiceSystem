/**
 * ParkingSpaceServiveImplTest.java
 * Test class for ParkingSpaceServiceImpl.java
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 11 August 2022
 */
package za.ac.cput.service.impl;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.entity.ParkingLot;
import za.ac.cput.entity.ParkingSpace;
import za.ac.cput.factory.ParkingLotFactory;
import za.ac.cput.factory.ParkingSpaceFactory;
import za.ac.cput.repository.ParkingSpaceRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SpringBootTest
class ParkingSpaceServiceImplTest {


    @Autowired private ParkingSpaceServiceImpl service;

    private static ParkingLot pl = ParkingLotFactory.build("District 6", "2");
    private static ParkingSpace pk = ParkingSpaceFactory.build("1",pl.getParkingLotID(),false);



    @BeforeAll
    @Test
    void create(){
        ParkingSpace create = this.service.create(pk);
        assertNotNull(create);
        System.out.println(create);
    }

    @Test
    @Order(2)
    void read(){
        //ParkingSpace create = this.service.create(pk);
        ParkingSpace read = this.service.read(pk.getParkingSpaceID());
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    @Order(3)
    void update(){
        //ParkingSpace create = this.service.create(pk);
        ParkingSpace update = this.service.update(new ParkingSpace.Builder().copy(pk).setIsEmpty(true).build());
        assertNotNull(update);
        System.out.println(update);

    }

    @Test
    @Order(5)
    void delete(){
        boolean delete = this.service.delete(pk.getParkingSpaceID());
        assertTrue(delete);
    }

    @Test
    @Order(4)
    void findAll(){
        List<ParkingSpace> findAll = this.service.findAll();
        assertNotNull(findAll);
        System.out.println(findAll);
    }

}