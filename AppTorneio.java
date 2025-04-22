
package com.example;
import java.util.Scanner;


public class AppTorneio {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Objeto 1 com valores fixos
        Torneio atleta1 = new Torneio("Lucas", 14);
        System.out.println("Atleta 1:");
        atleta1.imprimeDados();

        // Objeto 2 com entrada do usuário
        System.out.println("\nDigite os dados do segundo atleta:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        Torneio atleta2 = new Torneio(nome, idade);
        System.out.println("\nAtleta 2:");
        atleta2.imprimeDados();

        sc.close();
    }
}
