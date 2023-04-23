import java.util.ArrayList;

public class truck extends vehicle implements vehicle2 {
   
    private double loadcapacity;
    private int numberReserveWheels;
    private double weight;
    ArrayList <wheel> wheels;

    public void set_loadcapacity(double loadcapacity) {
        this.loadcapacity = loadcapacity;
    }
    public void get_loadcapacity() {
        System.out.println("The load capacity of the truck is: "+ loadcapacity);
    }

    public void set_numberreservewheels(int numberreservewheels) {
        this.numberReserveWheels = numberreservewheels;
    }
    public void get_numberReserveWheels() {
        System.out.println("The number of Reserved Wheels for the truck is: "+ numberReserveWheels);
    }

    public void set_weight(double weight) {
        this.weight = weight;
    }
    public void get_weight() {
        System.out.println("The weight of the truck is: "+ weight);
    }


    public truck(double loadcapacity, int numberReserveWheels, double weight, ArrayList <wheel> wheels, String plate) {
        super(plate);
        this.weight = weight;
        this.numberReserveWheels = numberReserveWheels;
        this.loadcapacity = loadcapacity;
        this.wheels = wheels;
    }

    public void print_truck_info() {
        print_vehicle_info();
        System.out.println("The truck's load  capacity is: "+ loadcapacity);
        System.out.println("The truck's weight is: "+ weight);
        System.out.println("The truck's number of reserved wheels is: "+ numberReserveWheels);
        for (wheel wheelunit: wheels) {
            wheelunit.print_wheel_info();
        };
    }

    public void add_wheel_in_truck(wheel wheelunit){
        wheels.add(wheelunit);
    }

    public static void main(String[] args) throws Exception {
        
    }
}