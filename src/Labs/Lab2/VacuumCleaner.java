package Labs.Lab2;

public class VacuumCleaner extends HouseholdElectricalAppliance{

    private double cordLength;
    private VacuumCleanerTypes vacuumCleanerType;


    public VacuumCleaner(int power, boolean powerSupply, double cordLength, VacuumCleanerTypes vacuumCleanerType) {
        super(power, powerSupply);
        this.cordLength = cordLength;
        this.vacuumCleanerType = vacuumCleanerType;
    }
}
