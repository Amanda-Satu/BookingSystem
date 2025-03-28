package za.ac.cput.repository;
//Sinhle Xiluva Mthethwa
//221802797

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Painter;
import za.ac.cput.factory.PainterFactory;


import java.util.List;


@TestMethodOrder(MethodOrderer.MethodName.class)
public class PainterRepositoryTest {
    private static PainterRepository repository = PainterRepository.getRepository();

    private static Painter painter = PainterFactory.createPainter("123456", "Simon Smith", "simon@gmail.com", "0124567890","roofPainter");

    @Test
    void a_create() {
        Painter created = repository.create(painter);
        assertNotNull(created);
        assertEquals(painter.getPainterID(), created.getPainterID());
        System.out.println("Created: " + created);
    }

    @Test
    void b_read() {
        Painter found = repository.read(painter.getPainterID());
        assertNotNull(found);
        System.out.println("Read: " + found);
    }

    @Test
    void c_update() {
        Painter updated = new Painter.Builder()
                .copy(painter)
                .setPainterID("234567")
                .build();

        assertNotNull(repository.update(updated));
        assertEquals("234567", repository.read(updated.getPainterID()).getPainterID());
        System.out.println("Updated: " + repository.read(updated.getPainterID()));
    }

    @Test
    void d_delete() {
        boolean success = repository.delete(painter.getPainterID());
        assertTrue(success);
        assertNull(repository.read(painter.getPainterID()));
        System.out.println("Deleted: " + success);
    }

    @Test
    void e_getAll() {
        List<Painter> painterList = repository.getAll();
        assertNotNull(painterList);
        System.out.println("Painter: " + painterList);
    }
}