package fcad.ed.tp4.punto3;

import ar.edu.uner.fcad.ed.arbolesbinariosyheaps.Heap;
import ar.edu.uner.fcad.ed.edlineales.colas.Cola;

public class ColaHeap<T extends Comparable<? super T>> implements Cola<T> {

    protected Heap<NodoColaHeap<T>> heap;

    public ColaHeap() {
        this.heap = new Heap();
    }

    @Override
    public boolean isEmpty() {
        return this.heap.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public T getFront() {
        return this.heap.findMin().valor;
    }

    @Override
    public void dequeue() {
        this.heap.removeMin();
    }

    @Override
    public void enqueue(T valor) {
        this.heap.addElement(new NodoColaHeap(valor));
    }

    @Override
    public void makeEmpty() {
        while (!this.isEmpty()) {
            this.heap.removeMin();
        }

    }

    @Override
    public String toString() {
        String res = "";
        if(heap.vacio()){
            return res;
        }
        return res + heap;
    }
    
    
}
