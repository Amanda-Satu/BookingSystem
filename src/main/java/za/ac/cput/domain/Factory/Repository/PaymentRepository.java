package za.ac.cput.domain.Factory.Repository;

import za.ac.cput.domain.Payment;

import java.util.ArrayList;
import java.util.List;

public class PaymentRepository implements IPaymentRepository {
    private static PaymentRepository repository = null;
    private List<Payment> paymentList;
    private PaymentRepository() {
        paymentList = new ArrayList<>();
    }
    public static PaymentRepository getRepository(){
        if(repository == null){
            repository = new PaymentRepository();
        } return repository;
    }
    @Override
    public List<Payment> getAll(){
        return paymentList;
    }

    @Override
    public Payment read(Payment payment) {
        return null;
    }

    @Override
    public Payment create(Payment payment) {
        boolean success = paymentList.add(payment);
        if(success){
            return payment;
        }
        return null;
    }
    @Override
    public Payment read(Integer id) {
        for(Payment payment : paymentList){
            if(payment.getPaymentId() == id){
                    return payment;
                }}
    return null;}

    @Override
    public Payment update(Payment payment){
                Payment oldPayment = read(payment.getPaymentId());
                if (oldPayment != null) {
                    paymentList.remove(oldPayment);
                    paymentList.add(payment);
                    return payment;
                }
                return null;}
    public boolean delete(Integer id){
             Payment oldPayment = read(id);
             if (oldPayment != null) {
                 paymentList.remove(oldPayment);

             }
             return false;}

}
