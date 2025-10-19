package com.example.actividadacm.Controller;


public class PremiumDiscountService implements DiscountService {
    int price;

    public PremiumDiscountService(int price) {
        this.price=price;
    }
    public void CalculateDiscount() {
        this.price= price-(price* 30 /100);

    }
    public void ShowPrice() {
        System.out.println("El precio final con el descuento premium es: "+ price);
    }
}


