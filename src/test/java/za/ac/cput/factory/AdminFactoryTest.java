package za.ac.cput.factory;
/*
Author: Siyamthanda Rolomana (217149073)
Date: 26 March 2025
 */
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Admin;

import static org.junit.jupiter.api.Assertions.*;

class AdminFactoryTest {

    @Test
    void createAdmin() {
        Admin admin = AdminFactory.createAdmin("admin@gmail.com", "dsv9000", "admin");
        assertNotNull(admin);
        System.out.println(admin);
    }
    @Test
    void createAdmin_InvalidEmail() {
        Admin admin = AdminFactory.createAdmin("invalid-email", "dsv9000", "admin");
        assertNull(admin, "Admin should not be created with an invalid email");
    }

    @Test
    void createAdmin_NullPassword() {
        Admin admin = AdminFactory.createAdmin("admin@gmail.com", null, "admin");
        assertNull(admin, "Admin should not be created with a null password");
    }

    @Test
    void testAdminCopy() {
        Admin original = AdminFactory.createAdmin("admin@gmail.com", "dsv9000", "admin");
        assertNotNull(original);

        Admin copiedAdmin = new Admin.Builder().copy(original).build();
        assertNotNull(copiedAdmin);
        assertEquals(original.getEmail(), copiedAdmin.getEmail());
        assertEquals(original.getPassword(), copiedAdmin.getPassword());
        assertEquals(original.getRole(), copiedAdmin.getRole());
    }

}
