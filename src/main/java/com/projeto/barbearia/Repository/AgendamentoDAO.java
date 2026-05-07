/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projeto.barbearia.Repository;

import com.projeto.barbearia.model.AgendamentoBean;
import com.projeto.barbearia.model.BarbeariaBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Aluno
 */
@Repository
public class AgendamentoDAO {
    public void inserirAgendamento(AgendamentoBean agendamento){
        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            stmt = conn.prepareStatement("INSERT INTO agendamento (data_agendamento, id_barbeiro_agendamento) VALUES (?,?)");
            stmt.setDate(1, agendamento.getData_agendamento());
            stmt.setInt(2, agendamento.getId_barbeiro_agendamento());
            
            stmt.executeUpdate();
            
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<AgendamentoBean> listarAgendamentosFiltradosData() {
        List<AgendamentoBean> lista = new ArrayList<>();
        try{
            Connection conn = Conexao.conectar();
            
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conn.prepareStatement("SELECT * FROM agendamento WHERE data_agendamento >= CURDATE();");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                AgendamentoBean bean = new AgendamentoBean();
                bean.setId_agendamento(rs.getInt("id_agendamento"));
                bean.setData_agendamento(rs.getDate("data_agendamento"));
                bean.setId_barbeiro_agendamento(rs.getInt("id_barbeiro"));
                
                lista.add(bean);
            }
         
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return lista;
    }
}
