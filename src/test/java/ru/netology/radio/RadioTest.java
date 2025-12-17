package ru.netology.radio;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetFlexibleRadioWave() {
        Radio radio = new Radio(30);

        radio.setRadioWave(27);

        Assertions.assertEquals(27, radio.getCurrentRadioWave());

    }

    @Test
    public void shouldNotSetFlexibleRadioWaveAboveMax() {
        Radio radio = new Radio(30);

        radio.setRadioWave(30);

        Assertions.assertEquals(0, radio.getCurrentRadioWave());

    }

    @Test
    public void shouldNotSetFlexibleRadioWaveBelowZero() {
        Radio radio = new Radio(30);

        radio.setRadioWave(-1);

        Assertions.assertEquals(29, radio.getCurrentRadioWave());

    }

    @Test
    public void shouldSetRadioWave() {
        Radio radio = new Radio();

        radio.setRadioWave(6);

        int expected = 6;
        int actual = radio.getCurrentRadioWave();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldChooseNextWave() {

        Radio radio = new Radio();
        radio.setRadioWave(6);

        radio.nextRadioWave();

        int expected = 7;
        int actual = radio.getCurrentRadioWave();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldChoosePrevWave() {

        Radio radio = new Radio();
        radio.setRadioWave(6);

        radio.prevRadioWave();

        int expected = 5;
        int actual = radio.getCurrentRadioWave();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void waveShouldNotBeSubZero() {

        Radio radio = new Radio();
        radio.setRadioWave(-1);

        int expected = 9;
        int actual = radio.getCurrentRadioWave();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void waveShouldNotBeAboveNine() {

        Radio radio = new Radio();
        radio.setRadioWave(10);

        int expected = 0;
        int actual = radio.getCurrentRadioWave();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldIncreaseRadioVolume() {

        Radio radio = new Radio();

        radio.setRadioVolume(78);

        radio.increaseRadioVolume();

        int expected = 79;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldDecreaseRadioVolume() {

        Radio radio = new Radio();

        radio.setRadioVolume(78);

        radio.decreaseRadioVolume();

        int expected = 77;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void volumeShouldNotBeSubZero() {

        Radio radio = new Radio();

        radio.setRadioVolume(0);

        radio.decreaseRadioVolume();

        int expected = 0;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void volumeShouldNotBeAboveHundred() {

        Radio radio = new Radio();

        radio.setRadioVolume(100);

        radio.increaseRadioVolume();

        int expected = 100;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldNotSetVolumeBelowZero() {

        Radio radio = new Radio();
        radio.setRadioVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldNotSetVolumeAboveHundred() {

        Radio radio = new Radio();
        radio.setRadioVolume(101);

        int expected = 100;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);

    }
}
