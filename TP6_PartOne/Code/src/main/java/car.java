import java.util.ArrayList;

public class car extends vehicle implements vehicle2 {
    private double weight;
    private String model;
    private String brand;
    ArrayList <wheel> wheels;

    public void set_weight(double weight) {
        this.weight = weight;
    }
    public void get_weight() {
        System.out.println("The weight of the car is: "+ weight);
    }

    public void set_model(String model) {
        this.model = model;
    }
    public void get_model() {
        System.out.println("The weight of the car is: "+ model);
    }

    public void set_brand(String brand) {
        this.brand = brand;
    }
    public void get_brand() {
        System.out.println("The weight of the car is: "+ brand);
    }

    public car(double weight, String model, String brand, ArrayList <wheel> wheels, String plate) {
        super(plate);
        this.brand = brand;
        this.model = model;
        this.weight = weight;
        this.wheels = wheels;
    }

    public void print_car_info() {
        print_vehicle_info();
        System.out.println("The car's weight is: "+ weight);
        System.out.println("The car's brand is: "+ brand);
        System.out.println("The car's model is: "+ model);
        for (wheel wheelunit: wheels) {
            wheelunit.print_wheel_info();
        };
    }

    public void add_wheel_in_car(wheel wheelunit){
        wheels.add(wheelunit);
    }

}