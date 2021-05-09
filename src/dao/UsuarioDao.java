package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexao.Dao;
import entidade.Usuario;

public class UsuarioDao extends Dao{
	
	/*Método para Adiciona o usuario no banco de dados*/
	public void adiciona(Usuario usuario) {
		try {
			
			Connection conexao = getConexao();
			PreparedStatement pstm = conexao
					.prepareStatement("Insert into	usuarios (id, nome, email, cpf, senha) values	(?,?,?,?,?)");
			
			pstm.setLong(1, usuario.getId());
			pstm.setString(2, usuario.getNome());
			pstm.setString(3, usuario.getEmail());
			pstm.setString(4, usuario.getCpf());
			pstm.setString(5, usuario.getSenha());
			
			
			pstm.execute();
			pstm.close();
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*Método para editar o usuario no banco de dados*/
	public void atualiza(Usuario usuario) {
		try {
			
			Connection conexao = getConexao();
			PreparedStatement pstmt = conexao
					.prepareStatement("Update usuarios SET id = ?, nome = ?, email = ?, cpf = ?, senha = ?"
							+ " WHERE id = ? ");
			
			pstmt.setLong(1, usuario.getId());
			pstmt.setString(2, usuario.getNome());
			pstmt.setString(3, usuario.getEmail());
			pstmt.setString(4, usuario.getCpf());
			pstmt.setString(5, usuario.getSenha());
			
			pstmt.execute();
			pstmt.close();
			conexao.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*Método para excluir o usuario no banco de dados*/
	public void remove(Usuario usuario) {
		try {
			Connection conexao = getConexao();
			PreparedStatement pstm = conexao
					.prepareStatement("Delete from	usuarios where id = ? ");
			
			pstm.setLong(1, usuario.getId());
			
			pstm.execute();
			pstm.close();
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/*Método para procurar o usuario no banco de dados*/
	public boolean pesquisa(Usuario usuario) {
		boolean encontrou = false;
		try {
			Connection conexao = getConexao();
			PreparedStatement pstm = conexao
					.prepareStatement("Select * from usuarios where id = ?");
			
			pstm.setLong(1, usuario.getId());
			ResultSet rs = pstm.executeQuery();
			if (rs.next()) {
				encontrou = true;
			}
			pstm.close();
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return encontrou;
	}
	
	/*Método exibir a consulta do usuario*/
	public Usuario consultar(Usuario usuario) {
		try {
			Connection conexao = getConexao();
			PreparedStatement pstm = conexao
					.prepareStatement("Select * from usuarios where id =	?");
			
			pstm.setLong(1, usuario.getId());
			ResultSet rs = pstm.executeQuery();
			
			if (rs.next()) {
				usuario.setId(rs.getLong("id"));
				usuario.setNome(rs.getString("nome"));
				usuario.setEmail(rs.getString("email"));
				usuario.setCpf(rs.getString("cpf"));
				usuario.setSenha(rs.getString("senha"));
			}
			
			pstm.close();
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usuario;
	}
	
	/*Método listar todos usuario*/
	public List<Usuario> listar() {
		
		List<Usuario> lista = new ArrayList<>();
		
		try {
			
			Connection conexao = getConexao();
			Statement stm = conexao.createStatement();
			ResultSet rs = stm.executeQuery("Select * from usuarios");
			
			while (rs.next()) {
				
				Usuario usuario = new Usuario();
				
				usuario.setId(rs.getLong("id"));
				usuario.setNome(rs.getString("nome"));
				usuario.setEmail(rs.getString("email"));
				usuario.setCpf(rs.getString("cpf"));
				usuario.setSenha(rs.getString("senha"));
				
				lista.add(usuario);
			}
			
			
			stm.close();
			conexao.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return lista;
	}

	
}
