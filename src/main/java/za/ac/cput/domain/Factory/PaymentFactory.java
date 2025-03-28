package za.ac.cput.domain.Factory;

import java.time.LocalDate;
import za.ac.cput.domain.Payment;
/* author:sphesihle slingile
230310257
date: 26 March 2025
 */
public class PaymentFactory {
    public static Payment createPayment( int paymentId,int bookingId,double amount,LocalDate paymentDate,
                                         String paymentMethod,String paymentStatus){

        if(paymentId <=0){
            throw new IllegalArgumentException("paymentId must be greater than 0");
        }
        if(bookingId <=0){
            throw new IllegalArgumentException("bookingId must be greater than 0");
        }
        if(amount <=0){
            throw new IllegalArgumentException("amount must be greater than 0");
        }
        if(paymentDate==null){
            throw new IllegalArgumentException("paymentDate must be entered");
        }
        if(paymentMethod.isEmpty()){
            throw new IllegalArgumentException("paymentMethod must be entered");
        }
//        if(paymentStatus.isEmpty()){
//            throw new IllegalArgumentException("paymentMethod must be entered");
//        }
        return new Payment.Builder()
                .setPaymentId(paymentId)
                .setBookingId(bookingId)
                .setAmount(amount)
                .setPaymentDate(paymentDate)
                .setPaymentMethod(paymentMethod)
                .setPaymentStatus(paymentStatus)
                .build();
    }
}
