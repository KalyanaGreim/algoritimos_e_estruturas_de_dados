package org.kaly.estruturas;

public class Node {
    public int data;
    int key;
    int value;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
    public Node(int key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}