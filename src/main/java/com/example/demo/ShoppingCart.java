package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ShoppingCart {
    private List<String> productos = new ArrayList<>();

    public void agregarProducto(String producto) {
        productos.add(producto);
    }

    public void mostrarProductos() {
        System.out.println("Carrito " + this + " contiene: " + productos);
    }
}

