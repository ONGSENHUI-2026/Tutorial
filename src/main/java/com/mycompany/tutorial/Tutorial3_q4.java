
package com.mycompany.tutorial;
import java.util.Scanner;

public class Tutorial3_q4 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter integer 1:");
        int num1=in.nextInt();
        System.out.print("Enter integer 2:");
        int num2=in.nextInt();
        System.out.print("Enter integer 3:");
        int num3=in.nextInt();
        int max=0;{
        if(num1>num2&&num1>num3){
        max=num1;}
        if(num2>num1&&num2>num3){
        max=num2;    
        }
       if(num3>num1&&num3>num2){
       max=num3;}
        System.out.println("Biggest integer :"+ max);}
       
       if(max==0){
           System.out.println("There is no biggest integer");}
       
       
  
    }
    
}
