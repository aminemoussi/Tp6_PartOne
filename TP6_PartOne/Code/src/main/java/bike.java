import java.util.ArrayList;

public class bike extends vehicle implements vehicle2 {
    
    private String name;
    private String model;
    ArrayList <wheel> wheels;

    public void set_name(String name) {
        this.name = name;
    }
    public void get_name() {
        System.out.println("The name of the bike is: "+ name);
    }

    public void set_model(String model) {
        this.model = model;
    }
    public void get_model() {
        System.out.println("The model of your bike is: "+ model);
    }



    public bike(String name, String model, ArrayList <wheel> wheels, String plate) {
        super(plate);
        this.name = name;
        this.model = model;
        this.wheels = wheels;
    }

    public void print_bike_info() {
        print_vehicle_info();
        System.out.println("The bike goes by the name of: "+ name);
        System.out.println("The bike's model is: "+ model);
        for (wheel wheelunit: wheels) {
            wheelunit.print_wheel_info();
        }
    }

    public void add_wheel_in_truck(wheel wheelunit){
        wheels.add(wheelunit);
    }

    public static void main(String[] args) throws Exception {
        
    }
}