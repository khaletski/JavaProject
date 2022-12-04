package Labs.Lab2.appliance;

public class VacuumCleaner extends HouseholdElectricalAppliance{

    private double cordLength;
    private VacuumCleanerTypes vacuumCleanerType;


    public VacuumCleaner(int power, boolean powerSupply, double cordLength, VacuumCleanerTypes vacuumCleanerType) {
        super(power, powerSupply);
        this.cordLength = cordLength;
        this.vacuumCleanerType = vacuumCleanerType;
    }

    public double getCordLength() {
        return cordLength;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

    public VacuumCleanerTypes getVacuumCleanerType() {
        return vacuumCleanerType;
    }

    public void setVacuumCleanerType(VacuumCleanerTypes vacuumCleanerType) {
        this.vacuumCleanerType = vacuumCleanerType;
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "cordLength=" + cordLength +
                ", vacuumCleanerType=" + vacuumCleanerType +
                ", power=" + power +
                ", powerSupply=" + powerSupply +
                '}';
    }
}
