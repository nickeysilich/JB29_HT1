package by.htp.les02.main;
/*
26. Найти площадь треугольника, две стороны которого равны а и b, а угол между этими сторонами у.
 */

import java.util.Scanner;
import static java.lang.Math.sin;

public class Task26 {

	public static void main(String[] args) {
		double a, b, y, s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите стороны треугольника: " + "(Нажмите Enter после каждого числа)");
        a = sc.nextDouble();
        b = sc.nextDouble();
        System.out.println("Введите угол между сторонами:");
        y = sc.nextDouble();
        double Y = Math.toRadians(y);
        s = (a * b * sin(Y)) / 2;
        System.out.println("Площадь треугольника = " + s);
	}

}
