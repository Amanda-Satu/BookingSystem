package za.ac.cput.domain.Factory.Repository;
/* author:sphesihle slingile
230310257
date: 28 March 2025
 */

import za.ac.cput.domain.Payment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class PaymentRepositoryTest {
private PaymentRepository repository;
private Payment payment;

@BeforeEach
    void setUp() {
    repository = PaymentRepository.getRepository();
    payment = new Payment.Builder()
            .setPaymentId(200)
            .setBookingId(300)
            .setPaymentMethod("Cheque")
            .build();
}
@Test
    public void create(){
    Payment paymentCreated = repository.create(payment);
    assertNotNull(paymentCreated);
    assertEquals(payment.getPaymentId(), paymentCreated.getPaymentId());
}
@Test
    public void read(){
    repository.create(payment);
    Payment paymentRead = repository.read(payment.getPaymentId());
    assertNotNull(paymentRead);
    assertEquals(200, paymentRead.getPaymentId());
}
@Test
    public void update(){
    repository.create(payment);
    payment = new Payment.Builder()
            .setPaymentId(200)
            .setBookingId(300)
            .setPaymentMethod("Debit")
            .build();
    Payment paymentUpdated = repository.update(payment);
    assertNotNull(paymentUpdated);
    assertEquals("Debit", paymentUpdated.getPaymentMethod());
}
@Disabled
@Test
    public void delete(){
    repository.create(payment);
    boolean deleted = repository.delete(200);
    assertFalse(deleted);
}
@Test
    public void getAll(){
    repository.create(payment);
    assertFalse(repository.getAll().isEmpty());
}
}