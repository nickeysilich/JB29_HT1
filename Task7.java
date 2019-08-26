package by.htp.les02.main;
/*
 * 7. Дан прямоугольник, ширина которого в два раза меньше длины. Найти площадь прямоугольника
 */

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите длинну или ширину прямоугольника: ");
		double n;
		double s;
		n = sc.nextInt();
		s = n * (n*2);
		System.out.println("Площадь прямоугольника = " + s);
	}

}
