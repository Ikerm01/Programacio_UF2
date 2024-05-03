package Arbre_Binari;

public class Node_arbre<V> {
    private V value;
    private Node_arbre<V> izq;
    private Node_arbre<V> der;

    public Node_arbre(V value, Node_arbre<V> izq, Node_arbre<V> der){
        this.value = value;
        this.izq = izq;
        this.der = der;
    }
    public V getValue() {
        return value;
    }
 
    public void setValue(V value) {
        this.value = value;
    }

    public Node_arbre<V> getIzq() {
        return izq;
    }
 
    public void setIzq(Node_arbre<V> izq) {
        this.izq = izq;
    }
 
    public Node_arbre<V> getDer() {
        return der;
    }
 
    public void setDer(Node_arbre<V> der) {
        this.der = der;
    }
}
