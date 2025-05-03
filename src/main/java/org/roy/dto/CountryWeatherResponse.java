package org.roy.dto;

public class CountryWeatherResponse {

    private String country;
    private String capital;
    private double temperature;
    private String weatherDescription;
    private int humidity;

    public CountryWeatherResponse(String country, String capital, double temperature, String weatherDescription, int humidity) {
        this.country = country;
        this.capital = capital;
        this.temperature = temperature;
        this.weatherDescription = weatherDescription;
        this.humidity = humidity;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getWeatherDescription() {
        return weatherDescription;
    }

    public void setWeatherDescription(String weatherDescription) {
        this.weatherDescription = weatherDescription;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}
