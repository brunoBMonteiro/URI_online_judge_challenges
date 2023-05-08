package org.example.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class OMaior {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int maiorAB = ((a+b+Math.abs(a - b))/2);
        int maiorABC = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

        System.out.println(maiorABC + " eh o maior");
    }

}
