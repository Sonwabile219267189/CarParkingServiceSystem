/*Payment.java
 * Payment entity
 *Author : Hlombekazi Mbelu 209024666
 * Date 7 April 2022
 */
package za.ac.cput.entity;

public class Payment {
    private String paymentId ;
    private  double paymentAmount;
    private String bankNumber;

    private Payment(Builder builder)
    {
        this.paymentId =  builder.paymentId;
        this.paymentAmount = builder.paymentAmount;
        this.bankNumber = builder.bankNumber;
    }
    @Override
    public String toString() {
        return "Payment{" +
                "paymentId='" + paymentId + '\'' +
                ", paymentAmount='" + paymentAmount + '\'' +
                ", bankNumber=" + bankNumber +
                '}';
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public static class Builder {

        private String paymentId;
        private double paymentAmount;
        private String bankNumber;

        public Builder setPaymentId(String paymentId) {
            this.paymentId = paymentId;
            return this;
        }

        public Builder setPaymentAmount(Double paymentAmount) {
            this.paymentAmount = paymentAmount;
            return this;
        }

        public Builder setBankNumber(String bankNumber) {
            this.bankNumber = bankNumber;
            return this;
        }

        public Builder copy(Payment payment) {
            this.paymentId = payment.paymentId;
            this.paymentAmount = payment.paymentAmount;
            this.bankNumber = payment.bankNumber;
            return this;
        }

        public Payment build() {
            return new Payment(this);
        }

    }
}
