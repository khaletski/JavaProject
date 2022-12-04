package Labs.Lab2;

public class Kettle extends HouseholdElectricalAppliance{

    private double volume;
    private boolean remoteControl;

    public Kettle(int power, boolean powerSupply, double volume, boolean remoteControl) {
        super(power, powerSupply);
        this.volume = volume;
        this.remoteControl = remoteControl;
    }
}
