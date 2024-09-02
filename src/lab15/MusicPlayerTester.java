package lab15;

public class MusicPlayerTester {
    public static void main(String[] args) {
        Song[] songs = new Song[3];
        songs[0] = new Song("Michael Jackson", "Beat It", "Thriller");
        songs[1] = new Song("Pearl Jam", "Even Flow", "Ten");
        songs[2] = new Song("Portishead", "Over", "NYC Live");

        Player[] players = {new CD("CD", songs), new MP3("MP3", songs), new Streamer("Streamer", songs) };

        players[0].play();
        players[0].nextSong();
        players[0].stop();

        players[1].play();
        players[1].prevSong();
        players[1].pause();

        players[2].play();
        players[2].pause();
    }
}
