package FerrariEngine;

public class RenaultEngine extends Engine {
    private double extraTurboEnergy;

    public RenaultEngine(double engineVolume, int cylinderAmount, double engineWeight, double extraTurboEnergy) {
        super(engineVolume, cylinderAmount, engineWeight);
        this.extraTurboEnergy = extraTurboEnergy;
    }

    public RenaultEngine() {
    }

    public double getExtraTurboEnergy() {
        return this.extraTurboEnergy;
    }

    public void setExtraTurboEnergy(double extraTurboEnergy) {
        this.extraTurboEnergy = extraTurboEnergy;
    }

    public double efficiency() {
        return 0.27;
    }

    public double throttleEnergy() {
        return this.getEngineVolume() * (double)this.getCylinderAmount() * 110.0 + this.extraTurboEnergy;
    }

    public double breakEnergy() {
        return this.getEngineWeight() * 2.1;
    }
}

