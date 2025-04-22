package com.example;
import java.util.Scanner;

public class AppTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Triângulo com construtor com parâmetros
        Triangulo t1 = new Triangulo(10.0, 5.0);
        System.out.println("Triângulo 1:");
        t1.imprimeDados();

        // Triângulo com construtor padrão
        Triangulo t2 = new Triangulo();
        System.out.println("\nDigite os valores para o Triângulo 2:");

        System.out.print("Base: ");
        double base = sc.nextDouble();
        t2.setBase(base);

        System.out.print("Altura: ");
        double altura = sc.nextDouble();
        t2.setAltura(altura);

        System.out.println("\nTriângulo 2:");
        t2.imprimeDados();

        sc.close();
    }


}
