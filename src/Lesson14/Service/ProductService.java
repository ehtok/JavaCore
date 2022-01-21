package Lesson14.Service;

import Lesson14.Model.Product;
import Lesson14.Toys;

import java.util.*;


public class ProductService implements IProductService {


    @Override
    public Product creatToy(int size, int price) {

        return new Product(size, price);
    }


}



