package com.mercurytfs.spring.ciclovida;

import com.mercurytfs.spring.ciclovida.beans.Sun;
import com.mercurytfs.spring.ciclovida.beans.Universitario;
import com.mercurytfs.spring.ioc.beans.ServicioRemoto;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Gabe on 02/09/2016.
 */
public class MainAnnotationClean {
    public static void main(String[] args) {
        System.setProperty("registro","2");
        AbstractApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.mercurytfs.spring.ciclovida.beans");
        System.out.println("Estudiante 1: " + applicationContext.getBean("estudiante"));
        System.out.println("Estudiante 2: " + applicationContext.getBean("estudiante"));

        Sun sun = applicationContext.getBean("sun", Sun.class);
        System.out.println(sun.getMensaje());

        applicationContext.close();
    }
}
