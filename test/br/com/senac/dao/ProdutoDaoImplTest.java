/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.dao;

import br.com.senac.model.Produto;
import java.util.List;
import org.hibernate.Session;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pedrão
 */
public class ProdutoDaoImplTest {
    
    private Produto produto;
    private ProdutoDao dao;
    private Session session;
    
    public ProdutoDaoImplTest() {
        session = HibernateUtil.abreSessao();
        dao = new ProdutoDaoImpl();
        
    }

    @Test
    public void testPesquisaEntidadeId() {
        System.out.println("pesquisaEntidadeId");
        Long id = null;
        Session session = null;
        ProdutoDaoImpl instance = new ProdutoDaoImpl();
        Produto expResult = null;
        Produto result = instance.pesquisaEntidadeId(id, session);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testListaTodos() {
        System.out.println("listaTodos");
        testSalvar();
        session = HibernateUtil.abreSessao();
        dao.listaTodos(session);
        session.close();
        System.out.println(produto);
    }

    @Test
    public void testPesquisaPorNome() {
        System.out.println("pesquisaPorNome");
        testSalvar();
        session = HibernateUtil.abreSessao();
        dao.pesquisaPorNome("P13", session);
        assertNotNull(produto.getId());
        session.close();
        System.out.println(produto);
    }
    
    @Test
    public void testSalvar() {
        System.out.println("Teste Salvar");
        produto = new Produto(1L, 50, "p13", "Ultragás");
              
        try {
            dao.salvarOuAlterar(produto, session);
            assertNotNull(produto.getId());
        } catch (Exception e) {
            System.out.println("Erro ao salvar teste " + e.getMessage());
        }
    }

    }
    

