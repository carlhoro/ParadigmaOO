import java.util.Stack;

public class EjemploPila {
    public static void main(String[] args) {
        Stack<String> pila = new Stack<>();

        // Insertar elementos
        pila.push("A");
        pila.push("B");
        pila.push("C");

        // Ver el elemento superior sin quitarlo
        System.out.println("Tope: " + pila.peek());

        // Quitar elementos
        while (!pila.empty()) {
            System.out.println("Sacando: " + pila.pop());
        }
    }
}

import java.util.Queue;
import java.util.LinkedList;

public class EjemploCola {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();

        // Insertar elementos
        cola.offer("A");
        cola.offer("B");
        cola.offer("C");

        // Ver el primer elemento sin quitarlo
        System.out.println("Frente: " + cola.peek());

        // Quitar elementos
        while (!cola.isEmpty()) {
            System.out.println("Sacando: " + cola.poll());
        }
    }
}