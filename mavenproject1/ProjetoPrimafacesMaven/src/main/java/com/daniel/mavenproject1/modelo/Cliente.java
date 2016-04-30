/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daniel.mavenproject1.modelo;

/**
 *
 * @author daniel
 */
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="clientes")
public class Cliente implements Serializable {
    private Long id;
    private String nome;
    private Integer idade;
 
    @Id
    @GeneratedValue
    @Column(name="clientes_id")
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    @Column(name="clientes_nome")
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    @Column(name="clientes_idade")
    public Integer getIdade() {
        return idade;
    }
 
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
