package ru.netology.NewProject.Radio;
public class Radio {
    private int StationNumber;
    private int SoundVolume;

    public int getStationNumber() {
        return StationNumber;
    }

    public void setStationNumber(int StationNumber) {
        if (StationNumber < 0) {
            return;
        }
        if (StationNumber > 9) {
            return;
        }
        this.StationNumber = StationNumber;
    }

    public int getSoundVolume() {
        return SoundVolume;
    }

    public void setSoundVolume(int SoundVolume) {
        if (SoundVolume < 0) {
            return;
        }
        if (SoundVolume > 10) {
            return;
        }
        this.SoundVolume = SoundVolume;
    }

    public void InCreaseVolume() {
        if (SoundVolume < 10) {
            SoundVolume = SoundVolume + 1;
        }
    }

    public void NextStation() {
        if (StationNumber != 9) {
            StationNumber++;
        } else {
            StationNumber = 0;
        }
    }

    public void PrevStation() {
        if (StationNumber != 0) {
            StationNumber++;
        } else {
            StationNumber = 9;
        }
    }
}


