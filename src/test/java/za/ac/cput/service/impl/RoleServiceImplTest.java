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
import za.ac.cput.entity.Role;
import za.ac.cput.factory.RoleFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
class RoleServiceImplTest {
    @Autowired
    private RoleServiceImpl service;

    private static Role role = RoleFactory.createRole("Student");

    @Test
    void a_create(){
        Role created= service.create(role);
        //assetNotNull(created);
        assertEquals(created.getRoleId(),role.getRoleId());
        System.out.println("Create: "+created);
    }

    @Test
    void b_read(){
        Role read =service.read(role.getRoleId());
        assertNotNull(read);
        assertEquals(read.getRoleId(),role.getRoleId());
        System.out.println("Read: "+read);
    }

    @Test
    void c_update(){
        Role oldRole =service.read(role.getRoleId());//insert id
        Role updated=new Role.Builder().copy(oldRole).setRoleName("Staff").build();
        assertNotNull(service.update(updated));
        System.out.println("Delete: "+ updated);
    }

    @Test
    ///@Disabled
    void e_delete(){
        boolean success=service.delete(role.getRoleId());
        assertTrue(success);
        System.out.println("delete: "+ success);
    }

    @Test
    //@Disabled
    void d_getAll(){
        System.out.println("Show all: ");
        System.out.println(service.getAll());

    }


}