package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Radio {

    private int maxNumberStation = 10;
    private int minNumberStation = 1;
    private int currentNumberStation = 5;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = 40;


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

//    public int getCurrentNumberStation() {
//        return currentNumberStation;
//    }

    public void setCurrentNumberStation(int currentNumberStation) {
        if (currentNumberStation > maxNumberStation) {
            return;
        }
        if (currentNumberStation < minNumberStation) {
            return;
        }
        this.currentNumberStation = currentNumberStation;

    }

    public void nextStation() {
        if (currentNumberStation < maxNumberStation) {
            currentNumberStation++;
        } else {
            currentNumberStation = minNumberStation;
        }
    }

    public void previosStation() {
        if (currentNumberStation > minNumberStation) {
            currentNumberStation--;
        } else {
            currentNumberStation = maxNumberStation;
        }
    }

    public void upVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void downVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }
}
