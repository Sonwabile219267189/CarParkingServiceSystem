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
import za.ac.cput.entity.Payment;
import za.ac.cput.factory.PaymentFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)

class PaymentRepositoryTest {
     public static PaymentRepository paymentRepository = PaymentRepository.getRepository();
      Payment payment = PaymentFactory.createPayment(50.78 , "245016444");

    @Test
    void a_getAll() {
        System.out.println("Show all : ");
        System.out.println(paymentRepository.getAll());
    }

    @Test
    void b_create() {
        Payment created = paymentRepository.create(payment);
        assertNull(created);
       System.out.println("Create : " + created);
    }

    @Test
    void c_read() {
        Payment read = paymentRepository.read(String.valueOf(payment));
       assertNull(read);
       System.out.println("Read : " + read);
    }

    @Test
    void d_update() {
        Payment updated = new Payment.Builder().copy(payment).build();
         assertNull(paymentRepository.update(updated));
          System.out.println("Update : " + updated);
    }

    @Test
    void e_delete() {
        boolean success = paymentRepository.delete(payment.getPaymentID());
        assertNotNull(success);
        System.out.println("Delete : " + success);
    }
}