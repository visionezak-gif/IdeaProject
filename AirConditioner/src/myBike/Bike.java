package myBike;

public class Bike {

    private boolean powerState;
    private int speed;
    private int gear;


    public boolean isOn() {
        return powerState;
    }


    public void turnOn() {
        powerState = true;
    }

    public void turnOff() {
        powerState = false;
    }

    public int currentGear() {
        return gear;
    }

    public void setGear() {
        if (speed >= 0 && speed <= 20) {
            gear = 1;
        }
        else if(speed >= 21 && speed <=30 ){
            gear = 2;
        }
        else if(speed >= 31 && speed <= 40){
            gear = 3;
        } else if (speed >=41) {
            gear = 4;
        }
    }

    public void accelerate() {
        if (gear == 1) {
            speed += 1;
        }
       else if(gear == 2){
            speed += 2;
        }
       else if(gear == 3) {
            speed += 3;
        } else if (gear == 4) {
            speed+= 4;
        }
    }

    public int checkSpeed() {
        return speed;
    }

    public void deccelerate() {
        if (gear == 1) {
            speed -= 1;
        }
        else if(gear == 2){
            speed -= 2;
        }
        else if(gear == 3) {
            speed -= 3;
        } else if (gear == 4) {
            speed -= 4;
        }
    }
}
