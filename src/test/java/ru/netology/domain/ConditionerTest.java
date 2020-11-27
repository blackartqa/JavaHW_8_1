package ru.netology.domain;

import org.junit.jupiter.api.Test;

import javax.management.ObjectName;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void shouldIncreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(22);
        conditioner.increaseCurrentTemperature();
        assertEquals(23, conditioner.getCurrentTemperature());
}
    @Test
    public void shouldNotIncreaseCurrentTemperature(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(30);
        conditioner.increaseCurrentTemperature();
        assertEquals(30, conditioner.getCurrentTemperature());

}

    @Test
    public void shouldDecreaseCurrentTemperature(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(27);
        conditioner.decreaseCurrentTemperature();
        assertEquals(26, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldNotDecreaseCurrentTemperature(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(15);
        conditioner.decreaseCurrentTemperature();
        assertEquals(15, conditioner.getCurrentTemperature());
    }

}

