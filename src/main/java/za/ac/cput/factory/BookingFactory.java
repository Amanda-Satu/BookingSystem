package za.ac.cput.factory;

import za.ac.cput.domain.Booking;

import java.time.LocalDateTime;

public class BookingFactory {
    public static Booking createBooking (String bookingId, String customerId, String painterId,
                                         String serviceId, LocalDateTime dateTime, String status, double totalCost) {
        return new Booking.Builder()
                .setBookingId(bookingId)
                .setCustomerId(customerId)
                .setPainterId(painterId)
                .setServiceId(serviceId)
                .setDateTime(dateTime)
                .setStatus(status)
                .setTotalCost(totalCost)
                .build();
    }
}