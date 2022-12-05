package labs.lab2.appliance.type;

import labs.lab2.appliance.HouseholdElectricalAppliance;

public class KithcenAppliance extends HouseholdElectricalAppliance {

    private boolean timer;
    private boolean remoteControl;

    public KithcenAppliance(int power, boolean powerSupply, String name, boolean timer, boolean remoteControl) {
        super(name, power, powerSupply);
        this.timer = timer;
        this.remoteControl = remoteControl;
    }

    public boolean isTimer() {
        return timer;
    }

    public void setTimer(boolean timer) {
        this.timer = timer;
    }

    public boolean isRemoteControl() {
        return remoteControl;
    }

    public void setRemoteControl(boolean remoteControl) {
        this.remoteControl = remoteControl;
    }

    @Override
    public String toString() {
        return "KithcenAppliance{" +
                "timer=" + timer +
                ", remoteControl=" + remoteControl +
                ", power=" + power +
                ", powerSupply=" + powerSupply +
                ", name='" + name + '\'' +
                '}';
    }
}
