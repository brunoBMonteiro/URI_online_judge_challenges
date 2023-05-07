package org.example.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * IMPORTANT:
 * O nome da classe deve ser "Esfera sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

// ESFERA  -  URI Online Judge | 1011
public class Esfera {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double raio = input.nextDouble();
        double PI = 3.14159;
        double volume = (4 / 3.0) * PI * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f%n", volume);

        input.close();
    }
}