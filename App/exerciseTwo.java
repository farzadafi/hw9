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

}
