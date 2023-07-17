package exe2;
import java.util.Scanner;

public class exe2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ler o valor monetário
        double valor = sc.nextDouble();

        // Definir os valores das notas e moedas possíveis
        int[] notas = {100, 50, 20, 10, 5, 2};
        double[] moedas = {1, 0.50, 0.25, 0.10, 0.05, 0.01};

        // Imprimir a mensagem inicial
        System.out.println("NOTAS:");

        // Para cada valor de nota
        for (int nota : notas) {
            // Calcular a quantidade de notas necessárias
            int quantidade = (int) (valor / nota);

            // Imprimir a quantidade e o valor da nota
            System.out.println(quantidade + " nota(s) de R$ " + nota + ".00");

            // Atualizar o valor restante
            valor = valor % nota;
        }

        // Imprimir a mensagem inicial
        System.out.println("MOEDAS:");

        // Para cada valor de moeda
        for (double moeda : moedas) {
            // Calcular a quantidade de moedas necessárias
            int quantidade = (int) (valor / moeda);

            // Imprimir a quantidade e o valor da moeda
            System.out.println(quantidade + " moeda(s) de R$ " + String.format("%.2f", moeda));

            // Atualizar o valor restante
            valor = valor % moeda;
        }
    }
}
