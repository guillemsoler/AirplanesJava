package com.suner;

public class CommercialAirplane extends Airplane {
    private boolean Adapted;

    public CommercialAirplane(String brand, String model, String licensePlate, String origin, String destination, Double autonomy, int passengerCapacity, int crew, boolean adapted) {
        super(brand, model, licensePlate, origin, destination, autonomy, passengerCapacity, crew);
        this.Adapted = adapted;
    }

    @Override
    public String toString() {
        return Texts.getCommercialAirplaneTxt() + super.toString() + Texts.getAdaptedTxt() + Adapted;
    }
}
