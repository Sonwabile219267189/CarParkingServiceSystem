/*PaymentFactoryTest .java
 * ScheduleFactory entity
 *Author : Hlombekazi Mbelu 209024666
 * Date 7 April 2022
 */
package za.ac.cput.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.entity.Payment;

import static org.junit.jupiter.api.Assertions.*;

class PaymentFactoryTest {

        Payment payment = PaymentFactory.createPayment(50.78 , "245016444");

        @Test
        public void paymentTest(){
            Assertions.assertEquals(payment, payment);
            Assertions.assertSame(payment,payment);
        }

        @Test
        @Disabled
        public void disableTest(){
            Assertions.assertEquals(payment, payment);
        }

        @Test
        @Timeout(value = 1000)
        public void testTimeout(){
            Assertions.assertEquals(payment, payment);
        }
}