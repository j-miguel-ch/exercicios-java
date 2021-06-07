/** @author José Miguel Gana Altamirano, 07/06/2021
 * Classe Principal e criação de instâncias propostas
 */

public class Principal {
    public static void main(String[] args) {
        Paciente p1 = new Paciente();
        p1.quilos = 60;
        p1.altura = 1.65;
        p1.calcularIMC();
        p1.diagnostico();

        Paciente p2 = new Paciente();
        p2.quilos = 75;
        p2.altura = 1.79;
        p2.calcularIMC();
        p2.diagnostico();

        Paciente p3 = new Paciente();
        p3.quilos = 101;
        p3.altura = 1.89;
        p3.calcularIMC();
        p3.diagnostico();

        System.out.println("IMC paciente 1 é: " + p1.imc);
        p1.imprimir();

        System.out.println("IMC paciente 2 é: " + p2.imc);
        p2.imprimir();

        System.out.println("IMC paciente 3 é: " + p3.imc);
        p3.imprimir();


    }
}
