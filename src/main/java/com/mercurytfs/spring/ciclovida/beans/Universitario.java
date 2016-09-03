package com.mercurytfs.spring.ciclovida.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Gabe on 03/09/2016.
 */
@Component("estudiante")
public class Universitario implements Estudiante {
    public Universitario() {
        System.out.println("--Construyendo un universitario--");
    }

    public int presentaExamen() {
        return (int) (Math.random() * 10.0);
    }

    public void destroy() throws Exception {
        System.out.println("Finalmente podemos decir adios a este estudiante.");
    }

    public void inicializa() {
        System.out.println("Realizando inicializacion de rutina en el bean.");
    }

    @PostConstruct
    public void afterPropertiesSet() throws Exception {
        System.out.println("Preparando al nuevo estudiante para entrar en la universidad.");
    }

    @PreDestroy
    public void destruye() {
        System.out.println("Realizando destruccion de rutina en el bean.");
    }

}
