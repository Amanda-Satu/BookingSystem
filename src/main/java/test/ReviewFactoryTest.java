package za.ac.cput.factory;
//Minathi shezi
//222353775

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Review;

import static org.junit.jupiter.api.Assertions.*;

class ReviewFactoryTest {

    @Test
    void testCreateReview_Success() {
        Review review = ReviewFactory.createReview("R001", "B001", "C001", "P001", "Great work!", 5);
        assertNotNull(review);
        assertEquals("R001", review.getReviewId());
        assertEquals("B001", review.getBookingId());
        assertEquals("C001", review.getCustomerId());
        assertEquals("P001", review.getPainterId());
        assertEquals("Great work!", review.getComment());
        assertEquals(5, review.getRating());
    }

    @Test
    void testCreateReview_InvalidRating() {
        Review review = ReviewFactory.createReview("R002", "B002", "C002", "P002", "Bad experience", 6);
        assertNull(review);
    }

    @Test
    void testCreateReview_MissingFields() {
        Review review = ReviewFactory.createReview("", "B003", "C003", "P003", "Okay service", 3);
        assertNull(review);
    }
}