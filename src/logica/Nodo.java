package logica;


public class Nodo<T> {
    private final T elemento;
    private Nodo izquierda, derecha;

    public Nodo(T elemento) {
        this.elemento = elemento;
    }
    
    public Nodo insertar(Nodo n, T elemento) {
        if (n == null)
            return new Nodo(elemento);
        else if (elemento.hashCode() < n.elemento.hashCode())
            n.izquierda = insertar(n.izquierda, elemento);
        else if (elemento.hashCode() > n.elemento.hashCode())
            n.derecha = insertar(n.derecha, elemento);
        return n;
    }
    
    public int nodosCompletos(Nodo n) {
        if (n == null)
            return 0;
        else {
            if (n.izquierda != null && n.derecha != null)
                return nodosCompletos(n.izquierda) + nodosCompletos(n.derecha) + 1;
            return nodosCompletos(n.izquierda) + nodosCompletos(n.derecha);
        }
    }

    public T getElemento() {
        return elemento;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }
    
}
