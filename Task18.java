package by.htp.les02.main;
/*
18. Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба.
 */


import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Task18 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длинну ребра куба:");
        double m, s, sg, v;
        m = sc.nextDouble();

        sg = (m * m);
        s = 6 * sqrt(m);
        v = pow(m, 6);

        System.out.println("Площадь грани куба = " + sg);
        System.out.println("Площадь полной поверхности куба = " + s);
        System.out.println("Объем куба = " + v);

    }
    }

