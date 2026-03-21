package e_Generics;

public class Box<T> { // T is generic
    T item;
    public void setItem(T item) {
        this.item = item;
    }
    public T getItem() {
        return this.item;
    }
}
