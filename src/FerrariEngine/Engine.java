package FerrariEngine;

public abstract class Engine {
    private double engineVolume;
    private int cylinderAmount;
    private double engineWeight;

    public Engine(double engineVolume, int cylinderAmount, double engineWeight) {
        this.engineVolume = engineVolume;
        this.cylinderAmount = cylinderAmount;
        this.engineWeight = engineWeight;
    }

    public Engine() {
    }

    public double getEngineVolume() {
        return this.engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getCylinderAmount() {
        return this.cylinderAmount;
    }

    public void setCylinderAmount(int cylinderAmount) {
        this.cylinderAmount = cylinderAmount;
    }

    public double getEngineWeight() {
        return this.engineWeight;
    }

    public void setEngineWeight(double engineWeight) {
        this.engineWeight = engineWeight;
    }

    public abstract double efficiency();

    public abstract double throttleEnergy();

    public abstract double breakEnergy();

    public double getMaxSpeed() {
        return (this.throttleEnergy() - this.breakEnergy()) * this.efficiency();
    }
}
