package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        products[index] = null;
        for (int i = index; i < products.length; i++) {
            if (products == null) {
                products[index] = products[i + 1];
                products[i + 1] = null;
            }
        }
        return products;
    }
}
