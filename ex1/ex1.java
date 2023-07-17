package exe1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exe1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // ler o número de valores a serem lidos
        ArrayList<Integer> pares = new ArrayList<>(); // lista para armazenar os valores pares
        ArrayList<Integer> impares = new ArrayList<>(); // lista para armazenar os valores ímpares
        for (int i = 0; i < N; i++) {
            int valor = sc.nextInt(); // ler um valor
            if (valor % 2 == 0) { // se o valor for par
                pares.add(valor); // adicionar à lista de pares
            } else { // se o valor for ímpar
                impares.add(valor); // adicionar à lista de ímpares
            }
        }
        sc.close();
        Collections.sort(pares); // ordenar a lista de pares em ordem crescente
        Collections.sort(impares, Collections.reverseOrder()); // ordenar a lista de ímpares em ordem decrescente
        for (int par : pares) { // para cada valor par na lista de pares
            System.out.println(par); // imprimir o valor
        }
        for (int impar : impares) { // para cada valor ímpar na lista de ímpares
            System.out.println(impar); // imprimir o valor
        }
    }
}