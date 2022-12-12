package labs.lab3;

public class NeuroSurgeon extends Surgeon{

    @Override
    String doOperation(Patient patient){
        if(patient.getComplaint() == "headache"){
            return patient.getComplaint() + " -> do operation";
        }
        return patient.getComplaint() + " -> don't operation:";
    }
}
