package ru.netology.radio;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

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
}
