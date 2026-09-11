public class ListStack implements StackInterface {
    StackNode cima = null;
    int size = 0;


    @Override
    public void clear() {
        cima = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return cima == null;
    }

    @Override
    public Object peek() {
        if (cima == null) {
            return null;
        }
        return cima.object;
    }

    @Override
    public Object pop() {
        if (cima == null) {
            return null;
        }

        Object dato = cima.object;
        cima = cima.above;
        size--;

        return dato;
    }

    @Override
    public boolean push(Object object) {
        if (object == null) return false;

        StackNode nuevo = new StackNode();
        nuevo.object = object;
        nuevo.above = cima;
        cima = nuevo;
        size++;

        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean search(Object object) {
        if (object == null || cima == null) {
            return false;
        }

        StackNode actual = cima;
        while (actual != null) {
            if (actual.object.equals(object)) {
                return true;
            }
            actual = actual.above;
        }
        return false;
    }

    @Override
    public String toString() {
        if (cima == null) {
            return "[]";
        }

        String resultado = "[";
        StackNode actual = cima;

        while (actual != null) {
            resultado = resultado + actual.object;
            if (actual.above != null) {
                resultado = resultado + ", ";
            }
            actual = actual.above;
        }
        resultado = resultado + "]";

        return resultado;
    }
}