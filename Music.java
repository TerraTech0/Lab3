import java.util.ArrayList;
import java.util.List;

public class Music extends Media{
    private String artist;
    private List<User> listeners;


    public Music(){

    }
    public Music(String title, String auteur, String ISBN, double price, String artist){
        super(title, auteur, ISBN, price);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void listen(User user){//not sure!

        if (!listeners.contains(user)){
            listeners.add(user);
            System.out.println(user.getUsername() + "is now listening to "+ getTitle()+"by "+artist);
        }else {
            System.out.println(user.getUsername()+"is already listening to "+ getTitle());
        }
        //Allows users to listen to music
    }
    public List<Music> generatePlaylist(List<Media> musicCatalog){
        //Generates a playlist of similar songs based on the artist(auteur)
        List<Music> playlist = new ArrayList<>();
        for (Media music : musicCatalog){
            if (music.getAuteur().equals(this.artist)){
                playlist.add((Music) music);
            }
        }
        return playlist;
    }



    @Override
    public String getMediaType() {
        /*
        if the price >= 10,
        else return "Music"
         */
        if (getPrice() >= 10) {
            return "Premium Music";
        } else {
            return "Music";
        }
    }

    @Override
    public String toString() {
        return "Music{" +
                "artist='" + artist + '\'' +
                '}';
    }
}
