package org.kaly.estruturas;

public class HashMap {
    private final int size = 10;
    private Node[] table;

    public HashMap() {
        table = new Node[size];
    }

    public void put(int key, int value) {
        int index = hashFunction(key);

        if (table[index] == null) {
            table[index] = new Node(key, value);
        } else {
            Node current = table[index];
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(key, value);
        }
    }

    public void delete(int key) {
        int index = hashFunction(key);

        if (table[index] == null) {
            System.out.println("Chave não encontrada.");
            return;
        }

        if (table[index].key == key) {
            table[index] = table[index].next;
            return;
        }

        Node current = table[index];
        Node previous = null;

        while (current != null && current.key != key) {
            previous = current;
            current = current.next;
        }

        if (current != null) {
            previous.next = current.next;
        } else {
            System.out.println("Chave não encontrada.");
        }
    }

    public int get(int key) {
        int index = hashFunction(key);

        Node current = table[index];
        while (current != null) {
            if (current.key == key) {
                return current.value;
            }
            current = current.next;
        }

        System.out.println("Chave não encontrada.");
        return -1;
    }

    public void clear() {
        table = new Node[size];
    }

    private int hashFunction(int key) {
        // Número primo escolhido para o tamanho da tabela hash
        int primeNumber = 17;
        return Math.abs(key % primeNumber);
    }
}
