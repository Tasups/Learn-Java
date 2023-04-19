public class City {
    
    private String name;
    private String country;
    private long population;
    
    public City(String name, String country, long population) {
        setName(name);
        setCountry(country);
        setPopulation(population);
    }
    
    public City(City source) {
        setName(source.name);
        setCountry(source.country);
        setPopulation(source.population);
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank.");
        }
        this.name = name;
    }
    
    public String getCountry() {
        return country;
    }
    
    public void setCountry(String country) {
        if (country == null || country.isBlank()) {
            throw new IllegalArgumentException("Country cannot be null or blank.");
        }
        this.country = country;
    }
    
    public long getPopulation() {
        return population;
    }
    
    public void setPopulation(long population) {
        if (population <= 0) {
            throw new IllegalArgumentException("Population cannot be less than or equal to zero.");
        }
        this.population = population;
    }
    
    public String toString() {
        return "\n" + this.name + " located in " + this.country + ", has a population of " + this.population;
    }
    
}