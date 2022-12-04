package Labs.Lab2;

public class Microwave extends HouseholdElectricalAppliance {

    private boolean timer;
    private boolean defrostMode;

    public Microwave(int power, boolean powerSupply, boolean timer, boolean defrostMode) {
        super(power, powerSupply);
        this.timer = timer;
        this.defrostMode = defrostMode;
    }
}
