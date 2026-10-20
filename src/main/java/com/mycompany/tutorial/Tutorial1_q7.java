
package com.mycompany.tutorial;

import java.util.Scanner;

public class Tutorial1_q7 {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter value in inch:");
        double inch=in.nextDouble();
        double meter=(inch*2.54)/100;
        
        System.out.println("%.2f inches = %.2f meters".formatted(inch,meter));
    }
    
}
