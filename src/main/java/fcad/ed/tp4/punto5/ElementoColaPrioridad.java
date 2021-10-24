/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fcad.ed.tp4.punto5;

import ar.edu.uner.fcad.ed.edlineales.colas.ColaPorEnlaces;

/**
 *
 * @author Fer
 */
public class ElementoColaPrioridad<T> implements Comparable<ElementoColaPrioridad<T>> {

    protected int prioridad;
    protected T valor;

    public ElementoColaPrioridad(int prioridad, T valor) {
        this.prioridad = prioridad;
        this.valor = valor;
    }

    @Override
    public int compareTo(ElementoColaPrioridad<T> o) {
        return Integer.compare(this.prioridad, o.prioridad);
    }

}
