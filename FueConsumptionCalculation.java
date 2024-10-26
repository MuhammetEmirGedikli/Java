import java.util.Scanner;

public class FueConsumptionCalculation {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many liters of fuel does your car consume on average per 100 km? (Example: 7.70): ");
        double consumption = scanner.nextDouble();
        
        System.out.print("How many kilometers have you driven with the car: ");
        double km = scanner.nextDouble();
        
        double totalFuel;
        totalFuel = (km / 100) * consumption;
        
        System.out.printf("The total fuel consumed by the car for %.2f kilometers is %.2f liters...", km, totalFuel);
        
        scanner.close();
    }
}
