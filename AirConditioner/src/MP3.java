public class MP3 {
    private boolean powerState;
    private boolean musicPlayer;
    public boolean isOn() {
        return powerState;
    }

    public void turnOn() {
        powerState = true;
    }

    public void turnOff() {
        powerState = false;
    }


    public boolean startSong() {
        return musicPlayer;
    }


    public void playSong() {
        musicPlayer = true;

    }
}
