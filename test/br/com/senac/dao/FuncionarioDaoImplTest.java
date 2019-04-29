/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.dao;

import br.com.senac.model.Funcionario;
import java.util.List;
import org.hibernate.Session;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alunos
 */
public class FuncionarioDaoImplTest {
    
    private Funcionario funcionario;
    private FuncionarioDao dao;
    private Session session;
    
    public FuncionarioDaoImplTest() {
        session = HibernateUtil.abreSessao();
    }
    
    @Test
    public void testSalvar() {
        System.out.println("Teste Salvar");
        dao = new FuncionarioDaoImpl();
        funcionario = new Funcionario("1232456", "159753", 1L, "jorge", "lol@gmail", "123456");
        session = HibernateUtil.abreSessao();
        dao.salvarOuAlterar(funcionario, session);
        session.close();
        System.out.println(funcionario);
    }

//    @Test
    public void testPesquisaEntidadeId() {
        System.out.println("pesquisaEntidadeId");
        Long id = null;
        Session session = null;
        FuncionarioDaoImpl instance = new FuncionarioDaoImpl();
        Funcionario expResult = null;
        Funcionario result = instance.pesquisaEntidadeId(id, session);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

//    @Test
    public void testListaTodos() {
        System.out.println("listaTodos");
        Session session = null;
        FuncionarioDaoImpl instance = new FuncionarioDaoImpl();
        List<Funcionario> expResult = null;
        List<Funcionario> result = instance.listaTodos(session);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

//    @Test
    public void testPesquisaPorNome() {
        System.out.println("pesquisaPorNome");
        String nome = "";
        Session session = null;
        FuncionarioDaoImpl instance = new FuncionarioDaoImpl();
        List<Funcionario> expResult = null;
        List<Funcionario> result = instance.pesquisaPorNome(nome, session);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

//    @Test
    public void testListarPorUnidade() {
        System.out.println("listarPorUnidade");
        String unidade = "";
        Session session = null;
        FuncionarioDaoImpl instance = new FuncionarioDaoImpl();
        List<Funcionario> expResult = null;
        List<Funcionario> result = instance.listarPorUnidade(unidade, session);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

//    @Test
    public void testBuscarPorCpf() {
        System.out.println("buscarPorCpf");
        String cpf = "";
        Session session = null;
        FuncionarioDaoImpl instance = new FuncionarioDaoImpl();
        Funcionario expResult = null;
        Funcionario result = instance.buscarPorCpf(cpf, session);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

//    @Test
    public void testBuscarPorMatricula() {
        System.out.println("buscarPorMatricula");
        String matricula = "";
        Session session = null;
        FuncionarioDaoImpl instance = new FuncionarioDaoImpl();
        Funcionario expResult = null;
        Funcionario result = instance.buscarPorMatricula(matricula, session);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

//    @Test
    public void testListarPorFuncao() {
        System.out.println("listarPorFuncao");
        String funcao = "";
        Session session = null;
        FuncionarioDaoImpl instance = new FuncionarioDaoImpl();
        List<Funcionario> expResult = null;
        List<Funcionario> result = instance.listarPorFuncao(funcao, session);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
