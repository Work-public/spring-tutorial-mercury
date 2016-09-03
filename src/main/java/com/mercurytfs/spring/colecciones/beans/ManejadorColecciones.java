package com.mercurytfs.spring.colecciones.beans;

import java.util.*;

/**
 * Created by Gabe on 03/09/2016.
 */
public class ManejadorColecciones {
    private List lista;
    private Persona[] arreglo;
    private Set conjunto;
    private Map mapa;
    private Properties propiedades;

    public void muestraLista() {
        System.out.println("\n---Mostrando lista---");

        for (Object o : lista) {
            System.out.println(o.getClass() + ": " + o);
        }
    }

    public void muestraArreglo() {
        System.out.println("\n---Mostrando arreglo---");

        for (Object o : arreglo) {
            System.out.println(o.getClass() + ": " + o);
        }
    }

    public void muestraConjunto() {
        System.out.println("\n---Mostrando conjunto---");

        for (Iterator it = conjunto.iterator(); it.hasNext(); ) {
            Object o = it.next();

            System.out.println(o.getClass() + ": " + o);
        }
    }

    public void muestraMapa() {
        System.out.println("\n---Mostrando mapa---");

        for (Iterator it = mapa.keySet().iterator(); it.hasNext(); ) {
            Object o = it.next();

            System.out.println("[llave] " + o.getClass() + ": " + o + ", [valor]" + mapa.get(o).getClass() + ": " + mapa.get(o));
        }
    }

    public void muestraPropiedades() {
        System.out.println("\n---Mostrando propiedades---");

        for (Iterator it = propiedades.keySet().iterator(); it.hasNext(); ) {
            Object o = it.next();

            System.out.println("[llave] " + o.getClass() + ": " + o + ", [valor]" + propiedades.get(o).getClass() + ": " + propiedades.get(o));
        }
    }

    public void setArreglo(Persona[] arreglo) {
        this.arreglo = arreglo;
    }

    public void setConjunto(Set conjunto) {
        this.conjunto = conjunto;
    }

    public void setLista(List lista) {
        this.lista = lista;
    }

    public void setMapa(Map mapa) {
        this.mapa = mapa;
    }

    public void setPropiedades(Properties propiedades) {
        this.propiedades = propiedades;
    }
}
