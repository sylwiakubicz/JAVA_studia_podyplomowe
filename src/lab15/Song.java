package lab15;

public class Song {
    private String artistsName;
    private String songName;
    private String albumName;

    public Song(String artistsName, String songName, String albumName) {
        this.artistsName = artistsName;
        this.songName = songName;
        this.albumName = albumName;
    }

    public String getArtistsName() {
        return artistsName;
    }

    public void setArtistsName(String artistsName) {
        this.artistsName = artistsName;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    @Override
    public String toString() {
        return "Song{" +
                "artistsName='" + artistsName + '\'' +
                ", songName='" + songName + '\'' +
                ", albumName='" + albumName + '\'' +
                '}';
    }
}
