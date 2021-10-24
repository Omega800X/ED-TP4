package fcad.ed.tp4.punto4;

import fcad.ed.tp4.punto3.NodoColaHeap;
import fcad.ed.tp4.punto3.ColaHeap;

public class ClienteColaHeap {

    public static void main(String[] args) {
        ColaHeap<Integer> cola = new ColaHeap<>();

        System.out.println("Cola: " + cola);

        cola.enqueue(3);
        cola.enqueue(5);
        cola.enqueue(7);
        cola.enqueue(9);
        cola.enqueue(11);

        System.out.println("Cola: " + cola);

        System.out.println("isEmpty(): " + cola.isEmpty());  //se espera true si esta vacia
        System.out.println("getFront(): " + cola.getFront());

        cola.dequeue();
        System.out.println(cola);

        System.out.println("isFull(): " + cola.isFull());          //se espera true si esta llena

        cola.makeEmpty();
        System.out.println("Cola: " + cola);
        System.out.println("isEmpty(): " + cola.isEmpty()); //se espera true si esta vacia

    }
}
