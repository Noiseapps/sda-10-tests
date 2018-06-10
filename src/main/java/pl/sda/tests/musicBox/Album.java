package pl.sda.tests.musicBox;

import java.util.List;

public class Album {

    private final String title;
    private final List<Song> songList;

    public Album(String title, List<Song> songList) {
        this.title = title;
        this.songList = songList;
    }

    public String getTitle() {
        return title;
    }

    public List<Song> getSongList() {
        return songList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Album album = (Album) o;

        if (title != null ? !title.equals(album.title) : album.title != null) return false;
        return songList != null ? songList.equals(album.songList) : album.songList == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (songList != null ? songList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Album{" +
                "title='" + title + '\'' +
                ", songList=" + songList +
                '}';
    }
}
