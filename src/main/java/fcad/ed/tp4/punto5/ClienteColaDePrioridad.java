package fcad.ed.tp4.punto5;

public class ClienteColaDePrioridad {

    public static void main(String[] args) {
        ColaDePrioridad<Integer> cola = new ColaDePrioridad();
        System.out.println(cola);
        System.out.println("size(): " + cola.size());
        System.out.println("isEmpty(): " + cola.isEmpty());
        System.out.println("min(): " + cola.min());
        
        //insertando elementos en la cola
        cola.insert(1, 3);
        cola.insert(2, 5);
        cola.insert(4, 7);
        cola.insert(6, 11);
        cola.insert(1, 33);
        
        System.out.println(cola);
        System.out.println("min(): " + cola.min());
        System.out.println("removeMin(): ");
        cola.removeMin();
        System.out.println("despues del removeMin(): " + cola);
        System.out.println("min(): " + cola.min());
        cola.removeMin();
        System.out.println("Aplicando otra vez removeMin(): " + cola);
        System.out.println("min(): " + cola.min());
    }
}
