package by.htp.les02.main;
/*
 * 12. Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2).
 */

import static java.lang.Math.sqrt;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Task12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите координаты точек " + "(Нажмите Enter после каждого числа)");
		double x1;
		double x2;
		double y1;
		double y2;
		double s;
		x1 = sc.nextDouble();
		x2 = sc.nextDouble();
		y1 = sc.nextDouble();
		y2 = sc.nextDouble();
		s = sqrt((pow(x2-x1,2))+(pow(y2-y1,2)));
		System.out.println("Расстояние между двумя точками = " + s);

	}

}
