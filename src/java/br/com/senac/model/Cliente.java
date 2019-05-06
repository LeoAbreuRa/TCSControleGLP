/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author rossi
 */
@Entity
@Table(name = "cliente")
public class Cliente extends Pessoa implements Serializable {
    
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Caminhao> caminhoes;
    private String cnpj;
    private String nomeSocial;
    private int codigo;

    public Cliente() {
    }

    public Cliente(List<Caminhao> caminhoes, String cnpj, String nomeSocial, int codigo) {
        this.caminhoes = caminhoes;
        this.cnpj = cnpj;
        this.nomeSocial = nomeSocial;
        this.codigo = codigo;
    }

    public List<Caminhao> getCaminhoes() {
        return caminhoes;
    }

    public void setCaminhoes(List<Caminhao> caminhoes) {
        this.caminhoes = caminhoes;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
  


    }

   
    

