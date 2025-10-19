package com.example.actividadacm.Controller;

public class BasicDiscountService implements DiscountService {
    private int price;

    public BasicDiscountService(int price) {
        this.price=price;
    }

    public void CalculateDiscount() {
        this.price= price-(price* 15 /100);
    }

    public void ShowPrice() {
        System.out.println("El precio final con el descuento basico es: "+ price);
    }



}
