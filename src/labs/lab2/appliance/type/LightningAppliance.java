package labs.lab2.appliance.type;

import labs.lab2.appliance.HouseholdElectricalAppliance;

public class LightningAppliance extends HouseholdElectricalAppliance {

    private double numberOfLumens;

    public LightningAppliance(int power, boolean powerSupply, String name, double numberOfLumens) {
        super(name, power, powerSupply);
        this.numberOfLumens = numberOfLumens;
    }

    public double getNumberOfLumens() {
        return numberOfLumens;
    }

    public void setNumberOfLumens(double numberOfLumens) {
        this.numberOfLumens = numberOfLumens;
    }

    @Override
    public String toString() {
        return "LightningAppliance{" +
                "numberOfLumens=" + numberOfLumens +
                ", power=" + power +
                ", powerSupply=" + powerSupply +
                ", name='" + name + '\'' +
                '}';
    }
}
