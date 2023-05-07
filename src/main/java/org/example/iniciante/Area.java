package org.example.iniciante;

import java.util.Locale;
import java.util.Scanner;


/**
 * IMPORTANT:
 * O nome da classe deve ser "Area" para que a sua solução execute
 * Class name must be "Area" for your solution to execute
 * El nombre de la clase debe ser "Area" para que su solución ejecutar
 */
public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double PI = 3.14159;

        double triangulo = (a * c) / 2;
        double circulo = PI * Math.pow(c, 2);
        double trapezio = ((a + b) * c) / 2;
        double quadrado = Math.pow(b, 2);
        double retangulo = a * b;

        System.out.printf("TRIANGULO: %.3f\n", triangulo);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETANGULO: %.3f\n", retangulo);
    }

}
