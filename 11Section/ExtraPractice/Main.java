public class Main {
    
    public static void main(String[] args) {
        
        /* PART ONE VALIDATION *********************************************************/
    
        // City city1 = new City("New York", "USA", 8500000);
        // System.out.println(city1.getName());
        // System.out.println(city1.toString());
    
        // Uncomment the following line to test invalid input for setName method
        // city1.setName("");
    
        // Uncomment the following line to test invalid input for setCountry method
        // city1.setCountry("");
    
        // Uncomment the following line to test invalid input for setPopulation method
        // city1.setPopulation(-1);
    
        // Uncomment the following line to test invalid input for the constructor
        // City city2 = new City("", "USA", 8500000);
        
        
        /* PART TWO VALIDATION *********************************************************/
        
        CityPopulationTracker tracker = new CityPopulationTracker();
        
        // // Test the addCity method
        tracker.addCity(new City("New York", "USA", 8550405));
        tracker.addCity(new City("Los Angeles", "USA", 3971883));
    
        // // Test the getCity method
        City nyCity = tracker.getCity("New York");
        System.out.println(nyCity.toString());
        System.out.println("Population of New York: " + nyCity.getPopulation());
    
        // // Test the setCity method
        City updatedNyCity = new City("New York", "USA", 8600000);
        tracker.setCity(updatedNyCity);
    
        // // Verify that the city data was updated
        nyCity = tracker.getCity("New York");
        System.out.println("Updated population of New York: " + nyCity.getPopulation());
    }
    
}