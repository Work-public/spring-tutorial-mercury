package com.mercurytfs.spring.ioc;

import com.mercurytfs.spring.ioc.beans.ServicioRemoto;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by Gabe on 02/09/2016.
 */
public class MainBeanFactory {
    public static void main(final String[] args){
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        ServicioRemoto servicio = beanFactory.getBean("servicioRemoto", ServicioRemoto.class);
        System.out.println("El valor es " + servicio.consultaDato());
    }
}
