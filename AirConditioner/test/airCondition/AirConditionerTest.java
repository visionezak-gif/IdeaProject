package airCondition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    @Test
    public void testThatIhaveAnAc_ItIsOff_ITurnItOn_ItIsOn() {
        AirConditioner airConditioner = new AirConditioner();
        assertFalse(airConditioner.isOn());

        airConditioner.turnOn();
        assertTrue(airConditioner.isOn());

    }

    @Test
    public void testThatIhaveAnAc_ItIsOff_ITurnItOn_ItIsOn_ITurnItOff_ItIsOff() {
        AirConditioner airConditioner = new AirConditioner();
        assertFalse(airConditioner.isOn());

        airConditioner.turnOn();
        assertTrue(airConditioner.isOn());

        airConditioner.turnOff();
        assertFalse(airConditioner.isOn());

    }

    @Test
    public void testThatIhaveAnAc_ItIsOff_ITurnItOn_ItIsOn_ITurnItOff_ItIsOff_ITurnItOn_ItIsOn_IIncreasedIt_ItIsIncreased() {
        AirConditioner airConditioner = new AirConditioner();
        assertFalse(airConditioner.isOn());

        airConditioner.turnOn();
        assertTrue(airConditioner.isOn());

        airConditioner.turnOff();
        assertFalse(airConditioner.isOn());

        airConditioner.turnOn();
        assertTrue(airConditioner.isOn());

        assertEquals(0 , airConditioner.checkTemperature());

        airConditioner.increase();
        assertEquals(1, airConditioner.checkTemperature());

    }

    @Test
    public void testThatIhaveAnAc_ItIsOff_ITurnItOn_ItIsOn_ITurnItOff_ItIsOff_ITurnItOn_ItIsOn_IIncreasedIt_ItIsIncreased_IDecreasedIt_ItIsDecreased() {
        AirConditioner airConditioner = new AirConditioner();
        assertFalse(airConditioner.isOn());

        airConditioner.turnOn();
        assertTrue(airConditioner.isOn());

        airConditioner.turnOff();
        assertFalse(airConditioner.isOn());

        airConditioner.turnOn();
        assertTrue(airConditioner.isOn());

        assertEquals(0 , airConditioner.checkTemperature());

        airConditioner.increase();
        assertEquals(1, airConditioner.checkTemperature());

        airConditioner.decrease();
        assertEquals(0, airConditioner.checkTemperature());

    }

    @Test
    public void testThatIhaveAnAc_ItIsOff_ITurnItOn_ItIsOn_ITurnItOff_ItIsOff_ITurnItOn_ItIsOn_IIncreasedItBeyound30_ItIsIncreasedStill30() {
        AirConditioner airConditioner = new AirConditioner();
        assertFalse(airConditioner.isOn());

        airConditioner.turnOn();
        assertTrue(airConditioner.isOn());

        airConditioner.turnOff();
        assertFalse(airConditioner.isOn());

        airConditioner.turnOn();
        assertTrue(airConditioner.isOn());

        assertEquals(0 , airConditioner.checkTemperature());

        for (int i = 1; i <= 30; i++){
            airConditioner.increase();
        }
        assertEquals(30, airConditioner.checkTemperature());

        airConditioner.increase();
        assertEquals(30 , airConditioner.checkTemperature());

        }


}
