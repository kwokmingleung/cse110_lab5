package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float newValue = (float)((this.getValue()* 9.0 / 5.0) + 32.0);
        Temperature newTemp = new Fahrenheit(newValue);
        return newTemp;
    }

    public String toString()
    {
        // TODO: Complete this method
        return String.valueOf(this.getValue()) + " C";
    }
}