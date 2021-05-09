package br.com.gestaoEscolar.controlAluno;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gestaoEscolar.domainAluno.GestaoEscolarAlunoIdentificacao;
import br.com.gestaoEscolar.domainEscola.GestaoEscolarDadosGerais;
import br.com.gestaoEscolar.model.daoAluno.GestaoEscolarAlunoIdentificacaoDao;
import br.com.gestaoEscolar.model.daoEscola.GestaoEscoarDadosGeraisDao;


/**
 * Servlet implementation class visitanteServlet
 */
@WebServlet(urlPatterns = "/GestaoEscolaAlunoIdentificacaoServlet")
public class GestaoEscolaAlunoIdentificacaoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private GestaoEscolarAlunoIdentificacaoDao fornecedorDao = new GestaoEscolarAlunoIdentificacaoDao();

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// CRUD - CREATE RETRIEVE UPDATE DELETE
		// System.out.println(" Chamou uma o método Serviço. ");
		// super.service(request, response);

		GestaoEscolarAlunoIdentificacao fornecedor = criaFornecedor(request);

		try {

			String acao = request.getParameter("acao11");
			if (acao != null) {
				if (acao.equals("CREATE11")) {

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

					if (fornecedor.getCodigoEstudante() == null) {
						//fornecedorDao.salvar(fornecedor);
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

	private GestaoEscolarAlunoIdentificacao criaFornecedor(HttpServletRequest request) {

		/*
		 * String codigoEscola = request.getParameter("256");// codigoEscola Integer
		 * codigoEscol = Integer.parseInt(codigoEscola);
		 */
		/*
		 * String codigoEstudante = request.getParameter("codigoEstudante");
		 * System.out.println(codigoEstudante);
		 */
		Integer codigoEstudant = null;
		String codigoInepEstudante = request.getParameter("codigoInepEstudante");
		 Integer.parseInt(codigoInepEstudante);
		Integer codigoInepEstudant = Integer.parseInt(codigoInepEstudante);
		
		System.out.println("Código Inepe Estudante :  "+codigoInepEstudant);

		String nomeEstudante = request.getParameter("nomeEstudante");
		System.out.println("Nome da Estudante : "+nomeEstudante);

		String nomeSocialEstudante = request.getParameter("nomeSocialEstudante");
		//Integer cnpj = Integer.parseInt(cnpjEntidade);
		
		System.out.println("Nome social Estudante : "+nomeSocialEstudante);
		

		String sexoEstudante = request.getParameter("sexoEstudante");
		  System.out.println(" Sexo :"+sexoEstudante);
		  
		 String dataNascimentoEstudante = request.getParameter("dataNascimentoEstudante"); 
		  String dataLocal[] = dataNascimentoEstudante.split("-");
		  LocalDate dataNascimentoEstudant = LocalDate.of(Integer.parseInt(dataLocal[0]), Integer.parseInt(dataLocal[1]),
		  Integer.parseInt(dataLocal[2])); 
		  
		  System.out.println(" Data de Nascimneto :"+dataNascimentoEstudant);
		
		String codigoIbgePaisNacionalidadeEstudante = request.getParameter("codigoIbgePaisNacionalidadeEstudante");
		Integer codigoIbgePaisUfNascimentoEstudant = Integer.parseInt(codigoIbgePaisNacionalidadeEstudante);
		

		String codigoIbgeUfNascimentoEstudante = request.getParameter("codigoIbgeUfNascimentoEstudante");
		Integer codigoIbgeUfNascimentoEstudant = Integer.parseInt(codigoIbgeUfNascimentoEstudante);
		
		
		String codigoIbgeMunicipioNascimentoEstudante = request.getParameter("codigoIbgeMunicipioNascimentoEstudante");
		Integer codigoIbgeMunicipioNascimentoEstudant = Integer.parseInt(codigoIbgeMunicipioNascimentoEstudante);

		String nomePaiEstudante = request.getParameter("nomePaiEstudante");
		String nomeMaeEstudante = request.getParameter("nomeMaeEstudante");
		
		String indicadorMaeFalecida = request.getParameter("indicadorMaeFalecida");
		String indicadorMaeDeclarada = request.getParameter("indicadorMaeDeclarada");

		String indicadorPaiFalecido = request.getParameter("indicadorPaiFalecido");
		String indicadorPaiDeclarado = request.getParameter("indicadorPaiDeclarado");
		
		String indicadorAlunoGemeo = request.getParameter("indicadorAlunoGemeo");
		String ruaEnderecoEstudante = request.getParameter("ruaEnderecoEstudante");
		String numeroEnderecoEstudante = request.getParameter("numeroEnderecoEstudante");
		
		
		String complementoEnderecoEstudante = request.getParameter("complementoEnderecoEstudante");
		String bairroEnderecoEstudante = request.getParameter("bairroEnderecoEstudante");
		String municipioEnderecoEstudante = request.getParameter("municipioEnderecoEstudante");
		
		String ufEnderecoEstudante = request.getParameter("ufEnderecoEstudante");
		String cepCnderecoEstudante = request.getParameter("cepCnderecoEstudante");
		String zonaEnderecoEstudante = request.getParameter("zonaEnderecoEstudante");
		
		String indicadorLocalizacaoDiferenciadaResidenciaEstudante = request.getParameter("indicadorLocalizacaoDiferenciadaResidenciaEstudante");
		String telefoneEstudante = request.getParameter("telefoneEstudante");
		String emailEstudante = request.getParameter("emailEstudante");
		
		String indicadorBolsaFamilia = request.getParameter("indicadorBolsaFamilia");
		
		
		String cpfEstudante = request.getParameter("cpfEstudante");
		
		
		System.out.println("CPF aluno : " + cpfEstudante);

		String numeroNisEstudante = request.getParameter("numeroNisEstudante");
		Integer numeroNisEstudant = Integer.parseInt(numeroNisEstudante);

		String indicadorHistoricoEscolarApresentado = request.getParameter("indicadorHistoricoEscolarApresentado");
		String indicadorEstudanteAtividadeComplementar = request.getParameter("indicadorEstudanteAtividadeComplementar");

		GestaoEscolarAlunoIdentificacao fornecedor = new GestaoEscolarAlunoIdentificacao(codigoEstudant, 
				codigoInepEstudant,nomeEstudante,nomeSocialEstudante,sexoEstudante,dataNascimentoEstudant,codigoIbgePaisUfNascimentoEstudant,codigoIbgeUfNascimentoEstudant,
				codigoIbgeMunicipioNascimentoEstudant,nomePaiEstudante,nomeMaeEstudante,indicadorMaeFalecida,
				indicadorMaeDeclarada,indicadorPaiFalecido,indicadorPaiDeclarado,indicadorAlunoGemeo,ruaEnderecoEstudante,
				numeroEnderecoEstudante,complementoEnderecoEstudante,bairroEnderecoEstudante,municipioEnderecoEstudante,ufEnderecoEstudante,
				cepCnderecoEstudante,zonaEnderecoEstudante,indicadorLocalizacaoDiferenciadaResidenciaEstudante,telefoneEstudante,
				emailEstudante,indicadorBolsaFamilia,cpfEstudante,numeroNisEstudant,indicadorHistoricoEscolarApresentado,indicadorEstudanteAtividadeComplementar);

		/*
		 * if (codigoEscola != null && !codigoEscola.equals("")) {
		 * //fornecedor.setCodigoEscola(Integer.parseInt(codigoEscola));
		 * 
		 * }
		 */

		return fornecedor;
	}

}
