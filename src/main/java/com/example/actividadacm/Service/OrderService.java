package com.example.actividadacm.Service;

import com.example.actividadacm.Controller.DiscountService;
import com.example.actividadacm.Controller.FamiliarDiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
/**
 * La notacion Qualifier ayuda a indicar el bean que debe
 * ser inyectado en el componente de Order Service
 * si cambiamos el nombre del bean se genera un error
 * debido a que los nombres de los beans no coinciden con
 * el nombre del bean de Qualifier
 */
    public class OrderService{


    private  DiscountService discountService;
        @Autowired(required=false) /* gracias al autowired required= false Spring no lanza
        error cuando intente inyectar el bean si este no existe*/

        public void setOrder (@Qualifier("Descuento Pareja") DiscountService discountService) {
            this.discountService = discountService;

        }

        public void Ejecutar(){
            discountService.CalculateDiscount();
            discountService.ShowPrice();
        }

    }


