/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.dao;

import br.com.senac.model.Cliente;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rossi
 */
public class ClienteDaoImplTest {
    
    private Cliente cliente;
    private ClienteDao dao;
    private Session session;
    

    
    
    public ClienteDaoImplTest() {
        session = HibernateUtil.abreSessao();
        
        
    }
    
     @Test
    public void testSalvar() {
        System.out.println("Teste salvar usuário");
        cliente = new Cliente(1l, "Rodolfo", "rod@gg", "5554545", "33333333", "Ponto Gas");
       
        try {
            dao.salvarOuAlterar(cliente, session);
            assertNotNull(session.getIdentifier(dao));
        } catch (Exception e) {
            System.out.println("Erro ao salvar teste " + e.getMessage());
        }
    }

    @Test
    public void testPesquisaEntidadeId() {
        System.out.println("Teste pesquisar por id ");
        cliente = dao.pesquisaEntidadeId(1l, session);
        assertNotNull(cliente.getId());
    }

    @Test
    public void testListaTodos() {
        System.out.println("Teste listar todos os clientes");
        verificaClienteExistenteBanco();
        List<Cliente> clientes = dao.listaTodos(session);
        assertTrue(!clientes.isEmpty());
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
    
     private void verificaClienteExistenteBanco() {
        Long id;
        try {
            Query consulta = session.createQuery("select max(id) from Cliente");
            id = (Long) consulta.uniqueResult();
            if (id == null) {
                testSalvar();
            } else {
                cliente = dao.pesquisaEntidadeId(id,session);
            }
        } catch (HibernateException e) {
            System.out.println("Erro teste cliente " + e.getMessage());
        }
    
     }
}