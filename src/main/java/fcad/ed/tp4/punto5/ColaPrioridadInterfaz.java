/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package fcad.ed.tp4.punto5;

/**
 *
 * @author Fer
 */
public interface ColaPrioridadInterfaz<T extends Comparable<T>> {

    /**
     * Indica la cantidad de elementos en la estructura.
     */
    public int size();

    /**
     * Indica si la estructura está vacía o no.
     */
    public boolean isEmpty();

    /**
     * Devuelve el elemento con mínimo valor de prioridad.
     */
    public T min();

    /**
     * Inserta un elemento en la estructura.
     */
    public void insert(int prioridad, T elemento);

    /**
     * Elimina el elemento con mínimo valor de prioridad.
     */
    public void removeMin();

    /**
     * Concatena en un String el estado actual de la estructura.
     */
    public String toString();
}
