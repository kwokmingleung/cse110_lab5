package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float newValue = (float)((this.getValue() - 32.0) * 5.0 / 9.0);
        Temperature newTemp = new Celsius(newValue);
        return newTemp;
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {
        // TODO: Complete this method
        return String.valueOf(this.getValue()) + " F";
    }
}