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
public class BarbeariaDAO {
    public List<BarbeariaBean> listarBarbeiros() {
        List<BarbeariaBean> lista = new ArrayList<>();
        try{
            Connection conn = Conexao.conectar();
            
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conn.prepareStatement("SELECT * FROM barbeiros");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                BarbeariaBean bean = new BarbeariaBean();
                bean.setNome(rs.getString("nome"));
                bean.setTelefone(rs.getInt("telefone"));
                bean.setEmail(rs.getString("email"));
                
                lista.add(bean);
            }
         
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return lista;
    }
    
    
}
