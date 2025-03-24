package za.ac.cput;

import za.ac.cput.domain.Review; // Import the Review class

public class Main {
    public static void main(String[] args) {
        // Print a greeting
        System.out.println("Hello");

        // Create a Review object using the Builder pattern
        Review review = new Review.Builder()
                .setReviewId("1")
                .setBookingId("booking123")
                .setCustomerId("cust123")
                .setPainterId("painter456")
                .setComment("The painting service was excellent!")
                .setRating(5)
                .build();

        // Print the Review object to verify
        System.out.println(review);
    }
}