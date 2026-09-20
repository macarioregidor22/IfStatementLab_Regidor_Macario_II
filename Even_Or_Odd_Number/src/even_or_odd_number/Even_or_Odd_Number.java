/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package even_or_odd_number;

import java.util.Scanner;

/**
 *
 * @author Regidor
 */
public class Even_or_Odd_Number {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the an integer");
        int number = input.nextInt();
        if (number % 2==0){
        System.out.println("The number is even.");
     } else {
            System.out.println("The number is odd");
        }
    }
}
