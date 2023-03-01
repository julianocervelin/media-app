package mediaapp.erros;

public class TratamentoErros {
    public static void main(String[] args) {
        Object numero1 = "Juliano";
        Object numero2 = 0.0;

        try {
            divisao((double)numero1, (double)numero2);
        } catch (InterruptedException e) {
            System.out.println("Houve um problema tecnico. Tente mais tarde.");
        }
    }

    private static void divisao(double numero1, double numero2) throws InterruptedException {

        Thread.sleep(1000L);

        double resultado = numero1 / numero2;
        System.out.println(resultado);
    }


}
