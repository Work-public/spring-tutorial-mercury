package com.mercurytfs.spring.ciclovida;

import com.mercurytfs.spring.ciclovida.beans.Sun;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Gabe on 03/09/2016.
 */
public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("ciclovida/applicationContext.xml");
        System.out.println("Estudiante 1: " + applicationContext.getBean("estudiante"));
        System.out.println("Estudiante 2: " + applicationContext.getBean("estudiante"));

        Sun sun = applicationContext.getBean("sun", Sun.class);
        System.out.println(sun.getMensaje());

        applicationContext.close();
    }
}
