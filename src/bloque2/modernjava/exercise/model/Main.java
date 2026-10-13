package bloque2.modernjava.exercise.model;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<Client> clients = new ArrayList<>();
        clients.add(new Client(1,"Diego","Lopez",new Contact("principal Ave","5637838646")));
        clients.add(new Client(2,"Benjamin","Lopez",new Contact(null,"5337838646")));
        clients.add(new Client(3,"Lizette","Lopez",new Contact(null,"533228646")));
        clients.forEach(System.out::println);

        List<Shipment> shipments = clients.stream().map(client -> {
            Shipment shipment = new Shipment(client.name(),client.contact().address());
            return shipment;
        }).toList();
        System.out.println(shipments);
        List<String> addresses = shipments.stream().map(Shipment::address).toList();
        addresses.forEach(System.out::println);
    }
}