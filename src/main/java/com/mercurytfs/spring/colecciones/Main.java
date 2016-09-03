package com.mercurytfs.spring.colecciones;

import com.mercurytfs.spring.colecciones.beans.ManejadorColecciones;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Gabe on 03/09/2016.
 */
public class Main {
    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("colecciones/applicationContext.xml");

        ManejadorColecciones manejador = applicationContext.getBean("manejador", ManejadorColecciones.class);

        manejador.muestraLista();
        manejador.muestraArreglo();
        manejador.muestraConjunto();
        manejador.muestraMapa();
        manejador.muestraPropiedades();
    }
}
