package za.ac.cput.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Customer;

import static org.junit.jupiter.api.Assertions.*;

class CustomerRepositoryTest {
    private CustomerRepository repository;
    private Customer customer;

    @BeforeEach
    void setUp() {
       repository = CustomerRepository.getRepository();
       customer = new Customer.Builder()
               .setCustomerID("customer23")
               .setName("Shaun Murphy")
               .build();
    }

    @Test
    void create() {
        Customer created = repository.create(customer);
        assertNotNull(created);
        assertEquals(customer.getCustomerID(), created.getCustomerID());
    }

    @Test
    void read() {
        repository.create(customer);
        Customer read = repository.read(customer.getCustomerID());
        assertNotNull(read);
        assertEquals("customer23", read.getCustomerID());
    }

    @Test
    void update() {
        repository.create(customer);
        Customer updated = new Customer.Builder()
                .setCustomerID("customer23")
                .setName("Glassman")
                .build();

        repository.update(updated);
        Customer result = repository.update(updated);
        assertNotNull(result);
        assertEquals("Glassman", result.getName());
    }

    @Test
    void delete() {
        repository.create(customer);
        boolean deleted = repository.delete("customer23");
        assertTrue(deleted);
    }

    @Test
    void getAll() {
        repository.create(customer);
        assertFalse(repository.getAll().isEmpty());
    }

}//end