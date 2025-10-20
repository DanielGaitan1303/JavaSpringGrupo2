package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    private final ProductServiceMal productServicemal;
    private final ProductServiceBien productServicebien;

    public DemoApplication(ProductServiceMal productServicemal, ProductServiceBien  productServiceBien) {
        this.productServicemal = productServicemal;
        this.productServicebien = productServiceBien;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        productServicemal.comprar("Usuario1", "Pan");
        productServicemal.comprar("Usuario2", "Leche");
        /*En este caso se comparte el mismo carrito para los usuarios porque el ProductServiceMal 
        solo instancia un carrito y utiliza el mismo cada vez que se llama a la funcion comprar*/
        productServicebien.comprar("Usuario1", "Pan");
        productServicebien.comprar("Usuario2", "Leche");
        productServicebien.comprar("Usuario2", "Pan");
        /*En este otro caso si se crean carritos diferentes porque cada vez que se 
        llama la funcion comprar se crea una nueva instancia de carrito, lo unico que seguiria mal
        es que no podria un mismo usuario agregar dos productos diferentes ya que no se esta 
        linkeando de ninguna forma el usuario con su respectivo carrito*/
    }
    /*Por otro lado si se pone el componente ShoppingCart con scope Singleton tambien 
    se crearia un solo carrito para todos los usuarios porque los componentes
    crean una sola instancia*/
}

