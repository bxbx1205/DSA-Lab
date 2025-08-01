import java.time.LocalTime;
import java.util.*;
public class Car {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        
        System.out.println("Start time: " + LocalTime.now());

        
        

        ArrayList<String> types = new ArrayList<>();
        types.add("SUV");
        types.add("SEDAN");
        types.add("RIKSHAW");
        types.add("TRUCK");

        ArrayList<String> CCs = new ArrayList<>();
        CCs.add("12000");
        CCs.add("150000");
        CCs.add("18000");
        CCs.add("20000");

        ArrayList<String> Tyres = new ArrayList<>();
        Tyres.add("4");
        Tyres.add("3");
        Tyres.add("10");
        

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the type of vehicle: ");
        String vehicleType = sc.nextLine().toUpperCase();

        ifElse(vehicleType, CCs, Tyres);
        // Switch(vehicleType, CCs, Tyres);

        long endTime = System.nanoTime();
        System.out.println("End time: " + LocalTime.now());
        System.out.println("total time taken: " + (endTime - startTime));

    }

    static void ifElse(String vehicleType, ArrayList<String> CCs, ArrayList<String> Tyres) {
        if (vehicleType.equals("SUV")) {
            System.out.println("Type is " + vehicleType + " and CC is " + CCs.get(0) + " and Tyres are " + Tyres.get(0));
        } else if (vehicleType.equals("sedan")) {
            System.out.println("Type is " + vehicleType + " and CC is " + CCs.get(1) + " and Tyres are " + Tyres.get(0));
        } else if (vehicleType.equals("Rikshaw")) {
            System.out.println("Type is " + vehicleType + " and CC is " + CCs.get(2) + " and Tyres are " + Tyres.get(1));
        } else if (vehicleType.equals("Truck")) {
            System.out.println("Type is " + vehicleType + " and CC is " + CCs.get(3) + " and Tyres are " + Tyres.get(2));
        } else {
            System.out.println("Vehicle type not found.");
        }
    }

    static void Switch(String vehicleType, ArrayList<String> CCs, ArrayList<String> Tyres) {
        switch (vehicleType) {
            case "SUV":
                System.out.println("Type is " + vehicleType + " and CC is " + CCs.get(0) + " and Tyres are " + Tyres.get(0));
                break;
            case "sedan":
                System.out.println("Type is " + vehicleType + " and CC is " + CCs.get(1) + " and Tyres are " + Tyres.get(0));
                break;
            case "Rikshaw": 
                System.out.println("Type is " + vehicleType + " and CC is " + CCs.get(2) + " and Tyres are " + Tyres.get(1));
                break;
            case "Truck":
                System.out.println("Type is " + vehicleType + " and CC is " + CCs.get(3) + " and Tyres are " + Tyres.get(2));
                break;
            default:
                System.out.println("Vehicle type not found.");
        }
    }
    
}
