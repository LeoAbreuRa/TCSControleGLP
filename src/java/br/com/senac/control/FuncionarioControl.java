package br.com.senac.control;

import br.com.senac.dao.FuncionarioDao;
import br.com.senac.dao.FuncionarioDaoImpl;
import br.com.senac.dao.HibernateUtil;
import br.com.senac.model.Endereco;
import br.com.senac.model.Funcionario;
import java.io.Serializable;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.ArrayDataModel;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import org.hibernate.Session;

/**
 *
 * @author Leo
 */
@ManagedBean
@ViewScoped
public class FuncionarioControl implements Serializable{
    
    private Funcionario funcionario;
    private FuncionarioDao funcionarioDao;
    private Endereco endereco;
    private Session session;
    private DataModel<Funcionario> modelFuncionarios;
    private List<Funcionario> funcionarios;
    private boolean mostrar_toolbar;
    
    private void abreSessao(){
        if(session == null){
            session = HibernateUtil.abreSessao();
        }else if(!session.isOpen()){
            session = HibernateUtil.abreSessao();
        }
    }
    
    public void novo() {
        mostrar_toolbar = !mostrar_toolbar;
    }

    public void novaPesquisa() {
        mostrar_toolbar = !mostrar_toolbar;
    }

    public void preparaAlterar() {
        mostrar_toolbar = !mostrar_toolbar;
    }
    
    public void pesquisar() {
        funcionarioDao = new FuncionarioDaoImpl();
        try {
            abreSessao();
            funcionarios = funcionarioDao.pesquisaPorNome(funcionario.getNome(), session);
            modelFuncionarios = new ListDataModel(funcionarios);
            funcionario.setNome(null);
        } catch (Exception e) {
            System.out.println("erro ao pesquisar funcionario por nome: " + e.getMessage());
        } finally {
            session.close();
        }
    }
    
    public void limpar(){
        funcionario = new Funcionario();
    }
    
    public void carregarParaAlterar(){
        mostrar_toolbar = !mostrar_toolbar;
        funcionario = modelFuncionarios.getRowData();
    }
    
    public void excluir(){
        funcionario = modelFuncionarios.getRowData();
        funcionarioDao = new FuncionarioDaoImpl();
        abreSessao();
        try {
            funcionarioDao.remover(funcionario, session);
            funcionarios.remove(funcionario);
            modelFuncionarios = new ListDataModel(funcionarios);
            
        } catch (Exception e) {
        }
    }
    
}
