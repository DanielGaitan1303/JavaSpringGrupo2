package com.example.actividadacm.Controller;

public class FamiliarDiscountService implements DiscountService {
    int price;

    public FamiliarDiscountService(int price) {
        this.price=price;
    }
    public void CalculateDiscount() {
        this.price= price-(price* 20 /100);

    }
    public void ShowPrice() {
        System.out.println("El precio final con el descuento familiar es: "+ price);
    }
}
