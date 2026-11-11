
package orientationtask1;

import java.util.LinkedList;
import java.util.Scanner;

public class QueueTest {

    public static void main(String[] args) {

        LinkedList<Customer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\nAirport Check-in Queue");
            System.out.println("1. Add passenger to queue");
            System.out.println("2. Remove passenger from queue");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            if (choice == 1) {

                long startTime = System.nanoTime();

                Customer customer = new Customer(startTime, 0);

                // Add passenger to the beginning
                queue.addFirst(customer);

                System.out.println("Passenger " + customer.getId()
                        + " added to the queue.");

            } else if (choice == 2) {

                if (queue.isEmpty()) {

                    System.out.println("Queue is empty.");

                } else {

                    // Remove passenger from the end (FIFO)
                    Customer customer = queue.removeLast();

                    long endTime = System.nanoTime();

                    customer.setEndTime(endTime);

                    long waitingTime = customer.calculateTimeSpent();

                    System.out.println("Passenger "
                            + customer.getId() + " removed from queue.");

                    System.out.println("Waiting time: "
                            + waitingTime / 1_000_000.0 + " milliseconds");

                    System.out.println("Customers still waiting: " + queue.size());
                }

            } else if (choice == 3) {

                System.out.println("Exiting simulation.");

            } else {

                System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 3);

        scanner.close();
    }
}
