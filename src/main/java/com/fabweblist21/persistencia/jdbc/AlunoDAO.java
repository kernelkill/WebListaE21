package com.fabweblist21.persistencia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.fabweblist21.persistencia.entidade.Aluno;


public class AlunoDAO {
	
	//Pega a Conexao com o banco 
	Connection con = ConexaoFactory.getConexao();
	
	public void cadastrarAluno(Aluno aluno){
		
		//Construindo o sql para inserção
		String sql = "INSERT INTO aluno (nome, nota) VALUES (?, ?)";
		
		try(PreparedStatement preparador = con.prepareStatement(sql)) {
			
			preparador.setString(1, aluno.getNome());
			preparador.setDouble(2, aluno.getNota());
			
			preparador.execute();
			
		} catch (SQLException e) {
			throw new RuntimeException("Erro ao cadastrar...", e);
		}
	}

}
