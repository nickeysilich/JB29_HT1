package by.htp.les02.main;
/*
 * 30. Три сопротивления R1 R2, и R3 соединены параллельно. Найдите сопротивление соединения.
 */

import java.util.Scanner;

public class Task30 {

	public static void main(String[] args) {
		double R1, R2, R3;
		double R;
		Scanner sc = new Scanner(System.in);
        System.out.println("Введите три значения сопротивления: " + "(Нажмите Enter после каждого числа)");
        R1 = sc.nextDouble();
        R2 = sc.nextDouble();
        R3 = sc.nextDouble();
        R = 1/ ((1/R1) + (1/R2) +(1/R3));
        System.out.println("Сопротивление соединения= " + R);

	}

}
