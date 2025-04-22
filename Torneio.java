
package com.example.ExerciciosGettersSetters;

public class Torneio {
     private String nome;
    private int idade;

    // Construtor com parâmetros
    public Torneio(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    // Getters e Setters com validação
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido.");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 5) {
            this.idade = idade;
        } else {
            System.out.println("Só serão aceitos atletas a partir dos 5 anos de idade.");
        }
    }

    // Verifica categoria com base na idade
    public String verificaCategoria() {
        if (idade >= 5 && idade <= 7) {
            return "Infantil";
        } else if (idade >= 8 && idade <= 10) {
            return "Juvenil";
        } else if (idade >= 11 && idade <= 15) {
            return "Adolescente";
        } else if (idade >= 16 && idade <= 30) {
            return "Adulto";
        } else if (idade > 30) {
            return "Sênior";
        } else {
            return "Sem categoria";
        }
    }

    // Imprime os dados do atleta
    public void imprimeDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Categoria: " + verificaCategoria());
    }
}
