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
import br.com.gestaoEscolar.domainEscola.GestaoEscolasrDiretorAdjunto;
import br.com.gestaoEscolar.model.daoEscola.GestaoEscoarDadosGeraisDao;
import br.com.gestaoEscolar.model.daoEscola.GestaoEscolasrDadosGestoresDao;
import br.com.gestaoEscolar.model.daoEscola.GestaoEscolasrDiretorAdjuntoDao;
//
/**
 * Servlet implementation class gestaoEscolasrDadosGestoresServlet
 */
@WebServlet( urlPatterns = "/GestaoEscolasrDiretorAdjuntoServlet")
public class GestaoEscolasrDiretorAdjuntoServlet extends HttpServlet { 
	private static final long serialVersionUID = 1L;
	private GestaoEscolasrDiretorAdjuntoDao fornecedorDao = new GestaoEscolasrDiretorAdjuntoDao();

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// CRUD - CREATE RETRIEVE UPDATE DELETE
		// System.out.println(" Chamou uma o método Serviço. ");
		// super.service(request, response);

		GestaoEscolasrDiretorAdjunto fornecedor = criaFornecedor(request);

		try {

			String acao = request.getParameter("acao3");
			if (acao != null) {
				if (acao.equals("CREATE3")) {

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

					if (fornecedor.getCodDiretorAdjunto() == null) {
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

	private GestaoEscolasrDiretorAdjunto criaFornecedor(HttpServletRequest request) {

		

		Integer codigoDirtAdjunto = null;
		
		String nomeDiretorAdjunto = request.getParameter("nomeDiretorAdjunto");
		System.out.println(" Nome do Diretor Geral : "+nomeDiretorAdjunto);
		

		String cpfDiretorAdjunto = request.getParameter("cpfDiretorAdjunto");
		
		
	

		String criterioAcessoDretAdjunto = request.getParameter("criterioAcessoDretAdjunto");
		System.out.println("Critério de Acesso : "+criterioAcessoDretAdjunto);

		String emailDiretorAdjunto = request.getParameter("emailDiretorAdjunto");
		System.out.println("CNPJ Recebido "+emailDiretorAdjunto);
		
		String situacaoFuncDiretorAdjunto = request.getParameter("situacaoFuncDiretorAdjunto");
		
		System.out.println(situacaoFuncDiretorAdjunto);
	

		String dataCadrstralDirAdjunto = request.getParameter("dataCadrstralDirAdjunto");

		String datCadastralDirtAdunt[] = dataCadrstralDirAdjunto.split("-");
		LocalDate datCadastralDiretorAjnto = LocalDate.of(Integer.parseInt(datCadastralDirtAdunt[0]),
				Integer.parseInt(datCadastralDirtAdunt[1]), Integer.parseInt(datCadastralDirtAdunt[2]));
	System.out.println("Data Cadastral do diretor  :  "+datCadastralDiretorAjnto);
	
		
	GestaoEscolasrDiretorAdjunto fornecedor = new GestaoEscolasrDiretorAdjunto(codigoDirtAdjunto,nomeDiretorAdjunto, cpfDiretorAdjunto,
			criterioAcessoDretAdjunto,emailDiretorAdjunto,
			situacaoFuncDiretorAdjunto, datCadastralDiretorAjnto);

		/*
		 * if (codigoEscola != null && !codigoEscola.equals("")) {
		 * //fornecedor.setCodigoEscola(Integer.parseInt(codigoEscola));
		 * 
		 * }
		 */

		return fornecedor;
	}
}
