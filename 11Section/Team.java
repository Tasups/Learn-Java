import java.util.Map;
import java.util.HashMap;

public class Team {
    
    private String name;
    private Map<String, String> players;
    
    public Team(String name) {
        this.name = name;
        this.players = new HashMap<>();
    }
    
    public Team(Team source) {
        setName(source.name);
        this.players = new HashMap<>();
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Team name cannot be null or empty");
        }
        this.name = name;
    }
    
    public String getPlayer(String position) {
        return this.players.get(position);
    }
    
    public void setPlayer(String position, String player) {
        this.players.put(position, player);
    }
    
}