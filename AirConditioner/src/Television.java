public class Television {
    private boolean powerState;
    private int channel = 0;
    private int volume = 0;

    public boolean isOn() {
        return powerState;
    }

    public void turnOn() {
        powerState = true;

    }


    public void turnOff() {
        powerState = false;

    }

    public int getCurrentChannel() {
        return channel;
    }

    public int next() {
        return channel += 1;
    }


    public void previous() {
        channel -= 1;

    }

    public int getCurrentVolume() {
        return volume;
    }


    public void increaseVolume() {
        if(volume <= 100)
        volume +=1;

    }

    public void decreaseVolume() {
        volume -= 1;
    }
}
