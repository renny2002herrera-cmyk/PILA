public class Main {
    public static void main(String[] args) {
        ListStack pila = new ListStack();

        System.out.println("¿Está vacía? " + pila.isEmpty());

        pila.push("Ana");
        pila.push(2);
        pila.push(true);
        pila.push("Juan");

        System.out.println("Pila: " + pila.toString());
        System.out.println("Tamaño: " + pila.size());

        System.out.println("Peek: " + pila.peek());
        System.out.println("Contiene 2: " + pila.search(2));
        System.out.println("Contiene 999: " + pila.search(999));

        System.out.println("Pop: " + pila.pop());
        System.out.println("Pila después del pop: " + pila.toString());
        System.out.println("Tamaño: " + pila.size());
        
        pila.clear();
        System.out.println("Pila después de clear: " + pila.toString());
        System.out.println("¿Está vacía? " + pila.isEmpty());
    }
}