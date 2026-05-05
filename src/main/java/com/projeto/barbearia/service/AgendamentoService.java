/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projeto.barbearia.service;

import com.projeto.barbearia.Repository.AgendamentoDAO;
import com.projeto.barbearia.model.AgendamentoBean;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Aluno
 */
@Service
public class AgendamentoService {
    
@Autowired
    private AgendamentoDAO repository;
    
   public void inserirAgendamento(AgendamentoBean agendamento){
       
            repository.inserirAgendamento(agendamento);
       }
   
   public List<AgendamentoBean> listarAgendamentosFiltradosData(){
        return repository.listarAgendamentosFiltradosData();
    }
}
