/*VehicleControllerTest.java
   test for the vehicle controller
  Author: Zintle Zothe (216130565)
  Date: October 2022
 */
package za.ac.cput.controller;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.*;
import za.ac.cput.entity.Role;
import za.ac.cput.entity.User;
import za.ac.cput.entity.Vehicle;
import za.ac.cput.factory.UserFactory;
import za.ac.cput.factory.VehicleFactory;
import za.ac.cput.service.impl.VehicleServiceImpl;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class VehicleControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private VehicleController controller;
    @Autowired
    private TestRestTemplate restTemplate;

    private Vehicle vehicle;
    private User user;
    private String baseUrl;

    @BeforeEach
    void setUp(){
        this.user= UserFactory.build("Charles","Korry", "38 Mangoose Sea-Point",
                "0627894563","KorryC@yahoo.com");

        this.vehicle= VehicleFactory.createVehicle("CF510156", user.getUserID(), "Toyota Hilux, truck","Nebula blue");

        this.baseUrl="http://localhost:" + this.port+ "carparkingservice/vehicle";
    }


    @Test
    @Order(1)
    void create(){
        String url=baseUrl + "/create";
        System.out.println(url);
        ResponseEntity<Vehicle> response = this.restTemplate
                .postForEntity(url, this.vehicle, Vehicle.class);
        System.out.println(response);
        assertAll(
                ()->assertEquals(HttpStatus.OK,response.getStatusCode()),
                ()-> assertNotNull(response.getBody())
        );
    }

    @Test
    @Order(2)
    void read(){
        String url=baseUrl+"/read/" + this.vehicle.getVehicleNumberPlate();
        System.out.println("URL: "+ url);
        System.out.println(vehicle);


    }


    @Test
    @Order(3)
    void update(){
        String url=baseUrl+ "/update";
        System.out.println("URL: "+ url);
        Vehicle updated =new Vehicle.Builder().setVehicleNumberPlate(vehicle.getVehicleNumberPlate()).setUserID(user.getUserID()).setVehicleModel(vehicle.getVehicleModel()).setVehicleColour("Red").build();
        System.out.println("Post data: "+ updated);
        ResponseEntity<Vehicle> response= restTemplate.postForEntity(url, updated, Vehicle.class);
    }

    @Test
    @Order(5)
    void delete(){
        String url=baseUrl+"/delete/" + this.vehicle.getVehicleNumberPlate();
        System.out.println("URL: "+ url);
        restTemplate.delete(url);
    }

    @Test
    @Order(4)
    void getAll(){
        String url = baseUrl +"/getall";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity= new HttpEntity<>(null, headers);
        ResponseEntity<String> response= restTemplate.exchange(url, HttpMethod.GET,entity, String.class);
        System.out.println("Show ALL: ");
        System.out.println(response);
        System.out.println(response.getBody());
    }

}