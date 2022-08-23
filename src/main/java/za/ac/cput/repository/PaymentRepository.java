//package za.ac.cput.repository;
///**
// * PaymentRepository.java
// * Interface class
// * Author: Hlombekazi Mbelu (209024666)
// * Date: 9 April 2022
// */
//
//
//import za.ac.cput.entity.Campus;
//import za.ac.cput.entity.Payment;
//
//import java.util.*;
//
//public class PaymentRepository implements IPaymentRepository {
//
//    public static PaymentRepository repository = null;
//    private List<Payment> paymentDB = null;
//
//
//
//    private PaymentRepository() {
//        paymentDB = new ArrayList<>();
//
//    }
//
//    public static PaymentRepository getRepository() {
//        if (repository == null) {
//            repository = new PaymentRepository();
//        }
//        return repository;
//    }
//
//
//    @Override
//    public List<Payment> getAll() {
//        return paymentDB;
//    }
//
//    @Override
//    public Payment create(Payment payment) {
//        paymentDB.add(payment);
//        return payment;
//    }
//
//    @Override
//    public Payment read(String s) {
//        for(Payment payment :paymentDB)
//            if(payment.getPaymentID().equals(s)){
//                return payment;
//
//    }
//        return null;
//    }
//
//    @Override
//    public Payment update(Payment payment) {
//            Payment oldPayment = read(payment.getPaymentID());
//            if(oldPayment != null){
//                paymentDB.remove(oldPayment);
//                paymentDB.add(payment);
//                return payment;
//            }
//            return null;
//    }
//
//    @Override
//    public boolean delete(String s) {
//        Payment paymentDelete = read(s);
//        if(paymentDelete == null){
//            return false;
//        }
//        paymentDB.remove(paymentDelete);
//        return true;
//    }
//
//}