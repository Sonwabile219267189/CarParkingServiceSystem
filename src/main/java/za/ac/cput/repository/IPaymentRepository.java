package za.ac.cput.repository;
/**
 * IPaymentRepository.java
 * Interface Class
 * Author: Hlombekazi Mbelu (209024666)
 * Date: 9 April 2022
 */


import java.util.List;
import za.ac.cput.entity.Payment;

public interface IPaymentRepository extends IRepository<Payment, String>{
    public List<Payment> getAll();
}
