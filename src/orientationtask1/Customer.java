package orientationtask1;

public class Customer {

    // Variables
    private int id;
    private long startTime;
    private long endTime;

    // Automatically generate customer IDs
    private static int nextId = 1;

    // Constructor
    public Customer(long startTime, long endTime) {
        this.id = nextId++;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Setter for ID
    public void setId(int id) {
        this.id = id;
    }

    // Getter for start time
    public long getStartTime() {
        return startTime;
    }

    // Setter for start time
    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    // Getter for end time
    public long getEndTime() {
        return endTime;
    }

    // Setter for end time
    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    // Calculate time spent
    public long calculateTimeSpent() {
        return endTime - startTime;
    }
}
