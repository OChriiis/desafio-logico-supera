package exe4;

import java.util.Scanner;

public class exe4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // ler o número de casos de teste
        sc.nextLine(); // consumir a quebra de linha
        for (int i = 0; i < N; i++) {
            String frase = sc.nextLine(); // ler a frase embaralhada
            String desembaralhada = desembaralhar(frase); // desembaralhar a frase
            System.out.println(desembaralhada); // imprimir a frase desembaralhada
        }
        sc.close();
    }

    // método que desembaralha uma frase conforme a especificação
    public static String desembaralhar(String frase) {
        int n = frase.length(); // tamanho da frase
        int meio = n / 2; // posição do meio da frase
        StringBuilder sb = new StringBuilder(); // construtor de string
        for (int i = 0; i < meio; i++) {
            sb.append(frase.charAt(meio - i - 1)); // adicionar o caractere da metade esquerda na ordem inversa
            sb.append(frase.charAt(n - i - 1)); // adicionar o caractere da metade direita na ordem inversa
        }
        return sb.toString(); // retornar a string construída
    }
}
