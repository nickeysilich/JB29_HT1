package by.htp.les02.main;
/*
 * 31. Составить программу для вычисления пути, пройденного лодкой, если ее скорость в стоячей воде v км/ч, скорость течения реки v1 км/ч, время движения по озеру t1 ч, а против течения реки — t2 ч. 
 */

import java.util.Scanner;

public class Task31 {

	public static void main(String[] args) {
		int v, v1;
		int t1, t2;
		int s1,s2, s3;
		Scanner sc = new Scanner(System.in);
        System.out.println("Введите скорость лодки в стоячей воде:");
        v = sc.nextInt();
        System.out.println("Введите скорость течения реки:");
        v1 = sc.nextInt();
        System.out.println("Введите время движения по озеру:");
        t1 = sc.nextInt();
        System.out.println("Введите время движения против течения реки:");
        t2 = sc.nextInt();
        s1 = v * t1;
        s2 = (v - v1) * t2;
        s3 = s1 +s2;
        
        System.out.println("Путь пройденный по озеру: " + s1);
        System.out.println("Путь пройденный против течения реки: " + s2);
        System.out.println("Весь пройденный путь: " + s3);
        
        
	}

}
