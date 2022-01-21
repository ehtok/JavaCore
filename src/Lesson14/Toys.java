package Lesson14;

import Lesson14.Model.Product;
import Lesson14.Service.ProductService;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Toys {
    public static void main(String[] args) {
        ProductService productService = new ProductService();

        Map<String, Product> toys = new HashMap();

        toys.put("Cat", productService.creatToy(15, 400));
        toys.put("Bear", productService.creatToy(20, 700));
        toys.put("Lion", productService.creatToy(90, 2000));


        for (Product value : toys.values()
        ) {
            System.out.println("Value price: " + value.getPrice() +
                    "  Value size: " + value.getSize());

        }

        Set<String> keys = toys.keySet();
        System.out.println("Toys' keys: " + keys);

        for (Map.Entry<String, Product> elements : toys.entrySet()
        ) {
            System.out.println("Toy's key: " + elements.getKey() +
                    " Toy's price: " + elements.getValue().getPrice() +
                    " Toy's size: " + elements.getValue().getSize());

        }


    }


}



