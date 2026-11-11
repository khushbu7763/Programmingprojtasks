
package orientationtask1;

import java.util.LinkedList;

public class ServicePoint {

    private LinkedList<Customer> queue;

    private long totalServiceTime;
    private int customersServed;

    public ServicePoint() {
        queue = new LinkedList<>();
        totalServiceTime = 0;
        customersServed = 0;
    }

    public void addToQueueue(Customer a) {
        queue.addFirst(a);
    }

    public Customer removeFromQueueue() {
        return queue.removeLast();
    }

    public void serve() {

        while (!queue.isEmpty()) {

            Customer customer = removeFromQueueue();

            long serviceStart = System.currentTimeMillis();

            long waitingTime = serviceStart - customer.getStartTime();

            long serviceTime = (long) (Math.random() * 3000) + 1000;

            try {
                Thread.sleep(serviceTime);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }

            long serviceEnd = System.currentTimeMillis();

            long actualServiceTime = serviceEnd - serviceStart;

            long responseTime = serviceEnd - customer.getStartTime();

            totalServiceTime += actualServiceTime;
            customersServed++;

            System.out.println("\nCustomer ID: " + customer.getId());
            System.out.println("Waiting time: " + waitingTime + " ms");
            System.out.println("Service time: " + actualServiceTime + " ms");
            System.out.println("Response time: " + responseTime + " ms");
        }
    }

    public double calculateAverageServiceTime() {

        if (customersServed == 0) {
            return 0;
        }

        return (double) totalServiceTime / customersServed;
    }
}
