package ru.netology.radio;

public class Radio {

    private int radioWave;
    private int radioVolume;

    public int getCurrentRadioWave() {
        return radioWave;
    }

    public void setRadioWave(int newRadioWave) {
        if (newRadioWave < 0) {
            radioWave = 9;

            return;
        }
        if (newRadioWave > 9) {
            radioWave = 0;

            return;
        }
        radioWave = newRadioWave;
    }

    public void nextRadioWave() {
        setRadioWave(radioWave + 1);
    }

    public void prevRadioWave() {
        setRadioWave(radioWave - 1);
    }


    public void increaseRadioVolume() {
        if (radioVolume < 100) {
            radioVolume += 1;
        }
    }

    public void decreaseRadioVolume() {
        if (radioVolume > 0) {
            radioVolume -= 1;
        }
    }
}
