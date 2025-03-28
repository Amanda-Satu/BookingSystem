package za.ac.cput.repository;
// Amanda Satu (221094008)

import za.ac.cput.domain.Customer;
import java.util.List;

public interface ICustomerRepository extends IRepository<Customer, String>{

    List<Customer> getAll();



}
