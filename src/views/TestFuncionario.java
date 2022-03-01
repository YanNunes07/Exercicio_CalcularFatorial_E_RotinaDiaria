package views;

import model.Funcionario;

import java.util.Scanner;

public class TestFuncionario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Funcionario f1 = new Funcionario();

        System.out.println("Nome");
        f1.setNome(ler.nextLine());

        System.out.println("Idade");
        f1.setIdade(ler.nextInt());

        while (f1.getIdade()<18){
            System.out.println("Digite uma idade valida");
            System.out.println("Digite sua idade");
            f1.setIdade(ler.nextInt());
        }
        System.out.println(f1);
    }
}
