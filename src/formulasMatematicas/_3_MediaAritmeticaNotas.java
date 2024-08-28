package formulasMatematicas;

import java.util.Scanner;

/*
    Crie um programa que calcule e exiba a média aritmética de três notas informadas pelo usuário
*/
public class _3_MediaAritmeticaNotas {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double numero3 = scanner.nextDouble();

        double media = (numero1 + numero2 + numero3) / 3;

        System.out.println("A média das notas é: " + media);

        scanner.close();
    }
}
