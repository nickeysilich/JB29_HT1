package by.htp.les02.main;
/*
 * 15. Написать программу, которая выводит на экран первые четыре степени числа π.
 */
import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Task15 {

	public static void main(String[] args) {
	double a, b, c, d;
	a = pow(PI,0);
	b = pow(PI,1);
	c = pow(PI,2);
	d = pow(PI,3);
	
	System.out.println("Нулевая степень="+ a);
	System.out.println("Первая степень="+ b);
	System.out.println("Вторая степень="+ c);
	System.out.println("Третья степень="+ d);
	}

}
