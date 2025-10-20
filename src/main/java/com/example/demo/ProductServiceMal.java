package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceMal {

    @Autowired
    private ShoppingCart cart;

    public void comprar(String usuario, String producto) {
        System.out.println(usuario + " agregando producto");
        cart.agregarProducto(producto);
        cart.mostrarProductos();
    }
}
