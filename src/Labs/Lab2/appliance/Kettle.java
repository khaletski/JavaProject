package Labs.Lab2.appliance;

public class Kettle extends HouseholdElectricalAppliance{

    private double volume;
    private boolean remoteControl;

    public Kettle(int power, boolean powerSupply, double volume, boolean remoteControl) {
        super(power, powerSupply);
        this.volume = volume;
        this.remoteControl = remoteControl;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public boolean isRemoteControl() {
        return remoteControl;
    }

    public void setRemoteControl(boolean remoteControl) {
        this.remoteControl = remoteControl;
    }

    @Override
    public String toString() {
        return "Kettle{" +
                "volume=" + volume +
                ", remoteControl=" + remoteControl +
                ", power=" + power +
                ", powerSupply=" + powerSupply +
                '}';
    }
}
