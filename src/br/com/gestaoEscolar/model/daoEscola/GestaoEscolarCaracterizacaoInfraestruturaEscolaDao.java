package br.com.gestaoEscolar.model.daoEscola;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.gestaoEscolar.domainEscola.GestaoEscolarCaracterizacaoInfraestruturaEscola;
import br.com.gestaoEscolar.domainEscola.GestaoEscolarCoordenadorDeAnexo;
import br.com.gestaoEscolar.domainEscola.GestaoEscolarCoordnadorPedagogico;
import br.com.gestaoEscolar.domainEscola.GestaoEscolarDadosGerais;
import br.com.gestaoEscolar.domainEscola.GestaoEscolarDiretordeNucleo;
import br.com.gestaoEscolar.domainEscola.GestaoEscolarSecretarioEscolar;
import br.com.gestaoEscolar.domainEscola.GestaoEscolasrDadosGestores;
import br.com.gestaoEscolar.domainEscola.GestaoEscolasrDiretorAdjunto;

public class GestaoEscolarCaracterizacaoInfraestruturaEscolaDao {

	public List<GestaoEscolarCaracterizacaoInfraestruturaEscolaDao> getFornecedores() throws SQLException, ClassNotFoundException {
	

		Connection conexao = ConexaoJDBCFactory.getConexao();
		PreparedStatement ps = conexao.prepareStatement(
				"SELECT numerocartao,NOME,CPF,RG,datentrada,datasaida,setorvisitado,foto FROM TB_VISITANTE");
		ResultSet rs = ps.executeQuery();
		List<GestaoEscolarCaracterizacaoInfraestruturaEscolaDao> fornecedores = new ArrayList<>();
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
	public void salvar(GestaoEscolarCaracterizacaoInfraestruturaEscola fornecedor) throws SQLException, ClassNotFoundException {
		System.out.println();
		// System.out.println(" Recebendo GestaoEscolarDadosGeraisDao " +
		// fornecedor.getCnpjEntidade());
		System.out.println();

		try {
			Connection conexao = ConexaoJDBCFactory.getConexao();
			PreparedStatement statement = conexao.prepareStatement(
					"INSERT INTO caracterizacao_infraestrutura_escola("
							+ "codigo_escola,"
							+ " indicador_local_funcionamento_escola,"
							+ " indicador_forma_ocupacao_predio,"
							+ "indicador_predio_compartilhado_com_outra_escola,"
							+ "codigo_inep_escola_predio_compartilhado_01, "
							+ "codigo_inep_escola_predio_compartilhado_02,"
							+ "codigo_inep_escola_predio_compartilhado_03,"
							+ "codigo_inep_escola_predio_compartilhado_04,"
							+ "codigo_inep_escola_predio_compartilhado_05,"
							+ "codigo_inep_escola_predio_compartilhado_06, "
							+ "indicador_fornece_agua_potavel_consumo_humano, "
							+ "indicador_forma_abastecimento_agua_rede_publica,"
							+ "indicador_forma_abastecimento_agua_poco_publico, "
							+ "indicador_forma_abastecimento_agua_cacimba_cisterna_poco, "
							+ "indicador_forma_abastecimento_agua_fonte_rio_igarape_riacho_cor,"
							+ "indicador_forma_abastecimento_agua_ausente,"
							+ "indicador_fonte_energia_eletrica_rede_publica,"
							+ "indicador_fonte_energia_eletrica_gerador_combustivel_fossil,"
							+ "indicador_fonte_energia_eletrica_fontes_renovaveis_alternativas,"
							+ "indicador_fonte_energia_eletrica_ausente,"
							+ "indicador_esgotamento_sanitario_rede_publica,"
							+ "indicador_esgotamento_sanitario_fossa_septica,"
							+ "indicador_esgotamento_sanitario_fossa_rudimentar_comum,"
							+ "indicador_esgotamento_sanitario_ausente,"
							+ "indicador_destinacao_lixo_servico_coleta,"
							+ "indicador_destinacao_lixo_queima,"
							+ "indicador_destinacao_lixo_enterra,"
							+ "indicador_destinacao_lixo_local_licenciado_poder_publico,"
							+ "indicador_destinacao_lixo_outra_area,"
							+ "indicador_tratamento_lixo_separacao_lixo_residuos,"
							+ "indicador_tratamento_lixo_reaproveitamento_reutilizacao,"
							+ "indicador_tratamento_lixo_reciclagem,"
							+ "indicador_tratamento_ausente,"
							+ "indicador_dependencia_existente_almoxarifado,"
							+ "indicador_dependencia_existente_area_verde,"
							+ "indicador_dependencia_existente_auditorio,"
							+ "indicador_dependencia_existente_banheiro,"
							+ "indicador_dependencia_existente_banheiro_acessivel,"
							+ "indicador_dependencia_existente_banheiro_educacao_infantil,"
							+ "indicador_dependencia_existente_banheiro_exclusivo_funcionario,"
							+ "indicador_dependencia_existente_banheiro_vestiario_com_chuveiro,"
							+ "indicador_dependencia_existente_biblioteca,"
							+ "indicador_dependencia_existente_cozinha,"
							+ "indicador_dependencia_existente_despensa,"
							+ "indicador_dependencia_existente_dormitorio_aluno,"
							+ "indicador_dependencia_existente_dormitorio_professor,"
							+ "indicador_dependencia_existente_laboratorio_ciencias,"
							+ "indicador_dependencia_existente_laboratorio_informatica,"
							+ "indicador_dependencia_existente_parque_infantil,"
							+ "indicador_dependencia_existente_patio_coberto,"
							+ "indicador_dependencia_existente_patio_descoberto,"
							+ "indicador_dependencia_existente_piscina,"
							+ "indicador_dependencia_existente_quadra_esporte_coberta,"
							+ "indicador_dependencia_existente_quadra_esporte_descoberta,"
							+ "indicador_dependencia_existente_refeitorio,"
							+ "indicador_dependencia_existente_sala_repouso_aluno,"
							+ "indicador_dependencia_existente_sala_atelie_arte,"
							+ "indicador_dependencia_existente_sala_musica_coral,"
							+ "indicador_dependencia_existente_sala_estudio_danca,"
							+ "indicador_dependencia_existente_sala_multiuso,"
							+ "indicador_dependencia_existente_terreirao,"
							+ "indicador_dependencia_existente_viveiro,"
							+ "indicador_dependencia_existente_sala_diretoria,"
							+ "indicador_dependencia_existente_sala_leitura,"
							+ "indicador_dependencia_existente_sala_professores,"
							+ "indicador_dependencia_existente_sala_recursos_multifuncionais,"
							+ "indicador_dependencia_existente_sala_secretaria,"
							+ "indicador_dependencia_existente_ausente,"
							+ "indicador_recursos_acessibilidade_corrimao_guarda_corpo,"
							+ "indicador_recursos_acessibilidade_elevador,"
							+ "indicador_recursos_acessibilidade_piso_tatil,"
							+ "indicador_recursos_acessibilidade_porta_vao_livre,"
							+ "indicador_recursos_acessibilidade_rampa,"
							+ "indicador_recursos_acessibilidade_sinalizacao_sonora,"
							+ "indicador_recursos_acessibilidade_sinalizacao_tatil,"
							+ "indicador_recursos_acessibilidade_sinalizacao_visual,"
							+ "indicador_recursos_acessibilidade_ausente,"
							+ "quantidade_sala_utilizada_escola_dentro_predio,"
							+ "quantidade_sala_utilizada_escola_fora_predio,"
							+ "quantidade_sala_climatizada,"
							+ "quantidade_sala_com_acessibilidade,"
							+ "indicador_espaco_cedido_brasil_alfabetizado,"
							+ "indicador_escola_abre_finais_semana_comunidade,"
							+ "indicador_escola_proposta_pedagogica_formacao_por_alternancia,"
							+ "indicador_localizacao_diferenciada_escola,"
							+ "indicador_orgao_vinculo_escola_secretaria_ministerio_educacao,"
							+ "indicador_orgao_vinculo_escola_secretaria_seguranca_forcas_arma,"
							+ "indicador_orgao_vinculo_escola_secretaria_ministerio_saude,"
							+ "indicador_orgao_vinculo_outro_orgao,"
							+ "indicador_categoria_escola,"
							+ "indicador_convenio_poder_publico,"
							+ "indicador_mantenedora_escola_privada_empresa_privada_grupo_empr,"
							+ "indicador_mantenedora_escola_privada_instituicoes_sem_fins_lucr,"
							+ "indicador_mantenedora_escola_privada_organizacao_nao_governamen,"
							+ "indicador_mantenedora_escola_privada_organizacao_da_sociedade_c,"
							+ "indicador_mantenedora_escola_privada_sindicato_trabalhadores_pa,"
							+ "indicador_mantenedora_escola_privada_sistema_s,"
							+ "indicador_esfera_administrativa_conselho_regulamentacao_autoriz,"
							+ "data_criacao_registro_tabela,"
							+ "usuario_criacao_registro_tabela)"
							+ ""
							+ " VALUES"
							+ ""
							+ "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?"
							+ ",?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

			//statement.setString(1, fornecedor.getNomecodigoDiretorDeNucleo());
			statement.setInt(1, fornecedor.getCodigoCarctzInfraEscola()); // Código da escola
			
			statement.setString(2, fornecedor.getIndicadorLocalFuncionamentoEscola());
			
			statement.setString(3, fornecedor.getIndicadorFormaOcupacaoPredio());
			statement.setString(4, fornecedor.getIndicadorPredioCompartilhadoOoutraEscola());
			statement.setInt(5, fornecedor.getCodigoInepEscolaPredioPompartilhado_01());
			
			statement.setInt(6, fornecedor.getCodigoInepEscolaPredioPompartilhado_02());
			statement.setInt(7, fornecedor.getCodigoInepEscolaPredioPompartilhado_03());
			statement.setInt(8, fornecedor.getCodigoInepEscolaPredioPompartilhado_04());

			statement.setInt(9, fornecedor.getCodigoInepEscolaPredioPompartilhado_05());
			statement.setInt(10, fornecedor.getCodigoInepEscolaPredioPompartilhado_06());
			statement.setString(11, fornecedor.getIndicadorForneceAguaPotavelConsumoHumano());

			statement.setObject(12, fornecedor.getIndicadorFormaAbastecimentoAguaRedePublica());
			statement.setString(13, fornecedor.getIndicadorFormaAbastecimentoAguaPocoPublico());
			
			statement.setString(14, fornecedor.getIndicadorFormaFbastecimentoFguaFacimbaCisternaPoco());

			statement.setObject(15, fornecedor.getIndicadorFormaAbastecimentoAguaFonteRioIgarapeRiacho_cor());
			statement.setString(16, fornecedor.getIndicadorFormaAbastecimentoAguaAusente());
			statement.setString(17, fornecedor.getIndicadorFonteEnergiaEletricaRedePublica());

			statement.setObject(18, fornecedor.getIndicadorFonteEnergiaEletricaGeradorCombustivelFossil());
			statement.setString(19, fornecedor.getIndicadorFonteEnergiaEletricaFontesRenovaveisAlternativas());
			statement.setString(20, fornecedor.getIndicadorFonteEnergiaEletricaAusente());

			
			statement.setObject(21, fornecedor.getIndicadorEsgotamentoSanitarioRedePublica());
			statement.setString(22, fornecedor.getIndicadorEsgotamentoSanitarioFossaSeptica());
			statement.setString(23, fornecedor.getIndicadorEsgotamentoSanitarioFossaRudimentarComum());

			statement.setString(24, fornecedor.getIndicadorEsgotamentoSanitarioAusente());
			statement.setString(25, fornecedor.getIndicadorDestinacaoLixoServicoColeta());
			statement.setString(26, fornecedor.getIndicadorDestinacaoLixoQueima());

			statement.setObject(27, fornecedor.getIndicadorDestinacaoLixoEnterra());
			statement.setString(28, fornecedor.getIndicadorDestinacaoLixoLocalLicenciadoPoderPublico());
			statement.setString(29, fornecedor.getIndicadorDestinacaoLixoOutraArea());

			
			statement.setObject(30, fornecedor.getIndicadorTratamentoLixoSeparacaoLixoResiduos());
			
			statement.setString(31, fornecedor.getIndicadorTratamentoLixoReaproveitamentoReutilizacao());
			statement.setString(32, fornecedor.getIndicadorTratamentoLixoReciclagem());

			
			statement.setObject(33, fornecedor.getIndicadorTratamentoAusente());
			statement.setString(34, fornecedor.getIndicadorDependenciaExistenteAlmoxarifado());
			statement.setString(35, fornecedor.getIndicadorDependenciaExistenteAreaVerde());

			
			statement.setObject(36, fornecedor.getIndicadorDependenciaExistenteAuditorio());
			statement.setString(37, fornecedor.getIndicadorEependenciaExistenteBanheiro());
			statement.setString(38, fornecedor.getIndicadorDependenciaExistenteBanheiroAcessivel());

			
			statement.setObject(39, fornecedor.getIndicadorDependenciaExistenteBanheiroEducacaoInfantil());
			statement.setString(40, fornecedor.getIndicadorDependenciaExistenteBanheiroExclusivoFuncionario());
			statement.setString(41, fornecedor.getIndicadorDependenciaExistenteBanheiroVestiarioComChuveiro());

			
			
			statement.setObject(42, fornecedor.getIndicadorDependenciaExistenteBiblioteca());
			statement.setString(43, fornecedor.getIndicadorDependenciaExistenteCozinha());
			statement.setString(44, fornecedor.getIndicadorDependenciaExistenteDespensa());

			
			statement.setObject(45, fornecedor.getIndicadorDependenciaExistenteDormitorioAluno());
			statement.setString(46, fornecedor.getIndicadorDependenciaExistenteDormitorioProfessor());
			statement.setString(47, fornecedor.getIndicadorDependenciaExistenteLaboratorioCiencias());

			statement.setObject(48, fornecedor.getIndicadorDependenciaExistenteLaboratorioInformatica());
			statement.setString(49, fornecedor.getIndicadorDependenciaExistenteParqueInfantil());
			statement.setString(50, fornecedor.getIndicadorDependenciaExistentePatioCoberto());

			
			statement.setObject(51, fornecedor.getIndicadorDependenciaExistentePatioDescoberto());
			statement.setString(52, fornecedor.getIndicadorDependenciaExistentePiscina());
			statement.setString(53, fornecedor.getIndicadorDependenciaExistenteQuadraEsporteCoberta());

			statement.setObject(54, fornecedor.getIndicadorDependenciaExistenteQuadraEsporteDescoberta());
			statement.setString(55, fornecedor.getIndicadorDependenciaExistenteRefeitorio());
			statement.setString(56, fornecedor.getIndicadorDependenciaExistenteSalaRepousoAluno());

			statement.setObject(57, fornecedor.getIndicadorDependenciaExistenteSalaAtelieArte());
			statement.setString(58, fornecedor.getIndicadorDependenciaExistenteSalaMusicaCoral());
			statement.setString(59, fornecedor.getIndicadorDependenciaExistenteSalaEstudioDanca());

			statement.setObject(60, fornecedor.getIndicadorDependenciaExistenteSalaMultiuso());
			statement.setString(61, fornecedor.getIndicadorDependenciaExistenteTerreirao());
			statement.setString(62, fornecedor.getIndicadorDependenciaExistenteViveiro());

			statement.setObject(63, fornecedor.getIndicadorDependenciaExistenteSalaDiretoria());
			statement.setString(64, fornecedor.getIndicadorDependenciaExistenteSalaLeitura());
			statement.setString(65, fornecedor.getIndicadorDependenciaExistenteSalaProfessores());

			statement.setObject(66, fornecedor.getIndicadorDependenciaExistenteSalaRecursosMultifuncionais());
			statement.setString(67, fornecedor.getIndicadorDependenciaExistenteSalaSecretaria());
			statement.setString(68, fornecedor.getIndicadorDependenciaExistenteAusente());

			statement.setObject(69, fornecedor.getIndicadorRecursosAcessibilidadeCorrimaoGuardaCorpo());
			statement.setString(70, fornecedor.getIndicadorRecursosAcessibilidadeElevador());
			statement.setString(71, fornecedor.getIndicadorRecursosAcessibilidadePisoTatil());

			statement.setObject(72, fornecedor.getIndicadorRecursosAcessibilidadePortaVaoLivre());
			statement.setString(73, fornecedor.getIndicadorRecursosAcessibilidadeRampa());
			statement.setString(74, fornecedor.getIndicadorRecursosAcessibilidadeSinalizacaoSonora());

			statement.setObject(75, fornecedor.getIndicadorRecursosAcessibilidadeSinalizacaoTatil());
			statement.setString(76, fornecedor.getIndicadorRecursosAcessibilidadeSinalizacaoVisual());
			statement.setString(77, fornecedor.getIndicadorRecursosAcessibilidadeAusente());

			statement.setInt(78, fornecedor.getQuantidadeSalaUtilizadaEscolaDentroPredio());
			statement.setInt(79, fornecedor.getQuantidadeSalaUtilizadaEscolaForaPredio());
			statement.setInt(80, fornecedor.getQuantidadeSalaClimatizada());

			statement.setInt(81, fornecedor.getQuantidadeSalaComAcessibilidade());
			statement.setString(82, fornecedor.getIndicadorEspacoCedidoBrasilAlfabetizado());
			statement.setString(83, fornecedor.getIndicadorEscolaAbreFinaisSemanaComunidade());

			statement.setObject(84, fornecedor.getIndicadorEscolaPropostaPedagogicaFormacaoPorAlternancia());
			statement.setString(85, fornecedor.getIndicadorLocalizacaoDiferenciadaEscola());
			statement.setString(86, fornecedor.getIndicadorOrgaoVinculoEscolaSecretariaMinisterioEducacao());

			statement.setObject(87, fornecedor.getIndicadorOrgaoVinculoEscolaSecretariaSegurancaForcasArma());
			statement.setString(88, fornecedor.getIndicadorOrgaoVinculoEscolaSecretariaMinisterioSaude());
			statement.setString(89, fornecedor.getIndicadorOrgaoVinculoOutroOrgao());

			statement.setObject(90, fornecedor.getIndicadorCategoriaEscola());
			statement.setString(91, fornecedor.getIndicadorConvenioPoderPublico());
			statement.setString(92, fornecedor.getIndicadorMantenedoraEscolaPrivadaEmpresaPrivadaGrupoEmpr());

			statement.setObject(93, fornecedor.getIndicadorMantenedoraEscolaPrivadaInstituicoesSemFinsLucr());
			statement.setString(94, fornecedor.getIndicadorMantenedoraEscolaPrivadaOrganizacaoNaoGovernamen());
			statement.setString(95, fornecedor.getIndicadorMantenedoraEscolaPrivadaOrganizacaoDaSociedadeC());

			statement.setObject(96, fornecedor.getIndicadorMantenedoraEscolaPrivadaSindicatoTrabalhadoresPa());
			statement.setString(97, fornecedor.getIndicadorMantenedoraEscolaPrivadaSistemaS());
			statement.setString(98, fornecedor.getIndicadorEsferaAdministrativaConselhoRegulamentacaoutoriz());

			statement.setObject(99, fornecedor.getDataCriacaoRegistroTabela());
			statement.setInt(100, fornecedor.getUsuarioCriacaoRegistroTabela());
		//	statement.setObject(101, fornecedor.getDataAtualizacaoRegistroTabela());

			
			//statement.setInt(102, fornecedor.getUsuarioAtualizacaoRegistroTabela());
			
			
			
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
			System.out.println("Erro ao emviar..  " + e.getMessage());	
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

	public GestaoEscolarCaracterizacaoInfraestruturaEscola getFornecedorId(Integer codFornecedor)
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

	public void atualizar(GestaoEscolarCaracterizacaoInfraestruturaEscola fornecedor) throws SQLException, ClassNotFoundException {
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
