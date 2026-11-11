
package orientationtask1;

public class SimulationTest {

    public static void main(String[] args) {

        // Run simulation 3 times
        for (int i = 1; i <= 3; i++) {

            System.out.println("\n========== SIMULATION "
                    + i + " ==========");

            // Create service point
            ServicePoint servicePoint = new ServicePoint();

            // Create customer generator
            CustomerGenerator generator = new CustomerGenerator();

            // Generate 5 customers
            System.out.println("\nGenerating customers...");

            generator.generateCustomers(servicePoint, 5);

            // Serve customers
            System.out.println("\nStarting service...\n");

            servicePoint.serve();

            // Display average service time
            System.out.println("\nAverage service time: "
                    + servicePoint.calculateAverageServiceTime()
                    + " ms");

            System.out.println("\nSimulation " + i + " completed.");
        }
    }
}
