package favorite.things.array;

/*@author aranc */
public class FavoriteThingsArray {
    public static void main(String[] args) {
        String[] favoriteThings = {"basketball", "running", "eating", "Coffee", "Music"};

        System.out.println("My Favorite Things:");

        for (int i = 0; i < favoriteThings.length; i++) {
            System.out.println((i + 1) + ". " + favoriteThings[i]);
        }

        System.out.println("\nTotal number of favorite things: " + favoriteThings.length);
    }
    
}
