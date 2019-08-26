package by.htp.les02.main;
/*
 * 
 23. Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R> r).
 */

import java.util.Scanner;
import static java.lang.Math.PI;

public class Task23 {

	public static void main(String[] args) {
		int R, r;
		double S;
		Scanner sc = new Scanner(System.in);
        System.out.println("Введите внутренний радиус r:");
        r = sc.nextInt();
        System.out.println("Введитевнешнии радиус R (R> r):");
        R = sc.nextInt();
		
        S =PI * (double)(R * R - r * r);
        System.out.println("Площадь кольца= " + S);
	}

}
