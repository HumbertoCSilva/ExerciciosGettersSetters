
package com.example.ExerciciosGettersSetters;

public class Vendedor {
     private float vendas;
    private float salario;
    private String nome;
    private int falta;

    // Construtor
    public Vendedor(float v, float s, String n, int f) {
        setVendas(v);
        setSalario(s);
        setNome(n);
        setFalta(f);
    }

    // Getters e Setters com validação
    public float getVendas() {
        return vendas;
    }

    public void setVendas(float vendas) {
        if (vendas >= 0) {
            this.vendas = vendas;
        } else {
            System.out.println("Valor de vendas inválido.");
        }
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("Salário deve ser maior que zero.");
        }
    }

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

    public int getFalta() {
        return falta;
    }

    public void setFalta(int falta) {
        if (falta >= 0) {
            this.falta = falta;
        } else {
            System.out.println("Número de faltas inválido.");
        }
    }

    // Método calcularComissao
    public float calcularComissao() {
        if (vendas >= 1000 && vendas < 2000) {
            return vendas * 0.10f;
        } else if (vendas >= 2000) {
            return vendas * 0.15f;
        }
        return 0f;
    }

    // Método descontoFalta
    public float descontoFalta() {
        return (salario / 30) * falta;
    }

    // Método calcularSalario
    public float calcularSalario() {
        return salario + calcularComissao() - descontoFalta();
    }

    // Método imprimirDados
    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Vendas: R$ " + vendas);
        System.out.println("Salário base: R$ " + salario);
        System.out.println("Faltas: " + falta);
        System.out.println("Comissão: R$ " + calcularComissao());
        System.out.println("Desconto por falta: R$ " + descontoFalta());
        System.out.println("Salário final: R$ " + calcularSalario());
    }
}
