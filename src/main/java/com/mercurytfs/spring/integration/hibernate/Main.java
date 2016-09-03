package com.mercurytfs.spring.integration.hibernate;

import com.mercurytfs.spring.integration.hibernate.beans.Contacto;
import com.mercurytfs.spring.integration.hibernate.persistencia.ContactosDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Gabe on 03/09/2016.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("hibernate/applicationContext.xml");
        ContactosDao contactosDAO = appContext.getBean(ContactosDao.class);

        long idContactoGuardado = contactosDAO.guardaContacto(new Contacto("Nombre 1", "Email 1", "Telefono 1"));

        Contacto contactoGuardado = contactosDAO.obtenContacto(idContactoGuardado);

        System.out.println("Nombre: " + contactoGuardado.getNombre());
        System.out.println("Email: " + contactoGuardado.getEmail());
    }
}
