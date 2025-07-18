import java.util.*;
public class Car2 {
    public static void main(String[] args) {
        ArrayList<String> vehicleType = new ArrayList<>(Arrays.asList("SUV", "sedan", "Rikshaw", "Truck"));
        ArrayList<String> CCs = new ArrayList<>(Arrays.asList("12000", "150000", "18000", "20000"));
        ArrayList<String> Tyres = new ArrayList<>(Arrays.asList("4", "3", "10"));
        

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the type of vehicle: ");
        String inputVehicleType = sc.nextLine();

        if (inputVehicleType.equals("SUV")) {
            System.out.println("Type is " + vehicleType + " and CC is " + CCs.get(0) + " and Tyres are " + Tyres.get(0));
        } else if (inputVehicleType.equals("sedan")) {
            System.out.println("Type is " + vehicleType + " and CC is " + CCs.get(1) + " and Tyres are " + Tyres.get(0));
        } else if (inputVehicleType.equals("Rikshaw")) {
            System.out.println("Type is " + vehicleType + " and CC is " + CCs.get(2) + " and Tyres are " + Tyres.get(1));
        } else if (inputVehicleType.equals("Truck")) {
            System.out.println("Type is " + vehicleType + " and CC is " + CCs.get(3) + " and Tyres are " + Tyres.get(2));
        } else {
            System.out.println("Vehicle type not found.");
        }

    }
}
