package by.htp.les02.main;
/*
 * 13. Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3). Найти его
периметр и площадь.
 */

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите координаты вершин " + "(Нажмите Enter после каждого числа)");
		double x1, x2, y2, x3, y3;
		double d1, d2, d3;
		double p;
		double s;
		x1 = sc.nextDouble();
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		x3 = sc.nextDouble();
		y3 = sc.nextDouble();
		d1 = sqrt((pow(x2-x1,2))+(pow(y2-y2,2)));
		d2 = sqrt((pow(x3-x2,2))+(pow(y3-y2,2)));
		d3 = sqrt((pow(x3-x1,2))+(pow(y3-y2,2)));
		p = (d1 + d2 + d3)/ 2;
		s = sqrt((p*(p-d1) * (p-d2) * (p-d3)));
		System.out.println("Периметр треугольника = " + p*2);
		System.out.println("Площадь треугольника = " + s);
		

	}

}
