package by.htp.les02.main;
/*
 * 17. Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел.
 */

import static java.lang.Math.pow;
import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа: " + "Нажмите Enter");
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
		int s;
		double g;
		
		s= ((int) pow(a,3) + (int) pow(b,3)) / 2;
		g =  sqrt(abs(a) * abs(b));
		
		System.out.println("Среднее арифметическое = " + s);
		System.out.println("Среднее геометрическое = " + g);
	}
}