/*Payment.java
 * PaymentFactory entity
 *Author : Hlombekazi Mbelu 209024666
 * Date 7 April 2022
 */
package za.ac.cput.factory;

import za.ac.cput.entity.Payment;
import za.ac.cput.util.Helper;

public class PaymentFactory {
    public static Payment createPayment(Double paymentAmount , String bankAccount )
    {
        String pay = Helper.generateUUID();
        Payment payment= new Payment.Builder()
                .setPaymentId(pay)
                .setPaymentAmount(paymentAmount)
                .setBankNumber(bankAccount)
                .build();

        return payment;
    }

}
