package br.com.dio.javaproject.loops;

import java.util.Scanner;

public class NomeIdadeWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int idade = 1;
        String nome = "1";

        while(!nome.equals("0")){
            System.out.println("Nome: ");
            nome = scan.next();
            System.out.println("Idade: ");
            idade = scan.nextInt();
        }


        System.out.println(nome + idade);

    }
}
