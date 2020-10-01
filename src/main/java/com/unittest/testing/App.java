package com.unittest.testing;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input Celsius : ");
        double celcius = input.nextDouble();
        
        Fahrenheit f = new Fahrenheit();
        
		while (!f.isBound(celcius)) {
			 System.out.println("**** Error ****");
        	 System.out.println("--- Please Input Agian ---");
        	 System.out.print("Input Celsius : ");
        	 celcius = input.nextDouble();
        }        
        f.input(celcius);
        System.out.println(f.toString());
    }
}
