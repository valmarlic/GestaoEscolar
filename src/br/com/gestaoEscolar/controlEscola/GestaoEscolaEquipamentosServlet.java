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

import br.com.gestaoEscolar.domainEscola.GestaoEscolarCaracterizacaoEquipamentoEscola;
import br.com.gestaoEscolar.domainEscola.GestaoEscolarDadosGerais;
import br.com.gestaoEscolar.model.daoEscola.GestaoEscoarDadosGeraisDao;
import br.com.gestaoEscolar.model.daoEscola.GestaoEscoarEquipamentosDao;

/**
 * Servlet implementation class visitanteServlet
 */
@WebServlet(urlPatterns = "/GestaoEscolaEquipamentosServlet")
public class GestaoEscolaEquipamentosServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private GestaoEscoarEquipamentosDao fornecedorDao = new GestaoEscoarEquipamentosDao();
	private GestaoEscolarCaracterizacaoEquipamentoEscola  gECEquipamento = new GestaoEscolarCaracterizacaoEquipamentoEscola();
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// CRUD - CREATE RETRIEVE UPDATE DELETE
		// System.out.println(" Chamou uma o método Serviço. ");
		// super.service(request, response);

		GestaoEscolarCaracterizacaoEquipamentoEscola fornecedor = criaFornecedor(request);

		try {

			String acao = request.getParameter("acao8");
			if (acao != null) {
				if (acao.equals("CREATE8")) {

					try {
						fornecedorDao.salvar(fornecedor);

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

	private GestaoEscolarCaracterizacaoEquipamentoEscola criaFornecedor(HttpServletRequest request) {

		/*
		 * String codigoEscola = request.getParameter("256");// codigoEscola Integer
		 * codigoEscol = Integer.parseInt(codigoEscola);
		 */

		Integer codigoCaracterizacaoEquipamentoEscola = null;

		String codigoCarctzEquipfraEscola = request.getParameter("codigoCarctzEquipfraEscola");
		System.out.println(codigoCarctzEquipfraEscola);
		Integer codigoCarctzEquipfraEscol = Integer.parseInt(codigoCarctzEquipfraEscola);

		String qtdAntenaParabolicaEquipamentoEscola = request.getParameter("qtdAntenaParabolicaEquipamentoEscola");
		Integer.parseInt(qtdAntenaParabolicaEquipamentoEscola);
		Integer qtdAntenaParabolicaEquipamentoEscol = Integer.parseInt(qtdAntenaParabolicaEquipamentoEscola);

		System.out.println("Quantidade de Antena Parabólica :  " + qtdAntenaParabolicaEquipamentoEscol);

		String qtdComputadoresAdmEquipamentoEscola = request.getParameter("qtdComputadoresAdmEquipamentoEscola");
		Integer qtdComputadoresAdmEquipamentoEscol = Integer.parseInt(qtdComputadoresAdmEquipamentoEscola);
		System.out.println("Quantidade de Computadores : " + qtdComputadoresAdmEquipamentoEscola);

		String qtdCopiadorasEquipamentoEscola = request.getParameter("qtdCopiadorasEquipamentoEscola");
		Integer qtdCopiadorasEquipamentoEscol = Integer.parseInt(qtdCopiadorasEquipamentoEscola);
		System.out.println("Quantidade de Copiadoras  : " + qtdCopiadorasEquipamentoEscol);

		String qtdInpressorasEquipamentoEscola = request.getParameter("qtdInpressorasEquipamentoEscola");
		Integer qtdInpressorasEquipamentoEscol = Integer.parseInt(qtdInpressorasEquipamentoEscola);

		String qtdInpressorasMultfuncionaisEquipamentoEscola = request
				.getParameter("qtdInpressorasMultfuncionaisEquipamentoEscola");
		Integer qtdInpressorasMultfuncionaisEquipamentoEscol = Integer
				.parseInt(qtdInpressorasMultfuncionaisEquipamentoEscola);

		String qtdEscannersEquipamentoEscola = request.getParameter("qtdEscannersEquipamentoEscola");
		Integer qtdEscannersEquipamentoEscol = Integer.parseInt(qtdEscannersEquipamentoEscola);
		System.out.println("Quantidade de Scanner  :  " + qtdEscannersEquipamentoEscol);

		String qtdDvdBluRayEquipamentoEscola = request.getParameter("qtdDvdBluRayEquipamentoEscola");
		Integer qtdDvdBluRayEquipamentoEscol = Integer.parseInt(qtdDvdBluRayEquipamentoEscola);

		String qtdAparelhoDeSomEquipamentoEscola = request.getParameter("qtdAparelhoDeSomEquipamentoEscola");
		Integer qtdAparelhoDeSomEquipamentoEscol = Integer.parseInt(qtdAparelhoDeSomEquipamentoEscola);

		String qtdAparelhoTVEquipamentoEscola = request.getParameter("qtdAparelhoTVEquipamentoEscola");
		Integer qtdAparelhoTVEquipamentoEscol = Integer.parseInt(qtdAparelhoTVEquipamentoEscola);

		String qtdLousaDigitalEquipamentoEscola = request.getParameter("qtdLousaDigitalEquipamentoEscola");
		Integer qtdLousaDigitalEquipamentoEscol = Integer.parseInt(qtdLousaDigitalEquipamentoEscola);

		String qtdProjetorMultmidiaEquipamentoEscola = request.getParameter("qtdProjetorMultmidiaEquipamentoEscola");
		Integer qtdProjetorMultmidiaEquipamentoEscol = Integer.parseInt(qtdProjetorMultmidiaEquipamentoEscola);

		String qtdComputadorDesktopEquipamentoEscola = request.getParameter("qtdComputadorDesktopEquipamentoEscola");
		Integer qtdComputadorDesktopEquipamentoEscol = Integer.parseInt(qtdComputadorDesktopEquipamentoEscola);

		String qtdComputadoresPortateisEquipamentoEscola = request
				.getParameter("qtdComputadoresPortateisEquipamentoEscola");
		Integer qtdComputadoresPortateisEquipamentoEscol = Integer.parseInt(qtdComputadoresPortateisEquipamentoEscola);

		String qtdComputadoresTabletsEquipamentoEscola = request
				.getParameter("qtdComputadoresTabletsEquipamentoEscola");
		Integer qtdComputadoresTabletsEquipamentoEscol = Integer.parseInt(qtdComputadoresTabletsEquipamentoEscola);

		String indicadorAcessoInternetUsoAluno = request.getParameter("indicadorAcessoInternetUsoAluno");
		if (indicadorAcessoInternetUsoAluno == null) {
			indicadorAcessoInternetUsoAluno = "N";
		}
		indicadorAcessoInternetUsoAluno = "S";

		String indicadorAcessoInternetUsoAdministrativo = request
				.getParameter("indicadorAcessoInternetUsoAdministrativo");
		if (indicadorAcessoInternetUsoAdministrativo == null) {
			indicadorAcessoInternetUsoAdministrativo = "N";
		}
		indicadorAcessoInternetUsoAdministrativo = "S";

		String indicadorAcessoInternetUsoProcessoEnsinoAprendizagem = request
				.getParameter("indicadorAcessoInternetUsoProcessoEnsinoAprendizagem");
		if (indicadorAcessoInternetUsoProcessoEnsinoAprendizagem == null) {
			indicadorAcessoInternetUsoProcessoEnsinoAprendizagem = "N";
		}
		indicadorAcessoInternetUsoProcessoEnsinoAprendizagem = "S";

		String indicadorAcessoInternetUsoComunidade = request.getParameter("indicadorAcessoInternetUsoComunidade");
		if (indicadorAcessoInternetUsoComunidade == null) {
			indicadorAcessoInternetUsoComunidade = "N";
		}
		indicadorAcessoInternetUsoComunidade = "S";

		String indicadorNaoPossuiacessoInternet = request.getParameter("indicadorNaoPossuiacessoInternet");
		if (indicadorNaoPossuiacessoInternet == null) {
			indicadorNaoPossuiacessoInternet = "N";
		}
		indicadorNaoPossuiacessoInternet = "S";

		String indicadorEquipamentoAlunoAcessoInternetComputadoresMesaP = request
				.getParameter("indicadorEquipamentoAlunoAcessoInternetComputadoresMesaP");
		if (indicadorEquipamentoAlunoAcessoInternetComputadoresMesaP == null) {
			indicadorEquipamentoAlunoAcessoInternetComputadoresMesaP = "N";
		}
		indicadorEquipamentoAlunoAcessoInternetComputadoresMesaP = "S";

		String indicadorEquipamentoAlunoAcessoInternetDispositivosPessoa = request
				.getParameter("indicadorEquipamentoAlunoAcessoInternetDispositivosPessoa");
		if (indicadorEquipamentoAlunoAcessoInternetDispositivosPessoa == null) {
			indicadorEquipamentoAlunoAcessoInternetDispositivosPessoa = "N";
		}
		indicadorEquipamentoAlunoAcessoInternetDispositivosPessoa = "S";

		String indicadorInternetBandaLarga = request.getParameter("indicadorInternetBandaLarga");
		gECEquipamento.getIndicadorInternetBandaLarga(indicadorInternetBandaLarga);
		System.out.println("Internete Banda Larga : "+indicadorInternetBandaLarga);
		
		String indicadorRedeLocalInterligacaoComputadoresCabo = request
				.getParameter("indicadorRedeLocalInterligacaoComputadoresCabo");
		
	
		
		String dataCriacaoRegistroTabela = request.getParameter("dataCriacaoRegistroTabela");
		String dataLocalAtz[] = dataCriacaoRegistroTabela.split("-");
		LocalDate dataCriacaoRegistroTabel = LocalDate.of(Integer.parseInt(dataLocalAtz[0]),
				Integer.parseInt(dataLocalAtz[1]), Integer.parseInt(dataLocalAtz[2]));
		System.out.println(" Data de criação do Registro" + dataCriacaoRegistroTabel);

		String usuarioUriacaoRegistroTabela = request.getParameter("usuarioUriacaoRegistroTabela");
		Integer usuarioUriacaoRegistroTabel = Integer.parseInt(usuarioUriacaoRegistroTabela);

		GestaoEscolarCaracterizacaoEquipamentoEscola fornecedor = new GestaoEscolarCaracterizacaoEquipamentoEscola(
				codigoCaracterizacaoEquipamentoEscola, codigoCarctzEquipfraEscol, qtdAntenaParabolicaEquipamentoEscol,
				qtdComputadoresAdmEquipamentoEscol, qtdCopiadorasEquipamentoEscol, qtdInpressorasEquipamentoEscol,
				qtdInpressorasMultfuncionaisEquipamentoEscol, qtdEscannersEquipamentoEscol,
				qtdDvdBluRayEquipamentoEscol, qtdAparelhoDeSomEquipamentoEscol, qtdAparelhoTVEquipamentoEscol,
				qtdLousaDigitalEquipamentoEscol, qtdProjetorMultmidiaEquipamentoEscol,
				qtdComputadorDesktopEquipamentoEscol, qtdComputadoresPortateisEquipamentoEscol,
				qtdComputadoresTabletsEquipamentoEscol, indicadorAcessoInternetUsoAluno,
				indicadorAcessoInternetUsoAdministrativo, indicadorAcessoInternetUsoProcessoEnsinoAprendizagem,
				indicadorAcessoInternetUsoComunidade, indicadorNaoPossuiacessoInternet,
				indicadorEquipamentoAlunoAcessoInternetComputadoresMesaP,
				indicadorEquipamentoAlunoAcessoInternetDispositivosPessoa, gECEquipamento.getIndicadorInternetBandaLarga(indicadorInternetBandaLarga),
				indicadorRedeLocalInterligacaoComputadoresCabo, dataCriacaoRegistroTabel, usuarioUriacaoRegistroTabel);

		/*
		 * if (codigoEscola != null && !codigoEscola.equals("")) {
		 * //fornecedor.setCodigoEscola(Integer.parseInt(codigoEscola));
		 * 
		 * }
		 */

		return fornecedor;
	}

}
