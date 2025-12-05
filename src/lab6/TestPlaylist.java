package lab6;

public class TestPlaylist {
  public static void main(String[] args) {
    Playlist myFavoriteSongPlaylist = new Playlist("My Favorite Songs", new String[]{});
    myFavoriteSongPlaylist.addSong("Shape of You");
    myFavoriteSongPlaylist.addSong("Blinding Lights");
    myFavoriteSongPlaylist.addSong("Levitating");
    myFavoriteSongPlaylist.printSongs();
    System.out.println("Total songs: " + myFavoriteSongPlaylist.getSoungCount());
    myFavoriteSongPlaylist.removeSong("Blinding Lights");
    myFavoriteSongPlaylist.printSongs();
    System.out.println("Total songs: " + myFavoriteSongPlaylist.getSoungCount());
  }

}
