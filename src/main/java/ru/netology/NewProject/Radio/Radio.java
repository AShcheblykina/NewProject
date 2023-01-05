package ru.netology.NewProject.Radio;
public class Radio {
    private int MinNumberStations = 0;
    private int MaxNumberStation = 9;
    private int StationNumber = MinNumberStations;
    private int MinSoundVolume = 0;
    private int MaxSoundVolume = 100;
    private int SoundVolume = MinSoundVolume;

    public Radio(int MinNumberStation, int MaxNumberStation) {
        this.MinNumberStations = MinNumberStation;
        this.MaxNumberStation = MaxNumberStation;
        this.StationNumber = MinNumberStation;
        this.MinSoundVolume = MinSoundVolume;
        this.MaxSoundVolume = MaxSoundVolume;
        this.SoundVolume = MinSoundVolume;

    }

    public Radio(int size) {
        MaxNumberStation = MinNumberStations + size;
        MaxSoundVolume = MinSoundVolume + size;
    }

    public int getStationNumber() {
        return StationNumber;
    }

    public int getMinNumberStations() {
        return MinNumberStations;
    }

    public int getMaxNumberStation() {
        return MaxNumberStation;
    }

    public void setStationNumber(int StationNumber) {
        if (this.StationNumber < 0) {
            return;
        }
        if (this.StationNumber > 9) {
            return;
        }
        this.StationNumber = StationNumber;
    }
    public int getSoundVolume() {
        return SoundVolume;
    }
    public int getMinSoundVolume() {
        return MinNumberStations;
    }
    public int getMaxSoundVolume() {
        return MaxSoundVolume;
    }

    public void setSoundVolume(int SoundVolume) {
        if (this.SoundVolume < 0) {
            return;
        }
        if (this.SoundVolume > 100) {
            return;
        }
        this.SoundVolume = SoundVolume;
    }

    public void InCreaseVolume() {
        if (SoundVolume < 100) {
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



