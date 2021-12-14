import java.time.LocalTime;

public class Metodos {
    public static void main(String[] args) {

        // Uso do método saudacao().
        LocalTime hora = LocalTime.now();
        System.out.println(saudacao(hora));

        // Uso do método somar(), subtrair(), multiplicar() e dividir().
        System.out.println(somar(2, 3));
        System.out.println(subtrair(2, 3));
        System.out.println(multiplicar(2, 3));
        System.out.println(dividir(2, 3));

        // Uso do método emprestimoFinal().
        System.out.println(emprestimoFinal(1000.00, 5));
    }

    public static int somar(int a, int b) {
        /*
        Retorna a soma dos dois parâmetros.
         */
        return a + b;
    }

    public static int subtrair(int a, int b) {
        /*
        Retorna a subtração dos dois parâmetros.
         */
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        /*
        Retorna a multiplicação dos dois parâmetros.
         */
        return a * b;
    }

    public static int dividir(int a, int b) {
        /*
        Retorna a divisão dos dois parâmetros.
         */
        return a / b;
    }

    public static String saudacao(LocalTime time) {
        /*
        Retorna uma saudação de acordo com a hora dada
         */
        if (time.getHour() > 7 && time.getHour() <= 12) {
            return "Bom Dia!";
        } else if (time.getHour() > 12 && time.getHour() <= 18) {
            return "Boa Tarde";
        } else {
            return "Boa Noite";
        }
    }

    public static double emprestimoFinal(double valor, int parcela) {
        /*
        Retorna o cálculo do empréstimo.
         */
        double taxa = 0.53;
        double valorJuros = (valor * taxa) / parcela;
        return valor + valorJuros;
    }
}
