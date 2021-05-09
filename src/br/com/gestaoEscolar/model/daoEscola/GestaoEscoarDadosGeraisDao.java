package br.com.gestaoEscolar.model.daoEscola;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.gestaoEscolar.domainEscola.GestaoEscolarDadosGerais;


public class GestaoEscoarDadosGeraisDao {

	public List<GestaoEscolarDadosGerais> getFornecedores() throws SQLException, ClassNotFoundException {
		Connection conexao = ConexaoJDBCFactory.getConexao();
		PreparedStatement ps = conexao.prepareStatement(
				"SELECT numerocartao,NOME,CPF,RG,datentrada,datasaida,setorvisitado,foto FROM TB_VISITANTE");
		ResultSet rs = ps.executeQuery();
		List<GestaoEscolarDadosGerais> fornecedores = new ArrayList<>();
		while (rs.next()) {
			// fornecedores.add(new Fornecedor(rs.getInt(1), rs.getString(2),
			// rs.getString(3), rs.getString(4),
			// rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)));

			rs.close();
			conexao.close();
		}
		return fornecedores;

	}

	public void salvar(GestaoEscolarDadosGerais fornecedor) throws SQLException, ClassNotFoundException {
		System.out.println();
	//	System.out.println("  Recebendo GestaoEscolarDadosGeraisDao  " + fornecedor.getCnpjEntidade());
		System.out.println();
		
		try {
			Connection conexao = ConexaoJDBCFactory.getConexao();
			PreparedStatement statement = conexao.prepareStatement(
					"INSERT INTO escola(nome_escola, codigo_inep_escola, cep_escola,endereco_escola,"

							+ "bairro_escola, numero_escola,complemento_endereco_escola, latitude_endereco_escola, "

							+ "longitude_endereco_escola,telefone_escola,codigo_status_escola, codigo_nucleo,indicador_escola_polo,"

							+ "indicador_escola_anexo,codigo_escola_polo,email_institucional_escola,zona_localizacao_escola,"

							+ "indicador_regulamentacao_autorizacao_escola,indicador_dependencia_administrativa_escola,"

							+ "data_criacao_registro_tabela,usuario_criacao_registro_tabela, data_atualizacao_registro_tabela,usuario_atualizacao_registro_tabela,"

							+ "cnpj_entidade, tipo_polo_anexo,distrito,"

							+ "uf,telefone_celular,fax_contato,numero_contato,municipio_escola) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

			// statement.setInt(1, fornecedor.getCodigoEscola());
			
			 statement.setString(1, fornecedor.getNomeEscola()); 
			 statement.setInt(2, (Integer) fornecedor.getCodInepEscola());
			 statement.setInt(3,fornecedor.getCepEscola());
			 statement.setString(4,fornecedor.getEnderecoEscola());
			 statement.setString(5,fornecedor.getBairroEscola()); statement.setString(6,
			  fornecedor.getNumeroEscola()); statement.setString(7,
			  fornecedor.getComplentEndercoEscola()); statement.setString(8,
			  fornecedor.getLatitudeEndEscola()); statement.setString(9,
			  fornecedor.getLongtudeEndEscola()); statement.setString(10,
			  fornecedor.getTelefoneEscola()); statement.setInt(11,
			  fornecedor.getCodStatusEscola()); statement.setInt(12,
			  fornecedor.getNucleo()); statement.setString(13,
			  fornecedor.getIndicadorEscolaPolo()); statement.setString(14,
			  fornecedor.getIndicadorEscolaAnexo()); statement.setInt(15,
			  fornecedor.getCodEscolaPolo()); statement.setString(16,
			  fornecedor.getEmailInstcnalEscola());
			  
			  statement.setInt(17, fornecedor.getZonaLoclizcaoEscola());
			  statement.setInt(18, fornecedor.getIndcdorReglantcaAutrzcaoEscola());
			  statement.setInt(19, fornecedor.getInddorDpciaAdmtvEscola());
			  statement.setObject(20, fornecedor.getDataCriacaoRegistroTabela());
			  statement.setInt(21, fornecedor.getUsuarioCriacaoRgistroTabela());
			  statement.setObject(22, fornecedor.getDatAtulizcaoRegistroTabela());
			  statement.setInt(23, fornecedor.getUsuarioAtulizcaoRegistroTabela());
			  statement.setString(24, fornecedor.getCnpjEntidade());
			  statement.setString(25, fornecedor.getTipoPoloAnexo());
			  statement.setString(26, fornecedor.getDistrito()); statement.setString(27,
			  fornecedor.getUf()); statement.setString(28,
			  fornecedor.getTelefoneCelelar()); statement.setString(29,
			  fornecedor.getFaxContato()); statement.setString(30,
			  fornecedor.getNumeroContato()); statement.setString(31,
			  fornecedor.getMunicipio());
			
			
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
