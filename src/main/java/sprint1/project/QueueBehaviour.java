package sprint1.project;

public interface QueueBehaviour {
    void takeInQueue(Human human);
    void takeOrders(Product product);
    void giveOrders(Product product);
    void releaseQueue();
}
