package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import entidade.Usuario;

public class UsuarioDAO extends ConexaoDAO {

	private Connection conn;
	public UsuarioDAO(){
		try {
			conn = getConnection();
		} catch(SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao abrir a conexão: " + e.getMessage());
		}
	}
	
	// Método responsável por salvar o aluno no banco de dados
	
	public void save(Usuario a) throws SQLException{
		PreparedStatement stmt = null;
		try {
			stmt = conn.prepareStatement("insert into usuario values (null, ?, ?, ?, ?, ?)");
			stmt.setString(1, a.getNome());
			stmt.setString(2, a.getCpf());
			stmt.setString(3, a.getTelefone());
			stmt.setString(4, a.getEndereco());
			stmt.setString(5, a.getCargo());
			int flag = stmt.executeUpdate();
			if(flag == 0)
				throw new SQLException("Erro ao gravar no banco");
		} finally {
			if(conn != null)
				conn.close();
			if(stmt != null)
				stmt.close();
		}
	}
	}

