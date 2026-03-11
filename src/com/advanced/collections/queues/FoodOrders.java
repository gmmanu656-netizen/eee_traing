package advanced.collections.queues;

import java.util.LinkedList;
import java.util.Queue;

public class FoodOrders {
    static void main(String[] args) {
        Queue<String> orders = new LinkedList<>();
        //for adding elements = [add] [strict][after][lenient]
        orders.add("ORD101");
        orders.offer("ORD102");
        orders.offer("ORD103");
        System.out.println("Orders: " + orders);
        //for removing elements [remove][poll][lenient]
        orders.remove();
        System.out.println("Orders: " + orders);
        orders.poll();
        System.out.println("Ordesr: " + orders);
    }
}