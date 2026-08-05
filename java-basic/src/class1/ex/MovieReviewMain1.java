package class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "Inception";
        inception.review = "Inception";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "About Time";
        aboutTime.review = "About Time";

        MovieReview[] movieReviews = {inception, aboutTime};

        for (MovieReview movieReview : movieReviews) {
            System.out.println("title: " + movieReview.title + " review: " + movieReview.review);
        }
    }
}
