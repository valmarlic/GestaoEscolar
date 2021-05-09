package br.com.gestaoEscolar.model.daoAluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.gestaoEscolar.domainAluno.GestaoEscolarAlunoIdentificacao;
import br.com.gestaoEscolar.model.daoEscola.ConexaoJDBCFactory;

public class GestaoEscolarAlunoIdentificacaoDao {

	public List<GestaoEscolarAlunoIdentificacao> getFornecedores() throws SQLException, ClassNotFoundException {
		Connection conexao = ConexaoJDBCFactory.getConexao();
		PreparedStatement ps = conexao.prepareStatement(
				"SELECT numerocartao,NOME,CPF,RG,datentrada,datasaida,setorvisitado,foto FROM TB_VISITANTE");
		ResultSet rs = ps.executeQuery();
		List<GestaoEscolarAlunoIdentificacao> fornecedores = new ArrayList<>();
		while (rs.next()) {
			// fornecedores.add(new Fornecedor(rs.getInt(1), rs.getString(2),
			// rs.getString(3), rs.getString(4),
			// rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)));

			rs.close();
			conexao.close();
		}
		return fornecedores;

	}

	public void salvar(GestaoEscolarAlunoIdentificacao fornecedor) throws SQLException, ClassNotFoundException {
		System.out.println();
		// System.out.println(" Recebendo GestaoEscolarDadosGeraisDao " +
		// fornecedor.getCnpjEntidade());
		System.out.println();

		try {
			Connection conexao = ConexaoJDBCFactory.getConexao();
			PreparedStatement statement = conexao.prepareStatement(
					"INSERT INTO estudante(nome_estudante, nome_social_estudante, sexo_estudante,data_nascimento_estudante,"
							+ "codigo_ibge_uf_nascimento_estudante, codigo_ibge_municipio_nascimento_estudante,"
							+ "indicador_aluno_gemeo," + "codigo_inep_estudante,"
							+ "numero_nis_estudante,indicador_bolsa_familia,indicador_historico_escolar_apresentado, indicador_estudante_atividade_complementar,"
							+ "cpf_estudante,cep_endereco_estudante"

							+ ") VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

			// statement.setInt(1, fornecedor.getCodigoEscola());

			statement.setString(1, fornecedor.getNomeEstudante());
			statement.setString(2, fornecedor.getNomeSocialEstudante());
			statement.setString(3, fornecedor.getSexoEstudante());
			statement.setObject(4, fornecedor.getDataNascimentoEstudante());
			statement.setInt(5, fornecedor.getCodigoIbgeUfNascimentoEstudante());

			statement.setInt(6, fornecedor.getCodigoIbgeMunicipioNascimentoEstudante());

			statement.setString(7, fornecedor.getIndicadorAlunoGemeo());

			statement.setInt(8, fornecedor.getCodigoInepEstudante());
			statement.setInt(9, fornecedor.getNumeroNisEstudante());
			statement.setString(10, fornecedor.getIndicadorBolsaFamilia());

			statement.setString(11, fornecedor.getIndicadorHistoricoEscolarApresentado());
			statement.setString(12, fornecedor.getIndicadorEstudanteAtividadeComplementar());

			statement.setString(13, fornecedor.getCpfEstudante());

			statement.setString(14, fornecedor.getCepEnderecoEstudante());

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
			System.out.println("Erro no banco BD..  " + e.getMessage());
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

	public GestaoEscolarAlunoIdentificacao getFornecedorId(Integer codFornecedor)
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

	public void atualizar(GestaoEscolarAlunoIdentificacao fornecedor) throws SQLException, ClassNotFoundException {
		Connection conexao = ConexaoJDBCFactory.getConexao();
		PreparedStatement statement = conexao.prepareStatement(
				"UPDATE estudante SET nome_estudante =?,nome_social_estudante = ?,sexo_estudante = ?,data_nascimento_estudante = ?,"
						+ "codigo_ibge_pais_nacionalidade_estudante = ?,codigo_ibge_uf_nascimento_estudante = ?,"
						+ "nome_pai_estudante = ?, nome_mae_estudante = ?, indicador_mae_falecida = ?, indicador_mae_declarada = ?, indicador_pai_falecido = ?, "
						+ "indicador_pai_declarado = ?, foto = ?,foto = ?, foto = ?,foto = ?, foto = ?, "
						+ "foto = ?, foto = ?, foto = ?, WHERE numerocartao = ?");
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
