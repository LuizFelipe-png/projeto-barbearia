/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projeto.barbearia.controller;

import com.projeto.barbearia.model.UsuarioBean;
import com.projeto.barbearia.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Aluno
 */
@RequestMapping("/api/usuarios")
public class UsuarioController {
    
    @Autowired
    private UsuarioService service;
    
    @PostMapping
    public String Cadastrar(@RequestBody UsuarioBean usuario){
        service.cadastrar(usuario);
        return "sucesso!";
    }
    
    @GetMapping
    public UsuarioBean login (@RequestBody UsuarioBean usuario){
        return service.login(usuario);
    }
}
