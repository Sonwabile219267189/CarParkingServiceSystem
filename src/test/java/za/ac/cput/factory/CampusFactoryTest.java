/**
 * CampusFactoryTest.java
 * Test class to test CampusFactory.java class
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 6 April 2022
 */
package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Campus;

import static org.junit.jupiter.api.Assertions.*;

class CampusFactoryTest {

    @Test
    public void testCreateCampus(){
        Campus campus = CampusFactory.build("District 6 Campus","Cape Town");
        assertNotNull(campus);
        System.out.println(campus.toString());
    }

}