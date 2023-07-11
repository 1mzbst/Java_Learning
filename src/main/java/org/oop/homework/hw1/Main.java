package org.oop.homework.hw1;

public class Main {
    public static void main(String[] args) {
    Shop shop = new Shop();
    Category categoryFruits = new Category("Fruits");
    categoryFruits.addProduct(new Product("Apple", 10, 9));
    categoryFruits.addProduct(new Product("Peach", 20, 10));

    Category categoryVeg  = new Category("Vegetables");
    categoryVeg.addProduct(new Product("Tomato",5,6));
    categoryVeg.addProduct(new Product("Potato",3,8));

    shop.addCategory(categoryFruits);
    shop.addCategory(categoryVeg);

    shop.printCatalog();

    User user1 = new User("user1","1234");

    user1.getBasket().addProduct(categoryFruits.getProducts().get(0));
    categoryFruits.getProducts().remove(0);


    }
}
