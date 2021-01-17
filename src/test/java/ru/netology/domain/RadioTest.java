package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    public void shouldSetCurrentNumberStationInInterval() {
        Radio radio = new Radio(10, 1, 5, 100, 0, 50);
        assertEquals(5, radio.getCurrentNumberStation());
    }
    @Test
    public void shouldSetCurrentNumberStationOverInterval(){
        Radio radio = new Radio(10, 1, 5, 100, 0, 50);
        assertEquals(5, radio.getCurrentNumberStation());

    }
    @Test
    public void shouldSetCurrentNumberStationUnderInterval() {
        Radio radio = new Radio(10, 1, 5, 100, 0, 50);
        radio.setCurrentNumberStation(-5);
        assertEquals(5, radio.getCurrentNumberStation());
    }


    @Test
    public void shouldNextStationInInterval(){
        Radio radio = new Radio(10,1,5,100,0,50);
        radio.nextStation();
        assertEquals(6, radio.getCurrentNumberStation());
    }
    @Test
    public void shouldNextStationOutInterval(){
        Radio radio = new Radio(10,1,10,100,0,50);
        radio.nextStation();
        assertEquals(1, radio.getCurrentNumberStation());
    }
    @Test
    public void shouldPreviosStationInInterval(){
        Radio radio = new Radio(10,1,5,100,0,50);
        radio.previosStation();
        assertEquals(4, radio.getCurrentNumberStation());
    }
    @Test
    public void shouldPreviosStationOutInterval(){
        Radio radio = new Radio(10,1,1,100,0,50);
        radio.previosStation();
        assertEquals(10, radio.getCurrentNumberStation());
    }
    @Test
    public void shouldUpVolumeInInterval(){
        Radio radio = new Radio(10,1,5,100,0,0);
        radio.upVolume();
        assertEquals(1, radio.getCurrentVolume());
    }
    @Test
    public void shouldUpVolumeOutInterval(){
        Radio radio = new Radio(10,1,5,100,0,100);
        radio.upVolume();
        assertEquals(100, radio.getCurrentVolume());
    }
    @Test
    public void shouldDownVolumeInInterval(){
        Radio radio = new Radio(10,1,5,100,0,50);

        radio.downVolume();
        assertEquals(49, radio.getCurrentVolume());
    }
    @Test
    public void shouldDownVolumeOutInterval(){
        Radio radio = new Radio(10,1,5,100,0,0);
        radio.downVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}
