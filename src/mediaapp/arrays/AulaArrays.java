package mediaapp.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AulaArrays {
    public static void main(String[] args) {

        // Caracteristicas do array no java
        // A quantidade deve ser informada na CRIACAO do array

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de nomes:");
        int quantidade = scanner.nextInt();

        String[] arrayNomes = new String[quantidade];

        String[] meuArrayStrings = {"A" , "B" , "C"};

        int[] meuArrayInteiro = {
                9,
                5,
                2
        };


        String[][] meuDicionario = {
                { "Abacate" , "Aveia"     , null  },
                { "Boteco"  , "Bola"      , "Balde" },
                { "Casa"    , "Coca-cola" , "Carro" },
                { "Delta"   , "Domino"    , "Dado"  }
        };





        int contador = 0;
        while (quantidade > contador) {
            System.out.println("Deseja incluir mais um nome? S ou N");
            String sair = scanner.next();
            if ("N".equals(sair)) {
                break;
            }

            System.out.println("Digite um nome:");
            String nome = scanner.next();

            arrayNomes[contador] = nome;
            contador++;
        }

        System.out.println(Arrays.toString(arrayNomes));




    }


}
