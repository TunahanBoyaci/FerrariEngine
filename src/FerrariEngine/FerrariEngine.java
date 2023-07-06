package FerrariEngine;

public class FerrariEngine extends Engine {
    public FerrariEngine(double engineVolume, int cylinderAmount, double engineWeight) {
        super(engineVolume, cylinderAmount, engineWeight);
    }

    public FerrariEngine() {
    }

    public double efficiency() {
        return 0.25;
    }

    public double throttleEnergy() {
        return this.getEngineVolume() * (double)this.getCylinderAmount() * 100.0;
    }

    public double breakEnergy() {
        return this.getEngineWeight() * 2.0;
    }
}
