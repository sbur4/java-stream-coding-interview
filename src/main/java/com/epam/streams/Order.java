package com.epam.streams;

import java.util.List;

public class Order {

    private List<String> orders;

    public Order(List<String> orders) {
        this.orders = orders;
    }

    public List<String> getOrders() {
        return orders;
    }

    public Order setOrders(List<String> orders) {
        this.orders = orders;
        return this;
    }
}
