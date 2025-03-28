package za.ac.cput.domain.Factory.Repository;

import za.ac.cput.domain.Payment;

import java.util.List;

public interface IPaymentRepository extends IRepository<Payment, Integer>{
    List<Payment> getAll();

    Payment read(Payment payment);
}
