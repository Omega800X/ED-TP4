package fcad.ed.tp4.punto3;

import ar.edu.uner.fcad.ed.arbolesbinariosyheaps.Heap;
import ar.edu.uner.fcad.ed.edlineales.colas.Cola;

public class ColaHeap<T extends Comparable<? super T>> implements Cola<T> {

    public Heap<NodoColaHeap<T>> heap;

    public ColaHeap() {
        this.heap = new Heap();
    }

    @Override
    public boolean isEmpty() {
        return this.heap.isEmpty();
    }

    @Override
    public boolean isFull() {
        return !(this.heap.isEmpty());
    }

    @Override
    public T getFront() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dequeue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void enqueue(T t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void makeEmpty() {
        while (this.isFull()) {
            this.heap.removeMin();
        }

    }
}
