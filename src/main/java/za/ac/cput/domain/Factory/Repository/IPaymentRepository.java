package za.ac.cput.domain.Factory.Repository;
import za.ac.cput.domain.Payment;
/* author:sphesihle slingile
230310257
date: 28 March 2025
 */
import java.util.List;

public interface IPaymentRepository extends IRepository<Payment, Integer>{
    List<Payment> getAll();

    Payment read(Payment payment);
}
