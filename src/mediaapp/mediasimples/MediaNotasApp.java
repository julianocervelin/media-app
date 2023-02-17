package mediaapp.mediasimples;

import java.util.Scanner;

public class MediaNotasApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MediaNotas mediaNotas = new MediaNotas();

        double provaInicial = 8.5;
        double provaFinal = 3.5;
        System.out.println("Digite sua nota de recuperacao");
        double recuperacao = sc.nextDouble();

        double resultado = mediaNotas.calcular(provaInicial, provaFinal, recuperacao);
        System.out.println(resultado);

        mediaNotas.imprimeResultado(resultado);
    }

    // Se media aluno maior ou igual que 6 => APROVADO
    // Se media aluno menor que 6 E maior ou igual que 4 => RECUPERACAO
    // Se media aluno menor que 4 => REPROVADO

    // 6 a 10 = APROVADO
    // 4 a 5.9 = RECUPERACAO
    // 0 a 3.9 = REPROVADO


}
