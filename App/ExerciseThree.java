package App;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ExerciseThree {
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
                input.nextLine();
                System.out.println("End of the Array!");
                break;
            }
        }
        return integerList;
    }

    public static List<Integer> arrangeList(ArrayList<Integer> arrayList){
        if(arrayList.size() %2 == 1 )
            arrayList.remove(arrayList.size()-1);

        for(int q=0;q<2;q++) {
            for (int i = 0; i < arrayList.size() - 1; i += 2) {
                final int j = i;
                if (arrayList.get(j) > arrayList.get(j + 1)) {
                    arrayList.remove(j);
                    arrayList.remove(j);
                }
            }
        }
        return arrayList;
    }



}
