package by.htp.les02.main;
/*
 * 16. Найти произведение цифр заданного четырехзначного числа.
 */

import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
        System.out.println("Введите четырехзначное число :");
        a = sc.nextInt();
		int b;
		int pr = 1;
		while (a != 0) {
			b = a % 10;
			pr = pr * b;
			a = a /10;
		}
		System.out.println("Произведение цифр:" + pr);
		}

	}

