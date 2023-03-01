package mediaapp;

import java.util.Scanner;

public class Entregas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Selecione o tipo de entrega: ");
        System.out.printf("Escreva %s para NORMAL\n","n");
        System.out.printf("Escreva %s para SEDEX\n","s");
        System.out.printf("Escreva %s para SEDEX10\n","x");
        System.out.printf("Escreva %s para sair\n","sair");

        String tipoEntrega = sc.nextLine();

        System.out.println(tipoEntrega);

      //  boolean continuaRodando = true;

//        while(true) {
//
//            if (tipoEntrega.equals("sair")) {
//                break;
//            } else {
//                switch (tipoEntrega) {
//                    case "n" -> System.out.println("NORMAL");
//                    case "s" -> System.out.println("SEDEX");
//                    case "x" -> System.out.println("SEDEX1O");
//                    default -> System.out.println("Opcao invalida!");
//                }
//                System.out.println("Selecione o tipo de entrega: ");
//                System.out.printf("Escreva %s para NORMAL\n","n");
//                System.out.printf("Escreva %s para SEDEX\n","s");
//                System.out.printf("Escreva %s para SEDEX10\n","x");
//                System.out.printf("Escreva %s para sair\n","sair");
//                tipoEntrega = sc.nextLine();
//            }
//
//        }



    }


}
