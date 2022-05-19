package br.com.dio.javaproject.loops;

import java.util.Scanner;

public class MaiorEMediaFor {


    public static void start(){
        System.out.println("Entre com 5 números.");

        int numero;
        int maiorNumero = 0;
        int soma = 0;

        for (int i = 0; i <= 4; i++){

            numero = lerNumero();
            soma += numero;

            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }

        int media = calcularMedia(soma);

        System.out.println("Media:" + media);
        System.out.println("Maior numero:" + maiorNumero);
    }

    private static int lerNumero(){
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número.");

        numero = scan.nextInt();

        return numero;

    }
    private static int calcularMedia(int soma){

        return soma / 5;

    }



}
