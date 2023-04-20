package model;

public class Microscope extends LabEquipment {
    
    private int magnification;
    
    public static final int MIN_MAG = 1;
    
    // String manufacturer, String model, int year
    public Microscope(String manufacturer, String model, int year, int magnification) {
        super(manufacturer, model, year);
        setMagnification(magnification);
    }
    
    public Microscope(Microscope source) {
        super(source);
        setMagnification(source.magnification);
    }
    
    public int getMagnification() {
        return magnification;
    }
    
    public void setMagnification(int magnification) {
        if (magnification < MIN_MAG) {
            throw new IllegalArgumentException("Magnification must be greater than or equal to the minimum magnification of 1.");
        }
        this.magnification = magnification;
    }
    
    @Override
    public String performMaintenance() {
        return "Microscope maintenance: clean the lenses and check the light source.";
    }
    
    @Override
    public LabEquipment clone() {
        Microscope microCopy = new Microscope(this);
        return microCopy;
    }
    
}