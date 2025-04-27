package model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private Client client;
    private List<Item> items;
    private ClientAddress clientAddress;
    private String state;

    public Order(int id, Client client, ClientAddress clientAddress) {
        this.id = id;
        this.client = client;
        this.items = new ArrayList<>();
        this.clientAddress = clientAddress;
        this.state = "Created";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public ClientAddress getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(ClientAddress clientAddress) {
        this.clientAddress = clientAddress;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void addItem (Item item) {
        items.add(item);
    }
}


