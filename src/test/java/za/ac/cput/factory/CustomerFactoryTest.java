package za.ac.cput.factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Customer;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class CustomerFactoryTest {

    private CustomerFactory factory;

    @BeforeEach
    void SetUp(){
        factory = new CustomerFactory();
    }

    @Test
    void testCreateCustomer(){

        Customer customer1 = CustomerFactory.createCustomer("cust123", "Sal Davids","saldavids33@yahoo.com",
                "sexySal33","0748512396","10 Nova Street", "Customer");

    assertNotNull(customer1);
    assertEquals("Sal Davids", customer1.getName());
    assertEquals("saldavids33@yahoo.com", customer1.getEmail());
    assertEquals("Customer", customer1.getRole());

    }

   @Test
   void testCreateCustomerWithEmptyName(){

        Exception ex = assertThrows(IllegalArgumentException.class, () ->
                CustomerFactory.createCustomer("cust123", "","saldavids33@yahoo.com",
                        "sexySal33","0748512396","10 Nova Street", "Customer"));

        assertEquals("Field name cannot be empty", ex.getMessage());
   }

    @Test
    void testCreateCustomerWithInvalidEmail() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
                CustomerFactory.createCustomer("cust123", "Sal Davids","saldavids33#yahoo.com",
                        "sexySal33","0748512396","10 Nova Street", "Customer"));

        assertEquals("Invalid email format", exception.getMessage());
    }

}//end