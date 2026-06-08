package net.javaproject.java;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        byte lives=3;
        short score=0;
        int secreteNumber=7;
        boolean win=false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess the number Game");
        System.out.println("you have "+lives+"lives.");
        
        while(lives>0){
            System.out.print("Enter your guess Number(1-10): ");
            int guess = scanner.nextInt();

            if(guess==secreteNumber){
                score+=100;
                win=true;
                break;
            }else{
                lives--;
                System.out.println("Wrong guess! Lives remaining: "+lives);
            }
        }
        if(win){
            System.out.println("Congratulations! You guessed the number.");
            System.out.println("Your score is: "+score);
        }else{
            System.out.println("Game over!");
            System.out.println("The correct secret number was: "+secreteNumber);

        }
        scanner.close();
    }

}
