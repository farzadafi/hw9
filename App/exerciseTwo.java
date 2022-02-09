package App;

import java.util.TreeSet;

public class exerciseTwo {

    public void exerciseTwo() {
        TreeSet<Character> randomCharacterA = new TreeSet<>();
        TreeSet<Character> randomCharacterB = new TreeSet<>();
        TreeSet<Character> union = new TreeSet<>();
        TreeSet<Character> intersection = new TreeSet<>();

        randomCharacterA.addAll(generateRandomCharacter());
        randomCharacterB.addAll(generateRandomCharacter());
        System.out.println( "Tree set 1:" + randomCharacterA);
        System.out.println( "Tree set 2:" + randomCharacterB);

        union = union(randomCharacterA,randomCharacterB);
        System.out.println( "Union is:" + union);

        intersection = intersection(randomCharacterA,randomCharacterB);
        System.out.println( "Intersection is:" + intersection);
    }

    public static TreeSet<Character> generateRandomCharacter(){
        TreeSet<Character> treeSet = new TreeSet<>();
        Random random = new Random();
        while(true){
            char randomChar = (char) (random.nextInt(26) + 'a');
            treeSet.add(randomChar);
            if(treeSet.size() == 10 )
                break;
        }
        return treeSet;
    }


}
