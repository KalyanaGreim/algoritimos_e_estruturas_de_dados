package org.kaly.algoritimos_avancados;

import java.util.HashMap;

//Solução Top-down (Memorização): técnica conhecida como memorização,
// onde armazenamos os resultados intermediários para evitar cálculos repetidos.

public class SolucaoTopDown {
    private static HashMap<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        int numero1 = 3;
        int numero2 = 7;

        System.out.println("Fatorial de " + numero1 + ": " + calcularFatorialTopDown(numero1));
        System.out.println("Fatorial de " + numero2 + ": " + calcularFatorialTopDown(numero2));
    }

    public static int calcularFatorialTopDown(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        }

        if (memo.containsKey(numero)) {
            return memo.get(numero);
        }

        int resultado = numero * calcularFatorialTopDown(numero - 1);
        memo.put(numero, resultado);

        return resultado;
    }
}
