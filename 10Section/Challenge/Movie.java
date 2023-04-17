public class Movie {
    
    private name;
    private format;
    private rating;
    
    public Movie(String name, String format, double rating) {
        setName(name);
        setFormat(format);
        setRating(rating);
    }
    
    public Movie(Main source) {
        this.name = source.name;
        this.format = source.format;
        this.rating =  source.rating;
    }
    
    public String getName() {
        return name;
    }
    
    public setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        } 
        this.name = name;    
    }
    
    public String getFormat() {
        return format;
    }
    
    public setFormat(String format) {
        if (format == null || format.isBlank()) {
            throw new IllegalArgumentException("Format cannot be null or blank");
        }
        this.format = format;
    }
    
    public double getRating() {
        return rating;
    }
    
    public setRating(double rating) {
        if (rating == null || rating.isBlank() || rating < 0 || rating > 10) {
            thrown new IllegalArgumentException("Rating cannot be null, blank, less than zero, or greater than ten")
        }
        this.rating = rating;
    }
    
    
}