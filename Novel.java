public class Novel extends Book{
    private String genre;


    public Novel(int stock, int[] reviews, String genre) {
        super(stock, reviews);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String getMediaType() {
        /*
        if Average Rating >= 4.5,
        else reutrn "Noval"
         */
        if (getAverageRating() >= 4.5){
            return "Bestselling Novel";
        }else {
            return "Novel";
        }

    }

    @Override
    public String toString() {
        return "Novel{" +
                "genre='" + genre + '\'' +
                '}';
    }
}
