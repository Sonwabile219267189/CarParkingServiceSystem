/**
 * ICampusRepository.java
 * Interface for other classes to extend
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 9 April 2022
 */
package za.ac.cput.repository;

import java.util.List;
import za.ac.cput.entity.Campus;
<<<<<<< HEAD:src/main/java/za/ac/cput/repository/ICampusRepository.java

=======
@Deprecated
>>>>>>> 219267189:src/main/java/za/ac/cput/carparkingservicesystem/repository/ICampusRepository.java
public interface ICampusRepository extends IRepository<Campus, String>{

    public List<Campus> getAll();
}
