import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book extends Media {
    private int stock;
    private List<Review> reviews;


    public Book(int stock, int[] reviews) {
        this.stock = stock;
        this.reviews = new ArrayList<>();
    }

    public Book(String title, String auteur, String ISBN, double price, int stock, List<Review> reviews) {
        super(title, auteur, ISBN, price);
        this.stock = stock;
        this.reviews = new ArrayList<>();
    }


    public Book() {

    }


    public int getStock() {
        return stock;
    }

    public List<Review> getReviews(Review review) {
        return reviews;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = new ArrayList<>();
    }

    void addReview(Review review) {//not sure
        if (reviews == null) {
            reviews = new ArrayList<>();
        }
        reviews.add(review);

    }

    double getAverageRating() {
        if (reviews == null || reviews.isEmpty()) {
            return 0.0;
        }

        double totalRating = 0;
        for (Review review : reviews) {
            totalRating += review.getRating();
        }

        return totalRating / reviews.size();
    }

    void purchase(User user) {
        // Allows users to add the book to the purchased list and decrease book stock by 1.
        if (stock > 0) {
            stock--;
            user.addToCart(this);
            System.out.println(user + " has purchased the book. Remaining stock: " + stock);
        } else {
            System.out.println("There are no books in stock.");
        }
    }

    boolean isBestseller() {
        //this method checks if a book is bestaeller based on criteria
        // such as if its average rating more than 5 or equals 4.5
        double averageRating = getAverageRating();
        return averageRating >= 4.5;
    }

    void restock(int quantity) {
        //this method allows for restocking a book by increasing its quantity in stock
        // it also prints a message to inform about the restocking.
        this.stock += quantity;
        System.out.println(quantity + "\ncopies of the book: " + getTitle() + "\nnew stock: " + this.stock);

    }

    @Override
    public String getMediaType() {
        /*
        if average rating >= 4.5,
        else return "Book"
         */
        if (getAverageRating() >= 4.5) {
            return "BestsellingBook";
        } else {
            return "Book";
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "stock=" + stock +
                ", reviews=" + reviews +
                '}';
    }
}
