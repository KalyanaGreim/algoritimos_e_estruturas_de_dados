package org.kaly.estruturas;


public class ListaEncadeada {
    private Node head;
    private int size;

    public ListaEncadeada() {
        this.head = null;
        this.size = 0;
    }

    public void push(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
        size++;
    }

    public Node pop() {
        if (head == null) {
            System.out.println("Lista vazia. Não é possível remover.");
            return null;
        }

        Node current = head;
        Node previous = null;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }

        if (previous != null) {
            previous.next = null;
        } else {
            head = null;
        }

        size--;
        return current;
    }

    public void insert(int index, Node node) {
        if (index < 0 || index > size) {
            System.out.println("Índice inválido. Não é possível inserir.");
            return;
        }

        if (index == 0) {
            node.next = head;
            head = node;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
        }

        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Índice inválido. Não é possível remover.");
            return;
        }

        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            Node previous = null;

            for (int i = 0; i < index; i++) {
                previous = current;
                current = current.next;
            }

            previous.next = current.next;
        }

        size--;
    }

    public Node elementAt(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Índice inválido. Não há elemento na posição indicada.");
            return null;
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current;
    }

    public int size() {
        return size;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
