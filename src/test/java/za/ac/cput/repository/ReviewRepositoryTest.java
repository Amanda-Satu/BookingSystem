package za.ac.cput.repository;

//minathi shezi

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Review;
import static org.junit.jupiter.api.Assertions.*;

class ReviewRepositoryTest {

    private ReviewRepository repository;
    private Review review;
    @BeforeEach
    void setUp() {
        repository = ReviewRepository.getRepository();
        review = new Review.Builder()
                .setReviewId("R001")
                .setBookingId("B001")
                .setCustomerId("C001")
                .setPainterId("P001")
                .setComment("Great work!")
                .setRating(5)
                .build();
    }
    @Test
    void create() {
        Review created = repository.create(review);
        assertNotNull(created);
        assertEquals(review.getReviewId(), created.getReviewId());
    }
    @Test
    void read() {
        repository.create(review);
        Review read = repository.read(review.getReviewId());
        assertNotNull(read);
        assertEquals("R001", read.getReviewId());
    }
    @Test
    void update() {
        repository.create(review);
        Review updated = new Review.Builder()
                .setReviewId("R001")
                .setBookingId("B001")
                .setCustomerId("C001")
                .setPainterId("P001")
                .setComment("Updated comment")
                .setRating(4)
                .build();
        repository.update(updated);
        Review result = repository.read(updated.getReviewId());
        assertNotNull(result);
        assertEquals("Updated comment", result.getComment());
    }
    @Test
    void delete() {
        repository.create(review);
        boolean deleted = repository.delete("R001");
        assertTrue(deleted);
    }
    @Test
    void getAll() {
        repository.create(review);
        assertFalse(repository.getAll().isEmpty());
    }
}

