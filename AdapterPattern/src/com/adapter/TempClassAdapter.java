package com.adapter;

public class TempClassAdapter extends CelciusReporter implements TempAdapter {

    @Override
    public double getTempInC() {
        return super.getTemperatureInCel();
    }

    @Override
    public void setTempInC(double tempInC) {
        super.setTemperatureInCel(tempInC);
    }

    @Override
    public double getTempInF() {
        return celciusToFarenheit(super.getTemperatureInCel());
    }

    @Override
    public void setTempInF(double tempInF) {
        super.setTemperatureInCel(farenheitToCelcius(tempInF));
    }

    private double celciusToFarenheit(double celcius) {
        return (celcius * 1.8) + 32;
    }

    private double farenheitToCelcius(double farenheit) {
        return (farenheit - 32) / 1.8;
    }
}
