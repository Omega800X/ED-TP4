package fcad.ed.tp4.punto2;

import ar.edu.uner.fcad.ed.arbolesbinariosyheaps.NodoArbolBinario;
import fcad.ed.tp4.punto1.ArbolBinarioExt;

public class ArbolBinarioExtCliente {

    public static void main(String[] args) {

        ArbolBinarioExt<Integer> arbol = new ArbolBinarioExt();
        NodoArbolBinario<Integer> nodo1 = new NodoArbolBinario(5);
        NodoArbolBinario<Integer> nodo2 = new NodoArbolBinario(7);
        NodoArbolBinario<Integer> nodo3 = new NodoArbolBinario(10);
        NodoArbolBinario<Integer> nodo4 = new NodoArbolBinario(77);
        NodoArbolBinario<Integer> nodo5 = new NodoArbolBinario(80);
        NodoArbolBinario<Integer> nodo6 = new NodoArbolBinario(55);
        NodoArbolBinario<Integer> nodo7 = new NodoArbolBinario(63);

        System.out.println("size(): " + arbol.size());

        arbol.agregarHijoDerecho(null, nodo1);
        arbol.agregarHijoIzquierdo(nodo1, nodo2);
        arbol.agregarHijoDerecho(nodo1, nodo3);
        arbol.agregarHijoIzquierdo(nodo2, nodo4);
        arbol.agregarHijoDerecho(nodo2, nodo5);
        arbol.agregarHijoIzquierdo(nodo3, nodo6);
        arbol.agregarHijoDerecho(nodo3, nodo7);

        System.out.println("size(): " + arbol.size());

        var listaHojas = arbol.hojas();
        System.out.println("hojas(): " + listaHojas);

        var listaInternos = arbol.internos();
        System.out.println("internos(): " + listaInternos);

        System.out.println("profundidad(nodo1): " + arbol.profundidad(nodo1));
        System.out.println("profundidad(nodo2): " + arbol.profundidad(nodo2));
        System.out.println("profundidad(nodo3): " + arbol.profundidad(nodo3));
        System.out.println("profundidad(nodo4): " + arbol.profundidad(nodo4));
        System.out.println("profundidad(nodo6): " + arbol.profundidad(nodo6));
        System.out.println("profundidad(): " + arbol.profundidad());

        System.out.println("altura(): " + arbol.altura());
        System.out.println("altura(nodo4): " + arbol.altura(nodo4));
        System.out.println("altura(nodo2): " + arbol.altura(nodo2));
    }
}
