import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    public void shouldSetCurrentRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(7);

        int expected = 7;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldSetCurrentStationAboveLimits() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(11);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldSetCurrentStationUnderLimits() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldSwitchNext() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(3);
        radio.next();

        int expected = 4;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSwitchNextToZero() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSwitchPrev() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSwitchPrevAfterZero() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetCurrentSoundVolume() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(10);

        int expected = 10;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetCurrentSoundVolumeLimits() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(11);

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetCurrentSoundVolumeLimits1() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(10);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void shouldIncreaseVolume1() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(0);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldDecreaseVolume (){
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(10);
        radio.decreaseVolume();

        int expected = 9;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldDecreaseVolume1 (){
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

}
