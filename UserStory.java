//Imports javas ArrayList and List utilities
//its way convenient, trust
import java.util.ArrayList;
import java.util.List;

public class UserStory {
  //Creates the private classes for all variables needed throughout the class
    private String[] artistsData;
    private String[] albumsData;
    private String[] genresData;
    private String favGenre;

      // Non-parameterized Constructor
    public UserStory() {
        // Initialize default values or leave them as null
        this.artistsData = new String[0];
        this.albumsData = new String[0];
        this.genresData = new String[0];
        this.favGenre = "";
    }

  //Parameterized Constructor
    public UserStory(String[] artistsFile, String[] albumsFile, String[] genresFile) {
      //Sets the local variables to the data found in the Files
        this.artistsData = artistsFile;
        this.albumsData = albumsFile;
        this.genresData = genresFile;
    }

  //Sets the favGenre variable to the newFav genre mutated in the DataRunner class
    public void setFav(String newFav) {
        favGenre = newFav;
    }

  //Gets the data from the favGenre variable
    public String getFav() {
        return favGenre;
    }

  //Method which sorts through the genreData file and creates a new array with only the data when it matches the genre set in the favGenre variable
    public String[] sortGenres() {
        List<String> matchingGenres = new ArrayList<>();

        for (String genre : genresData) {
            if (genre.equals(favGenre)) {
                matchingGenres.add(genre);
            }
        }

        return matchingGenres.toArray(new String[0]);
    }

  //Takes all of the data needed and sorted in the previous method and makes them all into a String 
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (int index = 0; index < genresData.length; index++) {
            String currentGenre = genresData[index];
            String currentArtist = artistsData[index];
            String currentAlbum = albumsData[index];

            if (currentGenre.equals(favGenre)) {
                result.append("Artist: ").append(currentArtist)
                      .append(", Album: ").append(currentAlbum)
                      .append(", Genre: ").append(currentGenre)
                      .append("\n");
            }
        }
        return result.toString();
  }
}
