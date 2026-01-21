package animal;
import java.util.*;

public class Main {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        // Input names for dog and cat
        String dName = scanner.nextLine();
        String cName = scanner.nextLine();

            
        // Create Dog objects
        Animal dog = new Dog(dName);
        dog.makeSound();

        // Create Cat objects
        Animal cat = new Cat(cName);
        cat.makeSound();


        scanner.close();
    }
}