package mediaapp.mediaponderada;

public class MediaPonderadaNotas {

    public double calcular(double provaInicial, double provaFinal, double provaSemestral,
                           double pesoPInicial, double pesoPfinal, double pesoPSemestral) {
        double resultado =
                (
                        (provaInicial*pesoPInicial) + (provaFinal*pesoPfinal) + (provaSemestral*pesoPSemestral)
                );
        return resultado;
    }
}
