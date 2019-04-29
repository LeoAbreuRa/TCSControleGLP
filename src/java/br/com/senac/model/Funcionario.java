package br.com.senac.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "funcionario")
@PrimaryKeyJoinColumn(name = "idPessoa")
public class Funcionario extends Pessoa implements Serializable{
    
    private String cpf;
    private String matricula;

    public Funcionario() {
    }

    public Funcionario(String cpf, String matricula, Long id, String nome, String email, String telefone) {
        super(id, nome, email, telefone);
        this.cpf = cpf;
        this.matricula = matricula;
    }

    
    
    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
}
