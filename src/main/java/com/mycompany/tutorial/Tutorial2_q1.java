
package com.mycompany.tutorial;
import java.util.Scanner;

public class Tutorial2_q1 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a character:");
        char letter = in.next().charAt(0);
        if(!Character.isLetter(letter)){
            System.out.println("this is not a letter"); }
       
        else{
                if(Character.compare(letter,'a')<0){
            System.out.println("this is  a capital letter");}
        else{
            System.out.println("this is not a capital letter");}
                }
    }
    
}
