package labs.lab3;

import java.io.IOException;
import java.util.logging.*;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws IOException {
        Handler consoleHandler = new FileHandler();
        Surgeon surgeon = new Surgeon();
        NeuroSurgeon neurosurgeon = new NeuroSurgeon();
        Patient firstPatient = new Patient(37.5, "headache");
        logger.addHandler(consoleHandler);
        logger.info("Surgeon: " + surgeon.doOperation(firstPatient));
        logger.info("Neurosurgeon: " + neurosurgeon.doOperation(firstPatient));

        Patient secondPatient = new Patient(37.0, "stomachache");
        logger.info("Surgeon: " + surgeon.doOperation(secondPatient));
        logger.info("Neurosurgeon: " + neurosurgeon.doOperation(secondPatient));

        Patient thirdPatient = new Patient(36.6, null);
        logger.info("Surgeon: " + surgeon.doOperation(thirdPatient));
        logger.info("Neurosurgeon: " + neurosurgeon.doOperation(thirdPatient));
    }
}
