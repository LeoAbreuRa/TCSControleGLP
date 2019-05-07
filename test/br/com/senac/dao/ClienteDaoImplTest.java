/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.dao;

import br.com.senac.model.Cliente;
import java.util.List;
import org.hibernate.Session;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rossi
 */
public class ClienteDaoImplTest {
    
    public ClienteDaoImplTest() {
    }

    @Test
    public void testPesquisaEntidadeId() {
        System.out.println("pesquisaEntidadeId");
        Long id = null;
        Session session = null;
        ClienteDaoImpl instance = new ClienteDaoImpl();
        Cliente expResult = null;
        Cliente result = instance.pesquisaEntidadeId(id, session);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testListaTodos() {
        System.out.println("listaTodos");
        Session session = null;
        ClienteDaoImpl instance = new ClienteDaoImpl();
        List<Cliente> expResult = null;
        List<Cliente> result = instance.listaTodos(session);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testPesquisaPorNome() {
        System.out.println("pesquisaPorNome");
        String nome = "";
        Session session = null;
        ClienteDaoImpl instance = new ClienteDaoImpl();
        List<Cliente> expResult = null;
        List<Cliente> result = instance.pesquisaPorNome(nome, session);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
