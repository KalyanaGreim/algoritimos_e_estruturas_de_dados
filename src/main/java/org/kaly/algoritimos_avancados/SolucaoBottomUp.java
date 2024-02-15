package org.kaly.algoritimos_avancados;

//Solução Bottom-up:calculamos os resultados menores primeiro
// e usamos esses resultados para calcular os maiores, evitando a recursão.
public class SolucaoBottomUp {
    public static void main(String[] args) {
        int numero1 = 3;
        int numero2 = 7;

        System.out.println("Fatorial de " + numero1 + ": " + calcularFatorialBottomUp(numero1));
        System.out.println("Fatorial de " + numero2 + ": " + calcularFatorialBottomUp(numero2));
    }

    public static int calcularFatorialBottomUp(int numero) {
        int[] dp = new int[numero + 1];
        dp[0] = 1;

        for (int i = 1; i <= numero; i++) {
            dp[i] = i * dp[i - 1];
        }

        return dp[numero];
    }
}
