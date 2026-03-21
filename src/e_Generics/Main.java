package e_Generics;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {

        // Generics = a concept where you can write a class interface, or method
        //            that is a compatible with different data types.
        //            <T> type parameter (placeholder that gets replaced with a real type)
        //            <String> type argument (specifies the type)

        Box<String> box = new Box<>();
        box.setItem("Banana");
        System.out.println(box.getItem());


        Box<Integer> boxInt = new Box<>();
        boxInt.setItem(144);
        System.out.println(boxInt.getItem());

        System.out.println();
        Products<String, Double> products = new Products<>("Banana", 12.5);
        System.out.println(products.getProduct());
        System.out.println(products.getPrice());

    }

}
