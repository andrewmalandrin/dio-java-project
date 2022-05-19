package br.com.dio.javaproject.loops;

import java.util.Date;
import java.util.Scanner;

import br.com.dio.javaproject.loops.User;

public class AddUser {

    public static void AddUser(){
        Scanner scan = new Scanner(System.in);

        String username, fullName, age, opcaoString;
        int opcao;
        boolean exit = false;

        do {



            System.out.println("Nome completo: ");
            fullName = scan.nextLine();

            System.out.println("Nome de usuario: ");
            username = scan.nextLine();

            System.out.println("Idade: ");
            age = scan.nextLine();


            User user = new User(username, fullName, Integer.parseInt(age));

            System.out.println("Usuario adicionado: \n");
            System.out.println("Nome: " + user.getFullName());
            System.out.println("Nome de usuario: " + user.getUsername());
            System.out.println("Idade: " + user.getAge());

            System.out.println("Adicionar outro usuario?\n1-Sim 2-Nao");
            opcaoString = scan.nextLine();
            opcao = Integer.parseInt(opcaoString);

            while(opcao == 2 || opcao == 1){

                if(opcao == 1){
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    break;
                } else if (opcao == 2) {
                    System.out.println("Saindo");
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    exit = true;
                    break;

                } else {
                    System.out.println("Opcao invalida, tente novamente");
                }

            }




        }while(!exit);


    }
}
