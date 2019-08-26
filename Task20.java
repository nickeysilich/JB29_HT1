package by.htp.les02.main;
/*
20. Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.
 */

import java.util.Scanner;

import static java.lang.Math.PI;

public class Task20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Введите длинну окружности:");
		double m, s, r;
        m = sc.nextDouble();
        r = m / (2 * PI);
        s = PI * (m * m);

        System.out.println("Площадь круга = " + s);


	}

}
