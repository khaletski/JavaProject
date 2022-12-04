package Labs.Lab2;

import Labs.Lab2.appliance.HouseholdElectricalAppliance;

import java.util.ArrayList;
import java.util.List;

public class CheckPower {

    private List<HouseholdElectricalAppliance> householdElectricalApplianceList = new ArrayList<>();

    public CheckPower(List<HouseholdElectricalAppliance> householdElectricalApplianceList) {
        this.householdElectricalApplianceList = householdElectricalApplianceList;
    }

    double CalculatePower() {

        double fullPower = 0;
        for (HouseholdElectricalAppliance o : householdElectricalApplianceList) {
            if (o.isPowerSupply())
                fullPower += o.getPower();
        }
        return fullPower;
    }
}
