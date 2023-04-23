import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Good morning,");
        System.out.println("Tell us what type of vehicles would you like to create: ");
        String type = input.nextLine();
        switch (type){
            case "car":
                ArrayList<wheel> wheels = new ArrayList<wheel>();
                System.out.println("Enter the brand of your car:");
                String brand = input.nextLine();
                System.out.println("Enter the plate number of your car:");
                String plate = input.next();
                System.out.println("Enter a model introdused by "+brand+": ");
                String model1 = input.next();
                System.out.println("Enter the weight of your car(kg):");
                double weight  = input.nextDouble();
                System.out.println("Now let's get the wheels.");
                
                System.out.println("1st wheel (front): ");
                System.out.println("Choose the wheel size(Inch): ");
                Double wheelsize = input.nextDouble();
                wheel wheel1 = new wheel(wheelsize);
                wheels.add(wheel1);
                
                System.out.println("2nd wheel (front): ");
                System.out.println("Choose the wheel size(Inch): ");
                wheelsize = input.nextDouble();
                wheel wheel2 = new wheel(wheelsize);
                wheels.add(wheel2);

                System.out.println("1st wheel (back): ");
                System.out.println("Choose the wheel size(Inch): ");
                wheelsize = input.nextDouble();
                wheel wheel3 = new wheel(wheelsize);
                wheels.add(wheel3);

                System.out.println("2nd wheel (back): ");
                System.out.println("Choose the wheel size(Inch): ");
                wheelsize = input.nextDouble();
                wheel wheel4 = new wheel(wheelsize);
                wheels.add(wheel4);

                car car1 = new car(weight, model1, brand, wheels, plate);

                System.out.println("A car was successfully created with the following onfo: ");
                car1.print_car_info();

                break;
            case "truck":
            ArrayList<wheel> wheels_truck = new ArrayList<wheel>();
            System.out.println("Enter the load capacity of your truck(kg):");
            Double loadcapacity = input.nextDouble();
            System.out.println("Enter the plate number of your truck:");
            plate = input.next();
            System.out.println("Enter the number of wheels on your truck: ");
            int numberreservedwheels = input.nextInt();
            System.out.println("Enter the weight of your car(kg):");
            weight  = input.nextDouble();
            System.out.println("Now let's get the wheels.");
            wheel wheeln = new wheel(1);
            for (int i = 0; i < numberreservedwheels; i++) {
                System.out.println("Wheel number "+i+": ");
                System.out.println("Choose the wheel size(Inch): ");
                wheelsize = input.nextDouble();
                wheeln = new wheel(wheelsize);
                wheels_truck.add(wheeln);
            }
           

            truck truck1 = new truck(loadcapacity, numberreservedwheels, weight, wheels_truck, plate);

            System.out.println("A truck was successfully created with the following onfo: ");
            truck1.print_truck_info();
                break;
            case "bike":
            ArrayList<wheel> wheels_bike = new ArrayList<wheel>();
            System.out.println("Enter the name of your bike:");
            String name = input.next();
            System.out.println("Enter the plate number of your bike:");
            plate = input.next();
            System.out.println("Enter the model of your bike: ");
            String model = input.next();
            
            System.out.println("Now let's get the wheels.");
            
            System.out.println("1st wheel (front): ");
            System.out.println("Choose the wheel size(Inch): ");
            wheelsize = input.nextDouble();
            wheel3 = new wheel(wheelsize);
            wheels_bike.add(wheel3);

            System.out.println("2nd wheel (back): ");
            System.out.println("Choose the wheel size(Inch): ");
            wheelsize = input.nextDouble();
            wheel3 = new wheel(wheelsize);
            wheels_bike.add(wheel3);
           

            bike bike1 = new bike(name, model, wheels_bike, plate);

            System.out.println("A bike was successfully created with the following onfo: ");
            bike1.print_bike_info();
                break;
            default:
                System.out.println("please enter a valid type.");
        }
}
}