package com.example;

public class Pessoa {

    // Atributos
    private String nome;
    private int idade;

    // Métodos acessores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome !=null  &&  !nome.isBlank()) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException(
                    "O nome não pode estar em branco.");

        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            throw new IllegalArgumentException(
                    "A idade não pode ser negativa." + idade);
        }
    }

    // Construtores
    public Pessoa(String nome, int idade){
        setNome(nome);
        setIdade(idade);
    }
    public Pessoa(){
        this("Nome a definir", 0);
        
    }

}
