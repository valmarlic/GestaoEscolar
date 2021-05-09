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
import br.com.gestaoEscolar.domainEscola.GestaoEscolarDiretordeNucleo;
import br.com.gestaoEscolar.domainEscola.GestaoEscolarSecretarioEscolar;
import br.com.gestaoEscolar.domainEscola.GestaoEscolasrDadosGestores;
import br.com.gestaoEscolar.domainEscola.GestaoEscolasrDiretorAdjunto;
import br.com.gestaoEscolar.model.daoEscola.GestaoEscoarDadosGeraisDao;
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
@WebServlet(urlPatterns = "/GestaoEscolarDiretordeNucleoServlet")
public class GestaoEscolarDiretordeNucleoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private GestaoEscolarDiretorDeNucleoDao fornecedorDao = new GestaoEscolarDiretorDeNucleoDao();

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// CRUD - CREATE RETRIEVE UPDATE DELETE
		// System.out.println(" Chamou uma o método Serviço. ");
		// super.service(request, response);

		GestaoEscolarDiretordeNucleo fornecedor = criaFornecedor(request);

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

					if (fornecedor.getCodigoDiretorDeNucleo() == null) {
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

	private GestaoEscolarDiretordeNucleo criaFornecedor(HttpServletRequest request) {

		Integer codigoDiretorDeNucleo = null;

		String nomeDiretorDeNucleo = request.getParameter("nomeDiretorDeNucleo");
		System.out.println(" Nome do Diretor Geral : " + nomeDiretorDeNucleo);

		String cpfcodigoDiretorDeNucleo = request.getParameter("cpfcodigoDiretorDeNucleo");

		String emailcodigoDiretorDeNucleo = request.getParameter("emailcodigoDiretorDeNucleo");
		System.out.println("Critério de Acesso : " + emailcodigoDiretorDeNucleo);
		
		String criterioAcessocodigoDiretorDeNucleo = request.getParameter("criterioAcessocodigoDiretorDeNucleo");
		System.out.println("Critério de Acesso : " + criterioAcessocodigoDiretorDeNucleo);

		String situacaoFuncionalcodigoDiretorDeNucleo = request.getParameter("situacaoFuncionalcodigoDiretorDeNucleo");
		System.out.println("CNPJ Recebido " + situacaoFuncionalcodigoDiretorDeNucleo);

		String cargaHorariacodigoDiretorDeNucleo = request.getParameter("cargaHorariacodigoDiretorDeNucleo");

		System.out.println(cargaHorariacodigoDiretorDeNucleo);

		String turnoCoordcodigoDiretorDeNucleor = request.getParameter("turnoCoordcodigoDiretorDeNucleor");

		//Integer cargaHoraria = (Integer) Integer.parseInt(cargaHorariaCoordPedagogico);

		//String turnoCoordDeAnexo = request.getParameter("turnoCoordDeAnexo");

		String dataCadrstralcodigoDiretorDeNucleo = request.getParameter("dataCadrstralcodigoDiretorDeNucleo");

		String datCadastralDiretorNucleo[] = dataCadrstralcodigoDiretorDeNucleo.split("-");

		LocalDate datCadastralDirNucleor = LocalDate.of(Integer.parseInt(datCadastralDiretorNucleo[0]),Integer.parseInt(datCadastralDiretorNucleo[1]), Integer.parseInt(datCadastralDiretorNucleo[2]));
		System.out.println("Data Cadastral do diretor  :  " + datCadastralDirNucleor);

		
		GestaoEscolarDiretordeNucleo fornecedor = new GestaoEscolarDiretordeNucleo(codigoDiretorDeNucleo, nomeDiretorDeNucleo, cpfcodigoDiretorDeNucleo, emailcodigoDiretorDeNucleo, 
				criterioAcessocodigoDiretorDeNucleo, situacaoFuncionalcodigoDiretorDeNucleo, cargaHorariacodigoDiretorDeNucleo, turnoCoordcodigoDiretorDeNucleor, datCadastralDirNucleor);

		/*
		 * if (codigoEscola != null && !codigoEscola.equals("")) {
		 * //fornecedor.setCodigoEscola(Integer.parseInt(codigoEscola));
		 * 
		 * }
		 */

		return fornecedor;
	}
}
