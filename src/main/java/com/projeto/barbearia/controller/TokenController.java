/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projeto.barbearia.controller;

import com.projeto.barbearia.service.TokenService;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



/**
 * TesteController - Controlador REST para testes de geração e validação de tokens JWT
 * 
 * Este controlador fornece dois endpoints:
 * 1. GET /teste - Gera um novo token JWT
 * 2. POST /validar-token - Valida um token JWT enviado como parâmetro
 * 
 * @author Usuario
 */
@RestController
public class TokenController {
    
    @Autowired
    private TokenService service;
    
   
    @PostMapping("/validar-token")
    public String validarToken(@RequestParam String token) {
        if (service.validarToken(token)) {
            Claims claims = service.extrairClaims(token);
            return "Token válido! Subject: " + claims.getSubject() + 
                   ", Emitido em: " + claims.getIssuedAt() + 
                   ", Expira em: " + claims.getExpiration();
        } else {
            return "Token inválido ou expirado!";
        }
    }
}
    

