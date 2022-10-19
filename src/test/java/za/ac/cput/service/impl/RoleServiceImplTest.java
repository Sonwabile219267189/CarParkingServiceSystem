/*RoleServiceTest.java
  Test for the RoleService
  Author: Zintle Zothe (216130565)
  Date: August 2022
 */
package za.ac.cput.service.impl;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.entity.ParkingLot;
import za.ac.cput.entity.Role;
import za.ac.cput.factory.RoleFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
class RoleServiceImplTest {
    @Autowired
    private RoleServiceImpl service;

    private static Role role1 = RoleFactory.createRole("Student");
    private static Role role2 = RoleFactory.createRole("Lecturer");

    @Test
    void a_create(){
        Role created1= service.create(role1);
        assertNotNull(created1);
        assertEquals(created1.getRoleId(),role1.getRoleId());
        System.out.println("Create: "+created1);

        Role created2= service.create(role2);
        assertNotNull(created2);
        assertEquals(created2.getRoleId(),role2.getRoleId());
        System.out.println("Create: "+created2);
    }

    @Test
    void b_read(){
        Role read =service.read(role1.getRoleId());
        assertNotNull(read);
        assertEquals(read.getRoleId(),role1.getRoleId());
        System.out.println("Read: "+read);
    }

    @Test
    void c_update(){
        Role oldRole =service.read(role1.getRoleId());
        Role updated= this.service.update(new Role.Builder().copy(oldRole).setRoleName("lecturer").build());
        assertNotNull(updated);
        System.out.println("Updated : "+ updated);

    }

    @Test
    void e_delete(){
        boolean success=service.delete(role1.getRoleId());
        assertTrue(success);
        System.out.println("delete: "+ success);
    }

    @Test
    void d_getAll(){
        System.out.println("Show all: ");
        System.out.println(service.getAll());

    }


}