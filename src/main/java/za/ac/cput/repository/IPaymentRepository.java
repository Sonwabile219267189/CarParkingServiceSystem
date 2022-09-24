package za.ac.cput.repository;
/**
 * IPaymentRepository.java
 * Interface Class
 * Author: Hlombekazi Mbelu (209024666)
 * Date: 9 April 2022
 */


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.Payment;
//import za.ac.cput.service.PaymentService;
@Repository
public interface IPaymentRepository extends JpaRepository<Payment, String> {

//    String getAll();
}
