/*RoleControllerTest.java
   test for the role controller
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
import za.ac.cput.factory.RoleFactory;
import za.ac.cput.factory.UserFactory;
import za.ac.cput.factory.VehicleFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@ExtendWith(SpringExtension.class)
public class RoleControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private RoleController controller;
    @Autowired
    private TestRestTemplate restTemplate;

    private Role role;
    private String baseUrl;

    @BeforeEach
    void setUp(){
        this.role= RoleFactory.createRole("Student");

        this.baseUrl="http://localhost:" + this.port+ "carparkingservice/role";
    }

    //CRUD Testing
    // C-> Create
    @Test
    //@Disabled
    void a_create() {
        String url=baseUrl +"/create";
        System.out.println(url);
        ResponseEntity<Role> response = this.restTemplate
                .postForEntity(url, this.role, Role.class);
        System.out.println(response);
        assertAll(
                ()->assertEquals(HttpStatus.OK,response.getStatusCode()),
                ()-> assertNotNull(response.getBody())
        );
    }

    //CRUD Testing
    // R-> Read
    @Test
    void b_read() {
        String url=baseUrl + "/read/" + this.role.getRoleId();
        System.out.println("URL: "+ url);
       // System.out.println(role);//
        ResponseEntity<Role> response= this.restTemplate.postForEntity(url, this.role, Role.class);
        System.out.println(response);

    }

    //CRUD Testing
    // U-> update
    @Test
    void c_update() {

        String url=baseUrl+ "/update";
        System.out.println("URL: "+ url);
        Role updated = new Role.Builder().copy(role).setRoleId(role.getRoleId()).setRoleName("Lecturer").build();
        System.out.println("Post data: "+ updated);
        ResponseEntity<Role> response= restTemplate.postForEntity(url, updated,Role.class);
        //assertNotNull(response.getBody());



    }


    @Test
    void e_delete() {
        String url=baseUrl+ "/delete/"+ role.getRoleId();
        System.out.println("URL: "+ url);
        restTemplate.delete(url);


    }

    @Test
    void d_getAll() {
        String url=baseUrl + "/getall";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity= new HttpEntity<>(null, headers);
        ResponseEntity<String> response= restTemplate.exchange(url, HttpMethod.GET,entity, String.class);
        System.out.println("Show ALL: ");
        System.out.println(response);
        System.out.println(response.getBody());


    }


}