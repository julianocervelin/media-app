package mediaapp;

public class Aplicativo {

    public static void main(String[] args) {

        // Como crio uma variavel com meu nome
        Cachorro goku = new Cachorro();
        goku.latir();
        int torqueDaMordida = goku.morder();

        Calculadora calculadoraTop = new Calculadora();

        int valorSomado = calculadoraTop.somaDoisNumeros("3","2");

        System.out.println(torqueDaMordida);

        System.out.println("Meu cachorro sabe somar: " + valorSomado);
    }
}
