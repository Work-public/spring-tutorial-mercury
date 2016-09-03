package com.mercurytfs.spring.integration.hibernate.persistencia;

import com.mercurytfs.spring.integration.hibernate.beans.Contacto;
import org.hibernate.HibernateException;

import java.util.List;

/**
 * Created by Gabe on 03/09/2016.
 */
public interface ContactosDao {
    void actualizaContacto(Contacto contacto) throws HibernateException;

    void eliminaContacto(Contacto contacto) throws HibernateException;

    long guardaContacto(Contacto contacto) throws HibernateException;

    Contacto obtenContacto(long idContacto) throws HibernateException;

    List<Contacto> obtenListaContactos() throws HibernateException;
}
