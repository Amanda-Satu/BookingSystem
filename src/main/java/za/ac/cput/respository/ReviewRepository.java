package za.ac.cput.repository;
//Minathi shezi 222353775
//28 March 2025
import za.ac.cput.domain.Review;
import java.util.ArrayList;
import java.util.List;

public class ReviewRepository implements IReviewRepository {
    private static ReviewRepository repository = null;
    private List<Review> reviewList;

    private ReviewRepository() {
        reviewList = new ArrayList<>();
    }

    public static ReviewRepository getRepository() {
        if (repository == null) {
            repository = new ReviewRepository();
        }
        return repository;
    }

    @Override
    public List<Review> getAll() {
        return reviewList;
    }

    @Override
    public Review create(Review review) {
        reviewList.add(review);
        return review;
    }

    @Override
    public Review read(String id) {
        return reviewList.stream().filter(r -> r.getReviewId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public Review update(Review review) {
        Review existingReview = read(review.getReviewId());
        if (existingReview != null) {
            reviewList.remove(existingReview);
            reviewList.add(review);
            return review;
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        Review review = read(id);
        if (review != null) {
            reviewList.remove(review);
            return true;
        }
        return false;
    }
}
