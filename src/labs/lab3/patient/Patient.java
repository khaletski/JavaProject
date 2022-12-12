package labs.lab3.patient;

public class Patient {

    private double bodyTemperature;
    private String complaint;

    public Patient(double bodyTemperature, String complaint) {
        this.bodyTemperature = bodyTemperature;
        this.complaint = complaint;
    }

    public double getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(double bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }
}