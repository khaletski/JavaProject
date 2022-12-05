package Labs.Lab2;

import Labs.Lab2.appliance.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<HouseholdElectricalAppliance> householdElectricalApplianceList = new ArrayList<>();


        CheckPower checkPower = new CheckPower(householdElectricalApplianceList);
        System.out.println(checkPower.CalculatePower());

        Collections.sort(householdElectricalApplianceList);
        System.out.println(householdElectricalApplianceList);

    }
}
