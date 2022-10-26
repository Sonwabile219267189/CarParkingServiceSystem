//package za.ac.cput.service.impl;
//
//import org.junit.jupiter.api.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import za.ac.cput.entity.User;
//import za.ac.cput.entity.UserRole;
//import za.ac.cput.factory.UserRoleFactory;
//
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//@SpringBootTest
//public class UserRoleServiceImplTest {
//    @Autowired
//    private UserRoleServiceImpl service;
//    private static UserRole usrR = UserRoleFactory.build();
//
//    @BeforeAll
//    @Test
//    @Order(1)
//    void create(){
//        System.out.println("---------------UserRole created successfully-----------");
//        UserRole create = this.service.create(usrR);
//        assertNotNull(usrR);
//        System.out.println(create);
//
//    }
//
//    @Test
//    @Order(3)
//    void read(){
//        System.out.println("-------User in the database------------");
//        UserRole read = this.service.read(usrR.getUserID());
//        assertNotNull(read);
//        System.out.println(read);
//    }
//
//    @Test
//    @Order(2)
//    void update(){
//        System.out.println("---------------------User updated---------------");
//        UserRole update = this.service.update(new UserRole.Builder().copy(usrR).setUserID("ur0811111111").build());
//        assertNotNull(update);
//        System.out.println(update);
//
//    }
//
//    @Test
//    @Order(5)
//    void findAll(){
//        System.out.println("-------------------------show all users----------------------------");
//        List<UserRole> findAll = this.service.findAll();
//        assertNotNull(findAll);
//        System.out.println(findAll);
//    }
//
//    @Test
//    @Order(4)
//    void delete(){
//        System.out.println("------------------------------Users deleted-----------------------------");
//        boolean delete = this.service.delete(usrR.getUserID());
//        assertTrue(delete);
//
//    }
//}
