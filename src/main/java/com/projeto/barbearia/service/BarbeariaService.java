/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projeto.barbearia.service;

import com.projeto.barbearia.Repository.BarbeariaDAO;
import com.projeto.barbearia.model.BarbeariaBean;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Aluno
 */
@Service
public class BarbeariaService {
    @Autowired
    private BarbeariaDAO repository;
    
    public List<BarbeariaBean> listarBarbeiros() {
        return repository.listarBarbeiros();
    }
    
}
