package ru.netology.radio;

public class Radio {

    private int radioWave;
    private int radioVolume;

    public int getCurrentRadioWave() {
        return radioWave;
    }

    public int getCurrentRadioVolume() {
        return radioVolume;
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


    public void setRadioVolume(int newRadioVolume) {
        if (newRadioVolume < 0) {
            radioVolume = 0;
            return;
        }
        if (newRadioVolume > 100) {
            radioVolume = 100;
            return;
        }
        radioVolume = newRadioVolume;
    }

    public void increaseRadioVolume() {
        if (radioVolume < 100) {
            radioVolume = radioVolume + 1;
        }
    }

    public void decreaseRadioVolume() {
        if (radioVolume > 0) {
            radioVolume -= 1;
        }
    }
}
