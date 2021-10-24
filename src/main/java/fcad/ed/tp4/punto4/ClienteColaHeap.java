package fcad.ed.tp4.punto4;

import fcad.ed.tp4.punto3.NodoColaHeap;
import fcad.ed.tp4.punto3.ColaHeap;

public class ClienteColaHeap {

    public static void main(String[] args) {
        ColaHeap<Integer> cola = new ColaHeap<>();
        cola.enqueue(5);
        NodoColaHeap<Integer> nodo1 = new NodoColaHeap(3);
        NodoColaHeap<Integer> nodo2 = new NodoColaHeap(5);
        NodoColaHeap<Integer> nodo3 = new NodoColaHeap(7);
        NodoColaHeap<Integer> nodo4 = new NodoColaHeap(9);
        NodoColaHeap<Integer> nodo5 = new NodoColaHeap(11);

        System.out.println("la cola esta vacia: " + cola.isEmpty());  //se espera true si esta vacia

        cola.heap.addElement(nodo1);
        cola.heap.addElement(nodo2);
        cola.heap.addElement(nodo3);
        cola.heap.addElement(nodo4);
        cola.heap.addElement(nodo5);

        System.out.println("---------------------------------");
        System.out.println(cola.heap.toString());
        System.out.println("---------------------------------");
        System.out.println("la cola esta llena: " + cola.isFull());          //se espera true si esta llena
        System.out.println("---------------------------------");
        cola.makeEmpty();
        System.out.println("---------------------------------");
        System.out.println("se vacia la cola por lo tanto no esta llena: " + cola.isFull()); //se espera true si esta vacia

    }
}
