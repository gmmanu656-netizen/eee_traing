package com.advanced.collections.base;

import java.util.ArrayList;
import java.util.Collection;

public class LiveOrders {
    static void main() {
        Collection<String> liveOrders = new ArrayList<>();
        liveOrders.add("ORD101");
        liveOrders.add("ORD102");
        liveOrders.add("ORD103");
        // check order
        System.out.println("ORD101 Available? Exists? " + liveOrders.contains("ORD101"));
        // check all the orders:
        System.out.println("Live Orders:" + liveOrders);
        System.out.println("Total live orders :" + liveOrders.size());
        liveOrders.clear();
        System.out.println("Current Orders + live Orders");
    }
}
