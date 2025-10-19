package com.example.actividadacm.config;

import com.example.actividadacm.Controller.BasicDiscountService;
import com.example.actividadacm.Controller.DiscountService;
import com.example.actividadacm.Controller.FamiliarDiscountService;
import com.example.actividadacm.Controller.PremiumDiscountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Beans {
    /**
     * Si no colocamos Primary a alguno de los Beans salta un error
     * que nos indica que hay 2 Beans en el contenedor y no sabe cual
     * bean escoger
     *
     */
    @Bean("Descuento Basico")

    public DiscountService getbasicDiscountService() {
        return new BasicDiscountService(4520);
    }

    @Bean("Descuento Premium")

    public DiscountService getPremiumDiscountService() {
        return new PremiumDiscountService(2000);
    }

    //@Bean("Descuento Familiar")
    public DiscountService getFamiliarDiscountService() {
        return new FamiliarDiscountService(5000);
    }
}
