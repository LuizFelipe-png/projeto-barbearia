/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projeto.barbearia.model;

import java.sql.Date;

/**
 *
 * @author Aluno
 */
public class AgendamentoBean {
    private Integer id_agendamento;
    private Date data_agendamento;
    private Integer id_barbeiro_agendamento;

    public AgendamentoBean() {
    }

    public AgendamentoBean(Integer id_agendamento, Date data_agendamento, Integer id_barbeiro_agendamento) {
        this.id_agendamento = id_agendamento;
        this.data_agendamento = data_agendamento;
        this.id_barbeiro_agendamento = id_barbeiro_agendamento;
    }

    public Integer getId_agendamento() {
        return id_agendamento;
    }

    public void setId_agendamento(Integer id_agendamento) {
        this.id_agendamento = id_agendamento;
    }

    public Date getData_agendamento() {
        return data_agendamento;
    }

    public void setData_agendamento(Date data_agendamento) {
        this.data_agendamento = data_agendamento;
    }

    public Integer getId_barbeiro_agendamento() {
        return id_barbeiro_agendamento;
    }

    public void setId_barbeiro_agendamento(Integer id_barbeiro_agendamento) {
        this.id_barbeiro_agendamento = id_barbeiro_agendamento;
    }

    
}
