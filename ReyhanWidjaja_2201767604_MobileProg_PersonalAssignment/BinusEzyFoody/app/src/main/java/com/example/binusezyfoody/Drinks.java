package com.example.binusezyfoody;

public class Drinks {
    private int image;
    private String drinkname;
    private int drinkprice;

    public Drinks(Integer image, String drinkname, Integer drinkprice){
        this.image = image;
        this.drinkname = drinkname;
        this.drinkprice = drinkprice;
    }

    public int getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getDrinkname() {
        return drinkname;
    }

    public void setDrinkname(String drinkname) {
        this.drinkname = drinkname;
    }

    public Integer getDrinkprice() {
        return drinkprice;
    }

    public void setDrinkprice(Integer drinkprice) {
        this.drinkprice = drinkprice;
    }
}
