package by.htp.les02.main;
/*
 * 28. Составить программу перевода радианной меры угла в градусы, минуты и секунды.
 */

import java.util.Scanner;
import static java.lang.Math.PI;

public class Task28 {

	public static void main(String[] args) {
		double r;
		double G, M, S;
		Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение угла в радианах:");
        r = sc.nextDouble();
        G =(r * 180/ Math.PI);
        int gr1 = (int) G;
        double gr2 = G - gr1;
        M = gr2 * 60;
        int m1 = (int)M;
        double m2 = M - m1;
        S = m2 * 60;
        System.out.println("Значение угла в градусах: " + (int)G);
        System.out.println("Значение угла в минутах: " + (int)M);
        System.out.println("Значение угла в секундах: " + (int)S);
        
        
        

	}

}
