package fcad.ed.tp4.punto5;

import ar.edu.uner.fcad.ed.edlineales.ListaEnlazadaOrdenada;
import ar.edu.uner.fcad.ed.edlineales.colas.ColaPorEnlaces;

public class ColaDePrioridad<T extends Comparable<T>> implements ColaPrioridadInterfaz<T> {

    private int cantElem;
    protected ListaEnlazadaOrdenada<ElementoColaPrioridad<T>> lista;

    @Override
    public int size() {
        return cantElem;
    }

    @Override
    public boolean isEmpty() {
        return lista.isEmpty();
    }

    @Override
    public T min() {
        return this.lista.first().valores.getFront();
    }

    @Override
    public void insert(int prioridad, T elemento) {
        boolean existePrioridad = false;
        for (int i = 0; i < lista.size(); i++) {
            if (this.lista.get(i).prioridad == prioridad) {
                this.lista.get(i).valores.enqueue(elemento);
                existePrioridad = true;
                break;
            }
        }
        if (!existePrioridad) {
            ColaPorEnlaces<T> aux = new ColaPorEnlaces();
            aux.enqueue(elemento);
            this.lista.add(new ElementoColaPrioridad(prioridad, aux));
        }
        cantElem++;
    }

    @Override
    public void removeMin() {
        this.lista.first().valores.dequeue();
    }

}
