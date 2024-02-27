public class AcademicBook extends Book{
    private String subject;



    public AcademicBook(int stock, int[] reviews, String subject) {
        super(stock, reviews);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String getMediaType() {
        /*
        if Average Rating >= 4.5,
        else return "AcademicBook"
         */
        if (getAverageRating() >= 4.5){
            return "Bestselling AcademicBook";
        }else {
            return "AcademicBook";
        }
    }

    @Override
    public String toString() {
        return "AcademicBook{" +
                "subject='" + subject + '\'' +
                '}';
    }
}
