package Playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    // -  It has three fields, two Strings called name and artist, and an ArrayList that holds objects of type Song called songs.
    // -  A constructor that accepts two Strings (name of the album and artist). It initialises the fields and instantiates songs.
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    // ddSong(), has two parameters of type String (title of song), double (duration of song) and returns a boolean.
    // Returns true if the song was added successfully or false otherwise.
    public boolean addSong(String titleOfSong, double durationOfSong) {
        if (findSong(titleOfSong) == null) {
            songs.add(new Song(titleOfSong, durationOfSong));
            return true;
        }
        return false;
    }

    // findSong(), has one parameter of type String (title of song) and returns a Song.
    // Returns the Song if it exists, null if it doesn't exists.
    private Song findSong(String titleOfSong) {
        for (Song song : this.songs) {
            if (song.getTitle().equals(titleOfSong)) {
                return song;
            }
        }
        return null;
    }

    // addToPlayList(), has two parameters of type int (track number of song in album) and LinkedList (the playlist) that holds objects of type Song, and returns a boolean.
    // Returns true if it exists and it was added successfully using the track number, or false otherwise.
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        if ((index > 0) && (index <= this.songs.size())) {
            playList.add(this.songs.get(index));
            return true;
        } else {
            if (trackNumber > 0) {
                return true;
            }
            return false;
        }
    }

    // addToPlayList(), has two parameters of type String (title of song) and LinkedList (the playlist) that holds objects of type Song, and returns a boolean.
    // Returns true if it exists and it was added successfully using the name of the song, or false otherwise.
    public boolean addToPlayList(String titleOfSong, LinkedList<Song> playList) {
        if (findSong(titleOfSong) != null) {
            Song song = findSong(titleOfSong);
            if (playList.size() >= 0) {
                playList.add(song);
                return true;
            }
        }
        return false;
    }
}
