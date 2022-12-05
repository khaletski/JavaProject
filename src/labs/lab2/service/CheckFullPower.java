package labs.lab2.service;

import labs.lab2.appliance.HouseholdElectricalAppliance;

import java.util.ArrayList;
import java.util.List;

public class CheckFullPower {

    private List<HouseholdElectricalAppliance> householdElectricalApplianceList = new ArrayList<>();

    public CheckFullPower(List<HouseholdElectricalAppliance> householdElectricalApplianceList) {
        this.householdElectricalApplianceList = householdElectricalApplianceList;
    }

    public double CalculatePower() {

        double fullPower = 0;
        for (HouseholdElectricalAppliance o : householdElectricalApplianceList) {
            if (o.isPowerSupply())
                fullPower += o.getPower();
        }
        return fullPower;
    }
}
