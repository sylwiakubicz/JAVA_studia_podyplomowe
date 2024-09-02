package lab15;

abstract public class MusicPlayer implements Player {
    public String playerType;
    private Song[] songs;
    private int index = 0;

    public MusicPlayer(String playerType, Song[] songs) {
        this.playerType = playerType;
        this.songs = songs;
    }

    String getCurrentSong() {
        return songs[index].toString();
    }
    @Override
    public void play() {
        System.out.println(playerType + " odtwrza " + getCurrentSong());
    }

    @Override
    public void pause() {
        System.out.println(playerType + " pauza " + getCurrentSong());
    }

    @Override
    public void nextSong() {
        if (index != songs.length - 1) {
            index += 1;
        } else {
            index = 0;
        }
        System.out.println(playerType + " odtwrza następny utwór - " + getCurrentSong());
    }

    @Override
    public void prevSong() {
        if (index != 0) {
            index -= 1;
        } else {
            index = songs.length -1;
        }
        System.out.print(playerType + " odtwrza poprzedni utwór - " + getCurrentSong());
    }

    @Override
    public void stop() {
        System.out.println(playerType + "stop");
        index = 0;
    }
}
