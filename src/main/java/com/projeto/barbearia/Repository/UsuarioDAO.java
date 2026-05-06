/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projeto.barbearia.Repository;

import com.projeto.barbearia.model.AgendamentoBean;
import com.projeto.barbearia.model.UsuarioBean;
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
public class UsuarioDAO {
    public void cadastrar(UsuarioBean cadastro){
        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            stmt = conn.prepareStatement("INSERT INTO usuarios (nome, email, senha) VALUES (?,?,?)");
            stmt.setString(1, cadastro.getNome());
            stmt.setString(2, cadastro.getEmail());
            stmt.setString(3, cadastro.getSenha());
            
            stmt.executeUpdate();
            
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public UsuarioBean login(UsuarioBean login){
        try{
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conn.prepareStatement("SELECT nome, email, senha FROM usuarios WHERE id = ?");
            
            rs = stmt.executeQuery();
            
            if(rs.next()){
            UsuarioBean bean = new UsuarioBean();
            login.setNome(rs.getString("nome"));
            login.setEmail(rs.getString("email"));
            login.setSenha(rs.getString("senha"));
            
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
        return login;
    }
}
