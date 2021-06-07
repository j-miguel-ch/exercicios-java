/* Criação de construtor e métodos calcularIMC(), diagnostico() e imprimir() */

public class Paciente {

    double quilos;
    double altura;
    double imc;

    void calcularIMC(){
        imc = (quilos)/(altura * altura);
    }

    double diagnostico(){
        return imc;
    }
    void imprimir(){
        if (imc < 16) {
            System.out.println("Baixo peso muito grave = IMC abaixo de 16 kg/m² \n");
        }
        if (imc >= 16 && imc <= 16.99) {
            System.out.println("Baixo peso grave = IMC entre 16 e 16,99 kg/m² \n");
        }
        if (imc >= 17 && imc <= 18.49) {
            System.out.println("Baixo peso = IMC entre 17 e 18,49 kg/m² \n");
        }
        if (imc >= 18.50 && imc <= 24.99) {
            System.out.println("Peso normal = IMC entre 18,50 e 24,99 kg/m² \n");
        }
        if (imc >= 25 && imc <= 29.99) {
            System.out.println("Sobrepeso = IMC entre 25 e 29,99 kg/m² \n");
        }
        if (imc >= 30 && imc <= 34.99) {
            System.out.println("Obesidade grau I = IMC entre 30 e 34,99 kg/m² \n");
        }
        if (imc >= 35 && imc <= 39.99) {
            System.out.println("Obesidade grau II = IMC entre 35 e 39,99 kg/m² \n");
        }
        if (imc >= 40) {
            System.out.println("Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m² \n");
        }
    }
}

