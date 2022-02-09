package App;

import java.util.*;

public class exerciseOne {
        Scanner input = new Scanner(System.in);
        String characters, randomString;
        Random random = new Random();
        Set<String> stringSet = new HashSet<>();
        List<Integer> numberOfPerCharacter = new ArrayList<>();
        Map<Character, Integer> characterIntegerHashMap = new HashMap<>();
        boolean isEqual = true;

        public void exerciseOne() {

            System.out.print("Enter your String(split with space):");
            characters = input.nextLine();
            String[] chars = characters.split(" ");
            if (chars.length == 1) {
                characterIntegerHashMap = calcNumberOfLetter(characters);
                for (Integer a : characterIntegerHashMap.values()) {
                    numberOfPerCharacter.add(a);
                }

                int length = characters.length();
                while (true) {
                    for (int j = 0; j < length * 10; j++) {
                        randomString = "";
                        char[] text = new char[length];
                        for (int i = 0; i < length; i++) {
                            text[i] = characters.charAt(random.nextInt(characters.length()));
                        }
                        for (int i = 0; i < text.length; i++) {
                            randomString += text[i];
                        }
                        stringSet.add(randomString);
                    }

                    Iterator<String> iterator = stringSet.iterator();
                    while (iterator.hasNext()) {
                        String element = iterator.next();
                        if (!calcNumberOfLetter(element).equals(calcNumberOfLetter(characters))) {
                            iterator.remove();
                        }
                    }

                    for (Integer integer : numberOfPerCharacter) {
                        if (integer != 1)
                            isEqual = false;
                    }
                    if (isEqual) {
                        if (stringSet.size() == fact(characters.length()))
                            break;
                    } else {
                        int temp = 1;
                        for (Integer a : characterIntegerHashMap.values()) {
                            temp *= fact(a);
                        }
                        if (stringSet.size() == (fact(characters.length())) / temp)
                            break;
                    }
                }
                System.out.println(stringSet);
            } else if (chars.length == 2) {
                if (calcNumberOfLetter(chars[0]).equals(calcNumberOfLetter(chars[1])))
                    System.out.println("passed");
                else
                    System.out.println("fail");
            } else
                System.out.println("You enter a wrong input!");
        }

    public static int fact(int number) {
        int i, fact = 1;
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }



    }
