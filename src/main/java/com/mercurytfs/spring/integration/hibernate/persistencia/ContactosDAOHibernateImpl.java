package com.mercurytfs.spring.integration.hibernate.persistencia;

import com.mercurytfs.spring.integration.hibernate.beans.Contacto;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Gabe on 03/09/2016.
 */
@Repository
public class ContactosDAOHibernateImpl implements ContactosDao {
    private Session sesion;
    private Transaction transaction;
    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public long guardaContacto(Contacto contacto) throws HibernateException {
            iniciaOperacion();
            return (Long) sesion.save(contacto);
//            transaction.commit();
    }

    public void actualizaContacto(Contacto contacto) throws HibernateException {
        try {
            iniciaOperacion();
            sesion.update(contacto);
            transaction.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
    }

    public void eliminaContacto(Contacto contacto) throws HibernateException {
        try {
            iniciaOperacion();
            sesion.delete(contacto);
            transaction.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
    }
    @Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
    public Contacto obtenContacto(long idContacto) throws HibernateException {
            iniciaOperacion();
            return (Contacto) sesion.get(Contacto.class, idContacto);
    }

    public List<Contacto> obtenListaContactos() throws HibernateException {
        List<Contacto> listaContactos = null;

        try {
            iniciaOperacion();
            listaContactos = sesion.createQuery("from Contacto").list();
        } finally {
            sesion.close();
        }

        return listaContactos;
    }

    private void iniciaOperacion() throws HibernateException {
        sesion = sessionFactory.getCurrentSession();
        //transaction = sesion.beginTransaction();
    }

    private void manejaExcepcion(HibernateException he) throws HibernateException {
        transaction.rollback();
    }
}
