package za.ac.cput.controller;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import za.ac.cput.entity.Department;
import za.ac.cput.factory.DepartmentFactory;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DepartmentControllerTest {
    @LocalServerPort
    private int port;

    @Autowired
    private DepartmentController controller;

    @Autowired
    private TestRestTemplate restTemplate;

    private Department department = DepartmentFactory.build("1008","HR","Belville");

    private final String baseUrl = "http://localhost:" + this.port + "/cput/department/";

    @Test
    void create(){
        String url = baseUrl +"create";
        System.out.println(url);
        ResponseEntity<Department> response = this.restTemplate.postForEntity(url,this.department,
                Department.class);
        System.out.println(response);
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getBody().getDepartmentId()),
                () -> assertNotNull(response.getBody())
        );
    }

    @Test
    void read(){
        String url = baseUrl + "read/";
        System.out.println(url);
        ResponseEntity<Department> response = this.restTemplate.getForEntity(url,Department.class);
        System.out.println(response);
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getBody().getDepartmentId())
        );
    }

    @Test
    void update(){
        String url = baseUrl +"update/";
        System.out.println(url);
        ResponseEntity<Department> response = this.restTemplate.postForEntity(url,this.department,
                Department.class);
        System.out.println(response);
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertNotNull(response.getBody())
        );
    }

    @Test
    void delete(){
        String url = baseUrl + "delete/" +this.department.getDepartmentId();
        this.restTemplate.delete(url);
    }

    @Test
    void findAll(){
        String url = baseUrl + "all";
        System.out.println(url);
        ResponseEntity<Department[]> response = this.restTemplate.getForEntity(url,Department[].class);
        System.out.println(Arrays.asList(response.getBody()));
        assertAll(
                () -> assertEquals(HttpStatus.OK,response.getStatusCode()),
                () -> assertTrue(response.getBody().length == 0)
        );
    }
}
