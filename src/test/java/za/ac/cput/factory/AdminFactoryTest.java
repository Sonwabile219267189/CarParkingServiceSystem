/* AdminFactoryTest.java
   Author: Nikiwe Mkontshwana (214236714)
   FactoryTest-Admin
   Date: 09April2022
 */


package za.ac.cput.factory;

import org.junit.jupiter.api.*;
import za.ac.cput.entity.Admin;

import static org.junit.jupiter.api.Assertions.*;

class AdminFactoryTest {
    @Test
    public void test(){
        Admin admin = AdminFactory.build("202204", "Jacky", "Ndlela");
        System.out.println(admin);
        assertNotNull(admin);
    }
    @Test
    public void testAdmin(){
        Admin admin = AdminFactory.build("202204","Jacky","Ndlela");
        Admin admin2 = AdminFactory.build("202205","Lebo",
                "Ntaba");
        assertNotSame(admin,admin2);
        System.out.println(admin.toString());
        System.out.println(admin2.toString());
    }

}