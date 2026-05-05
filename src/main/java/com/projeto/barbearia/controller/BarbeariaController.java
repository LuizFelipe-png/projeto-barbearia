/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projeto.barbearia.controller;

import com.projeto.barbearia.model.BarbeariaBean;
import com.projeto.barbearia.service.BarbeariaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Aluno
 */
@RestController
@RequestMapping("/api/barbeiros")
public class BarbeariaController {
    
    @Autowired
    private BarbeariaService barbeariaservice;
    
    @GetMapping
    public List<BarbeariaBean> listarBarbeiros() {
        System.out.println(barbeariaservice.listarBarbeiros());
        return barbeariaservice.listarBarbeiros();
    }
}

