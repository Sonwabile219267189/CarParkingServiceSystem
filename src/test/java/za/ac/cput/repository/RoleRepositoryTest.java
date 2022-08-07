//package za.ac.cput.repository;
//
///*RoleRepositoryTest.java
//  Test for the RoleRepository
//  Author: Zintle Zothe (216130565)
//  Date: 08 April 2022
// */
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import za.ac.cput.entity.Role;
//import za.ac.cput.factory.RoleFactory;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@TestMethodOrder(MethodOrderer.MethodName.class)
//
//public class RoleRepositoryTest {
//    private static RoleRepository repository=RoleRepository.getRepository();
//    private static Role role= RoleFactory.createRole("Student");
//
//
//    // CRUD
//    // C->Create test
//    @Test
//    void a_create() {
//        Role created = repository.create(role);
//        assertNotNull(created);
//        assertEquals(created.getRoleId(),role.getRoleId());
//        System.out.println(created+ " created successfully ");
//
//    }
//
//    // CRUD
//// R->Read test
//    @Test
//    void b_read() {
//        Role read= repository.read(role.getRoleId());
//        assertNotNull(read);
//        assertEquals(read.getRoleId(),role.getRoleId());
//        System.out.println("Read: "+ read);
//    }
//
//    // CRUD
//// U->Update test
//    @Test
//    void c_update() {
//        Role updated =new Role.Builder().copy(role).setRoleName("Guest").build();
//        assertNotNull(repository.update(updated));
//        System.out.println("Update: "+ updated);
//    }
//
//    // CRUD
//// D->Delete test
//    @Test
//    void e_delete() {
//        boolean deleted = repository.delete(role.getRoleId());
//        assertTrue(deleted);
//        System.out.println("Delete: "+ true);
//
//    }
//
//    //getAll test
//    @Test
//    void d_getAll() {
//        System.out.print("display all roles: ");
//        System.out.println(repository.getAll());
//    }
//}