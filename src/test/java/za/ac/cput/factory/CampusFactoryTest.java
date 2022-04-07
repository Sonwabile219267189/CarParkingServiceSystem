package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Campus;

import static org.junit.jupiter.api.Assertions.*;

class CampusFactoryTest {

    @Test
    public void testCreateCampus(){
        Campus campus = CampusFactory.build("44332","District 6 Campus","Cape Town");
        assertNotNull(campus);
        System.out.println(campus.toString());
    }

}