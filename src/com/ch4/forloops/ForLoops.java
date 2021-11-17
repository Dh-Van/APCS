package com.ch4.forloops;

public class ForLoops {

    public static int addEvens(int n){
        int sum = 0;
        for(int i = 0; i <= n; i += 2){
            sum += i;
        }

        return sum;
    }

    public static void printSquaresBack(int n){
        StringBuilder sb = new StringBuilder();
        for(int i = n; i > 0; i--){
            sb.append(i * i + ", ");
        }
        sb.deleteCharAt(sb.length() - 2);
        System.out.println(sb);
    }

    public static void sillyNumbers(){
        for(int x = 0; x < 3; x++){
            for(int i = 0; i <= 9; i++){
                for(int j = 0; j < 3; j++){
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }

    public static void sillyNumbers2(){
        for(int x = 0; x < 4; x++){
            for(int i = 1; i <= 9; i++){
                for(int j = 0; j < 9 - i + 1; j++){
                    System.out.print(9 - i + 1);
                }
            }
            System.out.println();
        }
    }

    public static void dollarAndStars(){
        for(int i = 7; i > 0; i--){
            for(int s = 0; s < 2 * (7 - i); s++){
                System.out.print("*");
            }
            for(int j = 0; j < i; j++){
                System.out.print("$");
            }
            for(int z = 0; z < i * 2; z++){
                System.out.print("*");
            }
            for(int a = 0; a < i; a++){
                System.out.print("$");
            }
            for(int b = 0; b < 2 * (7 - i); b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Add Evens
        System.out.println(addEvens(18));
        System.out.println(addEvens(88));
        System.out.println(addEvens(1234567898));

        System.out.println();

        // Print Squares Back
        printSquaresBack(8);
        printSquaresBack(35);
        printSquaresBack(45);

        System.out.println();

        // Silly Numbers
        sillyNumbers();

        System.out.println();

        // Silly Numbers 2
        sillyNumbers2();

        System.out.println();

        // Dollars and Stars
        dollarAndStars();

    }

}

/* Output:
90
1980
262867414

64, 49, 36, 25, 16, 9, 4, 1
1225, 1156, 1089, 1024, 961, 900, 841, 784, 729, 676, 625, 576, 529, 484, 441, 400, 361, 324, 289, 256, 225, 196, 169, 144, 121, 100, 81, 64, 49, 36, 25, 16, 9, 4, 1
2025, 1936, 1849, 1764, 1681, 1600, 1521, 1444, 1369, 1296, 1225, 1156, 1089, 1024, 961, 900, 841, 784, 729, 676, 625, 576, 529, 484, 441, 400, 361, 324, 289, 256, 225, 196, 169, 144, 121, 100, 81, 64, 49, 36, 25, 16, 9, 4, 1


000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999

999999999888888887777777666666555554444333221
999999999888888887777777666666555554444333221
999999999888888887777777666666555554444333221
999999999888888887777777666666555554444333221

$$$$$$$**************$$$$$$$
**$$$$$$************$$$$$$**
****$$$$$**********$$$$$****
******$$$$********$$$$******
********$$$******$$$********
**********$$****$$**********
************$**$************

Process finished with exit code 0

 */
