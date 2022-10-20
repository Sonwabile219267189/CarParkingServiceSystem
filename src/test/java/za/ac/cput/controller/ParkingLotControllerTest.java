package za.ac.cput.controller;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import za.ac.cput.entity.ParkingLot;
import za.ac.cput.factory.ParkingLotFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ParkingLotControllerTest {


    @LocalServerPort
    private int port;
    @Autowired private TestRestTemplate restTemplate;
    @Autowired private ParkingLotController controller;
    private ParkingLot parkingLot;
    private String baseURL = "http://localhost:" + this.port + "carparkingservice/parkinglot";

    @BeforeEach
    void setUp(){
        assertNotNull(controller);
        baseURL = "http://localhost:" + this.port + "/carparkingservice/parkinglot";
        this.parkingLot = ParkingLotFactory.build("Bellvile Campus", "1");
    }

    @Test
    @Order(1)
    void create() {
        String url = baseURL + "/create";
        System.out.println(url);

        ResponseEntity<ParkingLot> response = this.restTemplate.postForEntity(url, this.parkingLot, ParkingLot.class);
        System.out.println(response);
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    @Test
    @Order(2)
    void read() {
        String url = baseURL + "/read/" + this.parkingLot.getParkingLotID();
        System.out.println(url);
        ResponseEntity<ParkingLot> response = this.restTemplate.getForEntity(url,ParkingLot.class);
        System.out.println(response);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
    }

    @Test
    @Order(5)
    void delete() {
        String url = baseURL + "/delete/" + this.parkingLot.getParkingLotID();
        System.out.println(url);
        restTemplate.delete(url);
    }

    @Test
    @Order(3)
    void update() {
        String url = baseURL + "/update";
        System.out.println(url);
        ParkingLot update = new ParkingLot.Builder().copy(this.parkingLot).setParkingLotNumber("2").build();
        assertNotNull(update);
        ResponseEntity<ParkingLot> response = restTemplate.postForEntity(url, update, ParkingLot.class);
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