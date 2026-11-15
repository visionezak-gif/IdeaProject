package myBike;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    @Test
public void testThatMyBike_CanBeTurnedOff_AndCanBeTurnedOn() {
        Bike bike = new Bike();
        assertFalse(bike.isOn());

        bike.turnOn();
        assertTrue(bike.isOn());
    }

    @Test
    public void testThatMyBike_IsOn_AndCanBeTurnedOff() {
        Bike bike = new Bike();
        assertFalse(bike.isOn());

        bike.turnOn();
        assertTrue(bike.isOn());

        bike.turnOff();
        assertFalse(bike.isOn());

    }

    @Test
    public void testThatMyBike_CanAccelerate_fromGearOne_AndTheSpeed_IsIncreased_ByOne() {
        Bike bike = new Bike();
        assertFalse(bike.isOn());

        bike.turnOn();
        assertTrue(bike.isOn());

        assertEquals(0 , bike.checkSpeed());
        bike.setGear();

        assertEquals(1 , bike.currentGear());
        bike.accelerate();
        assertEquals(1 , bike.checkSpeed());


    }

    @Test
    public void testThatMyBike_CanAccelerate_fromGearTwo_AndTheSpeed_IsIncreased_ByTwo() {
        Bike bike = new Bike();
        assertFalse(bike.isOn());

        bike.turnOn();
        assertTrue(bike.isOn());

        assertEquals(0 , bike.checkSpeed());
        bike.setGear();
        assertEquals(1 , bike.currentGear());

        for(int i = 1; i <= 21; i++){
            bike.accelerate();

        }

        assertEquals(21 , bike.checkSpeed());

        bike.setGear();
        assertEquals(2, bike.currentGear());

        bike.accelerate();
        assertEquals(23, bike.checkSpeed());
    }

    @Test
    public void testThatMyBike_CanAccelerate_fromGearThree_AndTheSpeed_IsIncreased_ByThree() {
        Bike bike = new Bike();
        assertFalse(bike.isOn());

        bike.turnOn();
        assertTrue(bike.isOn());

        assertEquals(0 , bike.checkSpeed());
        bike.setGear();
        assertEquals(1 , bike.currentGear());

        for(int i = 1; i <= 21; i++){
            bike.accelerate();

        }

        assertEquals(21 , bike.checkSpeed());

        bike.setGear();
        assertEquals(2 , bike.currentGear());

        for(int i = 1; i <= 5; i++){
            bike.accelerate();

        }
        assertEquals(31 , bike.checkSpeed());

        bike.setGear();
        assertEquals(3, bike.currentGear());

        bike.accelerate();
        assertEquals(34, bike.checkSpeed());
    }

    @Test
    public void testThatMyBike_CanAccelerate_fromGearFour_AndTheSpeed_IsIncreased_ByFour() {
        Bike bike = new Bike();
        assertFalse(bike.isOn());

        bike.turnOn();
        assertTrue(bike.isOn());

        assertEquals(0, bike.checkSpeed());
        bike.setGear();
        assertEquals(1, bike.currentGear());

        for (int i = 1; i <= 21; i++) {
            bike.accelerate();

        }

        assertEquals(21, bike.checkSpeed());

        bike.setGear();
        assertEquals(2, bike.currentGear());

        for (int i = 1; i <= 5; i++) {
            bike.accelerate();
        }
        assertEquals(31, bike.checkSpeed());

        bike.setGear();
        assertEquals(3, bike.currentGear());

        for (int i = 1; i <= 4; i++) {
            bike.accelerate();
        }

        assertEquals(43, bike.checkSpeed());
        bike.setGear();
        assertEquals(4, bike.currentGear());

        bike.accelerate();
        assertEquals(47, bike.checkSpeed());


    }


    @Test
    public void testThatMyBike_Candeaccelerate_fromGearFour_AndTheSpeed_IsDencreased_ByFour() {
        Bike bike = new Bike();
        assertFalse(bike.isOn());

        bike.turnOn();
        assertTrue(bike.isOn());

        assertEquals(0, bike.checkSpeed());
        bike.setGear();
        assertEquals(1, bike.currentGear());

        for (int i = 1; i <= 21; i++) {
            bike.accelerate();

        }

        assertEquals(21, bike.checkSpeed());

        bike.setGear();
        assertEquals(2, bike.currentGear());

        for (int i = 1; i <= 5; i++) {
            bike.accelerate();
        }
        assertEquals(31, bike.checkSpeed());

        bike.setGear();
        assertEquals(3, bike.currentGear());

        for (int i = 1; i <= 4; i++) {
            bike.accelerate();
        }

        assertEquals(43, bike.checkSpeed());
        bike.setGear();
        assertEquals(4, bike.currentGear());

        bike.deccelerate();
        assertEquals(39, bike.checkSpeed());


    }

    @Test
    public void testThatMyBike_Candeaccelerate_fromGearThree_AndTheSpeed_IsDecreased_ByThree() {
        Bike bike = new Bike();
        assertFalse(bike.isOn());

        bike.turnOn();
        assertTrue(bike.isOn());

        assertEquals(0, bike.checkSpeed());
        bike.setGear();
        assertEquals(1, bike.currentGear());

        for (int i = 1; i <= 21; i++) {
            bike.accelerate();

        }

        assertEquals(21, bike.checkSpeed());

        bike.setGear();
        assertEquals(2, bike.currentGear());

        for (int i = 1; i <= 5; i++) {
            bike.accelerate();
        }
        assertEquals(31, bike.checkSpeed());

        bike.setGear();
        assertEquals(3, bike.currentGear());

        bike.deccelerate();
        assertEquals(28, bike.checkSpeed());

    }

    @Test
    public void testThatMyBike_Candeaccelerate_fromGearTwo_AndTheSpeed_IsDencreased_ByTwo() {
        Bike bike = new Bike();
        assertFalse(bike.isOn());

        bike.turnOn();
        assertTrue(bike.isOn());

        assertEquals(0, bike.checkSpeed());
        bike.setGear();
        assertEquals(1, bike.currentGear());

        for (int i = 1; i <= 21; i++) {
            bike.accelerate();

        }

        assertEquals(21, bike.checkSpeed());

        bike.setGear();
        assertEquals(2, bike.currentGear());

        bike.deccelerate();
        assertEquals(19, bike.checkSpeed());
    }

    @Test
    public void testThatMyBike_Candeaccelerate_fromGearOne_AndTheSpeed_IsDencreased_ByOne() {
        Bike bike = new Bike();
        assertFalse(bike.isOn());

        bike.turnOn();
        assertTrue(bike.isOn());

        assertEquals(0, bike.checkSpeed());
        bike.setGear();
        assertEquals(1, bike.currentGear());

        bike.accelerate();
        bike.accelerate();

        assertEquals(2, bike.checkSpeed());

        bike.deccelerate();
        assertEquals(1, bike.checkSpeed());
    }

}
