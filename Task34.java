package by.htp.les02.main;
/*
 * 34. Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные единицы измерения информации. 
 */

import java.util.Scanner;

public class Task34 {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Введите величину A:");
        int  A = sc.nextInt();
		double kb,mb,gb,tb;
        kb = A / 1024;
        mb = kb / 1024;
        gb = mb / 1024; 
        tb = gb / 1024;
        
        System.out.println("Bytes=" + A);
        System.out.println("Kilobytes= " + kb);
        System.out.println("Megabytes= " + mb);
        System.out.println("Gigabytes= " + gb);

	}


}
