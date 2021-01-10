package com.example.binusezyfoody;

public class MyOrder {
    private Integer qty;
    private Integer img;
    private Integer price;
    private String drinkn;

    public MyOrder(Integer qty, Integer img, Integer price, String drinkn) {
        this.qty = qty;
        this.img = img;
        this.price = price;
        this.drinkn = drinkn;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Integer getImg() {
        return img;
    }

    public void setImg(Integer img) {
        this.img = img;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDrinkn() {
        return drinkn;
    }

    public void setDrinkn(String drinkn) {
        this.drinkn = drinkn;
    }
}
