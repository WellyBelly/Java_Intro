// =============================================================================================================================
// 1. Ask the user for two integers. By using separate variables print the sum, product and quotient of the numbers to the console.
// =============================================================================================================================
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

//         Scanner keyboard = new Scanner(System.in);

//         System.out.println("Write a number");
//         int a = keyboard.nextInt();

//         System.out.println("Write a second number");
//         int b = keyboard.nextInt();

//         keyboard.close();

//         System.out.println("\nHere are some calculations with your numbers:"
//                             + "\n" + a + " + " + b + " = " + (a+b)
//                             + "\n" + a + " * " + b + " = " + (a*b)
//                             + "\n" + a + " / " + b + " = " + ((double)a/b));


// ==================================================================================================================================
// 2. Ask the user for name and age. Print to the console "Hey <name>! You are <age> years old" (replace with the given information).
// ==================================================================================================================================
//         Scanner keyboard = new Scanner(System.in);

//         System.out.println("What is your name?");
//         String name = keyboard.nextLine();

//         System.out.println("How old are you?");
//         int age = keyboard.nextInt();

//         keyboard.close();

//         System.out.format("\nHey %s! You are %s years old.",name,age);


// =============================================================================================================================================================
// 3. Use the variables given by the user in task 1 directly in the println method, so that the program prints both the invoice and the result. E.g. "3 + 2 = 5"
// =============================================================================================================================================================
//         System.out.println("Write a number");
//         int a = keyboard.nextInt();

//         System.out.println("Write a second number");
//         int b = keyboard.nextInt();

//         keyboard.close();

//         System.out.println("\nHere are some calculations with your numbers:"
//                             + "\n" + a + " + " + b + " = " + (a+b)
//                             + "\n" + a + " * " + b + " = " + (a*b)
//                             + "\n" + a + " / " + b + " = " + ((double)a/b));


// ========================================================================================================================================================
// 4. Write a program that asks for an amount in dollars and converts it to euros. Find the exchange rate online and define it as constant (keyword final).
// ========================================================================================================================================================
//         Scanner keyboard = new Scanner(System.in);

//         System.out.println("This is a Dollar to Euro converter.\nEnter amount of Dollars:");
//         int dollars = keyboard.nextInt();

//         final double EXCHANGE_RATE = 1.01;

//         System.out.format("%s Dollars are %s Euros.",dollars,(double)dollars*EXCHANGE_RATE);

//         keyboard.close();


// ======================================================================================================================================================================================================================================================
// 5. Write a program that calculates a person's body mass index. Find the necessary formula online, and first, store the values ​​used in variables. Print the body mass index to the console. Use fractional number (floating point data type) variables.
// ======================================================================================================================================================================================================================================================
// BMI = kg/m2
//         double height = 1.86;
//         double weight = 76;
//         double bmi = weight / Math.pow(height,2);

//         System.out.println("BMI is: " + bmi);


// ===============================================================================================================================================================================
// 6. Write a program that calculates and prints the area of ​​a rectangle, square and circle. Give the variables the values ​​of your choice. (Constant for Pi is defined in Math.PI)
// ===============================================================================================================================================================================
// Circle = π × r2, Rectangle = A x B, Square = A x A
        // int a = 20;
        // int b = 10;
        // int r = 6;

        // double square = Math.pow(a,2);
        // double rectangle = a * b;
        // double circle = Math.PI * Math.pow(r,2);

        // System.out.format("Square area: %s\nRectangle area: %s\nCircle area: %s",square,rectangle,circle);


// ========================================================================================================================================
// 7. Ask the user the number of apples. Print how many apples are left, when they are divided equally among five people (modulo operator).
// ========================================================================================================================================
        // Scanner keyboard = new Scanner(System.in);
        // System.out.println("How many apples are there?");
        // int apples = keyboard.nextInt(), people = 5, leftover;
        // leftover = apples%people;

        // System.out.format("I shared the apples among 5 people and now there are %s apples left", leftover);
        // keyboard.close();


// ==============================================================================================================================================================================================================================
// 8. Ask Matt how much money he has and how many children he has. Then Matt divides the money equally among the children to the nearest euro, but he keeps the remainder (cents) for himself. Print out how much money Matt has.
// ==============================================================================================================================================================================================================================
        Scanner keyboard = new Scanner(System.in);

        System.out.println("How much money do you have?");
        double money = keyboard.nextDouble();

        System.out.println("How many children do you have?");
        int children = keyboard.nextInt();

        double remainder = money % (double)children;

        System.out.format("You are left with %.2f euros",remainder);

        keyboard.close();
    };
};