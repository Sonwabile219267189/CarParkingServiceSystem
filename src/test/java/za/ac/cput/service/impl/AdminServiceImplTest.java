/* AdminServiceTest.java
   Author: Nikiwe Mkontshwana (214236714)
   FactoryTest-Admin
   Date: 18August2022
 */
package za.ac.cput.service.impl;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.entity.Admin;
import za.ac.cput.factory.AdminFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest

public class AdminServiceImplTest {
    @Autowired
    private AdminServiceImpl SERVICE;

    private static Admin admin = AdminFactory.build("202210","Libo",
            "Mbulu");

    @Test
    void create(){
        Admin create = this.SERVICE.create(admin);
        assertNotNull(create);
        System.out.println(create);
    }

    @Test
    void read(){
        Admin read = this.SERVICE.read(admin.getAdminId());
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    void update(){
        Admin update = this.SERVICE.update(new Admin.Builder()
                .copy(admin).setAdminId("202210").build());
        assertNotNull(update);
        System.out.println(update);
    }

    @Test
    void delete(){
        boolean delete = this.SERVICE.delete(admin.getAdminId());
        assertTrue(delete);
    }

    @Test
    void findAll(){
        List<Admin> findAll = this.SERVICE.findAll();
        assertNotNull(findAll);
        System.out.println(findAll);
    }
}


