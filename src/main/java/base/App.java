package base;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Glenroy Little
 */
import java.util.Scanner;
/**
 Exercise 22 - Comparing Numbers
 Comparing one input to a known value is common enough, but you’ll often need to process a collection of inputs.

 Write a program that asks for three numbers. Check first to see that all numbers are different.
 If they’re not different, then exit the program. Otherwise, display the largest number of the three.

 Example Output
 Enter the first number: 1
 Enter the second number: 51
 Enter the third number: 2
 The largest number is 51.
 Constraint
 Write the algorithm manually. Don’t use a built-in function for finding the largest number in a list.
 Challenges
 Modify the program so that all entered values are tracked and the user is prevented from entering a number that’s already been entered.
 Modify the program so that it asks for ten numbers instead of three.
 Modify the program so that it asks for an unlimited number of numbers.
 */
public class App 
{
    static Scanner in = new Scanner(System.in);

    public static void main( String[] args )
    {
        App myApp = new App();

        Integer num1 = myApp.getnum1();
        Integer num2 = myApp.getnum2();
        Integer num3 = myApp.getnum3();
        Integer largest = myApp.findlargest(num1, num2, num3);

        myApp.output(largest);
    }

    public Integer findlargest(Integer num1, Integer num2, Integer num3)
    {
        Integer max = num1;
        if(num2 > max)
            max = num2;
        if(num3 > max)
            max = num3;

        return max;
    }

    public Integer getnum1()
    {
        System.out.print("Enter the first number: ");
        Integer num = in.nextInt();
        return num;
    }

    public Integer getnum2()
    {
        System.out.print("Enter the second number: ");
        Integer num = in.nextInt();
        return num;
    }

    public Integer getnum3()
    {
        System.out.print("Enter the third number: ");
        Integer num = in.nextInt();
        return num;
    }

    public void output(Integer largest)
    {
        System.out.println("The largest number is " + largest + ".");
    }
}
