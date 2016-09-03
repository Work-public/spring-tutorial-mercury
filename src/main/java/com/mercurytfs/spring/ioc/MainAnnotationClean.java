package com.mercurytfs.spring.ioc;

import com.mercurytfs.spring.ioc.beans.ServicioRemoto;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Gabe on 02/09/2016.
 */
public class MainAnnotationClean {
    public static void main(String[] args) {
        System.setProperty("registro","2");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.mercurytfs.spring.ioc.beans");
        ServicioRemoto servicio = applicationContext.getBean("servicioRemotoEmpresarial", ServicioRemoto.class);
        System.out.println("El valor es " + servicio.consultaDato());
    }
}
