package exe3;

import java.util.Arrays;
import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler o tamanho do array
        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        // Ler o valor alvo
        System.out.print("Digite o valor alvo: ");
        int alvo = scanner.nextInt();

        // Criar o array com o tamanho informado
        int[] numeros = new int[tamanho];

        // Ler os elementos do array
        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < tamanho; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Chamar o método que conta os pares com diferença igual ao valor alvo
        int pares = contarParesComDiferenca(numeros, alvo);

        // Imprimir o resultado
        System.out.println("O número de pares com diferença igual a "
                + alvo + " é: " + pares);
    }

    private static int contarParesComDiferenca(int[] numeros, int alvo) {
        Arrays.sort(numeros); // Ordena o array em ordem crescente

        int pares = 0;
        int inicio = 0;
        int fim = 1;

        while (fim < numeros.length) {
            // Calcula a diferença entre os elementos nas posições fim e inicio
            int diferenca = numeros[fim] - numeros[inicio];

            // Se a diferença for igual ao valor alvo, incrementa o contador de pares
            // e avança as posições de inicio e fim
            if (diferenca == alvo) {
                pares++;
                inicio++;
                fim++;
            } 
            // Se a diferença for menor que o valor alvo, avança apenas a posição de fim
            else if (diferenca < alvo) {
                fim++;
            } 
            // Se a diferença for maior que o valor alvo, avança apenas a posição de inicio
            else {
                inicio++;
            }

            // Para evitar contar pares repetidos, verifica se as posições de inicio e fim são iguais
            // e caso sejam, avança a posição de fim
            if (inicio == fim) {
                fim++;
            }
        }

        return pares;
    }
}
