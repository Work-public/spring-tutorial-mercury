package com.mercurytfs.spring.ioc;

import com.mercurytfs.spring.ioc.beans.ServicioRemoto;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Gabe on 02/09/2016.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ServicioRemoto servicio = applicationContext.getBean("servicioRemoto", ServicioRemoto.class);
        System.out.println("El valor es " + servicio.consultaDato());
    }
}
