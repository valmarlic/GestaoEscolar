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

import br.com.gestaoEscolar.model.daoAluno.GestaoEscolarAlunoIdentificacaoDao;


/**
 * Servlet implementation class visitanteServlet
 */
@WebServlet(urlPatterns = "/servIndetificacaoAluno")
public class servIndetificacaoAluno extends HttpServlet {

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
		String codigoInepEstudante = request.getParameter("codigoInepEstudante");
		 Integer.parseInt(codigoInepEstudante);
		Integer codigoInepEstudant = Integer.parseInt(codigoInepEstudante);
		
		String cepEnderecoEstudante = request.getParameter("cepEnderecoEstudante");
		 Integer.parseInt(cepEnderecoEstudante);
		Integer cepEnderecoEstudant = Integer.parseInt(codigoInepEstudante);
		
		System.out.println("Cep estudante :  "+cepEnderecoEstudant);

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
		String codigoIbgeUfNascimentoEstudante = request.getParameter("codigoIbgeUfNascimentoEstudante");
		Integer codigoIbgeUfNascimentoEstudant = Integer.parseInt(codigoIbgeUfNascimentoEstudante);
		System.out.println(" UF de Nascimento:  "+codigoIbgeUfNascimentoEstudant);
		
		String codigoIbgeMunicipioNascimentoEstudante = request.getParameter("codigoIbgeMunicipioNascimentoEstudante");
		Integer codigoIbgeMunicipioNascimentoEstudant = Integer.parseInt(codigoIbgeMunicipioNascimentoEstudante);
		 System.out.println(" Código Ibge:"+codigoIbgeMunicipioNascimentoEstudant);
		
		String indicadorAlunoGemeo = request.getParameter("indicadorAlunoGemeo");
			System.out.println(" Aluno Gemeos:  "+indicadorAlunoGemeo);
		
		String cpfEstudante = request.getParameter("cpfEstudante");
		
		
		System.out.println("CPF aluno : " + cpfEstudante);

		String numeroNisEstudante = request.getParameter("numeroNisEstudante");
		Integer numeroNisEstudant = Integer.parseInt(numeroNisEstudante);

		String indicadorHistoricoEscolarApresentado = request.getParameter("indicadorHistoricoEscolarApresentado");
		String indicadorEstudanteAtividadeComplementar = request.getParameter("indicadorEstudanteAtividadeComplementar");
		
		//response.sendRedirect("ALUNO/Temp/tempGEscolarAluno.jsp?codigoInepEstudante="+codigoInepEstudante+"&nomeEstudante="+nomeEstudante);
		GestaoEscolarAlunoIdentificacao fornecedor = new GestaoEscolarAlunoIdentificacao(
				
				codigoInepEstudant,cepEnderecoEstudant,nomeEstudante,nomeSocialEstudante,sexoEstudante,
				dataNascimentoEstudant,codigoIbgeUfNascimentoEstudant,codigoIbgeMunicipioNascimentoEstudant,
				indicadorAlunoGemeo,cepEnderecoEstudante,cpfEstudante,numeroNisEstudant,indicadorHistoricoEscolarApresentado,
				indicadorEstudanteAtividadeComplementar);
		
		return fornecedor;
	}
		
	}


