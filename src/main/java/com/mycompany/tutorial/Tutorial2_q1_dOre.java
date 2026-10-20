
package com.mycompany.tutorial;
import java.util.Scanner;

public class Tutorial2_q1_dOre {

    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       System.out.println("Enter input:");
       if(!in.hasNextInt()){
           System.out.println("Error:Enter the number.");}
       else{
       int num=in.nextInt();
       switch(num){
       
           case'0' -> System.out.println("Sunday"); 
           case'1' -> System.out.println("Monday");
           case'2' -> System.out.println("Tuesday");
           case'3' -> System.out.println("Wednesday");}
           
         
           
         
           
           
       
    }
    
}
}
        