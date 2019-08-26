package by.htp.les02.main;
/*
 * 5. Составить алгоритм нахождения среднего арифметического двух чисел
 */
import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите 2 числа " + "(Нажмите Enter после каждого числа):");
		double a, b;
		a = sc.nextDouble();
		b = sc.nextDouble();
		double arif = (a + b) / 2;
		System.out.println("Среднее арифметическое двух чисел = " + arif);
	}

}

