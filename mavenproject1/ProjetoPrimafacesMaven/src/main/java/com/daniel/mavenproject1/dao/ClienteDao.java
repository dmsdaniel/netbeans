/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daniel.mavenproject1.dao;

import com.daniel.mavenproject1.modelo.Cliente;
 
public class ClienteDao extends GenericDAO<Cliente, Long> {
    public ClienteDao() {
       super(Cliente.class);
    } 
    
}