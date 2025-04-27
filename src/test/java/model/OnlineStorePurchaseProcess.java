package model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class OnlineStorePurchaseProcess {
    @Test
    public void clientOrders() {
        // 1) Creating 3 clients with addresses
        ClientAddress addressOne = new ClientAddress("Marsa gatve", 15, 7, "Rīga", "Latvija", "LV-1082");
        Client clientOne = new Client(1, "Laima Vaikule", "laima@gmail.com", String.valueOf(addressOne));

        ClientAddress addressTwo = new ClientAddress("Varavīksnes gatve", 11, 2, "Rīga", "Latvija", "LV-1082");
        Client clientTwo = new Client(2, "Raimonds Pauls", "raimonds_p@gmail.com", String.valueOf(addressTwo));

        ClientAddress addressThree = new ClientAddress("Zvaigznāja gatve", 16, 35, "Rīga", "Latvija", "LV-1082");
        Client clientThree = new Client(3, "Lauris Reiniks", "lauris_r@gmail.com", String.valueOf(addressThree));

       // 2) Creating 10 items
        Item itemOne = new Item(101, "Smartphone Galaxy S25", 969.99, "The latest smartphone from Samsung");
        Item itemTwo = new Item(102, "Sony WH-1000XM5 Headphones", 349.50, "Wireless noise-cancelling headphones");
        Item itemThree = new Item(103, "MacBook Air M2 Laptop", 1299.00, "Professional laptop");
        Item itemFour = new Item(104, "Tablet iPad Pro 12.9", 1099.00, "Professional tablet");
        Item itemFive = new Item(105, "Fitness tracker Xiaomi Mi Band 7", 49.99, "Smart fitness tracker");
        Item itemSix = new Item(106, "Smartwatch Apple Watch Series 8", 449.00, "Advanced smartwatch");
        Item itemSeven = new Item(107, "E-reader Kindle Paperwhite", 139.99, "Convenient e-book reader");
        Item itemEight = new Item(108, "Gaming console PlayStation 5", 499.99, "Modern gaming console");
        Item itemNine = new Item(109, "Wireless mouse Logitech MX Master 3S", 99.00, "High-precision wireless mouse");
        Item itemTen = new Item(110, "External SSD Samsung T7", 129.99, "Portable solid-state drive");

        // 3) Creating a cart with items for 2 clients
        clientOne.addToCart(itemOne);
        clientOne.addToCart(itemThree);
        clientOne.addToCart(itemFive);

        clientTwo.addToCart(itemSeven);
        clientTwo.addToCart(itemNine);

        // 4) Creating 4 orders with delivery for 2 clients
        // OrderA - the addresses match
        Order orderA = new Order(201, clientOne, addressOne);
        clientOne.placeOrder(orderA);
        orderA.addItem(itemOne);
        orderA.addItem(itemTwo);

        // OrderB - the addresses do not match
        ClientAddress deliveryAddressOne = new ClientAddress("Turaidas iela", 1, 1, "Jūrmala", "Latvija", "LV-2015");
        Order orderB = new Order(202, clientOne, deliveryAddressOne);
        clientOne.placeOrder(orderB);
        orderB.addItem(itemThree);
        orderB.addItem(itemFour);

        // OrderC - the addresses match
        Order orderC = new Order(203, clientTwo, addressTwo);
        clientTwo.placeOrder(orderC);
        orderC.addItem(itemFive);
        orderC.addItem(itemSix);

        // OrderD - the addresses do not match
        ClientAddress deliveryAddressTwo = new ClientAddress("Saules iela", 7, 2, "Salaspils", "Latvija", "LV-2169");
        Order orderD = new Order(204, clientTwo, deliveryAddressTwo);
        clientTwo.placeOrder(orderD);
        orderD.addItem(itemSeven);
        orderD.addItem(itemEight);

        // 5) Printing full information about clients with number of orders
        List<Order> ordersOne = new ArrayList<>();
        ordersOne.add(orderA);
        ordersOne.add(orderB);

        List<Order> ordersTwo = new ArrayList<>();
        ordersTwo.add(orderC);
        ordersTwo.add(orderD);

        System.out.println("\n--- Full info on clients and number of orders ---");
        System.out.println("Client :: id: " + clientOne.getId() + ", name: " + clientOne.getName() + ", email: " + clientOne.getEmail() + ", address: " + clientOne.getClientAddress() + " :: Number of orders: " + ordersOne.size());
        System.out.println("Client :: id: " + clientTwo.getId() + ", name: " + clientTwo.getName() + ", email: " + clientTwo.getEmail() + ", address: " + clientTwo.getClientAddress() + " :: Number of orders: " + ordersTwo.size());

        // 6) Printing all orders
        System.out.println("\n--- All orders ---");
        clientOne.printAllOrders();
        clientTwo.printAllOrders();


        // 7) Printing all clients
        List<Client> allClients = new ArrayList<>();
        allClients.add(clientOne);
        allClients.add(clientTwo);
        allClients.add(clientThree);

        System.out.println("\n--- All clients ---");
        for (Client client : allClients) {
            System.out.println("id: " + client.getId() + ", name: " + client.getName() + ";");
        }
    }
}
