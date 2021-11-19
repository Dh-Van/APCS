package com.ch4.advancedforloops;

public class AdvancedForLoops {

    public static void eights(){
        for(int i = 8; i > 0; i-=2){
            for(int k = 0; k < 8 - i; k+=2){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void alternate(int num){
        for(int i = 1; i <= num; i++){
            for(int j = 1; i % 2 != 0 && j <= i; j++){
                System.out.print(j);
            }
            for(int k = i; i % 2 == 0 && k > 0; k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void isosceles(int num){
        for(int i = 1; i <= num; i++){
            for(int c = 0; c < num - i; c++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            for(int k = i - 1; k > 0; k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void upSideDown(int num1, int num2){
        for(int i = 0; i <= num1 - num2; i++){
            for(int c = 0; c < i; c++){
                System.out.print(" ");
            }
            for(int j = num1 - i; j >= num2; j--){
                System.out.print(j);
            }
            for(int k = num2 + 1; k <= num1 - i; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Eights
        eights();

        System.out.println();

        // Alternate
        alternate(5);
        alternate(8);
        alternate(9);

        System.out.println();

        // Isosceles
        isosceles(4);
        isosceles(6);
        isosceles(7);

        System.out.println();

        // upSideDown
        upSideDown(9, 5);
        upSideDown(8, 6);
        upSideDown(8, 1);
    }
}
/* Output:
88888888
 666666
  4444
   22

1
21
123
4321
12345
1
21
123
4321
12345
654321
1234567
87654321
1
21
123
4321
12345
654321
1234567
87654321
123456789

   1
  121
 12321
1234321
     1
    121
   12321
  1234321
 123454321
12345654321
      1
     121
    12321
   1234321
  123454321
 12345654321
1234567654321

987656789
 8765678
  76567
   656
    5
87678
 767
  6
876543212345678
 7654321234567
  65432123456
   543212345
    4321234
     32123
      212
       1

 */
