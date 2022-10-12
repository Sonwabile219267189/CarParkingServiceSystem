package za.ac.cput.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import za.ac.cput.entity.Admin;
import za.ac.cput.factory.AdminFactory;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AdminControllerTest {
    @LocalServerPort
    private int port;

    @Autowired
    private AdminController controller;

    @Autowired
    private TestRestTemplate restTemplate;

    private Admin admin = AdminFactory.build("2205","Lisa","Ngoma");

    private final String baseUrl = "http://localhost:" + this.port + "/cput/admin/";

    @Test
    void create(){
        String url = baseUrl +"create";
        System.out.println(url);
        ResponseEntity<Admin> response = this.restTemplate.postForEntity(url,this.admin,
                Admin.class);
        System.out.println(response);
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getBody().getAdminId()),
                () -> assertNotNull(response.getBody())
        );
    }

    @Test
    void read(){
        String url = baseUrl + "read/";
        System.out.println(url);
        ResponseEntity<Admin> response = this.restTemplate.getForEntity(url,Admin.class);
        System.out.println(response);
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getBody().getAdminId())
        );
    }

    @Test
    void update(){
        String url = baseUrl +"update/";
        System.out.println(url);
        ResponseEntity<Admin> response = this.restTemplate.postForEntity(url,this.admin,
                Admin.class);
        System.out.println(response);
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertNotNull(response.getBody())
        );
    }

    @Test
    void delete(){
        String url = baseUrl + "delete/" +this.admin.getAdminId();
        this.restTemplate.delete(url);
    }

    @Test
    void findAll(){
        String url = baseUrl + "all";
        System.out.println(url);
        ResponseEntity<Admin[]> response = this.restTemplate.getForEntity(url,Admin[].class);
        System.out.println(Arrays.asList(response.getBody()));
        assertAll(
                () -> assertEquals(HttpStatus.OK,response.getStatusCode()),
                () -> assertTrue(response.getBody().length == 0)
        );
    }
}
