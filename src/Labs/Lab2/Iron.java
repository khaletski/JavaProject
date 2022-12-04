package Labs.Lab2;

public class Iron extends HouseholdElectricalAppliance {

    private double max_Temperature;
    private boolean steamGenerator;
    public Iron(int power, boolean powerSupply, double max_Temperatur, boolean steamGenerator) {
        super(power, powerSupply);
        this.max_Temperature = max_Temperature;
        this.steamGenerator = steamGenerator;
    }
}
