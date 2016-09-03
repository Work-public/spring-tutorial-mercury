package com.mercurytfs.spring.ioc.beans;

import org.springframework.stereotype.Service;

/**
 * Created by Gabe on 02/09/2016.
 */
@Service(value="servicioRemoto")
public class ServicioRemoto {
    public Object consultaDato() {
        return (int) (Math.random() * 10.0);
    }
}
