package com.ch8.word;
/* This question uses 2 classes, a Box class that represents an individual square in the puzzle
and a WordPuzzle class that represents a word puzzle grid.
 */
public class WordPuzzle {
    /** Each element is a Box object with a color (black or white)
     * and a number.  puzzle[r][c] represents the block in row r
     * column c.  There is at least one row in the puzzle.
     */
    private Box [][] puzzle;

    /* Write the WordPuzzle method toBeLabeled().  The method returns true
    if the box indexed by row r and column c in a word puzzle grid should be
    labeled with a positive number according to the word puzzle labeling rule;
    otherwise it returns false.  The parameter blackBoxes indicates which
    squares in the word puzzle grid are black.
     */
    /** Returns true if the square at row r, column c should be labeled
     * with a positive number, false otherwise.
     * The box at row r, column c is black if and only if blackBoxes[r][c]
     * is true.
     * Precondition: r and c are valid indexes in blackBoxes
     */
    public boolean toBeLabeled(int r, int c, boolean [][] blackBoxes){
        // Checks if a there is a black box at r, c
        if(blackBoxes[r][c]) return false;
        // If its in the 1st row or column, return true since no white box to the left / top
        if(r == 0 || c == 0) return true;
        // If there is a black box the row before, or the column above, return true
        if(blackBoxes[r-1][c] || blackBoxes[r][c-1]) return true;
        // If all cases fail, return false
        return false;
    }

    /* Write the WordPuzzle Constructor.  The constructor should initialize the
    puzzle grid to have the same dimensions as the parameter blackBoxes.
    Each element of the puzzle grid should be initialized with a
    reference to a Box object with the appropriate color and number.
    The number is positive if the box is labeled and 0 if the box is not
    labeled.
     */
    /** Constructs a Word Puzzle grid.
     * Precondition: There is at least one row in blackBoxes
     * Postcondition:
     * - The puzzle grid has the same dimensions as blackBoxes.
     * - The Box object at row r, column c, in the word puzzle grid
     * is black if and only if blackBoxes[r][c] is true.
     * - The boxes in the puzzle are labeled according to the word
     * puzzle labeling rule.
     * @param blackBoxes - a 2D array of Boxes
     */
    public WordPuzzle(boolean [][] blackBoxes){
        puzzle = new Box[blackBoxes.length][blackBoxes[0].length];
        for(int i = 0; i < blackBoxes.length; i++){
            for(int j = 0; j < blackBoxes[0].length; j++){
                puzzle[i][j] = new Box(blackBoxes[i][j], 0);
            }
        }

        int counter = 1;
        for(int i = 0; i < puzzle.length; i++){
            for(int j = 0; j < puzzle[0].length; j++){
                if(toBeLabeled(i, j, blackBoxes)){
                    puzzle[i][j] = new Box(false, counter);
                    counter++;
                } else if(!blackBoxes[i][j]){
                    puzzle[i][j] = new Box(false, 0);
                } else {
                    puzzle[i][j] = new Box(true, 0);
                }
            }
        }
    }


    public String toString(){
        String s = "";
        for(int r =0; r < puzzle.length; r++){
            for(int c = 0; c < puzzle[0].length; c++){
                s += puzzle[r][c].toString();
            }
            s += "\n";
        }
        return s;
    }


    public static void main(String[] args){
        /* represents the word puzzle in the example */
        boolean[][]blackBoxes = {
                {true,false,false,true,true,true,false,false,false},
                {false,false,false,false,true,false,false,false,false},
                {false,false,false,false,false,false,true,true,true},
                {false,false,true,false,false,false,true,false,false},
                {true,true,true,false,false,false,false,false,false},
                {false,false,false,false,true,false,false,false,false},
                {false,false,false,true,true,true,false,false,true}};

        WordPuzzle wp = new WordPuzzle(blackBoxes);
        System.out.println(wp);
    }
}

/*Output
 black  1wh  2wh black black black  3wh  4wh  5wh
  6wh white white  7wh black  8wh white white white
  9wh white white white  10wh white black black black
  11wh white black  12wh white white black  13wh  14wh
 black black black  15wh white white  16wh white white
  17wh  18wh  19wh white black  20wh white white white
  21wh white white black black black  22wh white black

 */