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

import br.com.gestaoEscolar.domainEscola.GestaoEscolarDadosGerais;
import br.com.gestaoEscolar.domainEscola.GestaoEscolasrDadosGestores;
import br.com.gestaoEscolar.model.daoEscola.GestaoEscoarDadosGeraisDao;
import br.com.gestaoEscolar.model.daoEscola.GestaoEscolasrDadosGestoresDao;

/**
 * Servlet implementation class gestaoEscolasrDadosGestoresServlet
 */
@WebServlet( urlPatterns = "/gestaoEscolasrDadosGestoresServlet")
public class GestaoEscolasrDadosGestoresServlet extends HttpServlet { 
	private static final long serialVersionUID = 1L;
	private GestaoEscolasrDadosGestoresDao fornecedorDao = new GestaoEscolasrDadosGestoresDao();

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// CRUD - CREATE RETRIEVE UPDATE DELETE
		// System.out.println(" Chamou uma o método Serviço. ");
		// super.service(request, response);

		GestaoEscolasrDadosGestores fornecedor = criaFornecedor(request);

		try {

			String acao = request.getParameter("acao1");
			if (acao != null) {
				if (acao.equals("CREATE1")) {

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

					if (fornecedor.getCodDiretorGeral() == null) {
						//fornecedorDao.salvar(fornecedor);
						request.setAttribute("mensagem", "Vistante salvo com sucesso");
					} else {
						//fornecedorDao.atualizar(fornecedor);
						request.setAttribute("mensagem", "Visitante atualizado com sucesso");
					}
				} else if (acao.equals("RETRIEVE")) {
					String numerocartao = request.getParameter("numerocartao");
					Integer codFornecedor = Integer.parseInt(numerocartao);
					//fornecedor = fornecedorDao.getFornecedorId(codFornecedor);
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

	private GestaoEscolasrDadosGestores criaFornecedor(HttpServletRequest request) {

		/*
		 * String codigoEscola = request.getParameter("256");// codigoEscola Integer
		 * codigoEscol = Integer.parseInt(codigoEscola);
		 */

		Integer codigoDGeral = null;
		
		String nomeDiretorGeral = request.getParameter("nomeDiretorGeral");
		System.out.println(" Nome do Diretor Geral : "+nomeDiretorGeral);
		

		String cpfDiretorGeral = request.getParameter("cpfDiretorGeral");
		// Integer.parseInt(cpfDiretorGeral);
		
	

		String criterioAcessoDgeral = request.getParameter("criterioAcessoDgeral");
		System.out.println("Critério de Acesso : "+criterioAcessoDgeral);

		String emailDiretorGeral = request.getParameter("emailDiretorGeral");
		System.out.println("CNPJ Recebido "+emailDiretorGeral);
		
		String situacaoFuncDiretorGeral = request.getParameter("situacaoFuncDiretorGeral");
		/*
		 * String dataLocal[] = dataCriacaoRegistroTabela.split("-"); LocalDate
		 * dataCricaoRegisto = LocalDate.of(Integer.parseInt(dataLocal[0]),
		 * Integer.parseInt(dataLocal[1]), Integer.parseInt(dataLocal[2]));
		 */
		System.out.println(situacaoFuncDiretorGeral);
		/*
		 * //LocalDate dataCricaoRegisto= new Locale(dataCriacaoRegistroTabela) ;
		 * DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/uuuu");
		 * LocalDate dataCricaoRegisto = LocalDate.parse(dataCriacaoRegistroTabela,
		 * formato);
		 */

		String dataCadastral = request.getParameter("dataCadastral");

		String datCadastralDirt[] = dataCadastral.split("-");
		LocalDate datCadastralDiretor = LocalDate.of(Integer.parseInt(datCadastralDirt[0]),
				Integer.parseInt(datCadastralDirt[1]), Integer.parseInt(datCadastralDirt[2]));
	System.out.println("Data Cadastral do diretor  :  "+datCadastralDiretor);
	
		
	GestaoEscolasrDadosGestores fornecedor = new GestaoEscolasrDadosGestores(codigoDGeral,  nomeDiretorGeral, cpfDiretorGeral,criterioAcessoDgeral,
			situacaoFuncDiretorGeral,emailDiretorGeral,datCadastralDiretor);

		/*
		 * if (codigoEscola != null && !codigoEscola.equals("")) {
		 * //fornecedor.setCodigoEscola(Integer.parseInt(codigoEscola));
		 * 
		 * }
		 */

		return fornecedor;
	}
}
