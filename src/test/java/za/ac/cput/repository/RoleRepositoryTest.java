package za.ac.cput.repository;

/*RoleRepositoryTest.java
  Test for the RoleRepository
  Author: Zintle Zothe (216130565)
  Date: 08 April 2022
 */
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.entity.Role;
import za.ac.cput.entity.Vehicle;
import za.ac.cput.factory.RoleFactory;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@TestMethodOrder(MethodOrderer.MethodName.class)

public class RoleRepositoryTest{

    @Autowired
    private RoleRepository repository;
    private static Role role= RoleFactory.createRole("Student");


    @Test
    void b_save(){
        Role saved=repository.save(role);
        assertNotNull(saved);
        assertEquals(saved.getRoleId(),role.getRoleId());
        System.out.println("Saved: "+'\n'+saved);
    }



    @Test
    void c_read() {
        Role saved=repository.save(role);
        Optional<Role> read= repository.findById(saved.getRoleId());
        assertNotNull(saved);
        assertEquals(saved.getRoleId(),role.getRoleId());
        System.out.println("read "+'\n'+read.get());
    }

    @Test
    void a_delete() {
        Role saved = repository.save(role);
        List<Role> roleDB=repository.findAll();
        assertEquals(1,roleDB.size());
        repository.delete(saved);
        System.out.println("Roles on the list "+'\n'+roleDB);
        roleDB= repository.findAll();
        assertEquals(0,roleDB.size());
    }



    @Test
    void d_findAll() {
        System.out.print("display all roles: ");
        System.out.println(repository.findAll());
    }
}