import java.util.ArrayList;
import java.util.List;

// Class for a Shipment
class Shipment {
    private int shipmentId;
    private String sender;
    private String receiver;
    private String contents;
    private String destination;
    private String deliveryStatus;

    public Shipment(int shipmentId, String sender, String receiver, String contents, String destination) {
        this.shipmentId = shipmentId;
        this.sender = sender;
        this.receiver = receiver;
        this.contents = contents;
        this.destination = destination;
        this.deliveryStatus = "In Transit";
    }

    public void updateDeliveryStatus(String status) {
        this.deliveryStatus = status;
    }

    public String trackShipment() {
        return "Shipment ID: " + shipmentId + ", Status: " + deliveryStatus;
    }
}

// Class for a Transporter
class Transporter {
    private String name;
    private String contactInfo;
    private List<Vehicle> fleet;

    public Transporter(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.fleet = new ArrayList<>();
    }

    public void assignVehicle(Shipment shipment, Vehicle vehicle) {
        // Logic to assign a vehicle to a shipment
    }

    public void trackDeliveries() {
        // Logic to track deliveries in progress
    }
}

// Class for a Vehicle
class Vehicle {
    private int vehicleId;
    private String type;
    private double capacity;
    private String currentLocation;

    public Vehicle(int vehicleId, String type, double capacity, String currentLocation) {
        this.vehicleId = vehicleId;
        this.type = type;
        this.capacity = capacity;
        this.currentLocation = currentLocation;
    }

    public void loadGoods(Shipment shipment) {
        // Logic to load goods into the vehicle
    }

    public void updateLocation(String location) {
        this.currentLocation = location;
    }

    public void unloadGoods(Shipment shipment) {
        // Logic to unload goods at the destination
    }
}

// Class for a Customer
class Customer {
    private String name;
    private String contactInfo;

    public Customer(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public Shipment placeShipmentOrder(String sender, String receiver, String contents, String destination) {
        // Logic to place a shipment order
        return new Shipment(1, sender, receiver, contents, destination);
    }

    public String checkShipmentStatus(Shipment shipment) {
        return shipment.trackShipment();
    }
}

public class TransportApplication {
    public static void main(String[] args) {
        // Creating objects and demonstrating behaviors
        Customer customer = new Customer("Zeeshan Raza", "zraza2511@gmail.com");
        Shipment shipment = customer.placeShipmentOrder("Sohel", "Taufik", "Electronics", "Himayat Nagar");

        Transporter transporter = new Transporter("Shaan Transport", "zraza2511@gmail.com");
        Vehicle vehicle = new Vehicle(101, "Truck", 5000.0, "Origin City");

        transporter.assignVehicle(shipment, vehicle);
        vehicle.loadGoods(shipment);
        vehicle.updateLocation("En Route");
        vehicle.unloadGoods(shipment);
        shipment.updateDeliveryStatus("Delivered");

        System.out.println("Shipment Status: " + customer.checkShipmentStatus(shipment));
    }
}
