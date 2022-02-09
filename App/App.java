package App;

import App.exerciseFour.hashmap;

import java.util.InputMismatchException;
import java.util.Scanner;

import static App.exerciseThree.input;

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
            System.out.println("4-HashMap(String,Integer).");
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
                    hashMap();
                    break;

                case 5:
                    System.out.println("Have a nice day!");
                    System.exit(0);

                default:
                    System.out.println("You enter a wrong number!");
            }
        }
    }

    public static void hashMap(){
        hashmap hashMap = new hashmap();
        String key;
        int command;
        boolean isTrue = true;
        while(isTrue){
            System.out.println("1-Put.");
            System.out.println("2-is Contain?.");
            System.out.println("3-is Empty?.");
            System.out.println("4-All Values.");
            System.out.println("5-Delete.");
            System.out.println("6-size.");
            System.out.println("7-Get value(key).");
            System.out.println("8-Exit");
            System.out.print("Enter a number:");
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
            switch (command){
                case 1:
                    System.out.print("Enter your key:");
                    key = input.nextLine();
                    System.out.print("Enter your value:");
                    command = input.nextInt();
                    input.nextLine();
                    hashMap.put(key,command);
                    break;

                case 2:
                    System.out.print("Enter your key:");
                    key = input.nextLine();
                    if(hashMap.containsKey(key))
                        System.out.println(key + " is founded!");
                    else
                        System.out.println(key + " is not founded!");
                    break;

                case 3:
                    if(hashMap.isEmpty())
                        System.out.println("Your List is empty!");
                    else
                        System.out.println("your List has " + hashMap.size() + " element!");
                    break;

                case 4:
                    hashMap.getAllValue();
                    break;

                case 5:
                    System.out.print("Enter your key:");
                    key = input.nextLine();
                    if(hashMap.containsKey(key)){
                        hashMap.delete(key);
                        System.out.println(key + " is successful deleted!");
                    }
                    else
                        System.out.println(key + " is not founded!");
                    break;

                case 6:
                    System.out.println("Your List has " + hashMap.size() + " element!");
                    break;

                case 7:
                    System.out.print("Enter your key:");
                    key = input.nextLine();
                    if(hashMap.containsKey(key)){
                        System.out.println(hashMap.get(key) + " value for " + key);
                    }
                    else
                        System.out.println(key + " is not defined before!");
                    break;

                case 8:
                    System.out.println("Good luck!");
                    isTrue = false;
                    break;

                default:
                    System.out.println("You enter a wrong number!");
            }
        }
    }
}
