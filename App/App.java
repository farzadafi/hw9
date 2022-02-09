package App;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int command;
        Scanner input = new Scanner(System.in);
        exerciseOne exerciseOne = new exerciseOne();
        exerciseTwo exerciseTwo = new exerciseTwo();
        exerciseThree exerciseThree = new exerciseThree();


        while (true) {
            System.out.println("\n***WELCOME***");
            System.out.println("1-word processor.");
            System.out.println("2-Create Two Tree Set(union and intersection).");
            System.out.println("3-Remove Bad Pair.");
            System.out.println("4-");
            System.out.println("5-Exit");
            System.out.print("Please select a number:");
            while (true) {
                try {
                    command = input.nextInt();
                    input.nextLine();
                    break;
                } catch (InputMismatchException exception) {
                    input.nextLine();
                    System.out.print("Enter a number:");
                }
            }
            switch (command) {
                case 1:
                    exerciseOne.exerciseOne();
                    break;

                case 2:
                    exerciseTwo.exerciseTwo();
                    break;

                case 3:
                    exerciseThree.exerciseThree();
                    break;

                case 4:

                    break;

                case 5:

                    break;

                default:
                    System.out.println("You enter a wrong number!");
            }
        }


    }
}
