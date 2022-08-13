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
        Admin admin = AdminFactory.createAdmin("20041022", "Jacky", "Ndlela");
        System.out.println(admin);
        assertNotNull(admin);
    }

}