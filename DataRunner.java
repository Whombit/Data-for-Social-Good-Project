import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {

    /*
    Instantiate UserStory object called "Jimmy"
    Paramaterize it with the data from the artist.txt, albums.txt, genre.txt
    */
    UserStory Jimmy = new UserStory(FileReader.toStringArray("artists.txt"), FileReader.toStringArray("albums.txt"), FileReader.toStringArray("genres.txt"));
    //Try in case of exception types
    try {
      System.out.println("Whats your favorite genre of music: ");
      //Instantiate scanner obj
      Scanner input = new Scanner(System.in);
      //use Scanner to take info given about the users favorite genre of music and assign it to a variable
      String newFav = input.nextLine();

      //use the setFav method (written in UserStory.java) to mutate the variable newFav into being the users favGenre variable
      Jimmy.setFav(newFav);

    } 
      
    //Catch exception types and handle it
    catch (Exception E) {
      System.out.println("Not a viable genre, try again \nViable Genres: Rock, Funk, Jazz, Blues, Pop, Folk, Classical, Reggae, Hip Hop, Electronic");
    }

    //Print out Jimmy's playlist with a toString method
    System.out.println(Jimmy.toString());

  }
}
