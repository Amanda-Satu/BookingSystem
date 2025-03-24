package za.ac.cput.domain;

/*
minathi shezi
 */
public class Review {
    private String reviewId;
    private String bookingId;
    private String customerId;
    private String painterId;
    private String comment;
    private int rating;

    // Private Constructor for Builder Pattern
    private Review(Builder builder) {
        this.reviewId = builder.reviewId;
        this.bookingId = builder.bookingId;
        this.customerId = builder.customerId;
        this.painterId = builder.painterId;
        this.comment = builder.comment;
        this.rating = builder.rating;
    }

    // Getters
    public String getReviewId() {
        return reviewId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getPainterId() {
        return painterId;
    }

    public String getComment() {
        return comment;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Review{" +
                "reviewId='" + reviewId + '\'' +
                ", bookingId='" + bookingId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", painterId='" + painterId + '\'' +
                ", comment='" + comment + '\'' +
                ", rating=" + rating +
                '}';
    }

    // Builder Class
    public static class Builder {
        private String reviewId;
        private String bookingId;
        private String customerId;
        private String painterId;
        private String comment;
        private int rating;

        public Builder setReviewId(String reviewId) {
            this.reviewId = reviewId;
            return this;
        }

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

        public Builder setComment(String comment) {
            this.comment = comment;
            return this;
        }

        public Builder setRating(int rating) {
            if (rating < 1 || rating > 5) {
                throw new IllegalArgumentException("Rating must be between 1 and 5");
            }
            this.rating = rating;
            return this;
        }

        public Builder copy(Review review) {
            this.reviewId = review.reviewId;
            this.bookingId = review.bookingId;
            this.customerId = review.customerId;
            this.painterId = review.painterId;
            this.comment = review.comment;
            this.rating = review.rating;
            return this;
        }

        public Review build() {
            return new Review(this);
        }
    }
}