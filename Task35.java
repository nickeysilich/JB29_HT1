package by.htp.les02.main;
/*
 * 35. Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N. 
 */

import java.util.Scanner;

public class Task35 {

	public static void main(String[] args) {
		int m,n;
		Scanner sc = new Scanner(System.in);
        System.out.println("Введите M :");
        m = sc.nextInt();
        System.out.println("Введите N :");
        n = sc.nextInt();
        
        double x = (double)m / n;
        double x1;
        x1 = (int)x;
        double y = (x * 100) - (x1 * 100);
        x1 = x1 % 10;
        y = (y - (y % 10)) / 10;
        System.out.println("M/N = " + x);
        System.out.println("Младшая цифра целой части= " + (int)x1);
        System.out.println("Старшая цифра дробной части= " +(int)y);
		
	}

}
