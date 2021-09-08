package com.company;
import java.util.Scanner;

public class Main{
    static int calculateFactorial(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int result = scanner.nextInt();
        System.out.println(calculateFactorial(result));
    }
}
//    Написать программу, которая с помощью метода, вычисляет факториал числа (использовать управляющую конструкцию цикла), проверить работу метода