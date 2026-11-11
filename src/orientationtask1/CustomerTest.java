package orientationtask1;

public class CustomerTest {

    public static void main(String[] args) {

    // Create customers
    Customer customer1 = new Customer(1000, 5000);
    Customer customer2 = new Customer(2000, 7000);
    Customer customer3 = new Customer(3000, 9000);

    // Display first customer
        System.out.println("Airport Check-in Simulation");

        System.out.println("-");

        System.out.println("Customer ID: " + customer1.getId());
        System.out.println("Start Time: " + customer1.getStartTime());
        System.out.println("End Time: " + customer1.getEndTime());
        System.out.println("Time Spent: " + customer1.calculateTimeSpent());

        System.out.println("--");

    // Display second customer
        System.out.println("Customer ID: " + customer2.getId());
        System.out.println("Start Time: " + customer2.getStartTime());
        System.out.println("End Time: " + customer2.getEndTime());
        System.out.println("Time Spent: " + customer2.calculateTimeSpent());

        System.out.println("--");

    // Display third customer
        System.out.println("Customer ID: " + customer3.getId());
        System.out.println("Start Time: " + customer3.getStartTime());
        System.out.println("End Time: " + customer3.getEndTime());
        System.out.println("Time Spent: " + customer3.calculateTimeSpent());
}
}
