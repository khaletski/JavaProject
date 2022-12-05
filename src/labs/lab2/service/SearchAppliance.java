package labs.lab2.service;

import labs.lab2.appliance.HouseholdElectricalAppliance;
import java.util.ArrayList;
import java.util.List;


public class SearchAppliance {


    public ArrayList<HouseholdElectricalAppliance> Search(int minPower, int maxPower, List<HouseholdElectricalAppliance> householdElectricalApplianceArrayList){

        ArrayList<HouseholdElectricalAppliance> result = new ArrayList<>();
        for(HouseholdElectricalAppliance o : householdElectricalApplianceArrayList)
        {
            if(o.getPower() >= minPower && o.getPower() <= maxPower)
                result.add(o);
        }
        return result;
    }

    public ArrayList<HouseholdElectricalAppliance> Search(boolean powerSupply, List<HouseholdElectricalAppliance> householdElectricalApplianceArrayList){

        ArrayList<HouseholdElectricalAppliance> result = new ArrayList<>();
        for(HouseholdElectricalAppliance o : householdElectricalApplianceArrayList)
        {
            if(o.isPowerSupply() == powerSupply)
                result.add(o);
        }
        return result;
    }

    public ArrayList<HouseholdElectricalAppliance> Search(String name, List<HouseholdElectricalAppliance> householdElectricalApplianceArrayList){

        ArrayList<HouseholdElectricalAppliance> result = new ArrayList<>();
        for(HouseholdElectricalAppliance o : householdElectricalApplianceArrayList)
        {
            if(o.getName().equals(name))
                result.add(o);
        }
        return result;
    }

    public ArrayList<HouseholdElectricalAppliance> Search(int minPower, int maxPower, boolean powerSupply, List<HouseholdElectricalAppliance> householdElectricalApplianceArrayList){

        ArrayList<HouseholdElectricalAppliance> firstSearch = Search(minPower, maxPower, householdElectricalApplianceArrayList);
        ArrayList<HouseholdElectricalAppliance> result  = Search(powerSupply, firstSearch);
        return result;
    }

    public ArrayList<HouseholdElectricalAppliance> Search(int minPower, int maxPower, String name, List<HouseholdElectricalAppliance> householdElectricalApplianceArrayList){

        ArrayList<HouseholdElectricalAppliance> firstSearch = Search(minPower, maxPower, householdElectricalApplianceArrayList);
        ArrayList<HouseholdElectricalAppliance> result  = Search(name, firstSearch);
        return result;
    }

    public ArrayList<HouseholdElectricalAppliance> Search(boolean powerSupply, String name, List<HouseholdElectricalAppliance> householdElectricalApplianceArrayList){

        ArrayList<HouseholdElectricalAppliance> firstSearch = Search(powerSupply, householdElectricalApplianceArrayList);
        ArrayList<HouseholdElectricalAppliance> result  = Search(name, firstSearch);
        return result;
    }

    public ArrayList<HouseholdElectricalAppliance> Search(int minPower, int maxPower, boolean powerSupply, String name, List<HouseholdElectricalAppliance> householdElectricalApplianceArrayList){

        ArrayList<HouseholdElectricalAppliance> firstSearch = Search(minPower, maxPower, householdElectricalApplianceArrayList);
        ArrayList<HouseholdElectricalAppliance> secondSearch  = Search(powerSupply, firstSearch);
        ArrayList<HouseholdElectricalAppliance> result  = Search(powerSupply, firstSearch);

        return result;
    }


}
