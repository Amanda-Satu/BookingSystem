package za.ac.cput.domain.Factory;

/* author:sphesihle slingile
230310257
date: 26 March 2025
 */
import za.ac.cput.domain.Payment;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;


class PaymentFactoryTest {
    @Test
    void createPayment() {
        int paymentId = 200;
        int bookingId = 201;
        double amount = 10.0;
        LocalDate paymentDate = LocalDate.of(2025,12,12);
        String paymentMethod = "Cheque";
        String paymentStatus = "Pending";

        Payment payment1 = PaymentFactory.createPayment(paymentId, bookingId, amount,
                paymentDate, paymentMethod, paymentStatus);
        assertNotNull(payment1);
        assertEquals(paymentId, payment1.getPaymentId());
        assertEquals(bookingId, payment1.getBookingId());
        assertEquals(amount, payment1.amount());
        assertEquals(paymentDate, payment1.getPaymentDate());
        assertEquals(paymentMethod, payment1.getPaymentMethod());
        assertEquals(paymentStatus, payment1.getPaymentStatus());
    }
    @Test
    void testCreateWithInvalidPaymentId() {
        int paymentId = 0;
        int bookingId = 201;
        double amount = 10.0;
        LocalDate paymentDate = LocalDate.of(2025,12,12);
        String paymentMethod = "Cheque";
        String paymentStatus = "Pending";
        IllegalArgumentException iaException = assertThrows(IllegalArgumentException.class, () -> {
            PaymentFactory.createPayment( paymentId, bookingId,amount,
                    paymentDate, paymentMethod, paymentStatus);
        });
        assertEquals("paymentId must be greater than 0", iaException.getMessage());
    }
    @Test
    void testCreateWithInvalidBookingId() {
        int paymentId = 200;
        int bookingId = -201;
        double amount = 10.0;
        LocalDate paymentDate = LocalDate.of(2025,12,12);
        String paymentMethod = "Cheque";
        String paymentStatus = "Pending";
        IllegalArgumentException iaException = assertThrows(IllegalArgumentException.class, () -> {
            PaymentFactory.createPayment( paymentId, bookingId,amount,
                    paymentDate, paymentMethod, paymentStatus);
        });
        assertEquals("bookingId must be greater than 0", iaException.getMessage());
    }
    @Test
    void testCreateWithInvalidAmount() {
        int paymentId = 200;
        int bookingId = 201;
        double amount = -10.0;
        LocalDate paymentDate = LocalDate.of(2025,12,12);
        String paymentMethod = "Cheque";
        String paymentStatus = "Pending";
        IllegalArgumentException iaException = assertThrows(IllegalArgumentException.class, () -> {
            PaymentFactory.createPayment( paymentId, bookingId,amount,
                    paymentDate, paymentMethod, paymentStatus);
        });
        assertEquals("amount must be greater than 0", iaException.getMessage());
    }
    @Test
    void testCreateWithInvalidPaymentDate() {
        int paymentId = 200;
        int bookingId = 201;
        double amount = 10.0;
        LocalDate paymentDate = null;
        String paymentMethod = "Cheque";
        String paymentStatus = "Pending";
        IllegalArgumentException iaException = assertThrows(IllegalArgumentException.class, () -> {
            PaymentFactory.createPayment( paymentId, bookingId,amount,
                    paymentDate, paymentMethod, paymentStatus);
        });
        assertEquals("paymentDate must be entered", iaException.getMessage());
    }
    @Test
    void testCreateWithInvalidPaymentMethod() {
        int paymentId = 200;
        int bookingId = 201;
        double amount = 10.0;
        LocalDate paymentDate = LocalDate.of(2025,12,12);
        String paymentMethod = "";
        String paymentStatus = "Pending";
        IllegalArgumentException iaException = assertThrows(IllegalArgumentException.class,() -> {
            PaymentFactory.createPayment( paymentId, bookingId,amount,
                    paymentDate, paymentMethod, paymentStatus);
        });
        assertEquals("paymentMethod must be entered", iaException.getMessage());
    }
//    @Test
//    void testCreateWithInvalidPaymentStatus() {
//        int paymentId = 200;
//        int bookingId = 201;
//        double amount = 10.0;
//        LocalDate paymentDate = LocalDate.of(2025,12,12);
//        String paymentMethod = "Cheque";
//        String paymentStatus = "";
//        IllegalArgumentException iaException = assertThrows(IllegalArgumentException.class, () -> {
//            PaymentFactory.createPayment( paymentId, bookingId,amount,
//                    paymentDate, paymentMethod, paymentStatus);
//        });
//        assertEquals("paymentStatus must be greater than 0", iaException.getMessage());
//    }
}