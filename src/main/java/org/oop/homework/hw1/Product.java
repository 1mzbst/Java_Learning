package org.oop.homework.hw1;

public class Product {
    private String name;
    private Integer price;
    private Integer rating;

    /**
     * @apiNote конструктор из name, price, rating.
     * @param name
     * @param price
     * @param rating
     */
    public Product(String name, Integer price, Integer rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    /**
     * @apiNote пустой коноструктор
     */
    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
