import java.util.Scanner;

public class Assignment2 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Celcius value to conver to Fahrenheit");
        double temperature = scan.nextDouble();
        temperature = 1.8 * temperature + 32;
        System.out.println("That temperature in Fahrenheit is " + temperature);
    }
    
}