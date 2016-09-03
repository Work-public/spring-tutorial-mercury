package com.mercurytfs.spring.ioc.beans;

import org.springframework.stereotype.Service;

/**
 * Created by Gabe on 02/09/2016.
 */
@Service
public class Concatenacion implements Proceso {
    public Object ejecuta() {
        return new StringBuilder().append("Hola ").append(" mundo");
    }
}
