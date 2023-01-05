package ru.netology.NewProject.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void RealStation() {
        Radio cond = new Radio(9);

        Assertions.assertEquals(0, cond.getMinNumberStations());
        Assertions.assertEquals(9, cond.getMaxNumberStation());
        Assertions.assertEquals(0, cond.getStationNumber());

    }

    @Test
    public void LastStations() {
        Radio radio = new Radio(9);
        radio.setStationNumber(9);

        radio.NextStation();

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ChangeStations() {
        Radio radio = new Radio(8);
        radio.setStationNumber(8);

        radio.NextStation();

        int expected = 9;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void FirstStations() {
        Radio radio = new Radio(0);
        radio.setStationNumber(0);

        radio.PrevStation();

        int expected = 9;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void NextStation() {
        Radio radio = new Radio(6);
        radio.setStationNumber(6);

        radio.NextStation();

        int expected = 7;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ChooseNextSoundVolume() {
        Radio radio = new Radio(52);
        radio.setSoundVolume(52);

        radio.InCreaseVolume();

        int expected = 53;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void AboveMaxSoundVolume() {
        Radio radio = new Radio(100);
        radio.setSoundVolume(100);

        radio.InCreaseVolume();

        int expected = 100;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void AboveMinSoundVolume() {
        Radio radio = new Radio(-0);
        radio.setSoundVolume(-0);


        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}
