//Tugsbileg Khaliunbat
// CIS1068 Lab 03
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis1068lab03;
import java.lang.Math;
/**
 *
 * @author tugsbilegkhaliunbat
 */
public class CIS1068Lab03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        quadratic(1,-7,12);
        System.out.println(triangleArea(8,5.2,7.1));
        printReverse("Hello World!");
        compoundedSavings(25);
    }
    
    /*
    @input double
    @output none
    @Des: prints roots of a quadratic equation
    */  
    public static void quadratic(double a, double b, double c) {
        double root1= ((-1*b + Math.sqrt((b*b - 4*a*c)))/(2*a));
        double root2= ((-1*b - Math.sqrt((b*b - 4*a*c)))/(2*a));
        System.out.println("x=" + root1);
        System.out.println("x=" + root2);
    }
    /*
    @input double
    @output double
    @Des: returns an area of a triangle
    */  
    public static double triangleArea(double a, double b, double c) {
        double s = ((a+b+c)/2);
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
    /*
    @input string
    @output none
    @Des: prints every character of a string in reverse
    */  
    public static void printReverse(String s) {
        for(int i = s.length()-1; i>=0; i--)
            System.out.print(s.charAt(i));
        System.out.println("");
        
    }
    public static void compoundedSavings(int n) {
        System.out.println("Year\tCurrent Balance\tInterest\tNew Deposit\tNew Balance");
        double currentBalance = 1000;
        double newDeposit;
        for(int i = 0; i<=n; i++) {
            double interest = currentBalance*0.065;
            if(i==0)
                newDeposit = 0;
            else
                newDeposit = 100;
            double newBalance =currentBalance+interest+newDeposit;
            System.out.print(i);
            System.out.printf("\t %.2f", currentBalance);
            System.out.printf("\t %.2f",interest);
            System.out.printf("\t\t %.2f", newDeposit);
            System.out.printf("\t\t %.2f \n",newBalance);
            currentBalance = newBalance;        
        }
    }
    
    
                
    
}
