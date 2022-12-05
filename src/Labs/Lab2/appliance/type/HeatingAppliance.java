package Labs.Lab2.appliance.type;

import Labs.Lab2.appliance.HouseholdElectricalAppliance;

public class HeatingAppliance extends HouseholdElectricalAppliance {

    private double maxTemperature;
    private boolean steamGenerator;
    public HeatingAppliance(int power, boolean powerSupply, String name, double maxTemperature, boolean steamGenerator){
        super(name, power, powerSupply);
        this.maxTemperature = maxTemperature;
        this.steamGenerator = steamGenerator;
    }

    public double getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(double maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public boolean isSteamGenerator() {
        return steamGenerator;
    }

    public void setSteamGenerator(boolean steamGenerator) {
        this.steamGenerator = steamGenerator;
    }

    @Override
    public String toString() {
        return "HeatingAppliance{" +
                "maxTemperature=" + maxTemperature +
                ", steamGenerator=" + steamGenerator +
                ", power=" + power +
                ", powerSupply=" + powerSupply +
                ", name='" + name + '\'' +
                '}';
    }
}
