package com.example;


public class Triangulo {
    private double base;
    private double altura;

    // Construtor padrão
    public Triangulo() {
        this.base = 0;
        this.altura = 0;
    }

    // Construtor com parâmetros
    public Triangulo(double base, double altura) {
        setBase(base);
        setAltura(altura);
    }

    // Getters e Setters com validação
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base > 0) {
            this.base = base;
        } else {
            System.out.println("Base deve ser maior que zero.");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Altura deve ser maior que zero.");
        }
    }

    // Cálculo da área
    public double calculaArea() {
        return (base * altura) / 2;
    }

    // Impressão dos dados
    public void imprimeDados() {
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calculaArea());
    }
}
