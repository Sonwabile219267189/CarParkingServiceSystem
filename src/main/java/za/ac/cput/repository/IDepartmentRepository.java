/* IDepartmentRepository.java
   Author: Nikiwe Mkontshwana(214236714)
   IDepartmentRepository
   Date: 08April2022
 */

package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.Department;

@Repository
public interface IDepartmentRepository extends JpaRepository<Department, String> {
}