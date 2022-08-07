package za.ac.cput.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.entity.ParkingLot;
import za.ac.cput.entity.ParkingSpace;
import za.ac.cput.factory.ParkingLotFactory;
import za.ac.cput.factory.ParkingSpaceFactory;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class IParkingSpaceRepositoryTest {
    @Autowired
    private IParkingSpaceRepository repository;
    private static ParkingLot parkingLot = ParkingLotFactory.build("District 6", "1");
    private static ParkingSpace parkingSpace = ParkingSpaceFactory.build("3",parkingLot.getParkingLotID(),false);
    private static ParkingSpace parkingSpace1 = ParkingSpaceFactory.build("4",parkingLot.getParkingLotID(),true);

    @Test
    void save(){
        ParkingSpace savePS = repository.save(parkingSpace);
        assertNotNull(savePS);
        System.out.println("[Save Result]: " + savePS);
    }

    @Test
    void read(){
        ParkingSpace savePS = repository.save(parkingSpace);
        ParkingSpace savePS1 = repository.save(parkingSpace1);

        Optional<ParkingSpace> read = repository.findById(parkingSpace1.getParkingSpaceID());
        assertNotNull(read);
        System.out.println("[Read result]: " + read);
    }

    @Test
    void showAll(){
        ParkingSpace savePS = repository.save(parkingSpace);
        ParkingSpace savePS1 = repository.save(parkingSpace1);

        System.out.println("[ShowAll result]: " + repository.findAll());
    }

    @Test
    void delete(){
        ParkingSpace savePS = repository.save(parkingSpace);
        ParkingSpace savePS1 = repository.save(parkingSpace1);

        repository.deleteAll();
        System.out.println(repository.findAll());
    }

}