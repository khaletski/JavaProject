package labs.lab2;

import labs.lab2.appliance.HouseholdElectricalAppliance;

import java.util.ArrayList;

public class SearchAppliance {


    ArrayList<HouseholdElectricalAppliance> Search(int minPower, int maxPower, ArrayList<HouseholdElectricalAppliance> householdElectricalApplianceArrayList){

        ArrayList<HouseholdElectricalAppliance> result = new ArrayList<>();
        for(HouseholdElectricalAppliance o : householdElectricalApplianceArrayList)
        {
            if(o.getPower() >= minPower && o.getPower() <= maxPower)
                result.add(o);
        }
        return result;
    }

    ArrayList<HouseholdElectricalAppliance> Search(boolean powerSupply, ArrayList<HouseholdElectricalAppliance> householdElectricalApplianceArrayList){

        ArrayList<HouseholdElectricalAppliance> result = new ArrayList<>();
        for(HouseholdElectricalAppliance o : householdElectricalApplianceArrayList)
        {
            if(o.isPowerSupply() == powerSupply)
                result.add(o);
        }
        return result;
    }

    ArrayList<HouseholdElectricalAppliance> Search(String name, ArrayList<HouseholdElectricalAppliance> householdElectricalApplianceArrayList){

        ArrayList<HouseholdElectricalAppliance> result = new ArrayList<>();
        for(HouseholdElectricalAppliance o : householdElectricalApplianceArrayList)
        {
            if(o.getName() == name)
                result.add(o);
        }
        return result;
    }

    ArrayList<HouseholdElectricalAppliance> Search(int minPower, int maxPower, boolean powerSupply, ArrayList<HouseholdElectricalAppliance> householdElectricalApplianceArrayList){

        ArrayList<HouseholdElectricalAppliance> firstSearch = Search(minPower, maxPower, householdElectricalApplianceArrayList);
        ArrayList<HouseholdElectricalAppliance> result  = Search(powerSupply, firstSearch);
        return result;
    }

    ArrayList<HouseholdElectricalAppliance> Search(int minPower, int maxPower, String name, ArrayList<HouseholdElectricalAppliance> householdElectricalApplianceArrayList){

        ArrayList<HouseholdElectricalAppliance> firstSearch = Search(minPower, maxPower, householdElectricalApplianceArrayList);
        ArrayList<HouseholdElectricalAppliance> result  = Search(name, firstSearch);
        return result;
    }

    ArrayList<HouseholdElectricalAppliance> Search(boolean powerSupply, String name, ArrayList<HouseholdElectricalAppliance> householdElectricalApplianceArrayList){

        ArrayList<HouseholdElectricalAppliance> firstSearch = Search(powerSupply, householdElectricalApplianceArrayList);
        ArrayList<HouseholdElectricalAppliance> result  = Search(name, firstSearch);
        return result;
    }

    ArrayList<HouseholdElectricalAppliance> Search(int minPower, int maxPower, boolean powerSupply, String name, ArrayList<HouseholdElectricalAppliance> householdElectricalApplianceArrayList){

        ArrayList<HouseholdElectricalAppliance> firstSearch = Search(minPower, maxPower, householdElectricalApplianceArrayList);
        ArrayList<HouseholdElectricalAppliance> secondSearch  = Search(powerSupply, firstSearch);
        ArrayList<HouseholdElectricalAppliance> result  = Search(powerSupply, firstSearch);

        return result;
    }


}
