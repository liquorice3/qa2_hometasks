package model;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private int id;
    private String name;
    private String email;
    private String clientAddress;
    private List<Item> cart;
    private List<Order> orders;

    public Client(int id, String name, String email, String clientAddress) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.clientAddress = clientAddress;
        this.cart = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public List<Item> getCart() {
        return cart;
    }

    public void setCart(List<Item> cart) {
        this.cart = cart;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public void addToCart(Item item) {
        this.cart.add(item);
    }

    public void placeOrder(Order order) {
        this.orders.add(order);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void printAllOrders() {
        for (Order o : orders) {
            System.out.println(o.getId() + ", " + o.getClient() + ", " + o.getItems());
        }
    }
}
