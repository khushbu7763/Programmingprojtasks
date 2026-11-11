
package orientationtask1;

public class CustomerGenerator {

    public void generateCustomers(ServicePoint servicePoint, int numberOfCustomers) {

        for (int i = 0; i < numberOfCustomers; i++) {

            long startTime = System.currentTimeMillis();

            Customer customer = new Customer(startTime, 0);

            servicePoint.addToQueueue(customer);

            System.out.println("Customer " + customer.getId()
                    + " added to queue.");
        }
    }
}
