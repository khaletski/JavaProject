package Labs.Lab2.appliance;

public class Iron extends HouseholdElectricalAppliance {

    private double maxTemperature;
    private boolean steamGenerator;
    public Iron(int power, boolean powerSupply, double maxTemperatur, boolean steamGenerator) {
        super(power, powerSupply);
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
        return "Iron{" +
                "maxTemperature=" + maxTemperature +
                ", steamGenerator=" + steamGenerator +
                ", power=" + power +
                ", powerSupply=" + powerSupply +
                '}';
    }
}
