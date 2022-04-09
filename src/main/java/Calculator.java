import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;
import static java.lang.System.exit;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public Calculator(){
    }

    public double squareRoot(double var){
        logger.info("Calculating Square Root of : " + var + "\n Result : " + Math.sqrt(var));
        return Math.sqrt(var);
    }
    public double factorial(double var){
        if(var < 0){
            logger.info("Factorial of negative number is not possible!");
            return Double.NaN;
        }
        else{
            double fact = 1;
            for(int i = 1; i <= var; i++){
                fact *= i;
            }
            logger.info("Factorial of the number : " + var + "\n Result is : " + fact);
            return fact;
        }
    }

    public double logarithm(double var){
        logger.info("Calculating Natural Logarithm of : " + var + "\n Result : " + Math.log(var));
        return Math.log(var);
    }

    public double power(double var1, double var2){
        logger.info("Power : " + var1 + "^" + var2 + "/n Result : " + Math.pow(var1, var2));
        return Math.pow(var1, var2);
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        Calculator c = new Calculator();
        int choice;
        double v1, v2;
        System.out.println("---------- ** Scientific Calculator ** ------------");
        System.out.println("------------------- ** Menu ** --------------------");
        while(true){
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Logarithm");
            System.out.println("4. Power");
            System.out.println("5. Exit");
            System.out.print("Please enter your choice : ");
            choice = Integer.parseInt(br.readLine());
            switch (choice){
                case 1:  // For Square Root
                    System.out.println("Square Root Operation:");
                    System.out.print("Enter the number: ");
                    v1 = Double.parseDouble(br.readLine());
                    System.out.println("Square Root of " + v1 + " = " + c.squareRoot(v1));
                    System.out.println("------------------------------------------------");
                    break;

                case 2: // For Factorial
                    System.out.println("Factorial Operation:");
                    System.out.print("Enter the number: ");
                    v1 = Double.parseDouble(br.readLine());
                    double result = c.factorial(v1);
                    System.out.println("Factorial of " + v1 + " = " + result);
                    System.out.println("------------------------------------------------");
                    break;
                case 3:  // For Natural Logarithm
                    System.out.println("Natural Logarithm Operation:");
                    System.out.print("Enter the number: ");
                    v1 = Double.parseDouble(br.readLine());
                    System.out.println("Natural Logarithm of " + v1 + " = " + c.logarithm(v1));
                    System.out.println("------------------------------------------------");
                    break;
                case 4:  // For Power Function
                    System.out.println("Exponential Function:");
                    System.out.println("Enter the first number: ");
                    v1 = Double.parseDouble(br.readLine());
                    System.out.println("Enter the second number : ");
                    v2 = Double.parseDouble(br.readLine());
                    System.out.println("Power :" + v1 + "^" + v2 + " = " + c.power(v1,v2));
                    System.out.println("------------------------------------------------");
                    break;

                case 5:
                    System.out.println("------------------- Thank You -------------------");
                    exit(0);
                default:
                    System.out.println("Invalid choice entered!");
            }
            System.out.println("\n");
        }

    }
}