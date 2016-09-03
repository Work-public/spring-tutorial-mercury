package com.mercurytfs.spring.ioc;

import com.mercurytfs.spring.ioc.beans.ServicioRemoto;
import com.mercurytfs.spring.ioc.beans.ServicioRemotoEmpresarial;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Gabe on 02/09/2016.
 */
public class MainEmpresarial {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextEmpresarial.xml");
        ServicioRemotoEmpresarial servicio = applicationContext.getBean("servicioRemoto", ServicioRemotoEmpresarial.class);
        System.out.println("El valor es " + servicio.consultaDato());
    }
}
