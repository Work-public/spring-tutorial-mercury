package com.mercurytfs.spring.ioc.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by Gabe on 02/09/2016.
 */
@Service(value = "servicioRemotoEmpresarial")
public class ServicioRemotoEmpresarial extends ServicioRemoto{
    private Proceso proceso;
    private Integer repeticiones;

    public ServicioRemotoEmpresarial() {
    }

    @Autowired
    public ServicioRemotoEmpresarial(@Qualifier("calculo") Proceso proceso) {
        this.proceso = proceso;
    }

    public Object consultaDato() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < repeticiones; i++) {
            stringBuilder.append(i + 1).append(" ").append(proceso.ejecuta()).append("\n");
        }
        return stringBuilder.toString();
    }

    @Value(value="#{systemProperties.registro}")
    public void setRepeticiones(Integer repeticiones) {
        this.repeticiones = repeticiones;
    }
}
