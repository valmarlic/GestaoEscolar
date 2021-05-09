package br.com.gestaoEscolar.controlEscola;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gestaoEscolar.domainEscola.GestaoEscolarDadosEducaconaisEscola;
import br.com.gestaoEscolar.model.daoEscola.GestaoEscoarDadosEducacionaisDao;


/**
 * Servlet implementation class visitanteServlet
 */
@WebServlet(urlPatterns = "/GestaoEscolaDadosEducacionaisServlet")
public class GestaoEscolaDadosEducacionaisServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private GestaoEscoarDadosEducacionaisDao fornecedorDao = new GestaoEscoarDadosEducacionaisDao();
	private GestaoEscolarDadosEducaconaisEscola geDadosEducacionais = new GestaoEscolarDadosEducaconaisEscola();
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// CRUD - CREATE RETRIEVE UPDATE DELETE
		// System.out.println(" Chamou uma o método Serviço. ");
		// super.service(request, response);

		GestaoEscolarDadosEducaconaisEscola fornecedor = criaFornecedor(request);

		try {

			String acao = request.getParameter("acao9");
			if (acao != null) {
				if (acao.equals("CREATE9")) {

					try {
						 fornecedorDao.salvar(fornecedor);
						System.out.println("Dados Enviados com sucesso..  ");
					} catch (Exception e) {
						System.out.println("Erro ao tratar com o banco  de Dados ..  " + e.getMessage());
					}

					/*
					 * try { fornecedor.valida(); } catch (ValidacaoException e) {
					 * request.setAttribute("mensagem", "Erro de Validacao dos Campos: " +
					 * e.getMessage()); request.setAttribute("fornecedor", fornecedor); }
					 */

					if (fornecedor.getCodigoCaracterizacaoEquipamentoEscola() == null) {
						// fornecedorDao.salvar(fornecedor);
						request.setAttribute("mensagem", "Vistante salvo com sucesso");
					} else {
						fornecedorDao.atualizar(fornecedor);
						request.setAttribute("mensagem", "Visitante atualizado com sucesso");
					}
				} else if (acao.equals("RETRIEVE")) {
					String numerocartao = request.getParameter("numerocartao");
					Integer codFornecedor = Integer.parseInt(numerocartao);
					fornecedor = fornecedorDao.getFornecedorId(codFornecedor);
					request.setAttribute("fornecedor", fornecedor);

				} else if (acao.equals("DELETE")) {
					String codigo = request.getParameter("numerocartao");
					Integer codFornecedor = Integer.parseInt(codigo);
					fornecedorDao.excluir(codFornecedor);
					request.setAttribute("mensagem", "Visitante excluido");
				}
			}
			request.setAttribute("fornecedores", fornecedorDao.getFornecedores());
			RequestDispatcher dispatcher = request.getRequestDispatcher("Visitante.jsp");
			dispatcher.forward(request, response);
		} catch (SQLException | ClassNotFoundException | IllegalArgumentException e) {
			request.setAttribute("mensagem", "Erro: " + e.getMessage());
			// RequestDispatcher dispatcher =
			// request.getRequestDispatcher("../ESCOLA/CadastroEscola/cadastroEscola.jsp");
			// dispatcher.forward(request, response);
		}

	}

	private GestaoEscolarDadosEducaconaisEscola criaFornecedor(HttpServletRequest request) {

		/*
		 * String codigoEscola = request.getParameter("256");// codigoEscola Integer
		 * codigoEscol = Integer.parseInt(codigoEscola);
		 */

		Integer codigoEscola = null;

		String codigoEscolaDadosEducacionais = request.getParameter("codigoEscolaDadosEducacionais");
		System.out.println(codigoEscolaDadosEducacionais);
		Integer codigoEscolaDadosEducacionai = Integer.parseInt(codigoEscolaDadosEducacionais);

		String dataRegistroTabelaDadosEducacionais = request.getParameter("dataRegistroTabelaDadosEducacionais");
		String dataRegistroTabelaDadosEducacionai[] = dataRegistroTabelaDadosEducacionais.split("-");
		LocalDate dataRegistroTabelaDadosEducacional = LocalDate.of(
				Integer.parseInt(dataRegistroTabelaDadosEducacionai[0]),
				Integer.parseInt(dataRegistroTabelaDadosEducacionai[1]),
				Integer.parseInt(dataRegistroTabelaDadosEducacionai[2]));
		System.out.println("Data de Cadastro : " + dataRegistroTabelaDadosEducacional);

		String usuarioUriacaoRegistroTabela = request.getParameter("usuarioUriacaoRegistroTabela");
		Integer.parseInt(usuarioUriacaoRegistroTabela);
		Integer usuarioUriacaoRegistroTabel = Integer.parseInt(usuarioUriacaoRegistroTabela);
		System.out.println("Código Usuário :  " + usuarioUriacaoRegistroTabel);

		String indicadorOrganizacaoEnsinoEscolaSerieAno = request
				.getParameter("indicadorOrganizacaoEnsinoEscolaSerieAno");
		if(indicadorOrganizacaoEnsinoEscolaSerieAno == null) {
			indicadorOrganizacaoEnsinoEscolaSerieAno="N";
		}
		indicadorOrganizacaoEnsinoEscolaSerieAno="S";
		
		System.out.println("Escola Serie Ano : " + indicadorOrganizacaoEnsinoEscolaSerieAno);

		String indicadorOrganizacaoEnsinoEscolaPeriodoSemestrais = request
				.getParameter("indicadorOrganizacaoEnsinoEscolaPeriodoSemestrais");
		
		if(indicadorOrganizacaoEnsinoEscolaPeriodoSemestrais == null) {
			indicadorOrganizacaoEnsinoEscolaPeriodoSemestrais="N";
		}
		indicadorOrganizacaoEnsinoEscolaPeriodoSemestrais="S";

		System.out.println("Ensino escola eeríodo semestral : " + indicadorOrganizacaoEnsinoEscolaPeriodoSemestrais);

		String indicadorOrganizacaoCiclosEnsinoFundamental = request
				.getParameter("indicadorOrganizacaoCiclosEnsinoFundamental");

		if(indicadorOrganizacaoCiclosEnsinoFundamental == null) {
			indicadorOrganizacaoCiclosEnsinoFundamental="N";
		}
		indicadorOrganizacaoCiclosEnsinoFundamental="S";
		
		String indicadorOrganizacaoEnsinoEscolaGruposNaoSeriados = request
				.getParameter("indicadorOrganizacaoEnsinoEscolaGruposNaoSeriados");
		
		if(indicadorOrganizacaoEnsinoEscolaGruposNaoSeriados == null) {
			indicadorOrganizacaoEnsinoEscolaGruposNaoSeriados="N";
		}
		indicadorOrganizacaoEnsinoEscolaGruposNaoSeriados="S";
		
		String indicadorOrganizacaoEnsinoEscolaModulos = request
				.getParameter("indicadorOrganizacaoEnsinoEscolaModulos");
		
		if(indicadorOrganizacaoEnsinoEscolaModulos == null) {
			indicadorOrganizacaoEnsinoEscolaModulos="N";
		}
		indicadorOrganizacaoEnsinoEscolaModulos="S";
		
		
		String indicadorOrganizacaoEnsinoEscolaAlternanciaRegular = request
				.getParameter("indicadorOrganizacaoEnsinoEscolaAlternanciaRegular");
				
		if(indicadorOrganizacaoEnsinoEscolaAlternanciaRegular == null) {
			indicadorOrganizacaoEnsinoEscolaAlternanciaRegular="N";
		}
		indicadorOrganizacaoEnsinoEscolaAlternanciaRegular="S";
		
		
		String indicadorInstrumentosAcervoMultimidia = request.getParameter("indicadorInstrumentosAcervoMultimidia");

		if(indicadorInstrumentosAcervoMultimidia == null) {
			indicadorInstrumentosAcervoMultimidia="N";
		}
		indicadorInstrumentosAcervoMultimidia="S";
		
		String indicadorInstrumentosInstrumentosMusicais = request
				.getParameter("indicadorInstrumentosInstrumentosMusicais");
		
		if(indicadorInstrumentosInstrumentosMusicais == null) {
			indicadorInstrumentosInstrumentosMusicais="N";
		}
		indicadorInstrumentosInstrumentosMusicais="S";
		
		String indicadorInstrumentosMateriaisPedagogicosEducacacao = request
				.getParameter("indicadorInstrumentosMateriaisPedagogicosEducacacao");
		if(indicadorInstrumentosMateriaisPedagogicosEducacacao == null) {
			indicadorInstrumentosMateriaisPedagogicosEducacacao="N";
		}
		indicadorInstrumentosMateriaisPedagogicosEducacacao="S";
		
		
		String indicadorMateriaisPedagogicoEducacaoIndigina = request
				.getParameter("indicadorMateriaisPedagogicoEducacaoIndigina");
		if(indicadorMateriaisPedagogicoEducacaoIndigina == null) {
			indicadorMateriaisPedagogicoEducacaoIndigina="N";
		}
		indicadorMateriaisPedagogicoEducacaoIndigina="S";
		
		String indicadorInstrumentosBrinquedosEducacaoInfantil = request
				.getParameter("indicadorInstrumentosBrinquedosEducacaoInfantil");
		if(indicadorInstrumentosBrinquedosEducacaoInfantil == null) {
			indicadorInstrumentosBrinquedosEducacaoInfantil="N";
		}
		indicadorInstrumentosBrinquedosEducacaoInfantil="S";
		
		String indicadorInstrumentosJogosEducativos = request.getParameter("indicadorInstrumentosJogosEducativos");

		if(indicadorInstrumentosJogosEducativos == null) {
			indicadorInstrumentosJogosEducativos="N";
		}
		indicadorInstrumentosJogosEducativos="S";
		
		String indicadorInstrumentosPedagogicosEtnicoSociais = request
				.getParameter("indicadorInstrumentosPedagogicosEtnicoSociais");
		if(indicadorInstrumentosPedagogicosEtnicoSociais == null) {
			indicadorInstrumentosPedagogicosEtnicoSociais="N";
		}
		indicadorInstrumentosPedagogicosEtnicoSociais="S";
		
		String indicadorInstrumentosMateriaisCientificos = request
				.getParameter("indicadorInstrumentosMateriaisCientificos");
		if(indicadorInstrumentosMateriaisCientificos == null) {
			indicadorInstrumentosMateriaisCientificos="N";
		}
		indicadorInstrumentosMateriaisCientificos="S";
		
		String indicadorInstrumentosCulturaisArtistic = request.getParameter("indicadorInstrumentosCulturaisArtistic");

		if(indicadorInstrumentosCulturaisArtistic == null) {
			indicadorInstrumentosCulturaisArtistic="N";
		}
		indicadorInstrumentosCulturaisArtistic="S";
		
		String indicadorInstrumentosPedagogicoEducacaoCampo = request
				.getParameter("indicadorInstrumentosPedagogicoEducacaoCampo");
		if(indicadorInstrumentosPedagogicoEducacaoCampo == null) {
			indicadorInstrumentosPedagogicoEducacaoCampo="N";
		}
		indicadorInstrumentosPedagogicoEducacaoCampo="S";
		
		String indicadorInstrumentosAmplificacaoDifusaoSomAudio = request
				.getParameter("indicadorInstrumentosAmplificacaoDifusaoSomAudio");
		if(indicadorInstrumentosAmplificacaoDifusaoSomAudio == null) {
			indicadorInstrumentosAmplificacaoDifusaoSomAudio="N";
		}
		indicadorInstrumentosAmplificacaoDifusaoSomAudio="S";
		
		String indicadorInstrumentosPraticaDesportiva = request.getParameter("indicadorInstrumentosPraticaDesportiva");
		if(indicadorInstrumentosPraticaDesportiva == null) {
			indicadorInstrumentosPraticaDesportiva="N";
		}
		indicadorInstrumentosPraticaDesportiva="S";
		
		String indicadorInstrumentosEducacaoIndigena = request.getParameter("indicadorInstrumentosEducacaoIndigena");
		//geDadosEducacionais.getIndicadorInstrumentosEducacaoIndigena(indicadorInstrumentosEducacaoIndigena);
		/*
		 * if(indicadorInstrumentosEducacaoIndigena == null &&
		 * indicadorInstrumentosEducacaoIndigena=="") {
		 * indicadorInstrumentosEducacaoIndigena="N"; }
		 * indicadorInstrumentosEducacaoIndigena="S";
		 */
		 
		  System.out.println("Educação Indigina  : "+indicadorInstrumentosEducacaoIndigena);
		
		String indicadorLinguaEducacaoLinguaPortuguesa = request
				.getParameter("indicadorLinguaEducacaoLinguaPortuguesa");
		if(indicadorLinguaEducacaoLinguaPortuguesa == null) {
			indicadorLinguaEducacaoLinguaPortuguesa="N";
		}
		indicadorLinguaEducacaoLinguaPortuguesa="S";
		
		String indicadorLinguaEducacaoIndigena = request.getParameter("indicadorLinguaEducacaoIndigena");
		if(indicadorLinguaEducacaoIndigena == null) {
			indicadorLinguaEducacaoIndigena="N";
		}
		indicadorLinguaEducacaoIndigena="S";
		
		String linguaIndigena01 = request.getParameter("linguaIndigena01");
		Integer linguaIndigen01 = Integer.parseInt(linguaIndigena01);
		String linguaIndigena02 = request.getParameter("linguaIndigena02");
		Integer linguaIndigen02 = Integer.parseInt(linguaIndigena02);
		String linguaIndigena03 = request.getParameter("linguaIndigena03");
		Integer linguaIndigen03 = Integer.parseInt(linguaIndigena03);

		String indicadorExameSelecaoIngressoEscola = request.getParameter("indicadorExameSelecaoIngressoEscola");
		
		
		String indicadorReservaVagaCotaPretoPardoIndigena = request
				.getParameter("indicadorReservaVagaCotaPretoPardoIndigena");
		if(indicadorReservaVagaCotaPretoPardoIndigena == null) {
			indicadorReservaVagaCotaPretoPardoIndigena="N";
		}
		indicadorReservaVagaCotaPretoPardoIndigena="S";
		
		String indicadorReservaVagaCotaPessoaComDeficiencia = request
				.getParameter("indicadorReservaVagaCotaPessoaComDeficiencia");
		
		if(indicadorReservaVagaCotaPessoaComDeficiencia == null) {
			indicadorReservaVagaCotaPessoaComDeficiencia="N";
		}
		indicadorReservaVagaCotaPessoaComDeficiencia="S";
		
		String indicadorReservaVagaCotaCondicaoRenda = request.getParameter("indicadorReservaVagaCotaCondicaoRenda");
		if(indicadorReservaVagaCotaCondicaoRenda == null) {
			indicadorReservaVagaCotaCondicaoRenda="N";
		}
		indicadorReservaVagaCotaCondicaoRenda="S";
		
		String indicadorReservaVagaCotaOutrasGrpQueNaoListados = request
				.getParameter("indicadorReservaVagaCotaOutrasGrpQueNaoListados");
		if(indicadorReservaVagaCotaOutrasGrpQueNaoListados == null) {
			indicadorReservaVagaCotaOutrasGrpQueNaoListados="N";
		}
		indicadorReservaVagaCotaOutrasGrpQueNaoListados="S";
		String indicadorReservaVagaCotaOriundoEscolaPublica = request
				.getParameter("indicadorReservaVagaCotaOriundoEscolaPublica");
		if(indicadorReservaVagaCotaOriundoEscolaPublica == null) {
			indicadorReservaVagaCotaOriundoEscolaPublica="N";
		}
		indicadorReservaVagaCotaOriundoEscolaPublica="S";

		String indicadorCotaSemReservaVaga = request.getParameter("indicadorCotaSemReservaVaga");
		if(indicadorCotaSemReservaVaga == null) {
			indicadorCotaSemReservaVaga="N";
		}
		indicadorCotaSemReservaVaga="S";
		String indicadorSiteBlogRedeSociaisEscola = request.getParameter("indicadorSiteBlogRedeSociaisEscola");
		if(indicadorSiteBlogRedeSociaisEscola == null) {
			indicadorSiteBlogRedeSociaisEscola="N";
		}
		indicadorSiteBlogRedeSociaisEscola="S";
		String indicadorCompartilhaEspacoComunidade = request.getParameter("indicadorCompartilhaEspacoComunidade");
		if(indicadorCompartilhaEspacoComunidade == null) {
			indicadorCompartilhaEspacoComunidade="N";
		}
		indicadorCompartilhaEspacoComunidade="S";
		String indicadorUsoEspacoEntornoEscola = request.getParameter("indicadorUsoEspacoEntornoEscola");
		if(indicadorUsoEspacoEntornoEscola == null) {
			indicadorUsoEspacoEntornoEscola="N";
		}
		indicadorUsoEspacoEntornoEscola="S";
		String indicadorOrgaoColegiadosFuncionamentoEscolaAssociacaoPais = request
				.getParameter("indicadorOrgaoColegiadosFuncionamentoEscolaAssociacaoPais");
		if(indicadorOrgaoColegiadosFuncionamentoEscolaAssociacaoPais == null) {
			indicadorOrgaoColegiadosFuncionamentoEscolaAssociacaoPais="N";
		}
		indicadorOrgaoColegiadosFuncionamentoEscolaAssociacaoPais="S";
		String indicadorOrgaoColegiadosFuncionamentoEscolaAssocPaisMest = request
				.getParameter("indicadorOrgaoColegiadosFuncionamentoEscolaAssocPaisMest");
		if(indicadorOrgaoColegiadosFuncionamentoEscolaAssocPaisMest == null) {
			indicadorOrgaoColegiadosFuncionamentoEscolaAssocPaisMest="N";
		}
		indicadorOrgaoColegiadosFuncionamentoEscolaAssocPaisMest="S";
		String indicadorOrgaoColegiadosFuncionamentoConselhoEscola = request
				.getParameter("indicadorOrgaoColegiadosFuncionamentoConselhoEscola");
		if(indicadorOrgaoColegiadosFuncionamentoConselhoEscola == null) {
			indicadorOrgaoColegiadosFuncionamentoConselhoEscola="N";
		}
		indicadorOrgaoColegiadosFuncionamentoConselhoEscola="S";
		String indicadorOrgaoColegiadosFuncionamentoGremioEstudant = request
				.getParameter("indicadorOrgaoColegiadosFuncionamentoGremioEstudant");
		
		if(indicadorOrgaoColegiadosFuncionamentoGremioEstudant == null) {
			indicadorOrgaoColegiadosFuncionamentoGremioEstudant="N";
		}
		indicadorOrgaoColegiadosFuncionamentoGremioEstudant="S";
		String indicadorOrgaoColegiadosFuncionamentoOutros = request
				.getParameter("indicadorOrgaoColegiadosFuncionamentoOutros");
		if(indicadorOrgaoColegiadosFuncionamentoOutros == null) {
			indicadorOrgaoColegiadosFuncionamentoOutros="N";
		}
		indicadorOrgaoColegiadosFuncionamentoOutros="S";
		
		String indicadorNaoHaorgaoColegiadosFuncionamento = request
				.getParameter("indicadorNaoHaorgaoColegiadosFuncionamento");
		if(indicadorNaoHaorgaoColegiadosFuncionamento == null) {
			indicadorNaoHaorgaoColegiadosFuncionamento="N";
		}
		indicadorNaoHaorgaoColegiadosFuncionamento="S";
		String indicadorProjetoPedagogicoAtualizado = request.getParameter("indicadorProjetoPedagogicoAtualizado");
		
		
		GestaoEscolarDadosEducaconaisEscola fornecedor = new GestaoEscolarDadosEducaconaisEscola(null,
				codigoEscolaDadosEducacionai, dataRegistroTabelaDadosEducacional, usuarioUriacaoRegistroTabel,
				indicadorOrganizacaoEnsinoEscolaSerieAno, indicadorOrganizacaoEnsinoEscolaPeriodoSemestrais,
				indicadorOrganizacaoCiclosEnsinoFundamental, indicadorOrganizacaoEnsinoEscolaGruposNaoSeriados,
				indicadorOrganizacaoEnsinoEscolaModulos, indicadorOrganizacaoEnsinoEscolaAlternanciaRegular,
				indicadorInstrumentosAcervoMultimidia, indicadorInstrumentosInstrumentosMusicais,
				indicadorInstrumentosMateriaisPedagogicosEducacacao, indicadorMateriaisPedagogicoEducacaoIndigina,
				indicadorInstrumentosBrinquedosEducacaoInfantil, indicadorInstrumentosJogosEducativos,
				indicadorInstrumentosPedagogicosEtnicoSociais, indicadorInstrumentosMateriaisCientificos,
				indicadorInstrumentosCulturaisArtistic, indicadorInstrumentosPedagogicoEducacaoCampo,
				indicadorInstrumentosAmplificacaoDifusaoSomAudio, indicadorInstrumentosPraticaDesportiva,
				indicadorInstrumentosEducacaoIndigena, indicadorLinguaEducacaoLinguaPortuguesa,
				indicadorLinguaEducacaoIndigena, linguaIndigen01, linguaIndigen02, linguaIndigen03,
				geDadosEducacionais.getIndicadorExameSelecaoIngressoEscola(indicadorExameSelecaoIngressoEscola), indicadorReservaVagaCotaPretoPardoIndigena,
				indicadorReservaVagaCotaPessoaComDeficiencia, indicadorReservaVagaCotaCondicaoRenda,
				indicadorReservaVagaCotaOutrasGrpQueNaoListados, indicadorReservaVagaCotaOriundoEscolaPublica,
				indicadorCotaSemReservaVaga, indicadorSiteBlogRedeSociaisEscola, indicadorCompartilhaEspacoComunidade,
				indicadorUsoEspacoEntornoEscola, indicadorOrgaoColegiadosFuncionamentoEscolaAssociacaoPais,
				indicadorOrgaoColegiadosFuncionamentoEscolaAssocPaisMest,
				indicadorOrgaoColegiadosFuncionamentoConselhoEscola,
				indicadorOrgaoColegiadosFuncionamentoGremioEstudant, indicadorOrgaoColegiadosFuncionamentoOutros,
				indicadorNaoHaorgaoColegiadosFuncionamento, geDadosEducacionais.getIndicadorProjetoPedagogicoAtualizado(indicadorProjetoPedagogicoAtualizado));

		return fornecedor;
	}

}
