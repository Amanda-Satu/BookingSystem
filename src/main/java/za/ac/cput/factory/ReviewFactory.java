package za.ac.cput.factory;
//minathi shezi
//222353775
import za.ac.cput.domain.Review;

public class ReviewFactory {

    public static Review createReview(String reviewId, String bookingId, String customerId, String painterId, String comment, int rating) {
        if (reviewId == null || reviewId.isEmpty() || bookingId == null || bookingId.isEmpty() || customerId == null || customerId.isEmpty() || painterId == null || painterId.isEmpty() || comment == null || comment.isEmpty() || rating < 1 || rating > 5) {
            return null;
        }

        return new Review.Builder()
                .setReviewId(reviewId)
                .setBookingId(bookingId)
                .setCustomerId(customerId)
                .setPainterId(painterId)
                .setComment(comment)
                .setRating(rating)
                .build();
    }
}