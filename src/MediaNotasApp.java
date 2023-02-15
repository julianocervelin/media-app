public class MediaNotasApp {

    public static void main(String[] args) {

        MediaNotas mediaNotas = new MediaNotas();

        double provaInicial = 8.5;
        double provaFinal = 3.5;
        double recuperacao = 7.0;

        double resultato = mediaNotas.calcular(provaInicial, provaFinal, recuperacao);
        System.out.println(resultato);
    }
}
