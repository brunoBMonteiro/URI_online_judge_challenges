package org.example.iniciante;

import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Scanner sc = new java.util.Scanner(System.in);
        int distancia = sc.nextInt();
        double combustivel = sc.nextDouble();
        double consumo = distancia / combustivel;
        System.out.printf("%.3f km/l\n", consumo);
        sc.close();
    }
}
