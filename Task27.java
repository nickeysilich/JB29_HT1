package by.htp.les02.main;
/*27. Дано значение a. Не используя никаких функций и никаких операций, кроме умножения, получить значение а8 за три операции и  а10 за четыре операции.  
 */

import java.util.Scanner;

public class Task27 {

	public static void main(String[] args) {
		int a, a2, a4, a8, a10;
		Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение а:");
        a = sc.nextInt();
        a2 = a *a;
        a4 = a2 * a2;
        a8 = a4 * a4;
        a10 = a8 * a2;
        System.out.println("a^8 = " + a8);
        System.out.println("a^10 = " + a10);
	}

}
