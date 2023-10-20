package sprint1.project;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {
    private final List<Human> queue;

    public Market(){
        this.queue = new ArrayList<>();
    }

    @Override
    public void acceptToMarket(Human human) {
        System.out.println(human.getName() + " зашел в магазин");
        takeInQueue(human);
    }

    @Override
    public void releaseFromMarket(List<Human> humans) {

    }

    @Override
    public void update() {

    }

    @Override
    public void takeInQueue(Human human) {
        System.out.println(human.getName() + "встал в очередь");
        queue.add(human);
    }

    @Override
    public void takeOrders(Product product) {
        for (Human human : queue) {
            if (!human.isMakeOrder) {
                if (product.Count > 0) {
                    product.Count -= 1;
                    human.setMakeOrder(true);
                    System.out.println(human.getName() + " сделал заказ" + product.getName());
                } else {
                    System.out.println("Товар" + product.getName() + "закончился");
                }
            }
        }
    }

    @Override
    public void giveOrders(Product product) {
        for (Human human : queue) {
            if (human.isMakeOrder) {
                human.setTakeOrder(true);
                System.out.println(human.getName() + " получил заказ" + product.name);
            }
        }
    }

    @Override
    public void releaseQueue() {

    }
}
