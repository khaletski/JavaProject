package labs.lab3.doctor;

import labs.lab3.patient.Patient;

public interface IDoctor {

    boolean examinePatient(Patient patient);
    boolean prescribeMedicine(Patient patient);
}
