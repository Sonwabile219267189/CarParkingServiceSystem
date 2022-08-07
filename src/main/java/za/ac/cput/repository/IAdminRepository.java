/* IAdminRepository.java
   Author: Nikiwe Mkontshwana(214236714)
   IAdminRepository
   Date: 08April2022
 */

package za.ac.cput.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.Admin;

@Repository
public interface IAdminRepository extends JpaRepository<Admin, String> {
}
