import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String email;
    private List<Media> purchasedMediaList;
    private List<Media> shoppingCart;

    public User() {
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.purchasedMediaList = new ArrayList<>();
        this.shoppingCart = new ArrayList<>();
    }

    public User(String bob, String mail, Object o, Object o1) {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Media> getPurchasedMediaList() {
        return purchasedMediaList;
    }

    public void setPurchasedMediaList(List<Media> purchasedMediaList) {
        this.purchasedMediaList = purchasedMediaList;
    }

    public List<Media> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(List<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    void addToCart(Media media){
        //Adds media to the user's shopping cart.
        shoppingCart.add(media);
    }
    void removeFromCart(Media media){
        //Remove media from the shopping cart.
        shoppingCart.remove(media);
    }
    void checkout(){
        //Completes the purchase and updates puchased media list
        //and stock
        purchasedMediaList.addAll(shoppingCart);

//        shoppingCart.clear();
    }

}
