package za.ac.cput.repository;

import za.ac.cput.domain.Booking;

import java.util.HashSet;
import java.util.Set;

public class BookingRepositoryImpl implements BookingRepository {
    private static BookingRepositoryImpl repository = null;
    private Set<Booking> bookingDB;

    private BookingRepositoryImpl() {
        this.bookingDB = new HashSet<>();
    }

    public static BookingRepositoryImpl getRepository() {
        if (repository == null) {
            repository = new BookingRepositoryImpl();
        }
        return repository;
    }

    @Override
    public Booking create(Booking booking) {
        this.bookingDB.add(booking);
        return booking;
    }

    @Override
    public Booking read(String bookingId) {
        return bookingDB.stream()
                .filter(b -> b.getBookingId().equals(bookingId))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Booking update(Booking booking) {
        Booking oldBooking = read(booking.getBookingId());
        if (oldBooking != null) {
            bookingDB.remove(oldBooking);
            bookingDB.add(booking);
            return booking;
        }
        return null;
    }

    @Override
    public boolean delete(String bookingId) {
        Booking booking = read(bookingId);
        if (booking != null) {
            bookingDB.remove(booking);
            return true;
        }
        return false;
    }

    @Override
    public Set<Booking> getAll() {
        return bookingDB;
    }
}
