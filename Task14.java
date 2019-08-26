package by.htp.les02.main;
/*
 * 14. Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
 */

import java.util.Scanner;
import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите радиус R ");
		double r, d, p, s;
		r = sc.nextDouble();
		d = r * 2;
		p = PI * d;
		s = PI * pow(r,2);
		System.out.println("Длинна окружности = " + p);
		System.out.println("Площадь круга = " + s);

	}

}
