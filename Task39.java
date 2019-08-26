package by.htp.les02.main;
/*39*. Дано действительное число х. Не пользуясь никакими другими арифметическими операциями, кроме умножения, сложения и вычитания, вычислите за минимальное число операций:
2x4 - 3х3 + 4х2 - 5х + 6. 
*/

import java.util.Scanner;

public class Task39 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Введите величину x:");
        int  x = sc.nextInt();
        int rez;
		int x2 = x * x;

		rez = x2 * (2 * x2 - 3 * x) + x * (4 * x - 5) + 6;

		System.out.println("Результат вычисления: " + rez);

	}

}
