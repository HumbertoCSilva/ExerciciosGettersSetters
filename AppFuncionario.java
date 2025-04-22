package com.example;

public class AppFuncionario {
    public static void main(String[] args) {
        //sem parametros
        Funcionario f1 = new Funcionario();
        f1.setCracha(100);
        f1.setSalario(1000.0f);
        f1.setCargo("Gerente");

        System.out.println("Func. 01:/n");
        System.out.println("Crachá: " + f1.getCracha());
        System.out.println("Salário: R$ " + f1.getSalario());
        System.out.println("Cargo: " + f1.getCargo());

        f1.calculaAumento(1);
        System.out.println("Salário após aumento por tempo: " + f1.getSalario());
        f1.calculaAumento(10.0f);
        System.out.println("Salario após aumento por %: R$ " + f1.getSalario());



        //usando o construtor com parametros
        Funcionario f2 = new Funcionario(200,1000.0f,"Auxiliar");
        System.out.println("Func. 02:/n ");
        System.out.println("Crachá: " + f2.getCracha());
        System.out.println("Salário: " + f2.getSalario());
        System.out.println("Cargo: " + f2.getCargo());

        f2.calculaAumento(1);
        System.out.println("Salário após aumento por tempo: " + f2.getSalario());
        f2.calculaAumento(20.0f);
        System.out.println("Salário após aumento por porcentagem: R$ " + f2.getSalario());
    }
}
