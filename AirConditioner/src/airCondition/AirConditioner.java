package airCondition;

public class AirConditioner {

    private boolean powerState;
    private  int temperature;

    public boolean isOn() {
        return powerState;

    }

    public void turnOn() {
        powerState = true;

    }

    public void turnOff() {
        powerState = false;

    }

    public int checkTemperature() {
        return temperature;
    }

    public void increase() {
        if (temperature < 30)
            temperature = temperature + 1;

    }

    public void decrease() {
        temperature += -1;
    }
}
