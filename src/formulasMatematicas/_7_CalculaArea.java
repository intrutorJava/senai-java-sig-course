package formulasMatematicas;

import java.util.Scanner;

/*
    Escreva um programa que calcule e exiba a área de um círculo, a partir do raio, utilizando a fórmula A =
*/
public class _7_CalculaArea {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        double area =Math.PI * Math.pow(raio, 2);

        System.out.println("O perímetro do circulo é: " + area);

        scanner.close();
    }
}
