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


public class GestaoEscoarDadosEducacionaisDao {

	public List<GestaoEscolarDadosEducaconaisEscola> getFornecedores()
			throws SQLException, ClassNotFoundException {
		Connection conexao = ConexaoJDBCFactory.getConexao();
		PreparedStatement ps = conexao.prepareStatement(
				"SELECT numerocartao,NOME,CPF,RG,datentrada,datasaida,setorvisitado,foto FROM TB_VISITANTE");
		ResultSet rs = ps.executeQuery();
		List<GestaoEscolarDadosEducaconaisEscola> fornecedores = new ArrayList<>();
		while (rs.next()) {
			// fornecedores.add(new Fornecedor(rs.getInt(1), rs.getString(2),
			// rs.getString(3), rs.getString(4),
			// rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)));

			rs.close();
			conexao.close();
		}
		return fornecedores;

	}

	public void salvar(GestaoEscolarDadosEducaconaisEscola fornecedor)
			throws SQLException, ClassNotFoundException {
		System.out.println();
		// System.out.println(" Recebendo GestaoEscolarDadosGeraisDao " +
		// fornecedor.getCnpjEntidade());
		

		try {
			Connection conexao = ConexaoJDBCFactory.getConexao();
			PreparedStatement statement = conexao.prepareStatement(
					"INSERT INTO caracterizacao_dados_educacionais_escola( "
					+ "codigo_escola,indicador_organizacao_ensino_escola_serie_ano,indicador_organizacao_ensino_escola_periodo_semestrais,"
					+ "indicador_organizacao_ensino_escola_ciclos_ensino_fundamental,indicador_organizacao_ensino_escola_ciclos_grupos_nao_seriados,"
					+ "indicador_organizacao_ensino_escola_modulos,indicador_organizacao_ensino_escola_alternancia_regular,indicador_instrumentos_atividades_acervo_multimidia,"
					+ "indicador_instrumentos_atividades_instrumentos_musicais,indicador_instrumentos_atividades_materiais_pedagogicos_educaca,"
					+ "indicador_instrumentos_atividades_brinquedos_educacao_infantil,indicador_instrumentos_atividades_jogos_educativos,"
					+ "indicador_instrumentos_atividades_mat_pedagogicos_educ_etnicos,indicador_iinstrumentos_atividades_materiais_cientificos,"
					+ "indicador_instrumentos_atividades_mat_ativid_culturais_artistic,indicador_instrumentos_atividades_mat_pedagogico_educacao_campo,"
					+ "indicador_instrumentos_atividades_eqpto_amplificacao_difusao_so,indicador_instrumentos_atividades_materiais_pratica_desportiva,"
					+ "indicador_educacao_indigena,indicador_lingua_educacao_indigena,lingua_indigena_01,lingua_indigena_02,lingua_indigena_03,"
					+ "indicador_exame_selecao_ingresso_escola,indicador_reserva_vaga_cota_auto_declarado_preto_pardo_indigena,indicador_reserva_vaga_cota_pessoa_com_deficiencia,"
					+ "indicador_reserva_vaga_cota_condicao_renda,indicador_reserva_vaga_cota_outras_condicoes,indicador_reserva_vaga_cota_oriundo_escola_publica,"
					+ "indicador_reserva_vaga_cota_sem_reserva,indicador_site_blog_rede_sociais_escola,indicador_compartilha_espaco_comunidade,"
					+ "indicador_uso_espaco_equipamento_entorno_escola,indicador_orgao_colegiados_funcionamento_escola_associacao_pais,indicador_orgao_colegiados_funcionamento_escola_assoc_pais_mest,"
					+ "indicador_orgao_colegiados_funcionamento_escola_conselho_escola,indicador_orgao_colegiados_funcionamento_escola_gremio_estudant,"
					+ "indicador_orgao_colegiados_funcionamento_escola_outros,indicador_orgao_colegiados_funcionamento_inexistente,indicador_projeto_pedagogico_atualizado,"
					+ "data_criacao_registro_tabela,usuario_atualizacao_registro_tabela,indicador_lingua_educacao_lingua_portuguesa,indicador_materiais_pedagogico_educacao_indigina"
					+ ") VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

			//44 campos- statement.setInt(1, fornecedor.getCodigoEscola());

			statement.setInt(1, fornecedor.getCodigoEscolaDadosEducacionais());
			statement.setString(2, fornecedor.getIndicadorOrganizacaoEnsinoEscolaSerieAno());
			statement.setString(3, fornecedor.getIndicadorOrganizacaoEnsinoEscolaPeriodoSemestrais());
			statement.setString(4, fornecedor.getIndicadorOrganizacaoCiclosEnsinoFundamental());
			statement.setString(5, fornecedor.getIndicadorOrganizacaoEnsinoEscolaGruposNaoSeriados());
			statement.setString(6, fornecedor.getIndicadorOrganizacaoEnsinoEscolaModulos());
			statement.setString(7, fornecedor.getIndicadorOrganizacaoEnsinoEscolaAlternanciaRegular());
			statement.setString(8, fornecedor.getIndicadorInstrumentosAcervoMultimidia());
			statement.setString(9, fornecedor.getIndicadorInstrumentosInstrumentosMusicais());
			statement.setString(10, fornecedor.getIndicadorInstrumentosMateriaisPedagogicosEducacacao());
			statement.setString(11, fornecedor.getIndicadorInstrumentosBrinquedosEducacaoInfantil());
			statement.setString(12, fornecedor.getIndicadorInstrumentosJogosEducativos());
			statement.setString(13, fornecedor.getIndicadorInstrumentosPedagogicosEtnicoSociais());
			statement.setString(14, fornecedor.getIndicadorInstrumentosMateriaisCientificos());
			statement.setString(15, fornecedor.getIndicadorInstrumentosCulturaisArtistic());
			statement.setString(16, fornecedor.getIndicadorInstrumentosPedagogicoEducacaoCampo());
			statement.setString(17, fornecedor.getIndicadorInstrumentosAmplificacaoDifusaoSomAudio());
			statement.setString(18, fornecedor.getIndicadorInstrumentosPraticaDesportiva());

			statement.setString(19, fornecedor.getIndicadorInstrumentosEducacaoIndigena());
			statement.setString(20, fornecedor.getIndicadorInstrumentosEducacaoIndigena());
			statement.setInt(21, fornecedor.getLinguaIndigena01());
			statement.setInt(22, fornecedor.getLinguaIndigena02());
			statement.setInt(23, fornecedor.getLinguaIndigena03());

			statement.setString(24, fornecedor.getIndicadorExameSelecaoIngressoEscola());
			statement.setObject(25, fornecedor.getIndicadorReservaVagaCotaPretoPardoIndigena());
			statement.setString(26, fornecedor.getIndicadorReservaVagaCotaPessoaComDeficiencia());
			
			statement.setString(27, fornecedor.getIndicadorReservaVagaCotaCondicaoRenda());
			statement.setObject(28, fornecedor.getIndicadorReservaVagaCotaOutrasGrpQueNaoListados());
			statement.setString(29, fornecedor.getIndicadorReservaVagaCotaOriundoEscolaPublica());

			statement.setString(30, fornecedor.getIndicadorCotaSemReservaVaga());
			statement.setObject(31, fornecedor.getIndicadorSiteBlogRedeSociaisEscola());
			statement.setString(32, fornecedor.getIndicadorCompartilhaEspacoComunidade());

			statement.setString(33, fornecedor.getIndicadorUsoEspacoEntornoEscola());
			statement.setObject(34, fornecedor.getIndicadorOrgaoColegiadosFuncionamentoEscolaAssociacaoPais());
			statement.setString(35, fornecedor.getIndicadorOrgaoColegiadosFuncionamentoEscolaAssocPaisMest());

			statement.setString(36, fornecedor.getIndicadorOrgaoColegiadosFuncionamentoConselhoEscola());
			statement.setString(37, fornecedor.getIndicadorOrgaoColegiadosFuncionamentoGremioEstudant());
			statement.setString(38, fornecedor.getIndicadorOrgaoColegiadosFuncionamentoOutros());

			statement.setString(39, fornecedor.getIndicadorNaoHaorgaoColegiadosFuncionamento());
			statement.setString(40, fornecedor.getIndicadorProjetoPedagogicoAtualizado());
			statement.setObject(41, fornecedor.getDataRegistroTabelaDadosEducacionais());

			
			
			statement.setInt(42, fornecedor.getUsuarioUriacaoRegistroTabela());
			statement.setString(43, fornecedor.getIndicadorLinguaEducacaoLinguaPortuguesa());
			statement.setString(44, fornecedor.getIndicadorMateriaisPedagogicoEducacaoIndigina());

			
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

	public GestaoEscolarDadosEducaconaisEscola getFornecedorId(Integer codFornecedor)
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

	public void atualizar(GestaoEscolarDadosEducaconaisEscola fornecedor) throws SQLException, ClassNotFoundException {
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
