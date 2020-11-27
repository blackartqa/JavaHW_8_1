package ru.netology.domain;

public class Radio {

    private int maxNumberStation;
    private int minNumberStation;
    private int currentNumberStation;
    private int maxVolume;
    private int minVolume;
    private int currentVolume;


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
