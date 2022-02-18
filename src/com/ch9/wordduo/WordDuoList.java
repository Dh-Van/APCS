package com.ch9.wordduo;

import java.util.ArrayList;

public class WordDuoList {
    private ArrayList<WordDuo> allDuos;


    /*
    Write the constructor for the WordDuoList class.  The constructor
    takes an array of Strings as a parameter and initializes the
    instance variable allDuos to an ArrayList of WordDuo objects.

    A WordDuo object consists of a word from the array paired with a
    word that appears later in the array.  The allDuos list constins
    WordDuo objects (words[i], words[j]) for every i and j, where
    0<=i<j<words.length.  Each WordDuo object is added exactly once to
    the list.

    The following examples illustrate two different WordDuo objects.

    Example 1:
    String [] wordNums = {"one", "two", "three"};
    WordDuoList exampleOne = new WordDuoList(wordNums);

    After the code has executed, the allDuos instance variable
    of exampleOne will contain the following WordDuo objects in the
    same order.
    ("one", "two"), ("one", "three"), ("two", "three")

    Example 2:
    String[] phrase = {"the", "more", "the", "merrier"};
    WordDuoList exampleTwo = new WordDuoList(phrase);

    After the code segment has executed, the allDuos instance variable of
    exampleTwo will contain the following WordDuo objects in come order.
    ("the", "more"), ("the", "the"), ("the", "merrier"),
    ("more", "the"), ("more", "merrier"), ("the", "merrier")
     */
    /** Constructor
     * Precondition:  word.length >2
     */
    public WordDuoList(String[] words){
        /* part A */
        allDuos = new ArrayList<>();
		for(int i = 1, counter = 0; counter < words.length - 2; i++){
            i = (i == words.length) ? (i = 1 + ++counter) : i;
            allDuos.add(new WordDuo(words[counter], words[i]));
        }
		

    }
    public String toString(){
        String s = "";
        for (WordDuo wd: allDuos){
            s += "("+wd.getFirst() + ", " + wd.getSecond() + ")\n";
        }
        return s;
    }

    /* Write the WordDuoList method numMatches.  This method returns the number
    of WordDuo objects in allDuos for which the two strings match.

    For example, the following code segment creates a WordDuoList object.

    String[] moreWords = {"the", "red", "fox", "the", "red");
    WordDuoList exampleThree = new WordDuoList(moreWords);

    After the code segment has executed, the allDuos instance variable of
    exampleThree will contain the following WordDuo objects in some order.
    The matching pairs are starred **.

    ("the", "red"), ("the", "fox"), **("the", "the")**, ("the", "red")
    ("red", "fox"), ("red", "the"), **("red", "red")**, ("fox", "the")
    ("fox", "red"), ("the", "red")
     */
    public int numMatches(){
        int retNum = 0;

        for(WordDuo wD : allDuos){
            retNum += (wD.first.equals(wD.second)) ? 1 : 0;    
        }

        return retNum;
    }

    /*Write the method moveMatchesToTop()  This method will look for
    WordDuo matches and move them to the beginning of the ArrayList.
    For example, the list above would end up as follows.  The relative
    order of these matches does not matter.

    ("red", "red"), ("the", "the"),("the", "red"), ("the", "fox"),
    ("the", "red") , ("red", "fox"), ("red", "the"), ("fox", "the")
    ("fox", "red"), ("the", "red")

     */
    public void moveMatchesToTop(){
        /* part c */
        for(int i = 0, counter = 0; i < allDuos.size(); i++){
            WordDuo wD = allDuos.get(i);
            if(wD.first.equals(wD.second)){
                allDuos.remove(i);
                allDuos.add(counter, wD);
                counter++;
            }
        }
    }

    public static void main(String[] args){
        String [] stuff = {"to","be","or","not","to","be"};
        WordDuoList wdl = new WordDuoList(stuff);
        System.out.println(wdl + "\n");
        System.out.println(wdl.numMatches() + "\n");
        wdl.moveMatchesToTop();
        System.out.println(wdl + "\n\n");

         String [] stuff2 = {"one","fish","two","fish","red","fish","blue","fish"};
         WordDuoList wdl2 = new WordDuoList(stuff2);
         System.out.println(wdl2 + "\n");
         System.out.println(wdl2.numMatches() + "\n");
         wdl2.moveMatchesToTop();
         System.out.println(wdl2 + "\n\n");

         String [] stuff3 = {"call","me","ishmael"};
         WordDuoList wdl3 = new WordDuoList(stuff3);
         System.out.println(wdl3 + "\n");
         System.out.println(wdl3.numMatches() + "\n");
         wdl3.moveMatchesToTop();
         System.out.println(wdl3 + "\n\n");
    }
}

/*Output
(to, be)
(to, or)
(to, not)
(to, to)
(to, be)
(be, or)
(be, not)
(be, to)
(be, be)
(or, not)
(or, to)
(or, be)
(not, to)
(not, be)
(to, be)


2

(to, to)
(be, be)
(to, be)
(to, or)
(to, not)
(to, be)
(be, or)
(be, not)
(be, to)
(or, not)
(or, to)
(or, be)
(not, to)
(not, be)
(to, be)



(one, fish)
(one, two)
(one, fish)
(one, red)
(one, fish)
(one, blue)
(one, fish)
(fish, two)
(fish, fish)
(fish, red)
(fish, fish)
(fish, blue)
(fish, fish)
(two, fish)
(two, red)
(two, fish)
(two, blue)
(two, fish)
(fish, red)
(fish, fish)
(fish, blue)
(fish, fish)
(red, fish)
(red, blue)
(red, fish)
(fish, blue)
(fish, fish)
(blue, fish)


6

(fish, fish)
(fish, fish)
(fish, fish)
(fish, fish)
(fish, fish)
(fish, fish)
(one, fish)
(one, two)
(one, fish)
(one, red)
(one, fish)
(one, blue)
(one, fish)
(fish, two)
(fish, red)
(fish, blue)
(two, fish)
(two, red)
(two, fish)
(two, blue)
(two, fish)
(fish, red)
(fish, blue)
(red, fish)
(red, blue)
(red, fish)
(fish, blue)
(blue, fish)



(call, me)
(call, ishmael)
(me, ishmael)


0

(call, me)
(call, ishmael)
(me, ishmael)

 */
