/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projeto.barbearia.controller;

import com.projeto.barbearia.model.UsuarioBean;
import com.projeto.barbearia.service.TokenService;
import com.projeto.barbearia.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Aluno
 */
@RestController
@RequestMapping("/api")
public class UsuarioController {
    
    @Autowired
    private UsuarioService service;
    
    @Autowired
    private TokenService tokenservice;

    @PostMapping("/cadastrar")
    public String cadastrar(@RequestBody UsuarioBean usuario){
        service.cadastrar(usuario);
        return "usuario cadastrado com sucesso!";
    }
    
    @PostMapping("/login")
    public String login (@RequestBody UsuarioBean bean){
        UsuarioBean usuario = service.login(bean.getEmail(), bean.getSenha());
        if(usuario.getEmail() != null){
            return tokenservice.gerarToken(usuario.getEmail());
        } else {
            return "Login inválido!";
        }
    }
}
