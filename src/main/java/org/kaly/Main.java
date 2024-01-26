package org.kaly;

import org.kaly.estruturas.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("EXERCICIO 1: Implemente uma pilha");
        Pilha pilha = new Pilha(5);

        System.out.println("A pilha está vazia? " + pilha.isEmpty());

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.println("Topo da pilha: " + pilha.top());
        System.out.println("Tamanho da pilha: " + pilha.size());

        System.out.println("Removendo o topo da pilha: " + pilha.pop());

        System.out.println("Topo da pilha após remoção: " + pilha.top());
        System.out.println("Tamanho da pilha após remoção: " + pilha.size());

        System.out.println("EXERCICIO 2: Implemente uma fila FIFO");

        Fila fila = new Fila(5);

        System.out.println("A fila está vazia? " + fila.isEmpty()); // true

        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);

        System.out.println("Frente da fila: " + fila.front());
        System.out.println("Final da fila: " + fila.rear());
        System.out.println("Tamanho da fila: " + fila.size());

        System.out.println("Removendo da frente da fila: " + fila.dequeue());

        System.out.println("Frente da fila após remoção: " + fila.front());
        System.out.println("Tamanho da fila após remoção: " + fila.size());

        System.out.println("EXERCICIO 3: Implemente uma lista encadeada");

        ListaEncadeada lista = new ListaEncadeada();

        lista.push(new Node(10));
        lista.push(new Node(20));
        lista.push(new Node(30));

        System.out.print("Lista: ");
        lista.printList();

        System.out.println("Tamanho da lista: " + lista.size());

        lista.insert(1, new Node(15));

        System.out.print("Lista após inserção: ");
        lista.printList();

        lista.remove(2);

        System.out.print("Lista após remoção: ");
        lista.printList();

        System.out.println("Tamanho da lista: " + lista.size());

        Node element = lista.elementAt(1);
        System.out.println("Elemento na posição 1: " + element.data);

        System.out.println("EXERCICIO 4: Complexidades assintóticas de tempo e espaço");
        System.out.println();
        System.out.println("Pilha:\n" +
                "Método push: O tempo de execução é constante O(1), pois adicionamos elementos ao topo da pilha. O espaço é O(1) porque não usamos espaço adicional em relação ao número de elementos.\n" +
                "\n" +
                "Método pop: O tempo de execução é constante O(1), pois removemos elementos do topo da pilha. O espaço é O(1) porque não usamos espaço adicional em relação ao número de elementos.\n" +
                "\n" +
                "Fila:\n" +
                "Método enqueue: O tempo de execução é constante O(1), pois adicionamos elementos ao final da fila. O espaço é O(1) porque não usamos espaço adicional em relação ao número de elementos.\n" +
                "\n" +
                "Método dequeue: O tempo de execução é constante O(1), pois removemos elementos do início da fila. O espaço é O(1) porque não usamos espaço adicional em relação ao número de elementos.\n" +
                "\n" +
                "Método rear: O tempo de execução é constante O(1), pois retornamos o elemento no final da fila. O espaço é O(1) porque não usamos espaço adicional em relação ao número de elementos.\n" +
                "\n" +
                "Método front: O tempo de execução é constante O(1), pois retornamos o elemento no início da fila. O espaço é O(1) porque não usamos espaço adicional em relação ao número de elementos.\n" +
                "\n" +
                "Lista Encadeada:\n" +
                "Método push: O tempo de execução é O(n), onde n é o número de elementos na lista, pois precisamos percorrer toda a lista para encontrar o último nó. O espaço é O(1), pois apenas adicionamos um novo nó.\n" +
                "\n" +
                "Método pop: O tempo de execução é O(n), onde n é o número de elementos na lista, pois precisamos percorrer toda a lista para chegar ao último nó. O espaço é O(1), pois não usamos espaço adicional em relação ao número de elementos.\n" +
                "\n" +
                "Método insert: O tempo de execução é O(n), onde n é a posição de inserção, pois precisamos percorrer a lista até a posição desejada. O espaço é O(1), pois apenas adicionamos um novo nó.\n" +
                "\n" +
                "Método remove: O tempo de execução é O(n), onde n é a posição de remoção, pois precisamos percorrer a lista até a posição desejada. O espaço é O(1), pois não usamos espaço adicional em relação ao número de elementos.\n" +
                "\n" +
                "Método elementAt: O tempo de execução é O(n), onde n é a posição do elemento desejado, pois precisamos percorrer a lista até a posição desejada. O espaço é O(1), pois não usamos espaço adicional em relação ao número de elementos.");

        System.out.println("EXERCICIO 5: Desafio – Implemente um mapa de hash do zero");
        System.out.println("O número primo é uma escolha comum para o tamanho da tabela hash, pois ajuda a minimizar colisões e distribui de forma mais uniforme as chaves ao longo da tabela.");
        HashMap map = new HashMap();

        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);

        System.out.println("Valor associado à chave 2: " + map.get(2)); // 20

        map.delete(2);

        System.out.println("Valor associado à chave 2 após exclusão: " + map.get(2)); // Chave não encontrada.

        map.clear();

        System.out.println("Valor associado à chave 1 após limpar o mapa: " + map.get(1));
    }


}