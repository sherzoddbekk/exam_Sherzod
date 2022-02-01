package com.example.examjurabekov__sherzod.model;

public class User {

    int foodpicture;
    String foodtext;
    String plece;
    String food;

    public User(int foodpicture, String foodtext, String plece, String food) {
        this.foodpicture = foodpicture;
        this.foodtext = foodtext;
        this.plece = plece;
        this.food = food;
    }

    public int getFoodpicture() {
        return foodpicture;
    }

    public void setFoodpicture(int foodpicture) {
        this.foodpicture = foodpicture;
    }

    public String getFoodtext() {
        return foodtext;
    }

    public void setFoodtext(String foodtext) {
        this.foodtext = foodtext;
    }

    public String getPlece() {
        return plece;
    }

    public void setPlece(String plece) {
        this.plece = plece;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
