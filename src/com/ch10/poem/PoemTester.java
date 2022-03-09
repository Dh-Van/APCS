package com.ch10.poem;

public class PoemTester {
    public static void main(String[] args) {
        Poem p1 = new Poem(12);
        System.out.println(p1.getNumlines()); // 12
        p1.printRhythm(); // Free Verse!

        Haiku h1 = new Haiku();
        System.out.println(h1.getNumlines()); // 3
        System.out.println(h1.getSyllables(2)); // 7
        h1.printRhythm();

        Limerick lim1 = new Limerick();
        System.out.println(lim1.getNumlines()); // 5
        System.out.println(lim1.getSyllables(2)); // 9
        System.out.println(lim1.getSyllables(4)); // 6
        lim1.printRhythm();

    }
}

/*Output:
    12
    Free Verse!
    3
    7
    ta-ta-ta-ta-ta
    ta-ta-ta-ta-ta-ta-ta
    ta-ta-ta-ta-ta
    5
    9
    6
    ta-ta-ta-ta-ta-ta-ta-ta-ta
    ta-ta-ta-ta-ta-ta-ta-ta-ta
    ta-ta-ta-ta-ta-ta
    ta-ta-ta-ta-ta-ta
    ta-ta-ta-ta-ta-ta-ta-ta-ta
 */