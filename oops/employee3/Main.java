package employee3;

public class Main {
    public static void main(String[] args) {
        // Hardcoded Manager input
        String M_name = "Jax";
        int M_id = 101;
        int M_teamSize = 8;

        // Hardcoded Engineer input
        String E_name = "William";
        int E_id = 202;
        String E_specialization = "Backend Developer";

        // Create Manager object
        Manager manager = new Manager(M_name, M_id, M_teamSize);
        System.out.println("Manager Details");
        manager.displayDetails();

        System.out.println();

        // Create Engineer object
        Engineer engineer = new Engineer(E_name, E_id, E_specialization);
        System.out.println("Engineer Details");
        engineer.displayDetails();
    }
}