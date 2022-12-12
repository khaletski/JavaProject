package labs.lab3.doctor;

import labs.lab3.patient.Patient;

public class Surgeon implements IDoctor {

    @Override
    public boolean examinePatient(Patient patient) {
        if (patient != null){
            return true;
        }
        return false;
    }

    @Override
    public boolean prescribeMedicine(Patient patient) {
        throw new UnsupportedOperationException();
    }

     String doOperation(Patient patient)
     {
        if(patient.getComplaint() != null){
            return patient.getComplaint() + " -> do operation";
        }
         return patient.getComplaint() + " -> don't operation:";
     }
}