package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceBien {

    private final ApplicationContext context;

    public ProductServiceBien(ApplicationContext context) {
        this.context = context;
    }

    public void comprar(String usuario, String producto) {
        ShoppingCart cart = context.getBean(ShoppingCart.class);
        System.out.println(usuario + " usando carrito " + cart);
        cart.agregarProducto(producto);
        cart.mostrarProductos();
    }
}
