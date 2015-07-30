package com.fabweblist21.persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
	
	public static Connection getConexao() {

		try {
			Class.forName("org.postgresql.Driver");
			return DriverManager.getConnection("jdbc:postgresql:lista21",
					"postgres", "toor");
			
		} catch (SQLException e) {
			throw new RuntimeException("Erro na Conexao com o banco", e);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
}
