
package com.example;
import java.util.Scanner;

public class AppVendedor {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Primeiro vendedor parametros
        Vendedor v1 = new Vendedor(1500, 3000, "Ana", 2);
        System.out.println("Vendedor 1:");
        v1.imprimirDados();

        // Segundo vendedor com entrada do usuário
        System.out.println("\nDigite os dados do segundo vendedor:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Salário: ");
        float salario = sc.nextFloat();

        System.out.print("Vendas: ");
        float vendas = sc.nextFloat();
        
        
        System.out.print("Faltas: ");
        int faltas = sc.nextInt();

        Vendedor v2 = new Vendedor(vendas, salario, nome, faltas);
        System.out.println("\nVendedor 2:");
        v2.imprimirDados();

        sc.close();
    }
}
