package model;

public class Centrifuge extends LabEquipment {
    
    private int maxRPM;
    
    public static final int MIN_RPM = 7500;
    
    // String manufacturer, String model, int year
    public Centrifuge(String manufacturer, String model, int year, int maxRPM) {
        super(manufacturer, model, year);
        setMaxRPM(maxRPM);
    }
    
    public Centrifuge(Centrifuge source) {
        super(source);
        setMaxRPM(source.maxRPM);
    }
    
    public int getMaxRPM() {
        return maxRPM;
    }
    
    public void setMaxRPM(int maxRPM) {
        if (maxRPM < MIN_RPM) {
            throw new IllegalArgumentException("Max RPM must be the same as or higher than the minimum of 7500RPM");
        }
        this.maxRPM = maxRPM;
    }
    
    @Override
    public String performMaintenance() {
        return "Centrifuge maintenance: check the rotor, clean the chamber, lubricate the spindle";
    }
    
    @Override
    public LabEquipment clone() {
        Centrifuge centCopy = new Centrifuge(this);
        return centCopy;
    }
    
}