/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.dao;

import java.io.Serializable;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public abstract class BaseDaoImpl<T, ID> 
                          implements BaseDao<T, ID>, Serializable{

    Transaction transaction;
            
    @Override
    public void salvarOuAlterar(T entidade, Session session) throws HibernateException {
        transaction = session.beginTransaction();
        session.saveOrUpdate(entidade);
        transaction.commit();
    }

    @Override
    public void remover(T entidade, Session session) throws HibernateException {
        transaction = session.beginTransaction();
        session.delete(entidade);
        transaction.commit();
    }

}
