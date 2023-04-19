import java.util.HashMap;

public class CityPopulationTracker {
    
    private HashMap<String, City> cityPopulations;
    
    public CityPopulationTracker() {
        this.cityPopulations = new HashMap<>();
    }
    
    public City getCity(String name) {
        City cityCopy = new City(this.cityPopulations.get(name));
        return cityCopy;
    }
    
    public void setCity(City city) {
        City cityCopy = new City(city);
        this.cityPopulations.put(city.getName(), cityCopy);
    }
    
    public void addCity(City city) {
        City cityCopy = new City(city);
        // we use the put method here because it will update if the key exists or add a new one if it doesn't
        this.cityPopulations.put(city.getName(), cityCopy);
    }
}