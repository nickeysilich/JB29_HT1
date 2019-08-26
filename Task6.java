package by.htp.les02.main;
/*
 * 6. Написать код для решения задачи. В n малых бидонах 80 л молока. Сколько литров молока в m больших бидонах, если в каждом большом бидоне на 12 л. больше, чем в малом?
 */

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите количество малых и больших бидонов " + "(Нажмите Enter после каждого числа):");
		int n, m;
		double nlitr, mlitr;
		n = sc.nextInt();
		m = sc.nextInt();
		nlitr = (double)80 / n;
		mlitr = m * (nlitr +  12);
		System.out.println("Литров молока в m больших бидонах= " + mlitr);
	}
		

	}

