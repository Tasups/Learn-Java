public class Person {
    private String name;
    private String nationality;
    private String dateOfBirth;
    // private String[] passport;
    private int seatNumber;
    
    public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        //this.passport = passport;
        this.seatNumber = seatNumber;
    }
    
    public Person(Person source) {
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        //this.passport = source.passport;
        this.seatNumber = source.seatNumber;
    }
    
    public boolean applyPassport() {
        double randomDouble = Math.random() * 2;
        int randomInt = (int)randomDouble;
        switch (randomInt) {
            case 0: return false;
            case 1: return true;
            default: return false;
        }
    }
    
    public int chooseSeat() {
        double randomDouble = Math.random() * 12;
        int randomInt = (int)randomDouble;
        return randomInt;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    // public String[] getPassport() {
    //     return passport;
    // }
    
    // public void setPassport(String[] passport) {
    //     this.passport = passport;
    // }
    
    public int getSeatNumber() {
        return seatNumber;
    }
    
    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
    
}
