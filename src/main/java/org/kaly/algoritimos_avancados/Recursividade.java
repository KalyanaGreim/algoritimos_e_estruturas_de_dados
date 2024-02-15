package org.kaly.algoritimos_avancados;

//resolve o problema do cálculo do fatorial em Java sem usar programação dinâmica,
// utilizando uma abordagem recursiva

//
public class Recursividade {

    public static void main(String[] args) {
        int numero1 = 3;
        int numero2 = 7;
        System.out.println("Exercício 1 – Resolva o problema usando recursão");

        System.out.println("Fatorial de " + numero1 + ": " + calcularFatorial(numero1));
        System.out.println("Fatorial de " + numero2 + ": " + calcularFatorial(numero2));

        System.out.println("Neste código, a função calcularFatorial é recursiva e calcula " +
                "o fatorial de um número. Se o número é 0 ou 1, " +
                "retorna 1 (caso base), caso contrário, calcula o fatorial multiplicando o número " +
                "pelo fatorial do número anterior.\n" +
                "\n" +
                "Quanto à questão de calcular o fatorial de um número acima de 100 com uma solução recursiva, " +
                "é importante mencionar que o cálculo de fatorial para números muito grandes pode " +
                "levar a estouro de pilha devido à profundidade excessiva das chamadas recursivas." +
                " Isso ocorre porque cada chamada recursiva consome espaço na pilha de execução. " +
                "Para lidar com fatoriais de números grandes, seria mais apropriado considerar " +
                "soluções iterativas ou outras estratégias de otimização, pois a recursão pode " +
                "não ser eficiente em tais casos.");
    }

    public static int calcularFatorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero * calcularFatorial(numero - 1);
        }
    }
}
