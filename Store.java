import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<User> users;
    private List<Media> medias;

    public Store() {
        this.users = new ArrayList<>();
        this.medias = new ArrayList<>();
    }

//    public Store(List<User> users, List<Media> medias) {
//        this.users = new ArrayList<>();
//        this.medias = new ArrayList<>();
//    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = new ArrayList<>();
    }

    public List<Media> getMedias() {
        return medias;
    }

    public void setMedias(List<Media> medias) {
        this.medias = medias;
    }
    void addUser(User user){
        //Adds a user to the list of users.
        users.add(user);
    }
    List<User> displayUsers(){
        //Displays a list of registered users.
        return users;
    }
    void addMedia(Media media){
        //Adds a media to the list of media.
        medias = new ArrayList<>();
        medias.add(media);
        //System.out.println(media);
    }
    List<Media> displayMedia(){
        //Displays a list of Available medias.

        return medias;
    }
    Book searchBook(String title){
        //Searches for a book by title and returns it if found!
        for (Media media : medias) {
            if (media instanceof Book) {
                Book book = (Book) media;
                if (book.getTitle().equals(title)) {
                    return book;
                }
            }
        }
        return null;
    }
}
