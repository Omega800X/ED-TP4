/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fcad.ed.tp4.punto1;

import ar.edu.uner.fcad.ed.arbolesbinariosyheaps.ArbolBinario;
import ar.edu.uner.fcad.ed.arbolesbinariosyheaps.NodoArbolBinario;
import ar.edu.uner.fcad.ed.edlineales.ListaEnlazadaNoOrdenada;

/**
 *
 * @author Fer
 */
public class ArbolBinarioExt<T> extends ArbolBinario<T> implements ArbolBinarioExtInterfaz<T> {

    @Override
    public int size() {

        if (this.vacio()) {
            return 0;
        }

        int res = 0;
        var iterador = this.iteradorPreorden();

        while (iterador.existeSiguiente()) {
            res++;
            iterador.siguiente();
        }

        return res;
    }

    @Override
    public ListaEnlazadaNoOrdenada<NodoArbolBinario<T>> hojas() {

        if (this.vacio()) {
            throw new IllegalStateException("El árbol no tiene hojas (está vacío).");
        }

        ListaEnlazadaNoOrdenada<NodoArbolBinario<T>> resultado = new ListaEnlazadaNoOrdenada();
        var iterador = this.iteradorPreorden();

        while (iterador.existeSiguiente()) {
            NodoArbolBinario<T> aux = this.obtenerNodo(iterador.siguiente());
            if (!aux.tieneHijoIzquierdo() && !aux.tieneHijoDerecho()) {
                resultado.addToRear(aux);
            }
        }

        return resultado;
    }

    @Override
    public ListaEnlazadaNoOrdenada<NodoArbolBinario<T>> internos() {

        if (this.vacio()) {
            return null;
        }

        ListaEnlazadaNoOrdenada<NodoArbolBinario<T>> aux = this.hojas();
        ListaEnlazadaNoOrdenada<NodoArbolBinario<T>> resultado = new ListaEnlazadaNoOrdenada();
        var iterador = this.iteradorPreorden();

        while (iterador.existeSiguiente()) {
            NodoArbolBinario<T> nodoAux = this.obtenerNodo(iterador.siguiente());
            if (!raiz.equals(nodoAux) && !aux.contains(nodoAux)) {
                resultado.addToRear(nodoAux);
            }
        }

        return resultado;
    }

    @Override
    public int altura(NodoArbolBinario<T> nodo) {
        
        if (nodo == null) {
            throw new IllegalArgumentException("No pueden pasarse referecias nulas.");
        }

        if (!this.existe(nodo)) {
            throw new IllegalArgumentException("El nodo no existe en el árbol.");
        }

        ArbolBinarioExt<T> aux = new ArbolBinarioExt();
        aux.agregarHijoDerecho(null, nodo);
        return aux.altura();
    }

    @Override
    public int profundidad(NodoArbolBinario<T> nodo) {

        if (this.vacio()) {
            return -1;
        }

        if (nodo == null) {
            throw new IllegalArgumentException("No pueden pasarse referecias nulas.");
        }

        if (!this.existe(nodo)) {
            throw new IllegalArgumentException("El nodo no existe en el árbol.");
        }

        if (nodo == raiz) {
            return 0;
        }

        int res = 0;
        NodoArbolBinario<T> aux = nodo;

        while (this.padre(aux) != null) {
            res++;
            aux = this.padre(aux);
        }

        return res;
    }

    @Override
    public int altura() {
        return profundidad();
    }

    @Override
    public int profundidad() {
        return profundidad(obtenerHojaMasProfunda());
    }

    private NodoArbolBinario<T> obtenerHojaMasProfunda() {

        ListaEnlazadaNoOrdenada<NodoArbolBinario<T>> listaHojas = this.hojas();
        NodoArbolBinario<T> nodoRes = listaHojas.first();

        for (int i = 0; i < listaHojas.size(); i++) {
            if (this.profundidad(listaHojas.get(i)) > this.profundidad(nodoRes)) {
                nodoRes = listaHojas.get(i);
            }
        }

        return nodoRes;
    }
}
