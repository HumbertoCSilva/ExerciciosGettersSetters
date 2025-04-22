package com.example;

public class Funcionario {

    // atributos
    private int cracha;
    private float salario;
    private String cargo;


     //construtor sem parametros
     public Funcionario(){
        this( 0, 0.0f , "cargo à definir" );
    }

    // construtor com parametros
    public Funcionario(int cracha, float salario, String cargo){
        setCracha(cracha);
        setSalario(salario);
        setCargo(cargo);
    }



    // metodos acessores
    public int getCracha() {
        return cracha;

    }


    public void setCracha(int cracha) {
        if (cracha >= 0) {
            this.cracha = cracha;
        } else {
            throw new IllegalArgumentException(
                    "O crachá não pode estar em branco.");

        }

    }

    public float getSalario() {
        return salario;

    }

    public void setSalario(float salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            throw new IllegalArgumentException(
                    "O salário não pode ser negativo ou zero.");

        }

    }

    public String getCargo( ) {
        return cargo;

    }

    public void setCargo(String cargo) {
        if (cargo !=null  &&  !cargo.isBlank()) {
            this.cargo = cargo;
        } else {
            throw new IllegalArgumentException(
                    "O cargo não não pode estar em branco.");

        }

    }
   

    //calcula o aumento salarial aplicando o %
    public float calculaAumento(float porcentagem) {
        if (porcentagem <= 0) {
            throw new IllegalArgumentException("A porcentagem deve ser positiva");
        }
        float aumento = this.salario * (porcentagem / 100);
        this.salario += aumento;
        return aumento;
    }

    //calcula aumento salarial somando 150,00 para cada ano trabalhado
    public float calculaAumento(int tempo) {
        if (tempo <= 0) {
            throw new IllegalArgumentException("O tempo deve ser positivo");
        }
        float aumento = tempo * 150.0f;
        this.salario += aumento;
        return aumento;
    }
}