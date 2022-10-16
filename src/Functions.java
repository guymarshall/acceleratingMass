import java.util.Scanner;

public class Functions {
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
}
