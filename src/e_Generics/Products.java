package e_Generics;

public class Products <T, U>{
    T product;
    U price;
    Products(T product, U price) {
        this.product = product;
        this.price = price;
    }

    public T getProduct() {
        return this.product;
    }
    public U getPrice() {
        return this.price;
    }
}
