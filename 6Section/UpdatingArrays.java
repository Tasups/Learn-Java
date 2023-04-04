import java.util.Arrays;

public class UpdatingArrays {
    
    public static void main(String[] args) {
        String[] menu = {"Espresso", "Iced Coffee", "Macchiato"};
        String menuString = Arrays.toString(menu);
        System.out.println(menuString);
        menu[2] = "Latte";
        // or, do the same in one ling
        System.out.println(Arrays.toString(menu));
        // YOU CANNOT CHANGE THE LENGTH OF AN ARRAY!!!! YOU NEED TO CREATE A NEW ARRAY!!!!
        String[] newMenu = new String[5];
        
        for (int i = 0; i < menu.length; i++) {
            newMenu[i] = menu[i];
        }
        newMenu[3] = "House Blend";
        newMenu[4] = "Dark Roast";
        System.out.println(Arrays.toString(newMenu));
        
    }
    
}