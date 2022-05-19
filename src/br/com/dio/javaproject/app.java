package br.com.dio.javaproject;

import br.com.dio.javaproject.loops.AddUser;
import br.com.dio.javaproject.loops.MaiorEMediaFor;

import java.util.Scanner;

public class app {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int opcao;
        boolean quitApp = false;




        while (!quitApp){

            System.out.println("Selecione uma das opcoes \n 1-Adicionar Usuario 2-Executar APP Maior e Media " +
                    "3-Encerrar");
            opcao = scan.nextInt();

            switch (opcao){
                case 1:
                    AddUser.AddUser();
                    break;

                case 2:
                    MaiorEMediaFor.start();
                    break;

                case 3:
                    System.out.println("Encerrando o programa.");
                    quitApp = true;
                    break;

                default:
                    System.out.println("Opcao invalida, tente novamente.\n");
                    break;
            }

        }

    }
}
