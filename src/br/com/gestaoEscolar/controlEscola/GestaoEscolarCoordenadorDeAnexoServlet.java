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

import br.com.gestaoEscolar.domainEscola.GestaoEscolarCoordenadorDeAnexo;
import br.com.gestaoEscolar.domainEscola.GestaoEscolarCoordnadorPedagogico;
import br.com.gestaoEscolar.domainEscola.GestaoEscolarDadosGerais;
import br.com.gestaoEscolar.domainEscola.GestaoEscolasrDadosGestores;
import br.com.gestaoEscolar.domainEscola.GestaoEscolasrDiretorAdjunto;
import br.com.gestaoEscolar.model.daoEscola.GestaoEscoarDadosGeraisDao;
import br.com.gestaoEscolar.model.daoEscola.GestaoEscolarCoordenadorDeAnexoDao;
import br.com.gestaoEscolar.model.daoEscola.GestaoEscolarCoordorPedagogicoDao;
import br.com.gestaoEscolar.model.daoEscola.GestaoEscolasrDadosGestoresDao;
import br.com.gestaoEscolar.model.daoEscola.GestaoEscolasrDiretorAdjuntoDao;

//
/**
 * Servlet implementation class gestaoEscolasrDadosGestoresServlet
 */
@WebServlet(urlPatterns = "/GestaoEscolarCoordenadorDeAnexoServlet")
public class GestaoEscolarCoordenadorDeAnexoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private GestaoEscolarCoordenadorDeAnexoDao fornecedorDao = new GestaoEscolarCoordenadorDeAnexoDao();

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// CRUD - CREATE RETRIEVE UPDATE DELETE
		// System.out.println(" Chamou uma o método Serviço. ");
		// super.service(request, response);

		GestaoEscolarCoordenadorDeAnexo fornecedor = criaFornecedor(request);

		try {

			String acao = request.getParameter("acao5");
			if (acao != null) {
				if (acao.equals("CREATE5")) {

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

					if (fornecedor.getCodigoCoordDeAnexo() == null) {
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

	private GestaoEscolarCoordenadorDeAnexo criaFornecedor(HttpServletRequest request) {

		Integer codigoCordenadorPedagogico = null;

		String nomeCoordDeAnexo = request.getParameter("nomeCoordDeAnexo");
		System.out.println(" Nome do Diretor Geral : " + nomeCoordDeAnexo);

		String cpfCoordDeAnexo = request.getParameter("cpfCoordDeAnexo");

		String emailCoordDeAnexo = request.getParameter("emailCoordDeAnexo");
		System.out.println("Critério de Acesso : " + emailCoordDeAnexo);

		String criterioAcessoCoordDeAnexo = request.getParameter("criterioAcessoCoordDeAnexo");
		System.out.println("CNPJ Recebido " + criterioAcessoCoordDeAnexo);

		String situacaoFuncionalCoordDeAnexo = request.getParameter("situacaoFuncionalCoordDeAnexo");

		System.out.println(situacaoFuncionalCoordDeAnexo);

		String cargaHorariaCoordDeAnexo = request.getParameter("cargaHorariaCoordDeAnexo");

		//Integer cargaHoraria = (Integer) Integer.parseInt(cargaHorariaCoordPedagogico);

		String turnoCoordDeAnexo = request.getParameter("turnoCoordDeAnexo");

		String dataCadrstralCoordDeAnexo = request.getParameter("dataCadrstralCoordDeAnexo");

		String datCadastralCoodAnexo[] = dataCadrstralCoordDeAnexo.split("-");

		LocalDate datCadastralCoordAnexo = LocalDate.of(Integer.parseInt(datCadastralCoodAnexo[0]),
				Integer.parseInt(datCadastralCoodAnexo[1]), Integer.parseInt(datCadastralCoodAnexo[2]));
		System.out.println("Data Cadastral do diretor  :  " + datCadastralCoordAnexo);

		GestaoEscolarCoordenadorDeAnexo fornecedor = new GestaoEscolarCoordenadorDeAnexo(codigoCordenadorPedagogico,
				nomeCoordDeAnexo, cpfCoordDeAnexo, emailCoordDeAnexo, criterioAcessoCoordDeAnexo,
				situacaoFuncionalCoordDeAnexo, cargaHorariaCoordDeAnexo, turnoCoordDeAnexo, datCadastralCoordAnexo);

		/*
		 * if (codigoEscola != null && !codigoEscola.equals("")) {
		 * //fornecedor.setCodigoEscola(Integer.parseInt(codigoEscola));
		 * 
		 * }
		 */

		return fornecedor;
	}
}
