package com.ch11.toh;

public class HanoiTower {
    private Peg peg1;
    private Peg peg2;
    private Peg peg3;
    private int numDiscs;

    public HanoiTower(int num) {
        this.numDiscs = num;

        this.peg1 = new Peg(1, numDiscs);
        this.peg2 = new Peg(2, numDiscs);
        this.peg3 = new Peg(3, numDiscs);

        for(int i = numDiscs; i > 0; i--){
            peg1.addDisc(i);
        }
    }

    public void solveTower() {
        printVertically();
        moveTower(peg1, peg2, peg3, numDiscs);
        printVertically();
    }

    private void moveTower(Peg pegA, Peg pegB, Peg pegC, int numToMove) {
        if(numToMove == 0) return;

        if(numToMove == 1){
            pegA.moveTopDisc(pegC);
            return;
        }

        moveTower(pegA, pegC, pegB, numToMove - 1);

        pegA.moveTopDisc(pegC);

        moveTower(pegB, pegA, pegC, numToMove - 1);
    }

    public void printVertically(){
        for(int i = numDiscs - 1; i >= 0; i--){
            String s = "";
            s += peg1.getDisc(i) + "\t" + peg2.getDisc(i) + "\t" + peg3.getDisc(i);
            System.out.println(s);
        }
    }
    
    public static void main(String[] args) {
        HanoiTower ht0 = new HanoiTower(0);
        ht0.solveTower();
        System.out.println("\n\n\n\n");

        HanoiTower ht1 = new HanoiTower(1);
        ht1.solveTower();
        System.out.println("\n\n\n\n");

        HanoiTower ht2 = new HanoiTower(2);
        ht2.solveTower();
        System.out.println("\n\n\n\n");

        HanoiTower ht3 = new HanoiTower(3);
        ht3.solveTower();
        System.out.println("\n\n\n\n");

        HanoiTower ht4 = new HanoiTower(4);
        ht4.solveTower();
        System.out.println("\n\n\n\n");

        HanoiTower ht5 = new HanoiTower(5);
        ht5.solveTower();
        System.out.println("\n\n\n\n");

        HanoiTower ht6 = new HanoiTower(6);
        ht6.solveTower();
        System.out.println("\n\n\n\n");
    }

}

/* Output:





1       0       0
Moving disc 1 from peg 1 to peg 3
0       0       1





1       0       0
2       0       0
Moving disc 1 from peg 1 to peg 2
Moving disc 2 from peg 1 to peg 3
Moving disc 1 from peg 2 to peg 3
0       0       1
0       0       2





1       0       0
2       0       0
3       0       0
Moving disc 1 from peg 1 to peg 3
Moving disc 2 from peg 1 to peg 2
Moving disc 1 from peg 3 to peg 2
Moving disc 3 from peg 1 to peg 3
Moving disc 1 from peg 2 to peg 1
Moving disc 2 from peg 2 to peg 3
Moving disc 1 from peg 1 to peg 3
0       0       1
0       0       2
0       0       3





1       0       0
2       0       0
3       0       0
4       0       0
Moving disc 1 from peg 1 to peg 2
Moving disc 2 from peg 1 to peg 3
Moving disc 1 from peg 2 to peg 3
Moving disc 3 from peg 1 to peg 2
Moving disc 1 from peg 3 to peg 1
Moving disc 2 from peg 3 to peg 2
Moving disc 1 from peg 1 to peg 2
Moving disc 4 from peg 1 to peg 3
Moving disc 1 from peg 2 to peg 3
Moving disc 2 from peg 2 to peg 1
Moving disc 1 from peg 3 to peg 1
Moving disc 3 from peg 2 to peg 3
Moving disc 1 from peg 1 to peg 2
Moving disc 2 from peg 1 to peg 3
Moving disc 1 from peg 2 to peg 3
0       0       1
0       0       2
0       0       3
0       0       4





1       0       0
2       0       0
3       0       0
4       0       0
5       0       0
Moving disc 1 from peg 1 to peg 3
Moving disc 2 from peg 1 to peg 2
Moving disc 1 from peg 3 to peg 2
Moving disc 3 from peg 1 to peg 3
Moving disc 1 from peg 2 to peg 1
Moving disc 2 from peg 2 to peg 3
Moving disc 1 from peg 1 to peg 3
Moving disc 4 from peg 1 to peg 2
Moving disc 1 from peg 3 to peg 2
Moving disc 2 from peg 3 to peg 1
Moving disc 1 from peg 2 to peg 1
Moving disc 3 from peg 3 to peg 2
Moving disc 1 from peg 1 to peg 3
Moving disc 2 from peg 1 to peg 2
Moving disc 1 from peg 3 to peg 2
Moving disc 5 from peg 1 to peg 3
Moving disc 1 from peg 2 to peg 1
Moving disc 2 from peg 2 to peg 3
Moving disc 1 from peg 1 to peg 3
Moving disc 3 from peg 2 to peg 1
Moving disc 1 from peg 3 to peg 2
Moving disc 2 from peg 3 to peg 1
Moving disc 1 from peg 2 to peg 1
Moving disc 4 from peg 2 to peg 3
Moving disc 1 from peg 1 to peg 3
Moving disc 2 from peg 1 to peg 2
Moving disc 1 from peg 3 to peg 2
Moving disc 3 from peg 1 to peg 3
Moving disc 1 from peg 2 to peg 1
Moving disc 2 from peg 2 to peg 3
Moving disc 1 from peg 1 to peg 3
0       0       1
0       0       2
0       0       3
0       0       4
0       0       5





1       0       0
2       0       0
3       0       0
4       0       0
5       0       0
6       0       0
Moving disc 1 from peg 1 to peg 2
Moving disc 2 from peg 1 to peg 3
Moving disc 1 from peg 2 to peg 3
Moving disc 3 from peg 1 to peg 2
Moving disc 1 from peg 3 to peg 1
Moving disc 2 from peg 3 to peg 2
Moving disc 1 from peg 1 to peg 2
Moving disc 4 from peg 1 to peg 3
Moving disc 1 from peg 2 to peg 3
Moving disc 2 from peg 2 to peg 1
Moving disc 1 from peg 3 to peg 1
Moving disc 3 from peg 2 to peg 3
Moving disc 1 from peg 1 to peg 2
Moving disc 2 from peg 1 to peg 3
Moving disc 1 from peg 2 to peg 3
Moving disc 5 from peg 1 to peg 2
Moving disc 1 from peg 3 to peg 1
Moving disc 2 from peg 3 to peg 2
Moving disc 1 from peg 1 to peg 2
Moving disc 3 from peg 3 to peg 1
Moving disc 1 from peg 2 to peg 3
Moving disc 2 from peg 2 to peg 1
Moving disc 1 from peg 3 to peg 1
Moving disc 4 from peg 3 to peg 2
Moving disc 1 from peg 1 to peg 2
Moving disc 2 from peg 1 to peg 3
Moving disc 1 from peg 2 to peg 3
Moving disc 3 from peg 1 to peg 2
Moving disc 1 from peg 3 to peg 1
Moving disc 2 from peg 3 to peg 2
Moving disc 1 from peg 1 to peg 2
Moving disc 6 from peg 1 to peg 3
Moving disc 1 from peg 2 to peg 3
Moving disc 2 from peg 2 to peg 1
Moving disc 1 from peg 3 to peg 1
Moving disc 3 from peg 2 to peg 3
Moving disc 1 from peg 1 to peg 2
Moving disc 2 from peg 1 to peg 3
Moving disc 1 from peg 2 to peg 3
Moving disc 4 from peg 2 to peg 1
Moving disc 1 from peg 3 to peg 1
Moving disc 2 from peg 3 to peg 2
Moving disc 1 from peg 1 to peg 2
Moving disc 3 from peg 3 to peg 1
Moving disc 1 from peg 2 to peg 3
Moving disc 2 from peg 2 to peg 1
Moving disc 1 from peg 3 to peg 1
Moving disc 5 from peg 2 to peg 3
Moving disc 1 from peg 1 to peg 2
Moving disc 2 from peg 1 to peg 3
Moving disc 1 from peg 2 to peg 3
Moving disc 3 from peg 1 to peg 2
Moving disc 1 from peg 3 to peg 1
Moving disc 2 from peg 3 to peg 2
Moving disc 1 from peg 1 to peg 2
Moving disc 4 from peg 1 to peg 3
Moving disc 1 from peg 2 to peg 3
Moving disc 2 from peg 2 to peg 1
Moving disc 1 from peg 3 to peg 1
Moving disc 3 from peg 2 to peg 3
Moving disc 1 from peg 1 to peg 2
Moving disc 2 from peg 1 to peg 3
Moving disc 1 from peg 2 to peg 3
0       0       1
0       0       2
0       0       3
0       0       4
0       0       5
0       0       6
*/