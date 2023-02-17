package mediaapp.mediasimples;

public class MediaNotas {

    final double MEDIA_MINIMA = 6.0;
    final double MEDIA_MINIMA_RECUPERACAO = 4.0;

    // CONSULTE O https://class.letscode.com.br/
    // em Funcoes

    // Crie o metodo/funcao calcular com 3 argumentos
    // dentro do novo metodo, calcule a media
    // retorne o resultado da media
    public double calcular(double provaInicial, double provaFinal, double recuperacao) {
        return (provaInicial + provaFinal + recuperacao) / 3;
    }

    public void imprimeResultado(double resultado) {
        if (resultado >= 6.0) {
            System.out.println("APROVADO");
        } else if (resultado < 6.0 && resultado >= 4.0) {
            System.out.println("RECUPERACAO");
        } else if (resultado < 4.0) {
            System.out.println("REPROVADO");
        }
    }
}
