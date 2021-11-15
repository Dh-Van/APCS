package com.ch4.forloops;

public class Factorial {

    public static long calcFactorial(int num){
        long sum = 1;

        for(int i = 1; i <= num; i++){
            sum *= i;
        }

        return sum;
    }

    public static double calcE(){
        double currentE = 1;
        double prevE = 0;
        int i = 1;

        while(currentE - prevE > 0.001){
            prevE = currentE;
            currentE += (1.0 / calcFactorial(i));
            i++;
        }

        return currentE;
    }

    public static double calcEX(int num){
        double currentE = 1;
        double prevE = 0;

        for(int i = 1; currentE - prevE > 0.001; i++){
            prevE = currentE;
            currentE += (Math.pow(num, i) / calcFactorial(i));
        }

        return currentE;
    }



    public static void main(String[] args) {
        for(int i = 1; i <= 20; i++){
            System.out.println(calcFactorial(i));
        }

        System.out.printf("\ne = %2.3f \n \n", calcE());

        for(int i = 1; i <= 5; i++){
            System.out.printf("e to the power of %d = %2.3f \n", i, calcEX(i));
        }
    }
}
/* Output
1
2
6
24
120
720
5040
40320
362880
3628800
39916800
479001600
6227020800
87178291200
1307674368000
20922789888000
355687428096000
6402373705728000
121645100408832000
2432902008176640000

e = 2.718

e to the power of 1 = 2.718
e to the power of 2 = 7.389
e to the power of 3 = 20.085
e to the power of 4 = 54.598
e to the power of 5 = 148.413

Process finished with exit code 0
 */