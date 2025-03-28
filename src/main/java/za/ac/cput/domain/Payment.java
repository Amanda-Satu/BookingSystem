package za.ac.cput.domain;

import java.time.LocalDate;

public class Payment {
    private int paymentId;
    private int bookingId;
    private double amount;
    private LocalDate paymentDate;
    private String paymentMethod;
    private String paymentStatus;

    private Payment (){

    }
    private Payment(Builder builder){
        this.paymentId = builder.paymentId;
        this.bookingId = builder.bookingId;
        this.amount = builder.amount;
        this.paymentDate = builder.paymentDate;
        this.paymentMethod = builder.paymentMethod;
        this.paymentStatus = builder.paymentStatus;

    }
    public int getPaymentId(){
        return paymentId;
    }
    public int getBookingId(){
        return bookingId;
    }
    public double amount(){
        return amount;
    }
    public LocalDate getPaymentDate(){
        return paymentDate;
    }
    public String getPaymentMethod(){
        return paymentMethod;
    }
    public String getPaymentStatus(){
        return paymentStatus;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", bookingId=" + bookingId +
                ", amount=" + amount +
                ", paymentDate='" + paymentDate + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", paymentStatus='" + paymentStatus + '\'' +
                '}';
    }
    public static class Builder {
        private int paymentId;
        private int bookingId;
        private double amount;
        private LocalDate paymentDate;
        private String paymentMethod;
        private String paymentStatus;

        public Builder setPaymentId(int paymentId){
            this.paymentId = paymentId;
            return this;}

        public Builder setBookingId(int bookingId){
            this.bookingId = bookingId;
            return this;}

        public Builder setAmount(double amount){
            this.amount = amount;
            return this;}

        public Builder setPaymentDate(LocalDate paymentDate){
            this.paymentDate = paymentDate;
            return this;}

        public Builder setPaymentMethod(String paymentMethod){
            this.paymentMethod = paymentMethod;
            return this;}

        public Builder setPaymentStatus(String paymentStatus){
            this.paymentStatus = paymentStatus;
            return this;}
        public Payment build(){return new Payment(this);}

    }
}
