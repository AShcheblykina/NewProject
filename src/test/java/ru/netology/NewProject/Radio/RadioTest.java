package ru.netology.NewProject.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void RealStation() {
        Radio radio = new Radio();

        radio.setStationNumber(6);

        int expected = 6;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void RealVolume() {
        Radio radio = new Radio();

        radio.setSoundVolume(8);

        int expected = 8;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldNotChooseLastStationLargerMax() {
        Radio radio = new Radio();

        radio.setStationNumber(50);

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldNotChooseSoundLargerMax() {
        Radio radio = new Radio();

        radio.setSoundVolume(50);

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ShouldNotChooseLastStationLargerMini() {
        Radio radio = new Radio();

        radio.setStationNumber(-1);

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldNotChooseSoundLargerMini() {
        Radio radio = new Radio();

        radio.setSoundVolume(-1);

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextStation() {
        Radio radio = new Radio();
        radio.setStationNumber(5);

        radio.NextStation();

        int expected = 6;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ChooseLastToStation() {
        Radio radio = new Radio();
        radio.setStationNumber(9);

        radio.NextStation();

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ChangeStations() {
        Radio radio = new Radio();
        radio.setStationNumber(8);

        radio.NextStation();

        int expected = 9;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(6);

        radio.InCreaseVolume();

        int expected = 7;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ChooseLastToVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(10);

        radio.InCreaseVolume();

        int expected = 10;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ChangeVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(9);

        radio.InCreaseVolume();

        int expected = 10;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void FirsStation() {
        Radio radio = new Radio();
        radio.setStationNumber(0);

        radio.PrevStation();

        int expected = 9;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ChooseToStation() {
        Radio radio = new Radio();
        radio.setStationNumber(1);

        radio.PrevStation();

        int expected = 2;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

}



