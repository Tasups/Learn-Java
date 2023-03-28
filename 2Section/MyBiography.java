/*
>> My name is <name>. I'm <age> years old, and I'm from <country>.
>> My favorite sport is <sport>. I play for <hours> hour(s) a day
>> When I'm tired, I like to play <game>.
>> In school, my favourite subject was <subject>. I scored a <grade>.
*/


public class MyBiography {
    
    public static void main(String[] args) {
        String name = "Jason";
        int age = 45;
        String country = "USA";
        String sport = "football";
        int hours = 0;
        String game = "Wordle";
        String subject = "history";
        char grade = 'A';
        
        System.out.println("My name is " + name + ". I'm " + age + " years old, and I'm from the " + country + ".");
        System.out.println("My favorite sport is " + sport + ". I play for " + hours + " hour(s) a day.");
        System.out.println("When I'm tired, I like to play " + game + ".");
        System.out.println("In school, my favourite subject was " + subject + ". I scored an " + grade +".");
    }
    
}