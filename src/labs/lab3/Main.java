package labs.lab3;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Surgeon surgeon = new Surgeon();
        NeuroSurgeon neurosurgeon = new NeuroSurgeon();
        Patient firstPatient = new Patient(37.5, "headache");
        Patient secondPatient = new Patient(37.0, "stomachache");
        Patient thirdPatient = new Patient(36.6, null);
        System.out.println("Surgeon: " + surgeon.doOperation(firstPatient));
        System.out.println("Surgeon: " + surgeon.doOperation(secondPatient));
        System.out.println("Surgeon: " + surgeon.doOperation(thirdPatient));
        System.out.println("Neurosurgeon: " + neurosurgeon.doOperation(firstPatient));
        System.out.println("Neurosurgeon: " + neurosurgeon.doOperation(secondPatient));
        System.out.println("Neurosurgeon: " + neurosurgeon.doOperation(thirdPatient));
    }
}
