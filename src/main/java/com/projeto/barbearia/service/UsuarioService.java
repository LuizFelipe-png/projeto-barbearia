/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projeto.barbearia.service;

import com.projeto.barbearia.Repository.UsuarioDAO;
import com.projeto.barbearia.model.UsuarioBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Aluno
 */
@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioDAO repository;
    
    public void cadastrar(UsuarioBean usuario){
        repository.cadastrar(usuario);
       }
    
    public UsuarioBean login (UsuarioBean usuario){
        return repository.login(usuario); 
    }
}
