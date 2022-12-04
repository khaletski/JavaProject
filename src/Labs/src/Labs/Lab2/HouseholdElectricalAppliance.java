package Labs.Lab2;

public abstract class HouseholdElectricalAppliance implements Comparable<HouseholdElectricalAppliance> {

    private int power;
    private boolean powerSupply;

    public HouseholdElectricalAppliance(int power, boolean powerSupply) {
        this.power = power;
        this.powerSupply = powerSupply;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(boolean powerSupply) {
        this.powerSupply = powerSupply;
    }

    @Override
    public int compareTo(HouseholdElectricalAppliance o) {
        int result = (this.getPower() - o.getPower());
        if (result >= 0)
            return 1;
        else if (result < 0)
            return -1;

        return result;
    }
}