import java.util.ArrayList;
import java.util.Scanner;

public class vehicle {
    protected String plate;

    public void set_plate_number(String plate) {
        this.plate = plate;
    }

    public void get_plate_number() {
        System.out.println("The plate number is: "+ plate);
    }

    public vehicle(String plate) {
        this.plate = plate;
    }

    public void print_vehicle_info() {
        System.out.println("The vehicle's plate number is: "+ plate);
    }

    public void goForward(){
        System.out.println("The vehicle is going forward.");
    }

    public void goBackward(){
        System.out.println("The vehicle is going backward.");
    }

    public void start(){
        System.out.println("The vehicle is starting.");
    }

    public void stop(){
        System.out.println("The vehicle have stopped.");
    }
    public static void main(String[] args) throws Exception {
        }
}
