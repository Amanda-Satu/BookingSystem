package za.ac.cput.repository;
/*
Author: Siyamthanda Rolomana (217149073)
Date: 26 March 2025
 */
import org.junit.jupiter.api.*;
import za.ac.cput.domain.Admin;
import za.ac.cput.factory.AdminFactory;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class AdminRepositoryTest {
    private static AdminRepository repository = AdminRepository.getRepository();

    private static Admin admin = AdminFactory.createAdmin("admin@service.com", "password123", "Admin");

    @Test
    void a_create() {
        Admin created = repository.create(admin);
        assertNotNull(created);
        assertEquals(admin.getEmail(), created.getEmail());
        System.out.println("Created: " + created);
    }

    @Test
    void b_read() {
        Admin found = repository.read(admin.getEmail());
        assertNotNull(found);
        System.out.println("Read: " + found);
    }

    @Test
    void c_update() {
        Admin updated = new Admin.Builder()
                .copy(admin)
                .setEmail("newemail@service.com")
                .build();

        assertNotNull(repository.update(updated));
        assertEquals("newemail@service.com", repository.read(updated.getEmail()).getEmail());
        System.out.println("Updated: " + repository.read(updated.getEmail()));
    }

    @Test
    void d_delete() {
        boolean success = repository.delete(admin.getEmail());
        assertTrue(success);
        assertNull(repository.read(admin.getEmail()));
        System.out.println("Deleted: " + success);
    }

    @Test
    void e_getAll() {
        List<Admin> adminList = repository.getAll();
        assertNotNull(adminList);
        System.out.println("Admins: " + adminList);
    }
}