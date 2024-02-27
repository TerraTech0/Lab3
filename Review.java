public class Review {
    private String username;
    private double rating;
    private String commement;

    Review(){

    }

    public Review(String username, double rating, String commement) {
        this.username = username;
        this.rating = rating;
        this.commement = commement;
    }

    public Review(String s, int i) {
    }

    public String getUsername() {
        return username;
    }

    public double getRating() {
        return rating;
    }

    public String getCommement() {
        return commement;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setCommement(String commement) {
        this.commement = commement;
    }
}
