package br.com.dio.javaproject.loops;


    /*
    Exercício

    Faça um programa que peça uma nota entre 0 e 10, validando se o valor está neste range, caso não esteja peça
    novamente o valort até que um valor válido seja inserido.

     */

import java.util.Scanner;

public class NotaWhile {
    public static void main(String[] args) {

        System.out.println("Insira uma nota entre 0 e 10.");

        int nota = pedirNota();

        while (0 > nota || nota > 10){
            System.out.println("Nota inválida, somente valores entre 0 e 10");
            nota = pedirNota();
        }

        System.out.println("Nota " + nota);

    }

    public static int pedirNota(){

        int nota;

        System.out.println("Nota: ");
        Scanner scan = new Scanner(System.in);
        nota = scan.nextInt();

        return nota;
    }
}
