package org.kaly.algoritimos_avancados_2;

import java.util.ArrayList;
import java.util.List;

public class Backtracking {
    public static void main(String[] args) {
        int[] conjunto = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int n = 2;
        System.out.println("Subconjuntos de " + n + " elementos: " + calcularSubconjuntos(conjunto, n));
    }

    public static List<List<Integer>> calcularSubconjuntos(int[] conjunto, int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(conjunto, n, 0, current, result);
        return result;
    }

    private static void backtrack(int[] conjunto, int n, int start, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == n) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < conjunto.length; i++) {
            current.add(conjunto[i]);

            backtrack(conjunto, n, i + 1, current, result);

            current.remove(current.size() - 1);
        }
    }
}
