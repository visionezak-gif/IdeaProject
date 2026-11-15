import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MP3Test {
    @Test
    public void testThat_MyMp3IsOff_IturnItON(){
        MP3 speaker = new MP3();
        assertFalse(speaker.isOn());

        speaker.turnOn();
        assertTrue(speaker.isOn());
    }

    @Test
    public void testThat_MyMp3IsOff_IturnItON_ITurnItOff(){
        MP3 speaker = new MP3();
        assertFalse(speaker.isOn());

        speaker.turnOn();
        assertTrue(speaker.isOn());

        speaker.turnOff();
        assertFalse(speaker.isOn());

    }



    @Test
    public void testThat_MyMp3_Cannot_PlaySong_WhenItIsOff(){
        MP3 speaker = new MP3();
        assertFalse(speaker.isOn());

        speaker.turnOn();
        assertTrue(speaker.isOn());

        speaker.turnOff();
        assertFalse(speaker.isOn());

        speaker.startSong();
        assertFalse(speaker.startSong());

    }

    @Test
    public void testThat_MyMp3_CanPlaySong_WhenItIsOn(){
        MP3 speaker = new MP3();
        assertFalse(speaker.isOn());

        speaker.turnOn();
        assertTrue(speaker.isOn());

        speaker.turnOff();
        assertFalse(speaker.isOn());

        speaker.startSong();
        assertFalse(speaker.startSong());

        speaker.playSong();
        assertTrue(speaker.startSong());

    }



}
