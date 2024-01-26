package org.kaly.estruturas;

public class Fila {
    private int[] array;
    private int front;
    private int rear;
    private int size;

    public Fila(int capacity) {
        array = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int value) {
        if (size < array.length) {
            rear = (rear + 1) % array.length;
            array[rear] = value;
            size++;
        } else {
            System.out.println("Fila cheia. Não é possível adicionar mais elementos.");
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            int value = array[front];
            front = (front + 1) % array.length;
            size--;
            return value;
        } else {
            System.out.println("Fila vazia. Não é possível remover elementos.");
            return -1;
        }
    }

    public int rear() {
        if (!isEmpty()) {
            return array[rear];
        } else {
            System.out.println("Fila vazia. Não há elemento no final.");
            return -1;
        }
    }

    public int front() {
        if (!isEmpty()) {
            return array[front];
        } else {
            System.out.println("Fila vazia. Não há elemento na frente.");
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
