package mediaapp.mediasimples;

import java.util.Scanner;

public class RefeicaoMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro acompanhamento");
        String acompanhamento1 = scanner.next();
        System.out.println("Digite o segundo acompanhamento");
        String acompanhamento2 = scanner.next();
        System.out.println("Digite o teirceiro acompanhamento");
        String acompanhamento3 = scanner.next();

        // criar array de acompanhamentos
        String[] acompanhamentos = {
                acompanhamento1,
                acompanhamento2,
                acompanhamento3
        };

        System.out.println("Tamanho do array: " + acompanhamentos.length);

        System.out.println(acompanhamentos);

      //  imprimeArrayAlunos();

    }

    public static void imprimeArrayAlunos(String[] acompanhamentos) {
        // for enhanced aprimorado
        int tamanhoArray = acompanhamentos.length;

        for (int indice = 0;
             indice < tamanhoArray;
             indice++) {
            System.out.println(acompanhamentos[indice]);
        }

        int indice = 0;
        while (indice < tamanhoArray) {
            System.out.println(acompanhamentos[indice]);
            indice++;
        }

        for (String a : acompanhamentos) {
            System.out.println(a);
        }

    }

}
