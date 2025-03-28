package za.ac.cput.repository;
//Amanda Satu(221094008)

import za.ac.cput.domain.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {

    private static CustomerRepository repository = null;
    private List<Customer> customerList;

    private CustomerRepository() {
        customerList = new ArrayList<Customer>();
    }

    public static CustomerRepository getRepository() {
        if (repository == null) {
            repository = new CustomerRepository();
        }
        return repository;
    }

    @Override
    public List<Customer> getAll() {
        return customerList;
    }

    @Override
    public Customer create(Customer customer) {
        boolean success = customerList.add(customer);
        if(success){
            return customer;
        }
        return null;
    }

    @Override
    public Customer read(String id) {
        for(Customer customer : customerList){
            if(customer.getCustomerID().equals(id)){
                return customer;
            }
        }
        return null;
    }

    @Override
    public Customer update(Customer customer) {
        Customer customerOld = read(customer.getCustomerID());
        if(customerOld != null){
            customerList.remove(customerOld);
            customerList.add(customer);
            return customer;
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        Customer customer = read(id);
        if(customer != null){
            customerList.remove(customer);
            return true;
        }
      return false;
    }
}//end