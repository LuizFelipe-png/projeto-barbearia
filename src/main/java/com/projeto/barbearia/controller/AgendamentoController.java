/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projeto.barbearia.controller;

import com.projeto.barbearia.model.AgendamentoBean;
import com.projeto.barbearia.model.BarbeariaBean;
import com.projeto.barbearia.service.AgendamentoService;
import com.projeto.barbearia.service.BarbeariaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author Aluno
 */
@RestController
@RequestMapping("/api/agendamentos")
public class AgendamentoController {
    
    @Autowired
    private AgendamentoService service;
    
    @PostMapping
    public String InserirAgendamento(@RequestBody AgendamentoBean agendamento){
        service.inserirAgendamento(agendamento);
        return "sucesso!";
    }
    
    @GetMapping
    public List<AgendamentoBean> listarAgendamentosFiltradosData() {
        return service.listarAgendamentosFiltradosData();
    }
}
