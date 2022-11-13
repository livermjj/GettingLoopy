import java.util.Scanner;
public class FtoC {
    public static void main(String[] args) {
        {
            Scanner in = new Scanner(System.in);
            boolean validInput = false;
            double inputF = 0;
            double outputC = 0;
            String trash = "";

            System.out.print("Input your temperature in fahrenheit: ");
            do {
                if (in.hasNextDouble()) {
                    inputF = in.nextDouble();
                    System.out.println(inputF);
                    validInput = true;
                } else {
                    trash = in.nextLine();
                    System.out.println("You entered " + trash + " Please enter a valid input");
                }

            } while (!validInput);
            outputC = ((inputF - 32) * .556);
            System.out.println("Your temperature in fahrenheit would be " + outputC + " C");
        }
    }
}