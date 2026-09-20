/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simple.grade.calculator;

import java.util.Scanner;

/**
 *
 * @author Regidor
 */
public class SimpleGradeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your test score");
        double test_score = input.nextDouble();
        if (test_score<=74){
            System.out.println("Needs Improvement");
        } else if (test_score>=75 && test_score<=89){
            System.out.println("Good");
        } else{
            System.out.println("Excellent");
        }
    }
    
}