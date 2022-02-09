package App;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class exerciseThree {
    int number;
    static Scanner input = new Scanner(System.in);
    List<Integer> integerList = new ArrayList<>();

    public void exerciseThree() {
        integerList = readFromInput();
        System.out.println(integerList);

        List<Integer> arrangeIntegerList = new ArrayList<>();
        arrangeIntegerList = arrangeList((ArrayList<Integer>) integerList);
        System.out.println(arrangeIntegerList);
    }

    public static List<Integer> readFromInput(){
        int number;
        List<Integer> integerList = new ArrayList<>();
        System.out.println("Enter alphabetic for break loop!");
        for(int i=0; ;i++){
            System.out.print("Enter " + i + ":");
            try {
                number = input.nextInt();
                integerList.add(number);
            }catch (InputMismatchException exception){
                System.out.println("End of the Array!");
                break;
            }
        }
        return integerList;
    }


}
