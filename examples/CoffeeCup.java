import java.util.Scanner;

import com.suhas.coffeebrewer.CoffeeBrewer;
import com.suhas.coffeebrewer.CoffeeBrewerMediator;

public class CoffeeCup {
    public static void main(String[] args) {
        CoffeeBrewerMediator brewer = new CoffeeBrewer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want milk in your coffee?");
        boolean withMilk = scanner.nextLine().equalsIgnoreCase("yes");
        brewer.brewCoffee(withMilk);
    }
}
