package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int toppings;

    private int cheese;

    boolean extraCheese;
    boolean extraToppings;
    boolean paperBag;
    boolean finalBill;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.extraCheese = false;
        this.extraToppings = false;
        this.paperBag = false;
        this.finalBill = false;
        this.bill = "";

        if(isVeg){
            this.price = 300;
            this.toppings = 70;
        }else{
            this.price = 400;
            this.toppings = 120;
        }
        this.cheese = 80;
        this.bill += "Base Price Of The Pizza: "+this.price+"\n";

        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(extraCheese == false){
            this.price = this.price + cheese;
            this.extraCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(extraToppings == false){
            this.price = this.price + toppings;
            this.extraToppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(paperBag == false){
            this.price = this.price + 20;
            this.paperBag = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(finalBill == false){
            if(extraCheese == true)
                this.bill += "Extra Cheese Added: "+this.cheese+"\n";
            if(extraToppings == true)
                this.bill += "Extra Toppings Added: "+this.toppings+"\n";
            if(paperBag == true)
                this.bill +="Paperbag Added: "+"20"+"\n";
            this.bill += "Total Price: "+this.price+"\n";
            finalBill = true;
        }
        return this.bill;
    }
}
