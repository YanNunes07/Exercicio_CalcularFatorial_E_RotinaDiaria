package views;

import model.Numero;

import java.util.Scanner;

public class TestNumero {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Numero n1 = new Numero();

        System.out.println("informe o numero para descobrir seu fatorial");
        n1.valor = ler.nextInt();

        System.out.println("Resultado"+n1.calcularFatorial());
    }
}
