package com.company;

public class Main {

    private static int computeSum(int num1,int num2){
        return num1 + num2;
    }

    private static int computeSum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    private static int max(int num1, int num2){
        int result;
        if(num1 > num2)
            result = num1;
        else
            result = num2;
        return result;
    }

    private static double max(double num1, double num2){
        double result;
        if(num1 > num2)
            result = num1;
        else
            result = num2;
        return result;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");

        System.out.println("The sum of 50 and 20 is " + Main.computeSum(50,30));
        System.out.println("The sum of 50, 30, and 25 is " + Main.computeSum(50,30,25));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("The greater value between 10 and 45 is " + Main.max(10,45));
        System.out.println("The greater value between 3.1 and 2.8 is " + Main.max(3.1,2.8));
    }
}
