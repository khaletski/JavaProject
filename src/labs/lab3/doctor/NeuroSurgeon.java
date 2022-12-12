package labs.lab3.doctor;

import labs.lab3.patient.Patient;

public class NeuroSurgeon extends Surgeon {

    @Override
    String doOperation(Patient patient){
        if(patient.getComplaint() == "headache"){
            return patient.getComplaint() + " -> do operation";
        }
        return patient.getComplaint() + " -> don't operation:";
    }
}
