package br.com.gestaoEscolar.model.daoEscola;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.gestaoEscolar.domainEscola.GestaoEscolarCaracterizacaoEquipamentoEscola;


public class GestaoEscoarEquipamentosDao {

	public List<GestaoEscolarCaracterizacaoEquipamentoEscola> getFornecedores()
			throws SQLException, ClassNotFoundException {
		Connection conexao = ConexaoJDBCFactory.getConexao();
		PreparedStatement ps = conexao.prepareStatement(
				"SELECT numerocartao,NOME,CPF,RG,datentrada,datasaida,setorvisitado,foto FROM TB_VISITANTE");
		ResultSet rs = ps.executeQuery();
		List<GestaoEscolarCaracterizacaoEquipamentoEscola> fornecedores = new ArrayList<>();
		while (rs.next()) {
			// fornecedores.add(new Fornecedor(rs.getInt(1), rs.getString(2),
			// rs.getString(3), rs.getString(4),
			// rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)));

			rs.close();
			conexao.close();
		}
		return fornecedores;

	}

	public void salvar(GestaoEscolarCaracterizacaoEquipamentoEscola fornecedor)
			throws SQLException, ClassNotFoundException {
		System.out.println();
		// System.out.println(" Recebendo GestaoEscolarDadosGeraisDao " +
		// fornecedor.getCnpjEntidade());
		

		try {
			Connection conexao = ConexaoJDBCFactory.getConexao();
			PreparedStatement statement = conexao.prepareStatement(
					"INSERT INTO caracterizacao_equipamento_escola(codigo_escola, equipamento_tecnico_administrativo_quantidade_antena_parabolica, equipamento_tecnico_administrativo_computadores,equipamento_tecnico_administrativo_copiadoras,"

							+ "equipamento_tecnico_administrativo_impressoras, equipamento_tecnico_administrativo_impressoras_multifuncionais,equipamento_tecnico_administrativo_scanner, equipamento_aprendizagem_dvd_blu_ray, "

							+ "equipamento_aprendizagem_aparelho_som,equipamento_aprendizagem_televisao,equipamento_aprendizagem_lousa_digital, equipamento_aprendizagem_projetor_multimidia,equipamento_computadores_aluno_desktop,"

							+ "equipamento_computadores_aluno_portateis,equipamento_computadores_aluno_tablets,indicador_acesso_internet_uso_aluno,indicador_acesso_internet_uso_administrativo,"

							+ "indicador_acesso_internet_uso_processo_ensino_aprendizagem,indicador_acesso_internet_uso_comunidade,"

							+ "indicador_acesso_internet_ausente,indicador_equipamento_aluno_acesso_internet_computadores_mesa_p, indicador_equipamento_aluno_acesso_internet_dispositivos_pessoa,indicador_internet_banda_larga,"

							+ "indicador_rede_local_interligacao_computadores_cabo, data_criacao_registro_tabela,usuario_criacao_registro_tabela) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

			// statement.setInt(1, fornecedor.getCodigoEscola());

			statement.setInt(1, fornecedor.getCodigoCarctzEquipfraEscola());
			statement.setInt(2, fornecedor.getQtdAntenaParabolicaEquipamentoEscola());
			statement.setInt(3, fornecedor.getQtdComputadoresAdmEquipamentoEscola());
			statement.setInt(4, fornecedor.getQtdCopiadorasEquipamentoEscola());
			statement.setInt(5, fornecedor.getQtdInpressorasEquipamentoEscola());
			statement.setInt(6, fornecedor.getQtdInpressorasMultfuncionaisEquipamentoEscola());
			statement.setInt(7, fornecedor.getQtdEscannersEquipamentoEscola());
			statement.setInt(8, fornecedor.getQtdDvdBluRayEquipamentoEscola());
			statement.setInt(9, fornecedor.getQtdAparelhoDeSomEquipamentoEscola());
			statement.setInt(10, fornecedor.getQtdAparelhoTVEquipamentoEscola());
			statement.setInt(11, fornecedor.getQtdLousaDigitalEquipamentoEscola());
			statement.setInt(12, fornecedor.getQtdProjetorMultmidiaEquipamentoEscola());
			statement.setInt(13, fornecedor.getQtdComputadorDesktopEquipamentoEscola());
			statement.setInt(14, fornecedor.getQtdComputadoresPortateisEquipamentoEscola());
			statement.setInt(15, fornecedor.getQtdComputadoresTabletsEquipamentoEscola());
			statement.setString(16, fornecedor.getIndicadorAcessoInternetUsoAluno());
			statement.setString(17, fornecedor.getIndicadorAcessoInternetUsoAdministrativo());
			statement.setString(18, fornecedor.getIndicadorAcessoInternetUsoProcessoEnsinoAprendizagem());

			statement.setString(19, fornecedor.getIndicadorAcessoInternetUsoComunidade());
			statement.setString(20, fornecedor.getIndicadorNaoPossuiacessoInternet());
			statement.setString(21, fornecedor.getIndicadorEquipamentoAlunoAcessoInternetComputadoresMesaP());
			statement.setString(22, fornecedor.getIndicadorEquipamentoAlunoAcessoInternetDispositivosPessoa());
			statement.setString(23, fornecedor.getIndicadorInternetBandaLarga());

			statement.setString(24, fornecedor.getIndicadorRedeLocalInterligacaoComputadoresCabo());
			statement.setObject(25, fornecedor.getDataCriacaoRegistroTabela());
			statement.setInt(26, fornecedor.getUsuarioUriacaoRegistroTabela());

			statement.execute();
			statement.closeOnCompletion();
			conexao.close();
			System.out.println("Dados Enviados com sucesso....!");
		}

		catch (SQLException | IllegalArgumentException e) {

			System.out.println("Erro no banco BD..  " + e.getMessage());
		
		} catch (Exception e) {
			System.out.println("Erro ao enviar..  " + e.getMessage());
			
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

	public GestaoEscolarCaracterizacaoEquipamentoEscola getFornecedorId(Integer codFornecedor)
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

	public void atualizar(GestaoEscolarCaracterizacaoEquipamentoEscola fornecedor) throws SQLException, ClassNotFoundException {
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
