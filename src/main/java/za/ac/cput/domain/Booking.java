package za.ac.cput.domain;


import java.time.LocalDateTime;

public class Booking {
    private String bookingId;
    private String customerId;
    private String painterId;
    private String serviceId;
    private LocalDateTime dateTime;
    private String status;
    private double totalCost;

    // Private Constructor for Builder Pattern
    private Booking(Builder builder) {
        this.bookingId = builder.bookingId;
        this.customerId = builder.customerId;
        this.painterId = builder.painterId;
        this.serviceId = builder.serviceId;
        this.dateTime = builder.dateTime;
        this.status = builder.status;
        this.totalCost = builder.totalCost;
    }

    // Getters
    public String getBookingId() { return bookingId; }
    public String getCustomerId() { return customerId; }
    public String getPainterId() { return painterId; }
    public String getServiceId() { return serviceId; }
    public LocalDateTime getDateTime() { return dateTime; }
    public String getStatus() { return status; }
    public double getTotalCost() { return totalCost; }

    // Builder Class
    public static class Builder {
        private String bookingId;
        private String customerId;
        private String painterId;
        private String serviceId;
        private LocalDateTime dateTime;
        private String status;
        private double totalCost;

        public Builder setBookingId(String bookingId) {
            this.bookingId = bookingId;
            return this;
        }

        public Builder setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder setPainterId(String painterId) {
            this.painterId = painterId;
            return this;
        }

        public Builder setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        public Builder setDateTime(LocalDateTime dateTime) {
            this.dateTime = dateTime;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Builder setTotalCost(double totalCost) {
            this.totalCost = totalCost;
            return this;
        }

        public Booking build() {
            return new Booking(this);
        }
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", painterId='" + painterId + '\'' +
                ", serviceId='" + serviceId + '\'' +
                ", dateTime=" + dateTime +
                ", status='" + status + '\'' +
                ", totalCost=" + totalCost +
                '}';
    }
}