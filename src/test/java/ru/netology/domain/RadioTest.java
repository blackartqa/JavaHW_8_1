package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    public void shouldSetCurrentNumberStationInInterval() {
        Radio radio = new Radio();
        radio.setMaxNumberStation(9);
        radio.setMinNumberStation(0);
        radio.setCurrentNumberStation(5);
        assertEquals(5, radio.getCurrentNumberStation());
    }
    @Test
    public void shouldSetCurrentNumberStationOverInterval(){
        Radio radio = new Radio();
        radio.setMaxNumberStation(9);
        radio.setMinNumberStation(0);
        radio.setCurrentNumberStation(12);
        assertEquals(0, radio.getCurrentNumberStation());

    }
    @Test
    public void shouldSetCurrentNumberStationUnderInterval(){
        Radio radio = new Radio();
        radio.setMaxNumberStation(9);
        radio.setMinNumberStation(0);
        radio.setCurrentNumberStation(-5);
        assertEquals(0, radio.getCurrentNumberStation());

    }
    @Test
    public void shouldNextStationInInterval(){
        Radio radio = new Radio();
        radio.setMaxNumberStation(9);
        radio.setMinNumberStation(0);
        radio.setCurrentNumberStation(5);
        radio.nextStation();
        assertEquals(6, radio.getCurrentNumberStation());
    }
    @Test
    public void shouldNextStationOutInterval(){
        Radio radio = new Radio();
        radio.setMaxNumberStation(9);
        radio.setMinNumberStation(0);
        radio.setCurrentNumberStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentNumberStation());
    }
    @Test
    public void shouldPreviosStationInInterval(){
        Radio radio = new Radio();
        radio.setMaxNumberStation(9);
        radio.setMinNumberStation(0);
        radio.setCurrentNumberStation(5);
        radio.previosStation();
        assertEquals(4, radio.getCurrentNumberStation());
    }
    @Test
    public void shouldPreviosStationOutInterval(){
        Radio radio = new Radio();
        radio.setMaxNumberStation(9);
        radio.setMinNumberStation(0);
        radio.setCurrentNumberStation(0);
        radio.previosStation();
        assertEquals(9, radio.getCurrentNumberStation());
    }
    @Test
    public void shouldUpVolumeInInterval(){
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(0);
        radio.upVolume();
        assertEquals(1, radio.getCurrentVolume());
    }
    @Test
    public void shouldUpVolumeOutInterval(){
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(10);
        radio.upVolume();
        assertEquals(10, radio.getCurrentVolume());
    }
    @Test
    public void shouldDownVolumeInInterval(){
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(9);
        radio.downVolume();
        assertEquals(8, radio.getCurrentVolume());
    }
    @Test
    public void shouldDownVolumeOutInterval(){
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(0);
        radio.downVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}
