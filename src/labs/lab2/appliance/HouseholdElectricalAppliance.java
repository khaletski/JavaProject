package labs.lab2.appliance;

public abstract class HouseholdElectricalAppliance implements Comparable<HouseholdElectricalAppliance> {

    protected int power;
    protected boolean powerSupply;
    protected String name;

    public HouseholdElectricalAppliance(String name, int power, boolean powerSupply) {
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
