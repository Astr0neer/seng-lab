package lab6;

import java.util.ArrayList;

public class Playlist {

  private String name;
  private String[] songs;

  Playlist(String name, String[] songs) {
    this.name = name;
    this.songs = songs;
  }
  public String getName() {
    return name;
  }

  public void addSong(String songName){
    ArrayList<String> songList = new ArrayList<>();
    for(String song : songs){
      songList.add(song);
    }
    songList.add(songName);
    songs = songList.toArray(new String[0]);
  }

  public void removeSong(String songName){
    ArrayList<String> songList = new ArrayList<>();
    for(String song : songs){
      songList.add(song);
    }
    songList.remove(songName);
    songs = songList.toArray(new String[0]);
  }
  public void printSongs(){
    System.out.println("Playlist: " + this.name);
    if(songs.length ==0){
      System.out.println("No songs in the playlist.");
      return;
    }
    for(String song : songs){
      System.out.println("- " + song);
    }
  }
  int getSoungCount(){
    return songs.length;
  }


}
