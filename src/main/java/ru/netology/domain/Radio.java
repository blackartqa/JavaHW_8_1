package ru.netology.domain;

public class Radio {

    private int maxNumberStation = 10;
    private int minNumberStation = 1;
    private int currentNumberStation = 5;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = 40;

    public Radio() {
    }

    public Radio(int maxNumberStation, int minNumberStation, int currentNumberStation, int maxVolume, int minVolume, int currentVolume) {
        this.maxNumberStation = maxNumberStation;
        this.minNumberStation = minNumberStation;
        this.currentNumberStation = currentNumberStation;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.currentVolume = currentVolume;
    }


    public int getMaxNumberStation() {
        return maxNumberStation;
    }

    public void setMaxNumberStation(int maxNumberStation) {
        this.maxNumberStation = maxNumberStation;
    }

    public int getMinNumberStation() {
        return minNumberStation;
    }

    public void setMinNumberStation(int minNumberStation) {
        this.minNumberStation = minNumberStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

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
