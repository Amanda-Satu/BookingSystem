package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Painter;

import static org.junit.jupiter.api.Assertions.*;

class PainterFactoryTest {

    @Test
    void testCreatePainter_Success() {
        Painter painter = PainterFactory.createPainter("P001", "John Daniel", "johnDaniel@example.com", "0812345678", "Celing Painting");
        assertNotNull(painter);
        assertEquals("P001", painter.getPainterID());
        assertEquals("John Daniel", painter.getName());
        assertEquals("johnDaniel@example.com", painter.getEmail());
        assertEquals("0812345678", painter.getPhoneNumber());
        assertEquals("Celing Painting", painter.getRole());
    }
    @Test
    void testCreatePainter_InvalidEmail() {
        Painter painter = PainterFactory.createPainter("P002", "John Daniel", "", "0723456789", "Pool painting");
        assertNull(painter);}

}
