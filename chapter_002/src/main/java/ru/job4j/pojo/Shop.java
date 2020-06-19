package ru.job4j.pojo;

public class Shop {
    public static void main(String[] args) {
        Product products[] = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);

        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }

        System.out.println();
        System.out.println("Удаляем значение из ячейки с индексом 1");
        //удаляем значение из ячейки с индексом 1
        products[1] = null;

        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }

        System.out.println();
        System.out.println("Записываем  в ячейку с индексом 1 значение ячейки с индексом 2 и удаляем значение из ячейки с индексом 2");
        products[1] = products[2];
        products[2] = null;
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
        System.out.println("задание");
        products[1]= new Product("Apple",8);
        products[2] = new Product("Cake", 1);
        products[3] = null;
        products[4] = new Product("Ham", 2);

        Shop.delete(products,3);
    }

    public static Product[] delete(Product[] products, int index) {
        products[index] = null;
        for (; index < products.length; index++) {
            if (products[index] == null && index != products.length - 1) {
                products[index] = products[index + 1];
                products[index + 1] = null;
            }}
            for (int i = 0; i < products.length; i++) {
                Product product = products[i];
                if (product != null) {
                    System.out.println(product.getName());
                } else {
                    System.out.println("null");
                }

            }
        return products;

    }

}


