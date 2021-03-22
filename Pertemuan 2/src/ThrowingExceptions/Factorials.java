package ThrowingExceptions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Johan Salusu
 */

// ****************************************************************
// Factorials.java
//
// Reads integers from the user and prints the factorial of each.
//
// ****************************************************************
import java.util.Scanner;
public class Factorials
{
    public static void main(String[] args)
    {
        String keepGoing = "y";
        Scanner scan = new Scanner(System.in);
        
        while (keepGoing.equals("y") || keepGoing.equals("Y"))
        {
            System.out.print("Enter an integer: ");
            
            try
            {
                int val = scan.nextInt();
                if (val < 0)
                {
                    throw new IllegalArgumentException("Access denied!");
                }
            
            System.out.println("Factorial(" + val + ") = " + MathUtils.factorial(val));
            }            
            catch (IllegalArgumentException e)
            {
            }
            
            System.out.print("Another factorial? (Y/N) ");
            keepGoing = scan.next();
        }
    }
}