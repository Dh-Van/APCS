package com.ch4.whileloops;

public class WhileLoops {

    public int addOds(int n){
        int count = 0;
        int sum = 0;

        while(count < n){
            count++;
            if(count % 2 == 0) continue;
            sum += count;
        }

        return sum;
    }

    public int sumDigits(int num){
        int sum = 0;

        while(num >= 1){
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

    public int howManyYears(double startPop, double endPop){
        int years = 0;
        double pop = startPop;

        while(pop < endPop){
            pop += pop * 0.0113;
            years++;
        }

        return years;
    }

    public int printSum(int n){
        int count = 0;
        int sum = 0;
        while(count <= n){
            sum += count;
            count++;
        }
        return sum;
    }

    public boolean isPerfectSquare(int n){
        int count = 0;
        int sum = 0;

        while(sum < n){
            count++;
            if(count % 2 == 0) continue;
            sum += count;
        }

        return sum == n;
    }

    public static void main(String[] args) {
        WhileLoops wl = new WhileLoops();

        System.out.println(wl.addOds(15));
        System.out.println(wl.addOds(25));
        System.out.println(wl.addOds(35) + "\n");

        System.out.println(wl.sumDigits(123));
        System.out.println(wl.sumDigits(78910));
        System.out.println(wl.sumDigits(91011) + "\n");

        System.out.println(wl.howManyYears(111.2, 120));
        System.out.println(wl.howManyYears(111.2, 135));
        System.out.println(wl.howManyYears(111.2, 150) + "\n");

        System.out.println(wl.printSum(13));
        System.out.println(wl.printSum(15));
        System.out.println(wl.printSum(20) + "\n");

        System.out.println(wl.isPerfectSquare(16));
        System.out.println(wl.isPerfectSquare(225));
        System.out.println(wl.isPerfectSquare(498));
        System.out.println(wl.isPerfectSquare(789) + "\n");

    }

}

/* Output:
64
169
324

6
25
12

7
18
27

91
120
210

true
true
false
false
 */
