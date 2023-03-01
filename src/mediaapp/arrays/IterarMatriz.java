package mediaapp.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class IterarMatriz {

    public static void main(String[] args) {
//        int[] array = {
//                5,
//                3,
//                1,
//                3
//        };
//        System.out.println("imprimindo array");
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Iteracao " + (i+1) + " " + array[i]);
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Digite a quantidade de linhas");
//        int qtdLinhas = 3;
//        System.out.println("Digite a quantidade de colunas");
//        int qtdColunas = 4;
//
//        int[][] minhaMatrix = new int[qtdLinhas][qtdColunas];
//
//        for (int linha = 0; linha < minhaMatrix.length; linha++) {
//            for (int coluna = 0; coluna < minhaMatrix[linha].length; coluna++) {
//                System.out.println("Digite um valor");
//                minhaMatrix[linha][coluna] = sc.nextInt();
//            }
//        }


        int[][] matrix = {
                {5, 7, 3, 6},
                {3, 2, 9, 8},
                {1, 7, 2, 5}
        };

        int[][] matrixSquared = {
                {5, 7, 3},
                {3, 2, 9},
                {1, 7, 2}
        };


        System.out.println("imprimindo matrix");
        imprimirMatrix(matrix);

        for (int linha = 0; linha < matrix.length; linha++) {
            for (int coluna = 0; coluna < matrix[linha].length; coluna++) {
                if (matrix[linha][coluna] % 2.0 != 0) {
                    matrix[linha][coluna] = 0;
                }
            }
        }
        System.out.println("imprimindo matrix modificada");
        imprimirMatrix(matrix);

    }

    private static void imprimirMatrix(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
    }
}
