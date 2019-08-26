package by.htp.les02.main;

import java.util.Scanner;

/*
 * 25. Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными коэффициентами a, b
 *  и с (предполагается, что а≠0 и что дискриминант уравнения неотрицателен). 
 */
public class Task25 {

	public static void main(String[] args) {
		double a, b, c;
		Scanner sc = new Scanner(System.in);
        System.out.println("Введите коэффициентами a (a≠0):");
        a = sc.nextDouble();
        System.out.println("Введите коэффициентами b:");
        b = sc.nextDouble();
        System.out.println("Введите коэффициентами c:");
        c = sc.nextDouble();
		double d = (b * b) - 4 * a * c;
		if (d < 0) {
			System.out.println("Корней нет");
		}
		else {
		if (d == 0) {
			double x1 = (-b)/ 2 * a;
			System.out.println( "X1=" + x1);
		}
		else {
			double x1 = (- b + Math.sqrt(d))/ (2 * a);
			double x2 = (- b - Math.sqrt(d))/ (2 * a);
			System.out.println( "X1=" + x1);
			System.out.println( "X2=" + x2);
		}
	}

}
}

