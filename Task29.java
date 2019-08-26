package by.htp.les02.main;
/*
 * 29. Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с.
 */

import java.util.Scanner;

public class Task29 {

	public static void main(String[] args) {
		double alfa, beta, gamma;
		double a, b, c;
		double x1, y1, z1;
		double x, y, z;
		Scanner sc = new Scanner(System.in);
        System.out.println("Введите стороны тругольника: " + "(Нажмите Enter после каждого числа)");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        
        alfa =((a * a) + (c * c) - (b * b)) / (2 * a * c) ;
        x1 = Math.acos(alfa);
        x= Math.toDegrees(x1);
        
        beta = ((a * a) + (b * b) - (c * c)) / (2 * a * b) ;
        y1 = Math.acos(beta);
        y = Math.toDegrees(y1);
        
        gamma = ((b * b) + (c * c) - (a * a)) / (2 * c * b) ;
        z1 = Math.acos(gamma);
        z = Math.toDegrees(z1);
   
        System.out.println("Угол alfa в радианах= " + x1 + " "  + "и в градусах= " + x);
        System.out.println("Угол beta в радианах= " + y1 + " "  + "и в градусах= " + y);
        System.out.println("Угол gamma в радианах= " + z1 + " "  + "и в градусах= " + z);

        
	}

}
