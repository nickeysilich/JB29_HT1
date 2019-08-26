package by.htp.les02.main;
/*
 * 37. Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:
 */

import java.util.Scanner;

public class Task37 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
	one();
	two();
	three();
	four();
	five();
	six();
	seven();
	eigth();
	nine();
	}
	public static void one() {
		//Целое число N является четным двузначным числом.
        System.out.println("Введите число :");
        int n;
			n = sc.nextInt();
		int a,b;
		a = n /10;
		b = n % 10;
		if(b % 2 == 0 & n < 100 & n > 9){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
	public static void two() {
		//Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.
		System.out.println("Введите четырехзначное число:");
		int n;
		n = sc.nextInt();
		int a,b,c,d;
		a = n / 1000;
		b = n / 100 % 10;
		c = n % 100 / 10;
		d = n % 1000 % 10;
		if((a + b) == (c + d)){
			System.out.println("true");
		}else
			System.out.println("false");
	}
	public static void three() {
	//Сумма цифр данного трехзначного числа N является четным числом.
	System.out.println("Введите трехзначное число:");
	int n;
	n = sc.nextInt();
	int a, b,c;
	a = n / 100;
	b = n / 10 % 10;
	c = n % 10;
	
	if((a + b + c) % 2 == 0){
		System.out.println("true");
	}else
		System.out.println("false");
	}
	public static void four() {
		//Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= т, х= п (т<п).
		System.out.println("Введите x и y:");
		int x,y;
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println ("Введите t and p:" );
		int t,p ;
			t = sc.nextInt();
			p = sc.nextInt();
		if (x >=t & x<=p ) {
			System.out.println("true");
		}else
			System.out.println("false");
		}
	public static void five() {
		//Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.
		System.out.println("Введите трехзначное число");
		int n;
		n = sc.nextInt();
		
		int a, b,c;
		a = n / 100;
		b = n / 10 % 10;
		c = n % 10;
		
		if(Math.pow((a + b + c),3) == n*n){
			System.out.println("true");
		}else
			System.out.println("false");
		}
	public static void six() {
		//Треугольник со сторонами а,b,с является равнобедренным. 
		System.out.println("Введите сторону a");
		int a;
		a = sc.nextInt();
		System.out.println("Введите сторону b");
		int b;
		b = sc.nextInt();
		System.out.println("Введите сторону c");
		int c;
		c = sc.nextInt();
		if (a==b && a==c && b==c ) {
			System.out.println("false");
			
		}else if (a==b || a==c || b==c ) {
			System.out.println("true");
		}
		else
			System.out.println("false");
	}
	public static void seven() {
		//Сумма каких-либо двух цифр заданного трехзначного натурального числа N равнатретьей цифре.
		System.out.println("Введите трехзначное натуральное число");
		int n;
		n = sc.nextInt();
		int a, b,c;
		a = n / 100;
		b = n / 10 % 10;
		c = n % 10;
		if (a +b==c | b+c==a | c+a==b) {
			System.out.println("true");
		}
		else
			System.out.println("false");
	}
	public static void eigth() {
		//Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4).
		System.out.println("Введите число n");
		int n;
		n = sc.nextInt();
		System.out.println("Введите число a");
		int a;
		a = sc.nextInt();
		int i=1;
		while (i<n) {
			i = i*a;
		}
		if (i==n) {
			System.out.println("true");
		}
		else
			System.out.println("false");
	}
	public static void nine() {
		//График функции у = ах2 + bх+ с проходит через заданную точку с координатами (m,п).
		System.out.println("Введите число a");
		int a,b,c,n;
		double y, m;
		a = sc.nextInt();
		System.out.println("Введите число b");
		b = sc.nextInt();
		System.out.println("Введите число c");
		c = sc.nextInt();
		System.out.println("Введите число m");
		m = sc.nextDouble();
		System.out.println("Введите число n");
		n = sc.nextInt();
		y = a*n*n + b*n + c;
		if (y == m) {
			System.out.println("true");
		}
		else
			System.out.println("false");
	}
}

