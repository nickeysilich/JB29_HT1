package by.htp.les02.main;
/*
19. Дана сторона равностороннего треугольника.
Найти площадь этого треугольника, его высоту, радиусы вписанной и описанной окружностей.
 */

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Task19 {
    public static void main (String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сторону треугольника:");
        double m, s, h, rv, ro;
        m = sc.nextDouble();
        h = (m * sqrt(3)) / 2;
        s = (m * h) / 2;
        rv = (sqrt(3)/6) * m;
        ro = (sqrt(3)/3) * m;

        System.out.println("Площадь треугольника = " + s);
        System.out.println("Высота треугольника = " + h);
        System.out.println("Радиусы вписанной окружности треугольника = " + rv);
        System.out.println("Радиусы описанной окружности треугольника = " + ro);
    }
    }