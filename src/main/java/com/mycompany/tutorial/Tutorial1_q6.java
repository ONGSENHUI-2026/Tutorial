package com.mycompany.tutorial;
import java.util.Scanner;

public class Tutorial1_q6 {

    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
        System.out.print("Enter diameter:");
        double diameter=keyboard.nextDouble();
        double pi=Math.PI;
        double circumference=diameter*pi;
        
        System.out.println("The circumference of the circle is : %.3f".formatted(circumference));
        
    }
}
