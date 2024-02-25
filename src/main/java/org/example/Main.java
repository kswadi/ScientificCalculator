package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        logger.info("Welcome to Scientific Calculator Application!");
        int choice;
        double num, exp;
        int numInt;
        int flag=0;

        Scanner reader = new Scanner(System.in);


        do {
            System.out.println("********************** Scientific Calculator **********************");
            System.out.println("Choose Operator ");
            System.out.println("Press 1 for Square root function ");
            System.out.println("Press 2 for Factorial function ");
            System.out.println("Press 3 for Natural Logarithm (base e) function ");
            System.out.println("Press 4 for Power function ");

            choice = reader.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Square Root calculation: ");
                    System.out.print("Enter number: ");
                    num = reader.nextDouble();
                    squareRoot(num);
                    break;

                case 2:
                    System.out.println("Factorial calculation: ");
                    System.out.print("Enter number: ");
                    numInt = reader.nextInt();
                    factorial(numInt);
                    break;

                case 3:
                    System.out.println("Natural Logarithm calculation: ");
                    System.out.print("Enter number: ");
                    num = reader.nextDouble();
                    naturalLogarithm(num);
                    break;

                case 4:
                    System.out.println("Power calculation: ");
                    System.out.print("Enter number: ");
                    num = reader.nextDouble();
                    System.out.print("exponent: ");
                    exp = reader.nextDouble();
                    power(num,exp);
                    break;

                default:
                    System.out.println("Exiting Application !!!");
                    flag = 1;


            }


        } while(flag!=1);

    }

    public static double squareRoot(double num){
        double result = Math.sqrt(num);
        System.out.println("Result = "+result);
        logger.info("Square root of "+num+ " is "+ result);
        return result;
    }

    public static int factorial(int num){
        int result = num ;
        for(int i=num-1; i>=1; i--) result = result*i;
        System.out.println("Result = "+result);
        logger.info("Factorial of "+num+ " is "+ result);
        return result;
    }
    public static double naturalLogarithm(double num){
        double result = Math.log(num);
        System.out.println("Result = "+result);
        logger.info("Natural Logarithm of "+num+ " is "+ result);
        return result;
    }
    public static double power(double num, double exp){
        double result = Math.pow(num,exp);
        System.out.println("Result = "+result);
        logger.info("Power "+num+ " is "+ result);
        return result;
    }
}