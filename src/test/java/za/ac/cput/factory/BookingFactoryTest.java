package za.ac.cput.factory;

import za.ac.cput.domain.Booking;
import za.ac.cput.factory.BookingFactory;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class BookingFactoryTest {

    @Test
    void testCreateBooking() {
        // Arrange (Setup Test Data)
        String bookingId = "B123";
        String customerId = "C456";
        String painterId = "P789";
        String serviceId = "S101";
        String dateTime = "2025-03-24 14:00";
        String status = "Pending";
        double totalCost = 1500.00;

        // Act (Call Factory Method)
        Booking booking = BookingFactory.createBooking(bookingId, customerId, painterId, serviceId, LocalDateTime.parse(dateTime), status, totalCost);

        // Assert (Verify the Output)
        assertNotNull(booking);
        assertEquals(bookingId, booking.getBookingId());
        assertEquals(customerId, booking.getCustomerId());
        assertEquals(painterId, booking.getPainterId());
        assertEquals(serviceId, booking.getServiceId());
        assertEquals(dateTime, booking.getDateTime());
        assertEquals(status, booking.getStatus());
        assertEquals(totalCost, booking.getTotalCost());
    }
}
