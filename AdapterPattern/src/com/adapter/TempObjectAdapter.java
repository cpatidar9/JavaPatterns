package com.adapter;

public class TempObjectAdapter implements TempAdapter {

    CelciusReporter celciusReporter = new CelciusReporter();

    @Override
    public double getTempInC() {
        return celciusReporter.getTemperatureInCel();
    }

    @Override
    public void setTempInC(double tempInC) {
        celciusReporter.setTemperatureInCel(tempInC);
    }

    @Override
    public double getTempInF() {
        return celciusToFarenheit(celciusReporter.getTemperatureInCel());
    }

    @Override
    public void setTempInF(double tempInF) {
        celciusReporter.setTemperatureInCel(farenheitToCelcius(tempInF));
    }

    private double celciusToFarenheit(double celcius) {
        return (celcius * 1.8) + 32;
    }

    private double farenheitToCelcius(double farenheit) {
        return (farenheit - 32) / 1.8;
    }
}
