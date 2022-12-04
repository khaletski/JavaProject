package Labs.Lab2.appliance;

public class Microwave extends HouseholdElectricalAppliance {

    private boolean timer;
    private boolean defrostMode;

    public Microwave(int power, boolean powerSupply, boolean timer, boolean defrostMode) {
        super(power, powerSupply);
        this.timer = timer;
        this.defrostMode = defrostMode;
    }

    public boolean isTimer() {
        return timer;
    }

    public void setTimer(boolean timer) {
        this.timer = timer;
    }

    public boolean isDefrostMode() {
        return defrostMode;
    }

    public void setDefrostMode(boolean defrostMode) {
        this.defrostMode = defrostMode;
    }

    @Override
    public String toString() {
        return "Microwave{" +
                "timer=" + timer +
                ", defrostMode=" + defrostMode +
                ", power=" + power +
                ", powerSupply=" + powerSupply +
                '}';
    }
}
