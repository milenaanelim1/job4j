package ru.job4j.pojo;

public class Product {
    private String name;
    private int count;

    public Product(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    /**public static void delete(Product[] products, int index){
        for(int i = 0; i < products.length; i++){
            if(products[index]==null){
                products[index] = products[index + 1];
            }
        }
        products[products.length - 1] = null;
        //Product pr = Product[]products;
        System.out.println(products);
    }
     */
}
