package sessions.graphql.eshop.vehicles;

public class Vehicle {
    public Vehicle(Long id, String name, String manufacturer, Long year, String fueltype, String transmission) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.year = year;
        this.fueltype = fueltype;
        this.transmission = transmission;
    }

    public Vehicle() {
    }

    String name;
    String manufacturer;
    Long year;
    Long id;
    String fueltype;
    String transmission;
}
