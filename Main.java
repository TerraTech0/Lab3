import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("Book Title", "Author", "123456789", 29.99, 10, new ArrayList<>());
        Music music = new Music("Song Title", "Artist", "987654321", 15.99, "Musician");
        Movie movie = new Movie("Movie Title", "Director", "567890123", 19.99, 150);


        User user1 = new User("Alice", "alice@example.com");
        User user2 = new User("Bob", "bob@example.com");

        Store store = new Store();

        store.addUser(user1);
        store.addUser(user2);

        store.addMedia(book);
        store.addMedia(music);
        store.addMedia(movie);

        System.out.println("Registered Users:");
        List<User> users = store.displayUsers();
        for (User user : users) {
            System.out.println(user.getUsername() + " - " + user.getEmail());
        }

        System.out.println("\nAvailable Media:");
        List<Media> medias = store.displayMedia();
        for (Media media : medias) {
            System.out.println(media.getTitle() + " - " + media.getMediaType());
        }

        String titleToSearch = "Book Title";
        Book foundBook = store.searchBook(titleToSearch);
        if (foundBook != null) {
            System.out.println("\nBook found: " + foundBook.getTitle());
        } else {
            System.out.println("\nBook with title '" + titleToSearch + "' not found.");
        }

        movie.watch(user1);

        List<Music> playlist = music.generatePlaylist(medias);
        System.out.println("\nGenerated Playlist:");
        for (Music playlistMusic : playlist) {
            System.out.println("Title: " + playlistMusic.getTitle() + ", Artist: " + playlistMusic.getArtist());
        }
    }
}

