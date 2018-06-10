package pl.sda.tests.musicBox;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicBox {

    private List<Artist> artists = new ArrayList<>();
    private int counter = 0;
    private Random random = new Random();


    public static void main(String[] args) {
        new MusicBox().run();
    }

    private void run() {
        artists.addAll(makeArtists());
    }

    private List<Artist> makeArtists() {
        List<Artist> artists = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            artists.add(new Artist("Artist" + counter++, makeAlbums()));
        }
        return artists;
    }

    private List<Album> makeAlbums() {
        List<Album> albums = new ArrayList<>();
        for (int i = 0; i < random.nextInt(5) + 1; i++) {
            albums.add(new Album("Album" + counter++, makeSongs()));
        }
        return albums;
    }

    private List<Song> makeSongs() {
        List<Song> songs = new ArrayList<>();
        for (int i = 0; i < random.nextInt(5) + 3; i++) {
            songs.add(new Song("Song" + counter++, random.nextInt(400 + 120)));
        }
        return songs;
    }
}
