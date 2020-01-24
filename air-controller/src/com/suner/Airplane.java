package com.suner;

public class Airplane {
    private String brand;
    private String model;
    private String licensePlate;
    private String origin;
    private String destination;
    private Double speed;
    private Double autonomy;
    private Boolean undercarriage;
    private Boolean engine;
    private Coordinate coordinates;
    private int passengerCapacity;
    private int crew;
    private boolean takenOff;

    public Airplane(String brand, String model, String licensePlate, String origin, String destination, Double autonomy, int passengerCapacity, int crew) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
        this.origin = origin;
        this.destination = destination;
        this.speed = 0.0;
        this.autonomy = autonomy;
        this.undercarriage = true;
        this.engine = false;
        this.coordinates = new Coordinate(100, (int)Math.floor(Math.random()*(120-100+1)+(100)), 0);
        this.passengerCapacity = passengerCapacity;
        this.crew = crew;
        this.takenOff = false;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Double getSpeed() {
        return speed;
    }
    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Double getAutonomy() {
        return autonomy;
    }
    public void setAutonomy(Double autonomy) {
        this.autonomy = autonomy;
    }

    public Boolean getUndercarriage() {
        return undercarriage;
    }
    public void setUndercarriage(Boolean undercarriage) {
        this.undercarriage = undercarriage;
    }

    public Boolean getEngine() {
        return engine;
    }
    public void setEngine(Boolean engine) {
        this.engine = engine;
    }

    public Coordinate getCoordinates() {
        return coordinates;
    }
    public void setCoordinates(Coordinate coordinates) {
        this.coordinates = coordinates;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }
    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getCrew() {
        return crew;
    }
    public void setCrew(int crew) {
        this.crew = crew;
    }

    public boolean isTakenOff() {
        return takenOff;
    }
    public void setTakenOff(boolean takenOff) {
        this.takenOff = takenOff;
    }

    /*--------------------------------------------------------------------------------------------------------------*/

    @Override
    public String toString() {
        return Texts.getBrandTxt() + brand +
                Texts.getModelTxt() + model +
                Texts.getLicensePlateTxt() + licensePlate +
                Texts.getOriginTxt() + origin +
                Texts.getDestinationTxt() + destination +
                Texts.getSpeedTxt() + speed +
                Texts.getAutonomyTxt() + autonomy +
                Texts.getUndercarriageTxt() + undercarriage +
                Texts.getEngineTxt() + engine +
                Texts.getCoordinatesTxt() + coordinates +
                Texts.getPassengerCapacityTxt() + passengerCapacity +
                Texts.getCrewTxt() + crew;
    }
}
