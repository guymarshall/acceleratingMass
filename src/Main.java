import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static double relativisticMass(double restMass, double velocity, double speedOfLight) {
        return restMass / Math.sqrt(
                1 - (
                        (velocity * velocity) / (speedOfLight * speedOfLight)
                )
        );
    }

    public static double kineticEnergy(double mass, double velocity) {
        return 0.5 * mass * velocity * velocity;
    }

    public static double energy(double mass, double speedOfLight) {
        return mass * speedOfLight * speedOfLight;
    }

    public static double userInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public static void main(String[] args) {
        // All values use SI units
        final double speedOfLight = 299792458;

        double restMass = userInput("Enter rest mass (kg): ");
        double velocity = userInput("Enter velocity (ms^-1): ");

        for (int i = 0; i < 1000000; i++) {
            System.out.printf("Relativistic mass: %f, velocity: %d%n", relativisticMass(restMass, i, speedOfLight), i);
        }
    }
}