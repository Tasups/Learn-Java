import java.util.Scanner;

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
        
        // CityPopulationTracker tracker = new CityPopulationTracker();
        
        // // // Test the addCity method
        // tracker.addCity(new City("New York", "USA", 8550405));
        // tracker.addCity(new City("Los Angeles", "USA", 3971883));
    
        // // // Test the getCity method
        // City nyCity = tracker.getCity("New York");
        // System.out.println(nyCity.toString());
        // System.out.println("Population of New York: " + nyCity.getPopulation());
    
        // // // Test the setCity method
        // City updatedNyCity = new City("New York", "USA", 8600000);
        // tracker.setCity(updatedNyCity);
    
        // // // Verify that the city data was updated
        // nyCity = tracker.getCity("New York");
        // System.out.println("Updated population of New York: " + nyCity.getPopulation());
        
        
        /* PART THREE VALIDATION *********************************************************/
        
        Scanner scanner = new Scanner(System.in);

        String cityName = promptForCityName(scanner);

        String country = promptForCountry(scanner);

        int population = promptForPopulation(scanner);

        City newCity = new City(cityName, country, population);

        CityPopulationTracker tracker = new CityPopulationTracker();
        tracker.addCity(newCity);

        System.out.println("City added to the tracker: " + newCity.getName());
        System.out.println(newCity.toString());
        
        scanner.close();
        
    }
    
    public static String promptForCityName(Scanner scanner) {
        while (true) {
            System.out.println("\nPlease enter a valid city name: ");
            String cityName = scanner.nextLine();
            if (!isNullOrBlank(cityName)) {
                return cityName;
            }
        }
    }
    
    public static String promptForCountry(Scanner scanner) {
        while (true) {
            System.out.println("\nPlease enter a valid country name: ");
            String country = scanner.nextLine();
            if (!isNullOrBlank(country)) {
                return country;
            }
        }
    }
    
    public static int promptForPopulation(Scanner scanner) {
        while (true) {
            System.out.println("\nPlease enter a valid population: ");
            if (!scanner.hasNextInt()) {
                scanner.next();
                continue;
            }
            int population = scanner.nextInt();
            if(!incorrectPopulation(population)) {
                return population;
            }
        }
    }
    
    public static boolean isNullOrBlank(String input) {
        return (input == null || input.isBlank());
    }
    
    public static boolean incorrectPopulation(int population) {
        return (population <= 0);
    }
    
}