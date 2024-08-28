package formulasMatematicas;

import java.util.Scanner;

/*
    Escreva um programa que calcule e exiba o IMC de um individuo utilizando a fórmula  IMC= peso/altura
*/
public class _5_CalculaIMC {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso em quilogramas: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("O IMC é: " + imc);

        scanner.close();
    }
}
