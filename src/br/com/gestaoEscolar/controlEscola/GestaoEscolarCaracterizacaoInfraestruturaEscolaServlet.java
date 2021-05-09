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

import br.com.gestaoEscolar.domainEscola.GestaoEscolarCaracterizacaoInfraestruturaEscola;
import br.com.gestaoEscolar.domainEscola.GestaoEscolarCoordenadorDeAnexo;
import br.com.gestaoEscolar.domainEscola.GestaoEscolarCoordnadorPedagogico;
import br.com.gestaoEscolar.domainEscola.GestaoEscolarDadosGerais;
import br.com.gestaoEscolar.domainEscola.GestaoEscolarDiretordeNucleo;
import br.com.gestaoEscolar.domainEscola.GestaoEscolarSecretarioEscolar;
import br.com.gestaoEscolar.domainEscola.GestaoEscolasrDadosGestores;
import br.com.gestaoEscolar.domainEscola.GestaoEscolasrDiretorAdjunto;
import br.com.gestaoEscolar.model.daoEscola.GestaoEscoarDadosGeraisDao;
import br.com.gestaoEscolar.model.daoEscola.GestaoEscolarCaracterizacaoInfraestruturaEscolaDao;
import br.com.gestaoEscolar.model.daoEscola.GestaoEscolarCoordenadorDeAnexoDao;
import br.com.gestaoEscolar.model.daoEscola.GestaoEscolarCoordorPedagogicoDao;
import br.com.gestaoEscolar.model.daoEscola.GestaoEscolarDiretorDeNucleoDao;
import br.com.gestaoEscolar.model.daoEscola.GestaoEscolarSecretarioEscolarDao;
import br.com.gestaoEscolar.model.daoEscola.GestaoEscolasrDadosGestoresDao;
import br.com.gestaoEscolar.model.daoEscola.GestaoEscolasrDiretorAdjuntoDao;

//
/**
 * Servlet implementation class gestaoEscolasrDadosGestoresServlet
 */
@WebServlet(urlPatterns = "/GestaoEscolarCaracterizacaoInfraestruturaEscolaServlet")
public class GestaoEscolarCaracterizacaoInfraestruturaEscolaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	GestaoEscolarCaracterizacaoInfraestruturaEscola geCInfra = new GestaoEscolarCaracterizacaoInfraestruturaEscola();
	private GestaoEscolarCaracterizacaoInfraestruturaEscolaDao fornecedorDao = new GestaoEscolarCaracterizacaoInfraestruturaEscolaDao();

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// CRUD - CREATE RETRIEVE UPDATE DELETE
		// System.out.println(" Chamou uma o método Serviço. ");
		// super.service(request, response);

		GestaoEscolarCaracterizacaoInfraestruturaEscola fornecedor = criaFornecedor(request);

		try {

			String acao = request.getParameter("acao7");
			if (acao != null) {
				if (acao.equals("CREATE7")) {

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

					if (fornecedor.getCodigoCaracterizacaoInfraestruturaEscola() == null) {
						// fornecedorDao.salvar(fornecedor);
						request.setAttribute("mensagem", "Vistante salvo com sucesso");
					} else {
						// fornecedorDao.atualizar(fornecedor);
						request.setAttribute("mensagem", "Visitante atualizado com sucesso");
					}
				} else if (acao.equals("RETRIEVE")) {
					String numerocartao = request.getParameter("numerocartao");
					Integer codFornecedor = Integer.parseInt(numerocartao);
					// fornecedor = fornecedorDao.getFornecedorId(codFornecedor);
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

	private GestaoEscolarCaracterizacaoInfraestruturaEscola criaFornecedor(HttpServletRequest request) {

		Integer codigoDiretorDeNucleo = null;

		String codigoCarctzInfraEscola = request.getParameter("codigoCarctzInfraEscola");
		System.out.println(" Código do Usuário : " + codigoCarctzInfraEscola);
		Integer codUsuario = Integer.parseInt(codigoCarctzInfraEscola);

		String indicadorLocalFuncionamentoEscola = request.getParameter("indicadorLocalFuncionamentoEscola");

		String indicadorFormaOcupacaoPredio = request.getParameter("indicadorFormaOcupacaoPredio");
		System.out.println("Forma de Ocupação do Prédio  : " + indicadorFormaOcupacaoPredio);

		String indicadorPredioCompartilhadoOoutraEscola = request
				.getParameter("indicadorPredioCompartilhadoOoutraEscola");
		if (indicadorPredioCompartilhadoOoutraEscola == null) {
			indicadorPredioCompartilhadoOoutraEscola = "N";
		} else
			indicadorPredioCompartilhadoOoutraEscola = "S";
		System.out.println("Prédio compartilhado com outra escola : " + indicadorPredioCompartilhadoOoutraEscola);

		String codigoInepEscolaPredioPompartilhado_01 = request.getParameter("codigoInepEscolaPredioPompartilhado_01");
		Integer codInepComp_01 = Integer.parseInt(codigoInepEscolaPredioPompartilhado_01);
		System.out.println("Prédio compartilhado 1 : " + codigoInepEscolaPredioPompartilhado_01);

		String codigoInepEscolaPredioPompartilhado_02 = request.getParameter("codigoInepEscolaPredioPompartilhado_02");
		Integer codInepComp_02 = Integer.parseInt(codigoInepEscolaPredioPompartilhado_02);
		System.out.println("Prédio compartilhado 1 : " + codigoInepEscolaPredioPompartilhado_02);

		String codigoInepEscolaPredioPompartilhado_03 = request.getParameter("codigoInepEscolaPredioPompartilhado_03");
		Integer codInepComp_03 = Integer.parseInt(codigoInepEscolaPredioPompartilhado_03);
		System.out.println("Prédio compartilhado 3 : " + codigoInepEscolaPredioPompartilhado_03);

		String codigoInepEscolaPredioPompartilhado_04 = request.getParameter("codigoInepEscolaPredioPompartilhado_04");
		Integer codInepComp_04 = Integer.parseInt(codigoInepEscolaPredioPompartilhado_04);

		String codigoInepEscolaPredioPompartilhado_05 = request.getParameter("codigoInepEscolaPredioPompartilhado_05");
		Integer codInepComp_05 = Integer.parseInt(codigoInepEscolaPredioPompartilhado_05);

		String codigoInepEscolaPredioPompartilhado_06 = request.getParameter("codigoInepEscolaPredioPompartilhado_06");
		Integer codInepComp_06 = Integer.parseInt(codigoInepEscolaPredioPompartilhado_06);

		String indicadorForneceAguaPotavelConsumoHumano = request
				.getParameter("indicadorForneceAguaPotavelConsumoHumano");
		if (indicadorForneceAguaPotavelConsumoHumano == null) {
			indicadorForneceAguaPotavelConsumoHumano = "N";
		} else
			indicadorForneceAguaPotavelConsumoHumano = "S";

		String indicadorFormaAbastecimentoAguaRedePublica = request
				.getParameter("indicadorFormaAbastecimentoAguaRedePublica");
		if (indicadorFormaAbastecimentoAguaRedePublica == null) {
			indicadorFormaAbastecimentoAguaRedePublica = "N";
		} else
			indicadorFormaAbastecimentoAguaRedePublica = "S";

		String indicadorFormaAbastecimentoAguaPocoPublico = request
				.getParameter("indicadorFormaAbastecimentoAguaPocoPublico");
		if (indicadorFormaAbastecimentoAguaPocoPublico == null) {
			indicadorFormaAbastecimentoAguaPocoPublico = "N";
		} else
			indicadorFormaAbastecimentoAguaPocoPublico = "S";

		String indicadorFormaFbastecimentoFguaFacimbaCisternaPoco = request
				.getParameter("indicadorFormaFbastecimentoFguaFacimbaCisternaPoco");

		if (indicadorFormaFbastecimentoFguaFacimbaCisternaPoco == null) {
			indicadorFormaFbastecimentoFguaFacimbaCisternaPoco = "N";
		} else
			indicadorFormaFbastecimentoFguaFacimbaCisternaPoco = "S";

		String indicadorFormaAbastecimentoAguaFonteRioIgarapeRiacho_cor = request
				.getParameter("indicadorFormaAbastecimentoAguaFonteRioIgarapeRiacho_cor");
		if (indicadorFormaAbastecimentoAguaFonteRioIgarapeRiacho_cor == null) {
			indicadorFormaAbastecimentoAguaFonteRioIgarapeRiacho_cor = "N";
		} else
			indicadorFormaAbastecimentoAguaFonteRioIgarapeRiacho_cor = "S";

		String indicadorFormaAbastecimentoAguaAusente = request.getParameter("indicadorFormaAbastecimentoAguaAusente");

		if (indicadorFormaAbastecimentoAguaAusente == null) {
			indicadorFormaAbastecimentoAguaAusente = "N";
		} else
			indicadorFormaAbastecimentoAguaAusente = "S";

		String indicadorFonteEnergiaEletricaRedePublica = request
				.getParameter("indicadorFonteEnergiaEletricaRedePublica");

		if (indicadorFonteEnergiaEletricaRedePublica == null) {
			indicadorFonteEnergiaEletricaRedePublica = "N";
		} else
			indicadorFonteEnergiaEletricaRedePublica = "S";

		String indicadorFonteEnergiaEletricaGeradorCombustivelFossil = request
				.getParameter("indicadorFonteEnergiaEletricaGeradorCombustivelFossil");

		if (indicadorFonteEnergiaEletricaGeradorCombustivelFossil == null) {
			indicadorFonteEnergiaEletricaGeradorCombustivelFossil = "N";
		} else
			indicadorFonteEnergiaEletricaGeradorCombustivelFossil = "S";

		String indicadorFonteEnergiaEletricaFontesRenovaveisAlternativas = request
				.getParameter("indicadorFonteEnergiaEletricaFontesRenovaveisAlternativas");
		if (indicadorFonteEnergiaEletricaFontesRenovaveisAlternativas == null) {
			indicadorFonteEnergiaEletricaFontesRenovaveisAlternativas = "N";
		} else
			indicadorFonteEnergiaEletricaFontesRenovaveisAlternativas = "S";

		String indicadorFonteEnergiaEletricaAusente = request.getParameter("indicadorFonteEnergiaEletricaAusente");
		if (indicadorFonteEnergiaEletricaAusente == null) {
			indicadorFonteEnergiaEletricaAusente = "N";
		} else
			indicadorFonteEnergiaEletricaAusente = "S";

		String indicadorEsgotamentoSanitarioRedePublica = request
				.getParameter("indicadorEsgotamentoSanitarioRedePublica");
		if (indicadorEsgotamentoSanitarioRedePublica == null) {
			indicadorEsgotamentoSanitarioRedePublica = "N";
		} else
			indicadorEsgotamentoSanitarioRedePublica = "S";

		String indicadorEsgotamentoSanitarioFossaSeptica = request
				.getParameter("indicadorEsgotamentoSanitarioFossaSeptica");
		if (indicadorEsgotamentoSanitarioFossaSeptica == null) {
			indicadorEsgotamentoSanitarioFossaSeptica = "N";
		} else
			indicadorEsgotamentoSanitarioFossaSeptica = "S";

		String indicadorEsgotamentoSanitarioFossaRudimentarComum = request
				.getParameter("indicadorEsgotamentoSanitarioFossaRudimentarComum");
		if (indicadorEsgotamentoSanitarioFossaRudimentarComum == null) {
			indicadorEsgotamentoSanitarioFossaRudimentarComum = "N";
		} else
			indicadorEsgotamentoSanitarioFossaRudimentarComum = "S";

		String indicadorEsgotamentoSanitarioAusente = request.getParameter("indicadorEsgotamentoSanitarioAusente");

		if (indicadorEsgotamentoSanitarioAusente == null) {
			indicadorEsgotamentoSanitarioAusente = "N";
		} else
			indicadorEsgotamentoSanitarioAusente = "S";
		String indicadorDestinacaoLixoServicoColeta = request.getParameter("indicadorDestinacaoLixoServicoColeta");
		if (indicadorDestinacaoLixoServicoColeta == null) {
			indicadorDestinacaoLixoServicoColeta = "N";
		} else
			indicadorDestinacaoLixoServicoColeta = "S";

		String indicadorDestinacaoLixoEnterra = request.getParameter("indicadorDestinacaoLixoEnterra");
		if (indicadorDestinacaoLixoEnterra == null) {
			indicadorDestinacaoLixoEnterra = "N";
		} else
			indicadorDestinacaoLixoEnterra = "S";

		String indicadorDestinacaoLixoQueima = request.getParameter("indicadorDestinacaoLixoQueima");
		if (indicadorDestinacaoLixoQueima == null) {
			indicadorDestinacaoLixoQueima = "N";
		} else
			indicadorDestinacaoLixoQueima = "S";

		String indicadorDestinacaoLixoLocalLicenciadoPoderPublico = request
				.getParameter("indicadorDestinacaoLixoLocalLicenciadoPoderPublico");

		if (indicadorDestinacaoLixoLocalLicenciadoPoderPublico == null) {
			indicadorDestinacaoLixoLocalLicenciadoPoderPublico = "N";
		} else
			indicadorDestinacaoLixoLocalLicenciadoPoderPublico = "S";

		String indicadorDestinacaoLixoOutraArea = request.getParameter("indicadorDestinacaoLixoOutraArea");
		if (indicadorDestinacaoLixoOutraArea == null) {
			indicadorDestinacaoLixoOutraArea = "N";
		} else
			indicadorDestinacaoLixoOutraArea = "S";

		String indicadorTratamentoLixoSeparacaoLixoResiduos = request
				.getParameter("indicadorTratamentoLixoSeparacaoLixoResiduos");
		if (indicadorTratamentoLixoSeparacaoLixoResiduos == null) {
			indicadorTratamentoLixoSeparacaoLixoResiduos = "N";
		} else
			indicadorTratamentoLixoSeparacaoLixoResiduos = "S";

		String indicadorTratamentoLixoReaproveitamentoReutilizacao = request
				.getParameter("indicadorTratamentoLixoReaproveitamentoReutilizacao");
		if (indicadorTratamentoLixoReaproveitamentoReutilizacao == null) {
			indicadorTratamentoLixoReaproveitamentoReutilizacao = "N";
		} else
			indicadorTratamentoLixoReaproveitamentoReutilizacao = "S";

		String indicadorTratamentoLixoReciclagem = request.getParameter("indicadorTratamentoLixoReciclagem");

		if (indicadorTratamentoLixoReciclagem == null) {
			indicadorTratamentoLixoReciclagem = "N";
		} else
			indicadorTratamentoLixoReciclagem = "S";
		String indicadorTratamentoAusente = request.getParameter("indicadorTratamentoAusente");
		if (indicadorTratamentoAusente == null) {
			indicadorTratamentoAusente = "N";
		} else
			indicadorTratamentoAusente = "S";

		String indicadorDependenciaExistenteAlmoxarifado = request
				.getParameter("indicadorDependenciaExistenteAlmoxarifado");
		if (indicadorDependenciaExistenteAlmoxarifado == null) {
			indicadorDependenciaExistenteAlmoxarifado = "N";
		} else
			indicadorDependenciaExistenteAlmoxarifado = "S";

		String indicadorDependenciaExistenteAreaVerde = request.getParameter("indicadorDependenciaExistenteAreaVerde");
		if (indicadorDependenciaExistenteAreaVerde == null) {
			indicadorDependenciaExistenteAreaVerde = "N";
		} else
			indicadorDependenciaExistenteAreaVerde = "S";

		String indicadorDependenciaExistenteAuditorio = request.getParameter("indicadorDependenciaExistenteAuditorio");
		if (indicadorDependenciaExistenteAuditorio == null) {
			indicadorDependenciaExistenteAuditorio = "N";
		} else
			indicadorDependenciaExistenteAuditorio = "S";

		String indicadorEependenciaExistenteBanheiro = request.getParameter("indicadorEependenciaExistenteBanheiro");
		if (indicadorEependenciaExistenteBanheiro == null) {
			indicadorEependenciaExistenteBanheiro = "N";
		} else
			indicadorEependenciaExistenteBanheiro = "S";

		String indicadorDependenciaExistenteBanheiroAcessivel = request
				.getParameter("indicadorDependenciaExistenteBanheiroAcessivel");
		if (indicadorDependenciaExistenteBanheiroAcessivel == null) {
			indicadorDependenciaExistenteBanheiroAcessivel = "N";
		} else
			indicadorDependenciaExistenteBanheiroAcessivel = "S";

		String indicadorDependenciaExistenteBanheiroEducacaoInfantil = request
				.getParameter("indicadorDependenciaExistenteBanheiroEducacaoInfantil");
		if (indicadorDependenciaExistenteBanheiroEducacaoInfantil == null) {
			indicadorDependenciaExistenteBanheiroEducacaoInfantil = "N";
		} else
			indicadorDependenciaExistenteBanheiroEducacaoInfantil = "S";

		String indicadorDependenciaExistenteBanheiroExclusivoFuncionario = request
				.getParameter("indicadorDependenciaExistenteBanheiroExclusivoFuncionario");
		if (indicadorDependenciaExistenteBanheiroExclusivoFuncionario == null) {
			indicadorDependenciaExistenteBanheiroExclusivoFuncionario = "N";
		} else
			indicadorDependenciaExistenteBanheiroExclusivoFuncionario = "S";

		String indicadorDependenciaExistenteBanheiroVestiarioComChuveiro = request
				.getParameter("indicadorDependenciaExistenteBanheiroVestiarioComChuveiro");
		if (indicadorDependenciaExistenteBanheiroVestiarioComChuveiro == null) {
			indicadorDependenciaExistenteBanheiroVestiarioComChuveiro = "N";
		} else
			indicadorDependenciaExistenteBanheiroVestiarioComChuveiro = "S";

		String indicadorDependenciaExistenteBiblioteca = request
				.getParameter("indicadorDependenciaExistenteBiblioteca");
		if (indicadorDependenciaExistenteBiblioteca == null) {
			indicadorDependenciaExistenteBiblioteca = "N";
		} else
			indicadorDependenciaExistenteBiblioteca = "S";

		String indicadorDependenciaExistenteCozinha = request.getParameter("indicadorDependenciaExistenteCozinha");
		if (indicadorDependenciaExistenteCozinha == null) {
			indicadorDependenciaExistenteCozinha = "N";
		} else
			indicadorDependenciaExistenteCozinha = "S";

		String indicadorDependenciaExistenteDespensa = request.getParameter("indicadorDependenciaExistenteDespensa");
		if (indicadorDependenciaExistenteDespensa == null) {
			indicadorDependenciaExistenteDespensa = "N";
		} else
			indicadorDependenciaExistenteDespensa = "S";

		String indicadorDependenciaExistenteDormitorioAluno = request
				.getParameter("indicadorDependenciaExistenteDormitorioAluno");
		if (indicadorDependenciaExistenteDormitorioAluno == null) {
			indicadorDependenciaExistenteDormitorioAluno = "N";
		} else
			indicadorDependenciaExistenteDormitorioAluno = "S";

		String indicadorDependenciaExistenteDormitorioProfessor = request
				.getParameter("indicadorDependenciaExistenteDormitorioProfessor");
		if (indicadorDependenciaExistenteDormitorioProfessor == null) {
			indicadorDependenciaExistenteDormitorioProfessor = "N";
		} else
			indicadorDependenciaExistenteDormitorioProfessor = "S";

		String indicadorDependenciaExistenteLaboratorioCiencias = request
				.getParameter("indicadorDependenciaExistenteLaboratorioCiencias");

		if (indicadorDependenciaExistenteLaboratorioCiencias == null) {
			indicadorDependenciaExistenteLaboratorioCiencias = "N";
		} else
			indicadorDependenciaExistenteLaboratorioCiencias = "S";

		String indicadorDependenciaExistenteLaboratorioInformatica = request
				.getParameter("indicadorDependenciaExistenteLaboratorioInformatica");
		if (indicadorDependenciaExistenteLaboratorioInformatica == null) {
			indicadorDependenciaExistenteLaboratorioInformatica = "N";
		} else
			indicadorDependenciaExistenteLaboratorioInformatica = "S";

		String indicadorDependenciaExistenteParqueInfantil = request
				.getParameter("indicadorDependenciaExistenteParqueInfantil");

		if (indicadorDependenciaExistenteParqueInfantil == null) {
			indicadorDependenciaExistenteParqueInfantil = "N";
		} else
			indicadorDependenciaExistenteParqueInfantil = "S";

		String indicadorDependenciaExistentePatioCoberto = request
				.getParameter("indicadorDependenciaExistentePatioCoberto");

		if (indicadorDependenciaExistentePatioCoberto == null) {
			indicadorDependenciaExistentePatioCoberto = "N";
		} else
			indicadorDependenciaExistentePatioCoberto = "S";

		String indicadorDependenciaExistentePatioDescoberto = request
				.getParameter("indicadorDependenciaExistentePatioDescoberto");

		if (indicadorDependenciaExistentePatioDescoberto == null) {
			indicadorDependenciaExistentePatioDescoberto = "N";
		} else
			indicadorDependenciaExistentePatioDescoberto = "S";

		String indicadorDependenciaExistentePiscina = request.getParameter("indicadorDependenciaExistentePiscina");
		if (indicadorDependenciaExistentePiscina == null) {
			indicadorDependenciaExistentePiscina = "N";
		} else
			indicadorDependenciaExistentePiscina = "S";

		String indicadorDependenciaExistenteQuadraEsporteCoberta = request
				.getParameter("indicadorDependenciaExistenteQuadraEsporteCoberta");

		if (indicadorDependenciaExistenteQuadraEsporteCoberta == null) {
			indicadorDependenciaExistenteQuadraEsporteCoberta = "N";
		} else
			indicadorDependenciaExistenteQuadraEsporteCoberta = "S";

		String indicadorDependenciaExistenteQuadraEsporteDescoberta = request
				.getParameter("indicadorDependenciaExistenteQuadraEsporteDescoberta");

		if (indicadorDependenciaExistenteQuadraEsporteDescoberta == null) {
			indicadorDependenciaExistenteQuadraEsporteDescoberta = "N";
		} else
			indicadorDependenciaExistenteQuadraEsporteDescoberta = "S";

		String indicadorDependenciaExistenteRefeitorio = request
				.getParameter("indicadorDependenciaExistenteRefeitorio");

		if (indicadorDependenciaExistenteRefeitorio == null) {
			indicadorDependenciaExistenteRefeitorio = "N";
		} else
			indicadorDependenciaExistenteRefeitorio = "S";

		String indicadorDependenciaExistenteSalaRepousoAluno = request
				.getParameter("indicadorDependenciaExistenteSalaRepousoAluno");

		if (indicadorDependenciaExistenteSalaRepousoAluno == null) {
			indicadorDependenciaExistenteSalaRepousoAluno = "N";
		} else
			indicadorDependenciaExistenteSalaRepousoAluno = "S";

		String indicadorDependenciaExistenteSalaAtelieArte = request
				.getParameter("indicadorDependenciaExistenteSalaAtelieArte");

		if (indicadorDependenciaExistenteSalaAtelieArte == null) {
			indicadorDependenciaExistenteSalaAtelieArte = "N";
		} else
			indicadorDependenciaExistenteSalaAtelieArte = "S";

		String indicadorDependenciaExistenteSalaMusicaCoral = request
				.getParameter("indicadorDependenciaExistenteSalaMusicaCoral");
		if (indicadorDependenciaExistenteSalaMusicaCoral == null) {
			indicadorDependenciaExistenteSalaMusicaCoral = "N";
		} else
			indicadorDependenciaExistenteSalaMusicaCoral = "S";

		String indicadorDependenciaExistenteSalaEstudioDanca = request
				.getParameter("indicadorDependenciaExistenteSalaEstudioDanca");
		if (indicadorDependenciaExistenteSalaEstudioDanca == null) {
			indicadorDependenciaExistenteSalaEstudioDanca = "N";
		} else
			indicadorDependenciaExistenteSalaEstudioDanca = "S";

		String indicadorDependenciaExistenteSalaMultiuso = request
				.getParameter("indicadorDependenciaExistenteSalaMultiuso");
		if (indicadorDependenciaExistenteSalaMultiuso == null) {
			indicadorDependenciaExistenteSalaMultiuso = "N";
		} else
			indicadorDependenciaExistenteSalaMultiuso = "S";

		String indicadorDependenciaExistenteTerreirao = request.getParameter("indicadorDependenciaExistenteTerreirao");
		if (indicadorDependenciaExistenteTerreirao == null) {
			indicadorDependenciaExistenteTerreirao = "N";
		} else
			indicadorDependenciaExistenteTerreirao = "S";

		String indicadorDependenciaExistenteViveiro = request.getParameter("indicadorDependenciaExistenteViveiro");

		if (indicadorDependenciaExistenteViveiro == null) {
			indicadorDependenciaExistenteViveiro = "N";
		} else
			indicadorDependenciaExistenteViveiro = "S";

		String indicadorDependenciaExistenteSalaDiretoria = request
				.getParameter("indicadorDependenciaExistenteSalaDiretoria");

		if (indicadorDependenciaExistenteSalaDiretoria == null) {
			indicadorDependenciaExistenteSalaDiretoria = "N";
		} else
			indicadorDependenciaExistenteSalaDiretoria = "S";

		String indicadorDependenciaExistenteSalaLeitura = request
				.getParameter("indicadorDependenciaExistenteSalaLeitura");

		if (indicadorDependenciaExistenteSalaLeitura == null) {
			indicadorDependenciaExistenteSalaLeitura = "N";
		} else
			indicadorDependenciaExistenteSalaLeitura = "S";

		String indicadorDependenciaExistenteSalaProfessores = request
				.getParameter("indicadorDependenciaExistenteSalaProfessores");

		if (indicadorDependenciaExistenteSalaProfessores == null) {
			indicadorDependenciaExistenteSalaProfessores = "N";
		} else
			indicadorDependenciaExistenteSalaProfessores = "S";

		String indicadorDependenciaExistenteSalaRecursosMultifuncionais = request
				.getParameter("indicadorDependenciaExistenteSalaRecursosMultifuncionais");

		if (indicadorDependenciaExistenteSalaRecursosMultifuncionais == null) {
			indicadorDependenciaExistenteSalaRecursosMultifuncionais = "N";
		} else
			indicadorDependenciaExistenteSalaRecursosMultifuncionais = "S";

		String indicadorDependenciaExistenteSalaSecretaria = request
				.getParameter("indicadorDependenciaExistenteSalaSecretaria");

		if (indicadorDependenciaExistenteSalaSecretaria == null) {
			indicadorDependenciaExistenteSalaSecretaria = "N";
		} else
			indicadorDependenciaExistenteSalaSecretaria = "S";

		String indicadorDependenciaExistenteAusente = request.getParameter("indicadorDependenciaExistenteAusente");
		if (indicadorDependenciaExistenteAusente == null) {
			indicadorDependenciaExistenteAusente = "N";
		} else
			indicadorDependenciaExistenteAusente = "S";

		String indicadorRecursosAcessibilidadeCorrimaoGuardaCorpo = request
				.getParameter("indicadorRecursosAcessibilidadeCorrimaoGuardaCorpo");
		if (indicadorRecursosAcessibilidadeCorrimaoGuardaCorpo == null) {
			indicadorRecursosAcessibilidadeCorrimaoGuardaCorpo = "N";
		} else
			indicadorRecursosAcessibilidadeCorrimaoGuardaCorpo = "S";

		String indicadorRecursosAcessibilidadeElevador = request
				.getParameter("indicadorRecursosAcessibilidadeElevador");
		if (indicadorRecursosAcessibilidadeElevador == null) {
			indicadorRecursosAcessibilidadeElevador = "N";
		} else
			indicadorRecursosAcessibilidadeElevador = "S";

		String indicadorRecursosAcessibilidadePisoTatil = request
				.getParameter("indicadorRecursosAcessibilidadePisoTatil");
		if (indicadorRecursosAcessibilidadePisoTatil == null) {
			indicadorRecursosAcessibilidadePisoTatil = "N";
		} else
			indicadorRecursosAcessibilidadePisoTatil = "S";

		String indicadorRecursosAcessibilidadePortaVaoLivre = request
				.getParameter("indicadorRecursosAcessibilidadePortaVaoLivre");

		if (indicadorRecursosAcessibilidadePortaVaoLivre == null) {
			indicadorRecursosAcessibilidadePortaVaoLivre = "N";
		} else
			indicadorRecursosAcessibilidadePortaVaoLivre = "S";

		String indicadorRecursosAcessibilidadeRampa = request.getParameter("indicadorRecursosAcessibilidadeRampa");

		if (indicadorRecursosAcessibilidadeRampa == null) {
			indicadorRecursosAcessibilidadeRampa = "N";
		} else
			indicadorRecursosAcessibilidadeRampa = "S";

		String indicadorRecursosAcessibilidadeSinalizacaoSonora = request
				.getParameter("indicadorRecursosAcessibilidadeSinalizacaoSonora");
		if (indicadorRecursosAcessibilidadeSinalizacaoSonora == null) {
			indicadorRecursosAcessibilidadeSinalizacaoSonora = "N";
		} else
			indicadorRecursosAcessibilidadeSinalizacaoSonora = "S";

		String indicadorRecursosAcessibilidadeSinalizacaoTatil = request
				.getParameter("indicadorRecursosAcessibilidadeSinalizacaoTatil");

		if (indicadorRecursosAcessibilidadeSinalizacaoTatil == null) {
			indicadorRecursosAcessibilidadeSinalizacaoTatil = "N";
		} else
			indicadorRecursosAcessibilidadeSinalizacaoTatil = "S";

		String indicadorRecursosAcessibilidadeSinalizacaoVisual = request
				.getParameter("indicadorRecursosAcessibilidadeSinalizacaoVisual");

		if (indicadorRecursosAcessibilidadeSinalizacaoVisual == null) {
			indicadorRecursosAcessibilidadeSinalizacaoVisual = "N";
		} else
			indicadorRecursosAcessibilidadeSinalizacaoVisual = "S";

		String indicadorRecursosAcessibilidadeAusente = request.getParameter("indicadorRecursosAcessibilidadeAusente");
		if (indicadorRecursosAcessibilidadeAusente == null) {
			indicadorRecursosAcessibilidadeAusente = "N";
		} else
			indicadorRecursosAcessibilidadeAusente = "S";

		String quantidadeSalaUtilizadaEscolaDentroPredio = request
				.getParameter("quantidadeSalaUtilizadaEscolaDentroPredio");

		Integer qttilizadaEscolaDentroPredio = Integer.parseInt(quantidadeSalaUtilizadaEscolaDentroPredio);

		String quantidadeSalaUtilizadaEscolaForaPredio = request
				.getParameter("quantidadeSalaUtilizadaEscolaForaPredio");
		Integer qttilizadaEscolaForaPredio = Integer.parseInt(quantidadeSalaUtilizadaEscolaForaPredio);

		String quantidadeSalaClimatizada = request.getParameter("quantidadeSalaClimatizada");
		Integer qtSalaClimatizada = Integer.parseInt(quantidadeSalaClimatizada);

		String quantidadeSalaComAcessibilidade = request.getParameter("quantidadeSalaComAcessibilidade");
		Integer qtSalaAcessibilidade = Integer.parseInt(quantidadeSalaComAcessibilidade);

		String indicadorEspacoCedidoBrasilAlfabetizado = request
				.getParameter("indicadorEspacoCedidoBrasilAlfabetizado");
		
		geCInfra.IndicadorEspacoCedidoBrasilAlfabetizado(indicadorEspacoCedidoBrasilAlfabetizado);

		String indicadorEscolaAbreFinaisSemanaComunidade = request
				.getParameter("indicadorEscolaAbreFinaisSemanaComunidade");
	//	geCInfra.getIndicadorEscolaAbreFinaisSemanaComunidade(indicadorEscolaAbreFinaisSemanaComunidade);
		System.out.println("  Escola Abre finais de semana  : "+geCInfra.getIndicadorEscolaAbreFinaisSemanaComunidade(indicadorEscolaAbreFinaisSemanaComunidade));

		
		String indicadorEscolaPropostaPedagogicaFormacaoPorAlternancia = request
				.getParameter("indicadorEscolaPropostaPedagogicaFormacaoPorAlternancia");
				geCInfra.getIndicadorEscolaPropostaPedagogicaFormacaoPorAlternancia(indicadorEscolaPropostaPedagogicaFormacaoPorAlternancia);
		System.out.println("  Escola Proposta formação por alternância   : "+geCInfra.getIndicadorEscolaPropostaPedagogicaFormacaoPorAlternancia(indicadorEscolaPropostaPedagogicaFormacaoPorAlternancia));
		
		
		

		String indicadorLocalizacaoDiferenciadaEscola = request.getParameter("indicadorLocalizacaoDiferenciadaEscola");

		String indicadorOrgaoVinculoEscolaSecretariaMinisterioEducacao = request
				.getParameter("indicadorOrgaoVinculoEscolaSecretariaMinisterioEducacao");

		String indicadorOrgaoVinculoEscolaSecretariaSegurancaForcasArma = request
				.getParameter("indicadorOrgaoVinculoEscolaSecretariaSegurancaForcasArma");

		String indicadorOrgaoVinculoEscolaSecretariaMinisterioSaude = request
				.getParameter("indicadorOrgaoVinculoEscolaSecretariaMinisterioSaude");

		String indicadorOrgaoVinculoOutroOrgao = request.getParameter("indicadorOrgaoVinculoOutroOrgao");

		String indicadorCategoriaEscola = request.getParameter("indicadorCategoriaEscola");

		String indicadorConvenioPoderPublico = request.getParameter("indicadorConvenioPoderPublico");

		geCInfra.getIndicadorConvenioPoderPublico(indicadorConvenioPoderPublico);
		

		String indicadorMantenedoraEscolaPrivadaEmpresaPrivadaGrupoEmpr = request
				.getParameter("indicadorMantenedoraEscolaPrivadaEmpresaPrivadaGrupoEmpr");

		String indicadorMantenedoraEscolaPrivadaInstituicoesSemFinsLucr = request
				.getParameter("indicadorMantenedoraEscolaPrivadaInstituicoesSemFinsLucr");

		String indicadorMantenedoraEscolaPrivadaOrganizacaoNaoGovernamen = request
				.getParameter("indicadorMantenedoraEscolaPrivadaOrganizacaoNaoGovernamen");

		String indicadorMantenedoraEscolaPrivadaOrganizacaoDaSociedadeC = request
				.getParameter("indicadorMantenedoraEscolaPrivadaOrganizacaoDaSociedadeC");

		String indicadorMantenedoraEscolaPrivadaSindicatoTrabalhadoresPa = request
				.getParameter("indicadorMantenedoraEscolaPrivadaSindicatoTrabalhadoresPa");

		String indicadorMantenedoraEscolaPrivadaSistemaS = request
				.getParameter("indicadorMantenedoraEscolaPrivadaSistemaS");

		String indicadorEsferaAdministrativaConselhoRegulamentacaoutoriz = request
				.getParameter("indicadorEsferaAdministrativaConselhoRegulamentacaoutoriz");

		String usuarioCriacaoRegistroTabela = request.getParameter("usuarioCriacaoRegistroTabela");
		Integer usuarioCriacaogistroTab = Integer.parseInt(usuarioCriacaoRegistroTabela);

		String dataCriacaoRegistroTabela = request.getParameter("dataCriacaoRegistroTabela");

		String datCadastralDiretorNucleo[] = dataCriacaoRegistroTabela.split("-");
		LocalDate datCadastralDirNucleor = LocalDate.of(Integer.parseInt(datCadastralDiretorNucleo[0]),
				Integer.parseInt(datCadastralDiretorNucleo[1]), Integer.parseInt(datCadastralDiretorNucleo[2]));
		System.out.println("Data Cadastral do diretor  :  " + datCadastralDirNucleor);

		/*
		 * String dataAtualizacaoRegistroTabela =
		 * request.getParameter("dataAtualizacaoRegistroTabela");
		 * 
		 * 
		 * String datCadastralAtualizcao[] = dataAtualizacaoRegistroTabela.split("-");
		 * LocalDate datCadastralAtualizar =
		 * LocalDate.of(Integer.parseInt(datCadastralAtualizcao[0]),Integer.parseInt(
		 * datCadastralAtualizcao[1]), Integer.parseInt(datCadastralAtualizcao[2]));
		 * System.out.println("Data Cadastral do diretor  :  " + datCadastralAtualizar);
		 */

		/*
		 * String usuarioAtualizacaoRegistroTabela =
		 * request.getParameter("usuarioAtualizacaoRegistroTabela"); Integer
		 * usuarioAtualizacaoegistro =
		 * Integer.parseInt(usuarioAtualizacaoRegistroTabela);
		 */

		GestaoEscolarCaracterizacaoInfraestruturaEscola fornecedor = new GestaoEscolarCaracterizacaoInfraestruturaEscola(
				codigoDiretorDeNucleo, codUsuario, indicadorLocalFuncionamentoEscola, indicadorFormaOcupacaoPredio,
				indicadorPredioCompartilhadoOoutraEscola, codInepComp_01, codInepComp_02, codInepComp_03,
				codInepComp_04, codInepComp_05, codInepComp_06, indicadorForneceAguaPotavelConsumoHumano,
				indicadorFormaAbastecimentoAguaRedePublica, indicadorFormaAbastecimentoAguaPocoPublico,
				indicadorFormaFbastecimentoFguaFacimbaCisternaPoco,
				indicadorFormaAbastecimentoAguaFonteRioIgarapeRiacho_cor, indicadorFormaAbastecimentoAguaAusente,
				indicadorFonteEnergiaEletricaRedePublica, indicadorFonteEnergiaEletricaGeradorCombustivelFossil,
				indicadorFonteEnergiaEletricaFontesRenovaveisAlternativas, indicadorFonteEnergiaEletricaAusente,
				indicadorEsgotamentoSanitarioRedePublica, indicadorEsgotamentoSanitarioFossaSeptica,
				indicadorEsgotamentoSanitarioFossaRudimentarComum, indicadorEsgotamentoSanitarioAusente,
				indicadorDestinacaoLixoServicoColeta, indicadorDestinacaoLixoQueima, indicadorDestinacaoLixoEnterra,
				indicadorDestinacaoLixoLocalLicenciadoPoderPublico, indicadorDestinacaoLixoOutraArea,
				indicadorTratamentoLixoSeparacaoLixoResiduos, indicadorTratamentoLixoReaproveitamentoReutilizacao,
				indicadorTratamentoLixoReciclagem, indicadorTratamentoAusente,
				indicadorDependenciaExistenteAlmoxarifado, indicadorDependenciaExistenteAreaVerde,
				indicadorDependenciaExistenteAuditorio, indicadorEependenciaExistenteBanheiro,
				indicadorDependenciaExistenteBanheiroAcessivel, indicadorDependenciaExistenteBanheiroEducacaoInfantil,
				indicadorDependenciaExistenteBanheiroExclusivoFuncionario,
				indicadorDependenciaExistenteBanheiroVestiarioComChuveiro, indicadorDependenciaExistenteBiblioteca,
				indicadorDependenciaExistenteCozinha, indicadorDependenciaExistenteDespensa,
				indicadorDependenciaExistenteDormitorioAluno, indicadorDependenciaExistenteDormitorioProfessor,
				indicadorDependenciaExistenteLaboratorioCiencias, indicadorDependenciaExistenteLaboratorioInformatica,
				indicadorDependenciaExistenteParqueInfantil, indicadorDependenciaExistentePatioCoberto,
				indicadorDependenciaExistentePatioDescoberto, indicadorDependenciaExistentePiscina,
				indicadorDependenciaExistenteQuadraEsporteCoberta, indicadorDependenciaExistenteQuadraEsporteDescoberta,
				indicadorDependenciaExistenteRefeitorio, indicadorDependenciaExistenteSalaRepousoAluno,
				indicadorDependenciaExistenteSalaAtelieArte, indicadorDependenciaExistenteSalaMusicaCoral,
				indicadorDependenciaExistenteSalaEstudioDanca, indicadorDependenciaExistenteSalaMultiuso,
				indicadorDependenciaExistenteTerreirao, indicadorDependenciaExistenteViveiro,
				indicadorDependenciaExistenteSalaDiretoria, indicadorDependenciaExistenteSalaLeitura,
				indicadorDependenciaExistenteSalaProfessores, indicadorDependenciaExistenteSalaRecursosMultifuncionais,
				indicadorDependenciaExistenteSalaSecretaria, indicadorDependenciaExistenteAusente,
				indicadorRecursosAcessibilidadeCorrimaoGuardaCorpo, indicadorRecursosAcessibilidadeElevador,
				indicadorRecursosAcessibilidadePisoTatil, indicadorRecursosAcessibilidadePortaVaoLivre,
				indicadorRecursosAcessibilidadeRampa, indicadorRecursosAcessibilidadeSinalizacaoSonora,
				indicadorRecursosAcessibilidadeSinalizacaoTatil, indicadorRecursosAcessibilidadeSinalizacaoVisual,
				indicadorRecursosAcessibilidadeAusente, qttilizadaEscolaDentroPredio, qttilizadaEscolaForaPredio,
				qtSalaClimatizada, qtSalaAcessibilidade, geCInfra.IndicadorEspacoCedidoBrasilAlfabetizado(indicadorEspacoCedidoBrasilAlfabetizado),
				geCInfra.getIndicadorEscolaAbreFinaisSemanaComunidade(indicadorEscolaAbreFinaisSemanaComunidade), geCInfra.getIndicadorEscolaPropostaPedagogicaFormacaoPorAlternancia(indicadorEscolaPropostaPedagogicaFormacaoPorAlternancia),
				indicadorLocalizacaoDiferenciadaEscola, indicadorOrgaoVinculoEscolaSecretariaMinisterioEducacao,
				indicadorOrgaoVinculoEscolaSecretariaSegurancaForcasArma,
				indicadorOrgaoVinculoEscolaSecretariaMinisterioSaude, indicadorOrgaoVinculoOutroOrgao,
				indicadorCategoriaEscola, geCInfra.getIndicadorConvenioPoderPublico(indicadorConvenioPoderPublico),
				indicadorMantenedoraEscolaPrivadaEmpresaPrivadaGrupoEmpr,
				indicadorMantenedoraEscolaPrivadaInstituicoesSemFinsLucr,
				indicadorMantenedoraEscolaPrivadaOrganizacaoNaoGovernamen,
				indicadorMantenedoraEscolaPrivadaOrganizacaoDaSociedadeC,
				indicadorMantenedoraEscolaPrivadaSindicatoTrabalhadoresPa, indicadorMantenedoraEscolaPrivadaSistemaS,
				indicadorEsferaAdministrativaConselhoRegulamentacaoutoriz, datCadastralDirNucleor,
				usuarioCriacaogistroTab);

		/*
		 * if (codigoEscola != null && !codigoEscola.equals("")) {
		 * //fornecedor.setCodigoEscola(Integer.parseInt(codigoEscola));
		 * 
		 * }
		 */

		return fornecedor;
	}

}
