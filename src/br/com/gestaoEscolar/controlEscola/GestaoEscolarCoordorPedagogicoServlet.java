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

import br.com.gestaoEscolar.domainEscola.GestaoEscolarCoordnadorPedagogico;
import br.com.gestaoEscolar.domainEscola.GestaoEscolarDadosGerais;
import br.com.gestaoEscolar.domainEscola.GestaoEscolasrDadosGestores;
import br.com.gestaoEscolar.domainEscola.GestaoEscolasrDiretorAdjunto;
import br.com.gestaoEscolar.model.daoEscola.GestaoEscoarDadosGeraisDao;
import br.com.gestaoEscolar.model.daoEscola.GestaoEscolarCoordorPedagogicoDao;
import br.com.gestaoEscolar.model.daoEscola.GestaoEscolasrDadosGestoresDao;
import br.com.gestaoEscolar.model.daoEscola.GestaoEscolasrDiretorAdjuntoDao;

//
/**
 * Servlet implementation class gestaoEscolasrDadosGestoresServlet
 */
@WebServlet(urlPatterns = "/GestaoEscolarCoordorPedagogicoServlet")
public class GestaoEscolarCoordorPedagogicoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private GestaoEscolarCoordorPedagogicoDao fornecedorDao = new GestaoEscolarCoordorPedagogicoDao();

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// CRUD - CREATE RETRIEVE UPDATE DELETE
		// System.out.println(" Chamou uma o método Serviço. ");
		// super.service(request, response);

		GestaoEscolarCoordnadorPedagogico fornecedor = criaFornecedor(request);

		try {

			String acao = request.getParameter("acao4");
			if (acao != null) {
				if (acao.equals("CREATE4")) {

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

					if (fornecedor.getCodigoCoordPedagogico() == null) {
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

	private GestaoEscolarCoordnadorPedagogico criaFornecedor(HttpServletRequest request) {

		Integer codigoCordenadorPedagogico = null;

		String nomeCoordPedagogico = request.getParameter("nomeCoordPedagogico");
		System.out.println(" Nome do Diretor Geral : " + nomeCoordPedagogico);

		String cpfCoordPedagogico = request.getParameter("cpfCoordPedagogico");

		String emailCoordPedagogico = request.getParameter("emailCoordPedagogico");
		System.out.println("Critério de Acesso : " + emailCoordPedagogico);

		String criterioAcessoCoordCFunCordPedgco = request.getParameter("criterioAcessoCoordCFunCordPedgco");
		System.out.println("CNPJ Recebido " + criterioAcessoCoordCFunCordPedgco);

		String situacaoFuncionalCoordPedagogico = request.getParameter("situacaoFuncionalCoordPedagogico");

		System.out.println(situacaoFuncionalCoordPedagogico);

		String cargaHorariaCoordPedagogico = request.getParameter("cargaHorariaCoordPedagogico");

		//Integer cargaHoraria = (Integer) Integer.parseInt(cargaHorariaCoordPedagogico);

		String turnoCoordPedagogico = request.getParameter("turnoCoordPedagogico");

		String dataCadrstralCoordPedagogico = request.getParameter("dataCadrstralCoordPedagogico");

		String datCadastralCoodPedgico[] = dataCadrstralCoordPedagogico.split("-");

		LocalDate datCadastralCoordPedagoggico = LocalDate.of(Integer.parseInt(datCadastralCoodPedgico[0]),
				Integer.parseInt(datCadastralCoodPedgico[1]), Integer.parseInt(datCadastralCoodPedgico[2]));
		System.out.println("Data Cadastral do diretor  :  " + datCadastralCoordPedagoggico);

		GestaoEscolarCoordnadorPedagogico fornecedor = new GestaoEscolarCoordnadorPedagogico(codigoCordenadorPedagogico,
				nomeCoordPedagogico, cpfCoordPedagogico, emailCoordPedagogico, criterioAcessoCoordCFunCordPedgco,
				situacaoFuncionalCoordPedagogico, cargaHorariaCoordPedagogico, turnoCoordPedagogico, datCadastralCoordPedagoggico);

		/*
		 * if (codigoEscola != null && !codigoEscola.equals("")) {
		 * //fornecedor.setCodigoEscola(Integer.parseInt(codigoEscola));
		 * 
		 * }
		 */

		return fornecedor;
	}
}
