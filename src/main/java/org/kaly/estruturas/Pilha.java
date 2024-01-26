package org.kaly.estruturas;

public class Pilha {
    private int[] array;
    private int top;
    private int size;

    public Pilha(int capacity) {
        array = new int[capacity];
        top = -1;
        size = 0;
    }

    public void push(int value) {
        if (top < array.length - 1) {
            array[++top] = value;
            size++;
        } else {
            System.out.println("Pilha cheia. Não é possível adicionar mais elementos.");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            size--;
            return array[top--];
        } else {
            System.out.println("Pilha vazia. Não é possível remover elementos.");
            return -1;
        }
    }

    public int top() {
        if (!isEmpty()) {
            return array[top];
        } else {
            System.out.println("Pilha vazia. Não há elemento no topo.");
            return -1;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

}
