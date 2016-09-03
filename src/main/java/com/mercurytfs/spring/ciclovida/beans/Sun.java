package com.mercurytfs.spring.ciclovida.beans;

import org.springframework.stereotype.Component;

/**
 * Created by Gabe on 03/09/2016.
 */
@Component("sun")
public class Sun {
    private static Sun instancia;

    static {
        instancia = new Sun();
    }

    private Sun() {
    }

    public static Sun getInstancia() {
        return instancia;
    }

    public String getMensaje() {
        return "Hola a todos los desarrolladores Java";
    }
}
