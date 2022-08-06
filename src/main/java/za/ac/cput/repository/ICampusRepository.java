/**
 * ICampusRepository.java
 * Interface for other classes to extend
 * Author: Sonwabile Gxoyiya (219267189)
 * Date: 9 April 2022
 */
package za.ac.cput.repository;

import java.util.List;
import za.ac.cput.entity.Campus;
@Deprecated
public interface ICampusRepository extends IRepository<Campus, String>{

    public List<Campus> getAll();
}
