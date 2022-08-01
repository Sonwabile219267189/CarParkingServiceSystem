/**
 * CampusFactoryTest.java
 * Test class to test CampusFactory.java class
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 6 April 2022
 */
package za.ac.cput.carparkingservicesystem.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.carparkingservicesystem.entity.Campus;

import static org.junit.jupiter.api.Assertions.*;

class CampusFactoryTest {

    Campus campus = CampusFactory.build("District 6 Campus", "Cape Town");

    @Test
    public void testCreateCampus(){
        Campus campus1 = CampusFactory.build("District 6 Campus","Cape Town");
        assertNotNull(campus1);
        System.out.println(campus1.toString());
    }


    @Test
    public void testNotSame(){
        Campus campusCopy = new Campus.Builder()
                .copy(campus)
                .build();
        assertNotSame(campusCopy,campus);
        System.out.println("CampusCopy: " + campusCopy.toString());
        System.out.println("CampusCopy: " + campus.toString());

    }



}