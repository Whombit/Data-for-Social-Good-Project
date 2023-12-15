import java.util.ArrayList;
import java.util.List;

public class UserStory {
    private String[] artistsData;
    private String[] albumsData;
    private String[] genresData;
    private String favGenre;

    public UserStory(String[] artistsFile, String[] albumsFile, String[] genresFile) {
        this.artistsData = artistsFile;
        this.albumsData = albumsFile;
        this.genresData = genresFile;
    }

    public void setFav(String newFav) {
        favGenre = newFav;
    }

    public String getFav() {
        return favGenre;
    }

    public String[] sortGenres() {
        List<String> matchingGenres = new ArrayList<>();

        for (String genre : genresData) {
            if (genre.equals(favGenre)) {
                matchingGenres.add(genre);
            }
        }

        return matchingGenres.toArray(new String[0]);
    }

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
