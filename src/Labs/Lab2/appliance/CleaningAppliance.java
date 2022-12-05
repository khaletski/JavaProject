package Labs.Lab2.appliance;

public class CleaningAppliance extends HouseholdElectricalAppliance{

    private double cordLength;

    public CleaningAppliance(int power, boolean powerSupply, String name, double cordLength) {
        super(name, power, powerSupply);
        this.cordLength = cordLength;

    }

    public double getCordLength() {
        return cordLength;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public String toString() {
        return "CleaningAppliance{" +
                "cordLength=" + cordLength +
                ", power=" + power +
                ", powerSupply=" + powerSupply +
                ", name='" + name + '\'' +
                '}';
    }
}
