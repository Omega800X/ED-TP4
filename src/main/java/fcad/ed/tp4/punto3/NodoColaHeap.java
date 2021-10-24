
package fcad.ed.tp4.punto3;

public class NodoColaHeap<T> implements Comparable <NodoColaHeap<T>> {
    private static int ULTIMO_ORDEN=-1;
    protected T valor;
    protected Integer orden;
    
    public NodoColaHeap(T valor){
        this.valor=valor;
        this.orden=++ULTIMO_ORDEN;
        
    }

    @Override
    public int compareTo(NodoColaHeap<T> o) {
        return Integer.compare(this.orden, o.orden);
    }
    
}
