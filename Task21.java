package by.htp.les02.main;
/*
 * 21. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

public class Task21 {

	public static void main(String[] args) {
		double x = 123.456;
		double a, b, c;
		a =(int)x;
		b = x * 1000 - a * 1000;
		c = b + (a / 1000);
		System.out.println(c);
	}

}
