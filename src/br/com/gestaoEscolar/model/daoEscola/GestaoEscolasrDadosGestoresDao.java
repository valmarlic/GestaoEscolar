package br.com.gestaoEscolar.model.daoEscola;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.gestaoEscolar.domainEscola.GestaoEscolarDadosGerais;
import br.com.gestaoEscolar.domainEscola.GestaoEscolasrDadosGestores;

public class GestaoEscolasrDadosGestoresDao {

	public List<GestaoEscolasrDadosGestoresDao> getFornecedores() throws SQLException, ClassNotFoundException {
		// gestaoEscolasrDadosGestores

		Connection conexao = ConexaoJDBCFactory.getConexao();
		PreparedStatement ps = conexao.prepareStatement(
				"SELECT numerocartao,NOME,CPF,RG,datentrada,datasaida,setorvisitado,foto FROM TB_VISITANTE");
		ResultSet rs = ps.executeQuery();
		List<GestaoEscolasrDadosGestoresDao> fornecedores = new ArrayList<>();
		while (rs.next()) {
			// fornecedores.add(new Fornecedor(rs.getInt(1), rs.getString(2),
			// rs.getString(3), rs.getString(4),
			// rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)));

			rs.close();
			conexao.close();
		}
		return fornecedores;

	}

	// gestaoEscolasrDadosGestores
	public void salvar(GestaoEscolasrDadosGestores fornecedor) throws SQLException, ClassNotFoundException {
		System.out.println();
		// System.out.println(" Recebendo GestaoEscolarDadosGeraisDao " +
		// fornecedor.getCnpjEntidade());
		System.out.println();

		try {
			Connection conexao = ConexaoJDBCFactory.getConexao();
			PreparedStatement statement = conexao.prepareStatement(
					"INSERT INTO diretor_geral(nome_diretor, cpf_diretor, criterio_acesso_cargo_funcao,e_mail_diretor,"
							+ "situacao_funcional, data_cadastral) VALUES(?,?,?,?,?,?)");

			statement.setString(1, fornecedor.getNomeDiretorGeral());
			statement.setString(2, fornecedor.getCpfDiretorGeral());
			statement.setString(3, fornecedor.getCriterioAcessoDgeral());
			statement.setString(4, fornecedor.getEmailDiretorGeral());
			statement.setString(5, fornecedor.getSituacaoFuncDiretorGeral());
			statement.setObject(6, fornecedor.getDataCadastral());

			statement.execute();
			statement.closeOnCompletion();
			conexao.close();
		}

		catch (SQLException | IllegalArgumentException e) {

			System.out.println("Erro no banco BD..  " + e.getMessage());
			// RequestDispatcher dispatcher =
			// request.getRequestDispatcher("../ESCOLA/CadastroEscola/cadastroEscola.jsp");
			// dispatcher.forward(request, response);
		} catch (Exception e) {

		}

	}

	public void excluir(Integer codFornecedor) throws SQLException, ClassNotFoundException {
		Connection conexao = ConexaoJDBCFactory.getConexao();
		PreparedStatement statement = conexao.prepareStatement("DELETE FROM TB_VISITANTE WHERE numerocartao = ?");
		statement.setInt(1, codFornecedor);
		statement.execute();
		statement.close();
		conexao.close();
	}

	public GestaoEscolarDadosGerais getFornecedorId(Integer codFornecedor)
			throws IllegalArgumentException, SQLException, ClassNotFoundException {
		Connection conexao = ConexaoJDBCFactory.getConexao();
		PreparedStatement ps = conexao.prepareStatement(
				"SELECT numerocartao,NOME,CPF,RG,datentrada,datasaida,setorvisitado,foto FROM TB_VISITANTE WHERE numerocartao = ?");
		ps.setInt(1, codFornecedor);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			// return new Fornecedor(rs.getString(1), rs.getString(2), rs.getString(3),
			// rs.getString(4), rs.getString(5),
			// rs.getString(6), rs.getString(7), rs.getString(8));
			rs.close();
			conexao.close();
		}
		throw new IllegalArgumentException("Nao achou visitante para o codigo " + codFornecedor);
	}

	public void atualizar(GestaoEscolarDadosGerais fornecedor) throws SQLException, ClassNotFoundException {
		Connection conexao = ConexaoJDBCFactory.getConexao();
		PreparedStatement statement = conexao.prepareStatement(
				"UPDATE TB_VISITANTE SET NOME =?,CPF = ?,RG = ?,datentrada = ?,setorvisitado = ?,setorvisitado = ?,foto = ?, WHERE numerocartao = ?");
		// statement.setString(1, fornecedor.getNome());
		// statement.setString(2, fornecedor.getCpf());
		// statement.setString(3, fornecedor.getRg());
		// statement.setString(4, fornecedor.getDataentrada());
		// statement.setString(5, fornecedor.getDatasaida());
		// statement.setString(6, fornecedor.getSetorvisitado());
		// statement.setString(7, fornecedor.getFoto());
		// statement.execute();
		statement.close();
		conexao.close();
	}

}
