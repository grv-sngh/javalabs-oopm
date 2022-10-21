// import ascii.AsciiArt;
import java.util.Scanner;

public class Gravity {
    
    public static double gravityEquation(double xi, double t, double v, double a)  {
        double distance = (0.5*a*t*t) + v*t + xi; 
        return (distance);
    }
     
    public static void main(String[] args) {
        // Creating the art objects
        AsciiArt banner = new AsciiArt("./banner.txt");
        AsciiArt art = new AsciiArt("./ascii/art.txt");

    
        try {
            art.makeart();
            banner.makeart();
            art.funfact();

            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.print("Enter the initial position (m): ");
            double xi = sc.nextDouble();
            System.out.print("Enter the time elapsed (seconds): ");
            double t = sc.nextDouble();
            System.out.print("Enter the velocity (m/s): ");
            double v = sc.nextDouble();
            System.out.print("Enter the accleration (m/s^2): ");
            double a = sc.nextDouble();
            sc.close();

            double answer = gravityEquation(xi, t, v, a); // Actual Gravity Equation
            // double answer = gravityEquation(1,1,1,1); //Test code only
            

            System.out.print("\nProcessing Data.");
            int progress = 5;
            for(int i = 0; i < progress; i++) {
                Thread.sleep(500);
                System.out.print(".");
            }
            System.out.println("Done");

            System.out.println("\n\nAnswer: ");
            System.out.println("Distance travelled is " + answer + " meters.");

            if(answer>=1000){
                System.out.println("Woah! That's a lot of meters");
            }

        } catch (Exception e) {
            System.out.println("\nOops! An Error Occured");
        }

    }
}
