
import myBike.Bike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TelevisionTest {

    @Test
    public void myTVIsOff_butITurnedItOn() {
        Television television = new Television();
        assertFalse(television.isOn());

        television.turnOn();
        assertTrue(television.isOn());
    }


    @Test
    public void myTVIsOff_butITurnedItOn_ITurnItOff() {
        Television television = new Television();
        assertFalse(television.isOn());

        television.turnOn();
        assertTrue(television.isOn());

        television.turnOff();
        assertFalse(television.isOn());
    }

    @Test
    public void myTVcanChangeChannels() {
        Television television = new Television();
        assertFalse(television.isOn());

        television.turnOn();
        assertTrue(television.isOn());


        assertEquals(0, television.getCurrentChannel());

        television.next();
        assertEquals(1, television.getCurrentChannel());


    }


    @Test
    public void myTVcanChangeChannels_backToPrevious() {
        Television television = new Television();
        assertFalse(television.isOn());

        television.turnOn();
        assertTrue(television.isOn());


        assertEquals(0, television.getCurrentChannel());

        television.next();
        assertEquals(1, television.getCurrentChannel());

        television.previous();
        assertEquals(0, television.getCurrentChannel());


    }

    @Test
    public void myTvVolume_CanBeIncrease_To100ByOne_AndNotGreater_Than100() {
        Television television = new Television();
        assertFalse(television.isOn());

        television.turnOn();
        assertTrue(television.isOn());


        assertEquals(0, television.getCurrentVolume());

        television.increaseVolume();
        assertEquals(1, television.getCurrentVolume());


    }


    @Test
    public void myTvVolume_CanBeDecrease_ByOne() {
        Television television = new Television();
        assertFalse(television.isOn());

        television.turnOn();
        assertTrue(television.isOn());


        assertEquals(0, television.getCurrentVolume());

        television.increaseVolume();
        assertEquals(1, television.getCurrentVolume());

        television.decreaseVolume();
        assertEquals(0, television.getCurrentVolume());


    }




    }
