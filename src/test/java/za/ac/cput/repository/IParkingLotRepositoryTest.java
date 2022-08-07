package za.ac.cput.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.entity.ParkingLot;
import za.ac.cput.factory.ParkingLotFactory;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class IParkingLotRepositoryTest {
    @Autowired
    private IParkingLotRepository repository;
    private static ParkingLot parkingLot = ParkingLotFactory.build("District 6", "1");
    private static ParkingLot parkingLot1 = ParkingLotFactory.build("Bellvile Campus","2");


    @Test
    void save(){
        ParkingLot savePL = repository.save(parkingLot);
        assertNotNull(savePL);
        System.out.println("[Save Result]: " + savePL);
    }

    @Test
    void read(){
        ParkingLot savePL = repository.save(parkingLot);
        ParkingLot savePL1 = repository.save(parkingLot1);

        Optional<ParkingLot> read = repository.findById(parkingLot1.getParkingLotID());
        assertNotNull(read);
        System.out.println("[Read result]: " + read);
    }

    @Test
    void showAll(){
        ParkingLot savePL = repository.save(parkingLot);
        ParkingLot savePL1 = repository.save(parkingLot1);

        System.out.println(repository.findAll());
    }

    @Test
    void delete(){
        ParkingLot savePL = repository.save(parkingLot);
        ParkingLot savePL1 = repository.save(parkingLot1);

        repository.deleteAll();
        System.out.println(repository.findAll());
    }
}