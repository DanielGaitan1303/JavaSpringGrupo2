package com.example.actividadacm;

import com.example.actividadacm.Controller.BasicDiscountService;
import com.example.actividadacm.Controller.DiscountService;
import com.example.actividadacm.Controller.PremiumDiscountService;
import com.example.actividadacm.Service.OrderService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        var service = context.getBean(OrderService.class);
        service.Ejecutar();
    }

}









