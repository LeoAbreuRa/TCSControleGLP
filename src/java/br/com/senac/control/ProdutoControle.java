/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.control;

import br.com.senac.dao.HibernateUtil;
import br.com.senac.dao.ProdutoDao;
import br.com.senac.model.Produto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.DataModel;
import org.hibernate.Session;

/**
 *
 * @author Pedrão Master
 */

@ManagedBean(name ="ProdutoP")
@ViewScoped
public class ProdutoControle  implements Serializable {
      private boolean mostrarToolbar = false;
      private String pesqProduto = "";
      private Session session;
      private ProdutoDao dao;
      private Produto produto;
      private List<Produto> produtos;
      private DataModel<Produto> modelProduto;
      
      private void abreSessao() {
        if (session == null || !session.isOpen()) {
            session = HibernateUtil.abreSessao();
        }
    }

    public void mudaToolbar() {
        produto = new Produto();
        produtos = new ArrayList();
        pesqProduto = "";
        mostrarToolbar = !mostrarToolbar;
    }

    public boolean isMostrarToolbar() {
        return mostrarToolbar;
    }

    public void setMostrarToolbar(boolean mostrarToolbar) {
        this.mostrarToolbar = mostrarToolbar;
    }

    public String getPesqProduto() {
        return pesqProduto;
    }

    public void setPesqProduto(String pesqProduto) {
        this.pesqProduto = pesqProduto;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public ProdutoDao getDao() {
        return dao;
    }

    public void setDao(ProdutoDao dao) {
        this.dao = dao;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public DataModel<Produto> getModelProduto() {
        return modelProduto;
    }

    public void setModelProduto(DataModel<Produto> modelProduto) {
        this.modelProduto = modelProduto;
    }
    
    
}
