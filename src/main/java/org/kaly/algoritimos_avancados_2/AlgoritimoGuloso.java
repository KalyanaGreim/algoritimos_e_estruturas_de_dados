package org.kaly.algoritimos_avancados_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlgoritimoGuloso {
    public static void main(String[] args) {
        int quantia = 18;
        int[] moedasDisponiveis = {5, 2, 1};

        List<Integer> resultado = darTroco(quantia, moedasDisponiveis);

        System.out.println("Troco para " + quantia + ": " + resultado);
    }

    public static List<Integer> darTroco(int quantia, int[] moedasDisponiveis) {
        List<Integer> troco = new ArrayList<>();

        List<Integer> moedasOrdenadas = new ArrayList<>();
        for (int moeda : moedasDisponiveis) {
            moedasOrdenadas.add(moeda);
        }
        Collections.sort(moedasOrdenadas, Collections.reverseOrder());

        for (int moeda : moedasOrdenadas) {
            while (quantia >= moeda) {
                troco.add(moeda);
                quantia -= moeda;
            }
        }

        return troco;
    }
}
