/* CarParkingServiceSystem.java
 Controller Test for a Reservation Class

 Author: Siyamtanda Tonjeni (217107958)
 Date: 19 August 2022
 */
package za.ac.cput.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import za.ac.cput.entity.Reservation;
import za.ac.cput.factory.ReservationFactory;
import za.ac.cput.factory.ReservationStatusFactory;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class ReservationControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private ReservationController controller;

    @Autowired
    private TestRestTemplate restTemplate;

    private Reservation reservation = ReservationFactory.build("T324","L2"
            ,"23 August 2022", ReservationStatusFactory.build("Y253",
                    "Need payment"));
    private final String baseUrl = "http://localhost:3306" + this.port + "/cput/reservation/";

    @Test
    void create(){
        String url = baseUrl +"create";
        System.out.println(url);
        ResponseEntity<Reservation> response = this.restTemplate.postForEntity(url,this.reservation,
                Reservation.class);
        System.out.println(response);
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertNotNull(response.getBody())
        );
    }

    @Test
    void read(){
        String url = baseUrl + "read/";
        System.out.println(url);
        ResponseEntity<Reservation> response = this.restTemplate.getForEntity(url,Reservation.class);
        System.out.println(response);
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode())
        );
    }

    @Test
    void update(){
        String url = baseUrl +"update/";
        System.out.println(url);
        ResponseEntity<Reservation> response = this.restTemplate.postForEntity(url,this.reservation,
                Reservation.class);
        System.out.println(response);
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertNotNull(response.getBody())
        );
    }

    @Test
    void delete(){
        String url = baseUrl + "delete/" +this.reservation.getReservationID();
        this.restTemplate.delete(url);
    }

    @Test
    void findAll(){
        String url = baseUrl + "all";
        System.out.println(url);
        ResponseEntity<Reservation[]> response = this.restTemplate.getForEntity(url,Reservation[].class);
        System.out.println(Arrays.asList(response.getBody()));
        assertAll(
                () -> assertEquals(HttpStatus.OK,response.getStatusCode()),
                () -> assertTrue(response.getBody().length == 0)
        );
    }
}
