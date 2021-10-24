package fcad.ed.tp4.punto5;

import ar.edu.uner.fcad.ed.edlineales.ListaEnlazadaOrdenada;

public class ColaDePrioridad<T extends Comparable<T>> implements ColaPrioridadInterfaz<T> {

    protected ListaEnlazadaOrdenada<ElementoColaPrioridad<T>> lista;

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T min() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(int prioridad, T elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeMin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
