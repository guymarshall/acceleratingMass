import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // All values use SI units
        final double speedOfLight = 299792458;

        double restMass = Functions.userInput("Enter rest mass (kg): ");
        double velocity = Functions.userInput("Enter velocity (ms^-1): ");

        for (int i = 1000000; i < speedOfLight; i++) {
            System.out.printf("Relativistic mass: %f, velocity: %d%n", Functions.relativisticMass(restMass, i, speedOfLight), i);
        }
    }
}