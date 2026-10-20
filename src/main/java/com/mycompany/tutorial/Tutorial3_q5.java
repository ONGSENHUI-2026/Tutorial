package com.mycompany.tutorial;
import java.util.Scanner;
public class Tutorial3_q5 {

       public static void main(String[] args) {
           Scanner in=new Scanner(System.in);
           System.out.print("Enter the year:");
          if(!in.hasNextInt()){
              System.out.println("Please enter the whole year.");
          } 
          else{
          int year=in.nextInt();
          if(year%4==0&&year%10!=0){
              System.out.println(year+" is a leap year.");}
              
          else if(year%400==0){
              System.out.println(year+" is a leap year.");
          } 
          else{
              System.out.println(year+" is not leap year");}
          }
       }
    
}
