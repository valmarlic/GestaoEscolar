package br.com.gestaoEscolar.model.daoEscola;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.gestaoEscolar.domainEscola.GestaoEscolarCaracterizacaoEquipamentoEscola;
import br.com.gestaoEscolar.domainEscola.GestaoEscolarDadosEducaconaisEscola;
import br.com.gestaoEscolar.domainEscola.GestaoEscolarHecursosHumanosEscola;


public class GestaoEscoarRecursosHumanosDao {

	public List<GestaoEscolarHecursosHumanosEscola> getFornecedores()
			throws SQLException, ClassNotFoundException {
		Connection conexao = ConexaoJDBCFactory.getConexao();
		PreparedStatement ps = conexao.prepareStatement(
				"SELECT numerocartao,NOME,CPF,RG,datentrada,datasaida,setorvisitado,foto FROM TB_VISITANTE");
		ResultSet rs = ps.executeQuery();
		List<GestaoEscolarHecursosHumanosEscola> fornecedores = new ArrayList<>();
		while (rs.next()) {
			// fornecedores.add(new Fornecedor(rs.getInt(1), rs.getString(2),
			// rs.getString(3), rs.getString(4),
			// rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)));

			rs.close();
			conexao.close();
		}
		return fornecedores;

	}

	public void salvar(GestaoEscolarHecursosHumanosEscola fornecedor)
			throws SQLException, ClassNotFoundException {
		System.out.println();
		// System.out.println(" Recebendo GestaoEscolarDadosGeraisDao " +
		// fornecedor.getCnpjEntidade());
		

		try {
			Connection conexao = ConexaoJDBCFactory.getConexao();
			PreparedStatement statement = conexao.prepareStatement(
					"INSERT INTO caracterizacao_recursos_humanos_alimentacao_escolar_escola( "
					+ "codigo_escola,profissionais_escola_quantidade_auxiliares_secretaria_auxiliare,profissionais_escola_quantidade_servico_gerais_porteiros_zelado,"
					+ "profissionais_escola_quantidade_bibliotecario_auxiliar_bibliote,profissionais_escola_quantidade_bombeiro_brigadista_profissiona,"
					+ "profissionais_escola_quantidade_coordenador_turno_disciplinar,profissionais_escola_quantidade_fonoaudiologo,profissionais_escola_quantidade_nutricionista,"
					+ "profissionais_escola_quantidade_psicologo_escolar,profissionais_escola_quantidade_profissional_preparacao_seguran,"
					+ "profissionais_escola_quantidade_profissional_apoio_supervisao_p,profissionais_escola_quantidade_secretario_escolar,"
					+ "profissionais_escola_quantidade_seguranca_guarda_seguranca_patr,profissionais_escola_quantidade_tecnico_monitores_supervisores,"
					+ "profissionais_escola_quantidade_vice_diretor_diretor_adjunto_pr,profissionais_escola_quantidade_orientador_comunitario_assisten,"
					+ "indicador_alimentacao_escola_pnae_fnde,data_criacao_registro_tabela,usuario_criacao_registro_tabela"
					+ ") VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

			//44 campos- statement.setInt(1, fornecedor.getCodigoEscola());

			statement.setInt(1, fornecedor.getCodigoEscolaRecursosHumanos());
			statement.setInt(2, fornecedor.getProfissionaisEscolaQtdAuxiliaresSecretariaAuxiliare());
			statement.setInt(3, fornecedor.getProfissionaisEscolaQtdServicoGeraisPorteirosZelador());
			statement.setInt(4, fornecedor.getProfissionaisEscolaQtdBibliotecarioAuxiliarBiblioteca());
			statement.setInt(5, fornecedor.getProfissionaisEscolaQtdBombeiroBrigadistaProfissiona());
			statement.setInt(6, fornecedor.getProfissionaisEscolaQtdCoordenadorTurnoDisciplinar());
			statement.setInt(7, fornecedor.getProfissionaisEscolaQtdFonoaudiologo());
			statement.setInt(8, fornecedor.getProfissionaisEscolaQtdNutricionista());
			statement.setInt(9, fornecedor.getProfissionaisEscolaQtdPsicologoEscolar());
			statement.setInt(10, fornecedor.getProfissionaisEscolaQtdProfissionalPreparacaoSeguranca());
			statement.setInt(11, fornecedor.getProfissionaisEscolaQtdProfissionalApoioSupervisaoP());
			statement.setInt(12, fornecedor.getProfissionaisEscolaQtdSecretarioEscolar());
			statement.setInt(13, fornecedor.getProfissionaisEscolaQtdSegurancaGuardaPatr());
			statement.setInt(14, fornecedor.getProfissionaisEscolaQtdTecnicoMonitoresSupervisores());
			statement.setInt(15, fornecedor.getProfissionaisEscolaQtdViceDiretorAdjuntoPr());
			statement.setInt(16, fornecedor.getProfissionaisEscolaQtdOrientadorComunitarioAssisten());
			statement.setString(17, fornecedor.getIndicadorAlimentacaoEscolaPnaeFnde());
			statement.setObject(18, fornecedor.getDataCriacaoRegistroTabela());
			statement.setInt(19, fornecedor.getUsuarioCriacaoRegistroTabela());
			
			
			statement.execute();
			statement.closeOnCompletion();
			conexao.close();
			//System.out.println("Dados Enviados com sucesso....!");
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

	public GestaoEscolarHecursosHumanosEscola getFornecedorId(Integer codFornecedor)
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

	public void atualizar(GestaoEscolarHecursosHumanosEscola fornecedor) throws SQLException, ClassNotFoundException {
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
