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
        moveTower(peg1, peg2, peg3, numDiscs);
        System.out.println(peg1.getDiscs());
        System.out.println(peg2.getDiscs());
        System.out.println(peg3.getDiscs());
    }

    private void moveTower(Peg pegA, Peg pegB, Peg pegC, int numToMove) {
        if(numToMove == 2){
            pegA.moveTopDisc(pegB);
            pegA.moveTopDisc(pegC);
            pegB.moveTopDisc(pegC);
            return;
        }

        moveTower(pegA, pegC, pegB, numToMove - 1);

        pegA.moveTopDisc(pegC);

        moveTower(pegB, pegA, pegC, numToMove - 1);
    }

    /**
     * 
     * @param origin The peg with the discs in the two stack
     * @param destination The peg where two stack should be created
     * @param intermediate The extra peg
     */
    private void create2Stack(Peg origin, Peg destination, Peg intermediate){
        // Moves the top disc from a to b
        origin.moveTopDisc(intermediate);
        // Moves the top disc from a to c
        origin.moveTopDisc(destination);
        // Moves the top disc from b to c
        intermediate.moveTopDisc(destination);
    }

    private void create3Stack(Peg origin, Peg destination, Peg intermediate){
        // Creates a 2 stack from a to b
        create2Stack(origin, intermediate, destination);
        // Moves the top disc from a to c
        origin.moveTopDisc(destination);
        // Creates a 2 stack from b to c
        create2Stack(intermediate, destination, origin);
    }

    private void create4Stack(Peg origin, Peg destination, Peg intermediate){
        create3Stack(origin, intermediate, destination);
        origin.moveTopDisc(destination);
        create3Stack(intermediate, destination, origin);
    }

    private void create5Stack(Peg origin, Peg destination, Peg intermediate){
        create4Stack(origin, intermediate, destination);
        origin.moveTopDisc(destination);
        create4Stack(intermediate, destination, origin);
    }

    private void create6Stack(Peg origin, Peg destination, Peg intermediate){
        create5Stack(origin, intermediate, destination);
        origin.moveTopDisc(destination);
        create5Stack(intermediate, destination, origin);
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HanoiTower ht = new HanoiTower(6);
        ht.solveTower();
    }

}
