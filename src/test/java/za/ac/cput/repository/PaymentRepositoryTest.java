package za.ac.cput.repository;
/**
 * PaymentRepositoryTest.java
  * Interface class
  * Author: Hlombekazi Mbelu (209024666)
  * Date: 9 April 2022
 * */
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.entity.Payment;
import za.ac.cput.factory.PaymentFactory;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
@SpringBootTest
class PaymentRepositoryTest {
     public static IPaymentRepository paymentRepository ;
      Payment payment = PaymentFactory.createPayment(50.78 , "245016444");

    @Test
    void a_getAll() {
        System.out.println("Show all :  " +payment);
        System.out.println(paymentRepository.getAll());
    }

    @Test
    void b_create() {
        Payment created = paymentRepository.save(payment);
        assertNotNull(created);
       System.out.println("Create : " + created);
    }

    @Test
    void d_read() {
        Payment save = paymentRepository.save(payment);
        Optional<Payment> read = paymentRepository.findById(
                payment.getPaymentID());
        assertNotNull(read);
        System.out.println("Read reservation: " + read);
    }

    @Test
    void c_update() {
        Payment updated = new Payment.Builder().copy(payment).build();
         assertNull(paymentRepository.save(updated));
          System.out.println("Update : " + updated);
    }

    @Test
    void e_delete() {
        Payment delete = paymentRepository.save(payment);

        paymentRepository.deleteAll();
        System.out.println(paymentRepository.findAll());
    }
}