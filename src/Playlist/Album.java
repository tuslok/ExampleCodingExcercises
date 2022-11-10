package Playlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String name;
    private String artist;
    ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    // addSong(), has two parameters of type String (title of song), double (duration of song) and returns a boolean.
    // Returns true if the song was added successfully or false otherwise.
    public boolean addSong(String titleOfSong, double duration) {
        if (songs.contains(titleOfSong)) {
            songs.add(new Song(titleOfSong, duration));
            System.out.println("Added song: " + titleOfSong + ", duration: " + duration);
            return true;
        } else {
            System.out.println("Song is already added.");
            return false;
        }
    }

    //findSong(), has one parameter of type String (title of song) and returns a Song.
    // Returns the Song if it exists, null if it doesn't exists.
    public boolean findSong(String titleOfSong) {
        if(songs.contains(titleOfSong)){
            return true;
        }
        return false;
    }

    // addToPlayList(), has two parameters of type int (track number of song in album) and LinkedList (the playlist) that holds objects of type Song, and returns a boolean.
    // Returns true if it exists and it was added successfully using the track number, or false otherwise.

    /*public boolean addToPlayList(int number, LinkedList<Song> playList) {

    }

    // addToPlayList(), has two parameters of type String (title of song) and LinkedList (the playlist) that holds objects of type Song, and returns a boolean.
    // Returns true if it exists and it was added successfully using the name of the song, or false otherwise.

    public static boolean addToPlayList(String titleOfSong, LinkedList<Song> playList) {

    }*/

}
