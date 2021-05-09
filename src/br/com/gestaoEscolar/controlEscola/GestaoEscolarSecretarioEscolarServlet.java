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
import br.com.gestaoEscolar.domainEscola.GestaoEscolarSecretarioEscolar;
import br.com.gestaoEscolar.domainEscola.GestaoEscolasrDadosGestores;
import br.com.gestaoEscolar.domainEscola.GestaoEscolasrDiretorAdjunto;
import br.com.gestaoEscolar.model.daoEscola.GestaoEscoarDadosGeraisDao;
import br.com.gestaoEscolar.model.daoEscola.GestaoEscolarCoordenadorDeAnexoDao;
import br.com.gestaoEscolar.model.daoEscola.GestaoEscolarCoordorPedagogicoDao;
import br.com.gestaoEscolar.model.daoEscola.GestaoEscolarSecretarioEscolarDao;
import br.com.gestaoEscolar.model.daoEscola.GestaoEscolasrDadosGestoresDao;
import br.com.gestaoEscolar.model.daoEscola.GestaoEscolasrDiretorAdjuntoDao;

//
/**
 * Servlet implementation class gestaoEscolasrDadosGestoresServlet
 */
@WebServlet(urlPatterns = "/GestaoEscolarSecretarioEscolarServlet")
public class GestaoEscolarSecretarioEscolarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private GestaoEscolarSecretarioEscolarDao fornecedorDao = new GestaoEscolarSecretarioEscolarDao();

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// CRUD - CREATE RETRIEVE UPDATE DELETE
		// System.out.println(" Chamou uma o método Serviço. ");
		// super.service(request, response);

		GestaoEscolarSecretarioEscolar fornecedor = criaFornecedor(request);

		try {

			String acao = request.getParameter("acao6");
			if (acao != null) {
				if (acao.equals("CREATE6")) {

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

					if (fornecedor.getCodigoSecretarioEscolar() == null) {
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

	private GestaoEscolarSecretarioEscolar criaFornecedor(HttpServletRequest request) {

		Integer codigoSecretarioEscolar = null;

		String nomeSecretarioEscolaro = request.getParameter("nomeSecretarioEscolaro");
		System.out.println(" Nome do Diretor Geral : " + nomeSecretarioEscolaro);

		String cpfSecretarioEscolar = request.getParameter("cpfSecretarioEscolar");

		String emailSecretarioEscolar = request.getParameter("emailSecretarioEscolar");
		System.out.println("Critério de Acesso : " + emailSecretarioEscolar);
		
		String criterioAcessoSecretarioEscolar = request.getParameter("criterioAcessoSecretarioEscolar");
		System.out.println("Critério de Acesso : " + criterioAcessoSecretarioEscolar);

		String situacaoFuncionalSecretarioEscolar = request.getParameter("situacaoFuncionalSecretarioEscolar");
		System.out.println("CNPJ Recebido " + situacaoFuncionalSecretarioEscolar);

		String cargaHorariaSecretarioEscolar = request.getParameter("cargaHorariaSecretarioEscolar");

		System.out.println(cargaHorariaSecretarioEscolar);

		String turnoCoordSecretarioEscolar = request.getParameter("turnoCoordSecretarioEscolar");

		//Integer cargaHoraria = (Integer) Integer.parseInt(cargaHorariaCoordPedagogico);

		//String turnoCoordDeAnexo = request.getParameter("turnoCoordDeAnexo");

		String dataCadrstralSecretarioEscolar = request.getParameter("dataCadrstralSecretarioEscolar");

		String datCadastralSecrtariEscolar[] = dataCadrstralSecretarioEscolar.split("-");

		LocalDate datCadastralSecrtEsclar = LocalDate.of(Integer.parseInt(datCadastralSecrtariEscolar[0]),Integer.parseInt(datCadastralSecrtariEscolar[1]), Integer.parseInt(datCadastralSecrtariEscolar[2]));
		System.out.println("Data Cadastral do diretor  :  " + datCadastralSecrtEsclar);

		GestaoEscolarSecretarioEscolar fornecedor = new GestaoEscolarSecretarioEscolar(codigoSecretarioEscolar,
				nomeSecretarioEscolaro, cpfSecretarioEscolar, emailSecretarioEscolar, criterioAcessoSecretarioEscolar,
				situacaoFuncionalSecretarioEscolar, cargaHorariaSecretarioEscolar, turnoCoordSecretarioEscolar, datCadastralSecrtEsclar);

		/*
		 * if (codigoEscola != null && !codigoEscola.equals("")) {
		 * //fornecedor.setCodigoEscola(Integer.parseInt(codigoEscola));
		 * 
		 * }
		 */

		return fornecedor;
	}
}
