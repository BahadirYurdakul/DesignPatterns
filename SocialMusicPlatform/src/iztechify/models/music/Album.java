package iztechify.models.music;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Album extends Observable {
    private String title;
    private String description;
    private List<Song> songs;

    public Album(String title, String description) { // TODO add songs?
        this.title = title;
        this.description = description;
        this.songs = new ArrayList<>();
    }

    public boolean addSongToAlbum(Song song){ // TODO save to json file
        boolean isSuccessful = songs.add(song);
        notifyObservers();
        return isSuccessful;
    }

    public boolean removeSong(Song song){ // TODO save to json file
        boolean isSuccessful = songs.remove(song);
        notifyObservers();
        return isSuccessful;
    }
}
