import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String album) {
        this.name = name;
        this.artist = album;
        this.songs = new SongList();
    }

    public boolean addSong(String songTitle, double songDuration) {
        return this.songs.add(new Song(songTitle, songDuration));
    }


    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        Song checkedSong = this.songs.findSong(trackNumber);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        } else {
            System.out.println("This album does not have a track " + trackNumber);
            return false;
        }
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playList) {
        Song song = songs.findSong(songTitle);
        if (song != null) {
            playList.add(song);
            return true;
        }
        System.out.println("The song " + songTitle + " is not in this album");
        return false;
    }

    public static class SongList {
        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<>();
        }

        private boolean add(Song song) {
            if (songs.contains(song)) {
                return false;
            } else {
                this.songs.add(song);
                return true;
            }
        }

        private Song findSong(String songTitle) {
            for (Song checkedSong : this.songs) {
                if (checkedSong.getTitle().equals(songTitle)) {
                    return checkedSong;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if (index > 0 && index < songs.size()) {
                return songs.get(index);
            } else {
                return null;
            }
        }
    }
}