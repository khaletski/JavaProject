package Labs.Lab2;

import Labs.Lab2.appliance.*;
import Labs.Lab2.appliance.type.CleaningAppliance;
import Labs.Lab2.appliance.type.HeatingAppliance;
import Labs.Lab2.appliance.type.KithcenAppliance;
import Labs.Lab2.appliance.type.LightningAppliance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<HouseholdElectricalAppliance> householdElectricalApplianceList = new ArrayList<>();
        householdElectricalApplianceList.add(new CleaningAppliance(2000, true, "VacuumCleaner", 3.4));
        householdElectricalApplianceList.add(new LightningAppliance(1300, false, "DeskLamp", 700));
        householdElectricalApplianceList.add(new HeatingAppliance(5600, true, "Heater", 80, false));
        householdElectricalApplianceList.add(new KithcenAppliance(1850, true, "Kettle", false, true));


        CheckFullPower checkPower = new CheckFullPower(householdElectricalApplianceList);
        System.out.println(checkPower.CalculatePower());

        Collections.sort(householdElectricalApplianceList);
        System.out.println(householdElectricalApplianceList);

        SearchAppliance searchAppliance = new SearchAppliance();
        System.out.println(searchAppliance.Search(1700, 2300, (ArrayList<HouseholdElectricalAppliance>) householdElectricalApplianceList));
        System.out.println(searchAppliance.Search(1700,2300, "VacuumCleaner", (ArrayList<HouseholdElectricalAppliance>) householdElectricalApplianceList));
    }
}
