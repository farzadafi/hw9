package App;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exerciseThree {
    int number;
    Scanner input = new Scanner(System.in);
    List<Integer> integerList = new ArrayList<>();

    public void exerciseThree() {
        integerList = readFromInput();
        System.out.println(integerList);

        List<Integer> arrangeIntegerList = new ArrayList<>();
        arrangeIntegerList = arrangeList((ArrayList<Integer>) integerList);
        System.out.println(arrangeIntegerList);
    }

}
