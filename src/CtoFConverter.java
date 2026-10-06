import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double celsius = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print("Enter temperature in Celsius: ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("You said: " + trash);
                System.out.println("Invalid input. Try again.\n");
            }
        } while (!done);

        double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}
