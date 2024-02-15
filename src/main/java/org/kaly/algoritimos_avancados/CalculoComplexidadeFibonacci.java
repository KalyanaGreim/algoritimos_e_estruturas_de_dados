package org.kaly.algoritimos_avancados;

public class CalculoComplexidadeFibonacci {
    //Complexidade de Tempo:
    //
    //Solução Recursiva (Exponencial):
    //
    //A complexidade de tempo é aproximadamente O(2^n), onde n é o índice desejado na sequência de Fibonacci.
    //Cada chamada recursiva gera duas chamadas subsequentes, levando a um crescimento exponencial no número
    // total de chamadas.
    //
    //Solução com Programação Dinâmica (Bottom-up):
    //
    //A complexidade de tempo é O(n), onde n é o índice desejado na sequência de Fibonacci.
    //A abordagem bottom-up calcula e armazena os resultados intermediários em uma tabela,
    // eliminando a necessidade de recálculos e reduzindo a complexidade.
    //
    //Por que a solução com programação dinâmica é melhor?
    //
    //A solução com programação dinâmica é mais eficiente devido a algumas razões:
    //
    //Redução de Recálculos:
    //
    //Na solução dinâmica, os resultados intermediários são armazenados em uma tabela, evitando recálculos. Isso reduz a quantidade total de operações necessárias.
    //Complexidade Linear:
    //
    //A solução bottom-up tem uma complexidade de tempo linear, O(n), o que é muito mais eficiente do que a solução recursiva exponencial, especialmente para valores de n significativamente grandes.
    //Melhor Utilização de Recursos:
    //
    //A solução dinâmica utiliza eficientemente a memória para armazenar resultados intermediários, enquanto a solução recursiva exponencial pode levar a um estouro de pilha para valores grandes de n.
    //Evita Problemas de Stack Overflow:
    //
    //A solução dinâmica evita o risco de estouro de pilha (Stack Overflow), que é um problema comum em abordagens recursivas para cálculos de Fibonacci com grandes valores de n.
    //Em resumo, a programação dinâmica proporciona uma melhoria significativa na eficiência ao evitar recálculos desnecessários e otimizar a utilização de recursos.
}
