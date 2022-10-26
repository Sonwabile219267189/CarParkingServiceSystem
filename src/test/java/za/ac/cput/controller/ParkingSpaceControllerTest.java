/**
 * ParkingSpaceControllerTest.java
 * Test class for ParkingSpaceController.java
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 16 August 2022
 */
package za.ac.cput.controller;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.*;
import za.ac.cput.entity.ParkingLot;
import za.ac.cput.entity.ParkingSpace;
import za.ac.cput.factory.ParkingLotFactory;
import za.ac.cput.factory.ParkingSpaceFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ParkingSpaceControllerTest {

    @LocalServerPort
    private int port;
    @Autowired
    private TestRestTemplate restTemplate;
    @Autowired private ParkingSpaceController controller;
    private ParkingLot parkingLot;
    private ParkingSpace parkingSpace;
    private String baseURL = "http://localhost:" + this.port + "carparkingservice/parkingspace";

    @BeforeEach
    void setUp(){
        assertNotNull(controller);
        baseURL = "http://localhost:" + this.port + "/carparkingservice/parkingspace";
        this.parkingLot = ParkingLotFactory.build("Bellvile Campus", "1");
        this.parkingSpace = ParkingSpaceFactory.build("2", parkingLot.getParkingLotID(),true);
    }

    @Test
    @Order(1)
    void create() {
        String url = baseURL + "/create";
        System.out.println(url);

        ResponseEntity<ParkingSpace> response = this.restTemplate.postForEntity(url, this.parkingSpace, ParkingSpace.class);
        System.out.println(response);
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    @Test
    @Order(2)
    void read() {
        String url = baseURL + "/read/" + this.parkingSpace.getParkingSpaceID();
        System.out.println(url);
        ResponseEntity<ParkingSpace> response = this.restTemplate.getForEntity(url,ParkingSpace.class);
        System.out.println(response);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
    }

    @Test
    @Order(5)
    void delete() {
        String url = baseURL + "/delete/" + this.parkingSpace.getParkingSpaceID();
        System.out.println(url);
        restTemplate.delete(url);
    }

    @Test
    @Order(3)
    void update() {
        String url = baseURL + "/update";
        System.out.println(url);
        ParkingSpace update = new ParkingSpace.Builder().copy(this.parkingSpace).setParkingSpaceNumber("7").build();
        assertNotNull(update);
        ResponseEntity<ParkingSpace> response = restTemplate.postForEntity(url, update, ParkingSpace.class);
        assertNotNull(response.getBody());

    }

    @Test
    @Order(4)
    void getAll() {
        String url = baseURL + "/getAll";
        System.out.println(url);
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null,headers);
        ResponseEntity<String> response = this.restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
    }

}