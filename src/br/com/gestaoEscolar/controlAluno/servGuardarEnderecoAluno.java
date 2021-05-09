package br.com.gestaoEscolar.controlAluno;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.startup.SetAllPropertiesRule;

import br.com.gestaoEscolar.domainAluno.GestaoEscolarAlunoIdentificacao;

/**
 * Servlet implementation class servGuardaEndercoAluno
 */
@WebServlet("/servGuardarEnderecoAluno")
public class servGuardarEnderecoAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servGuardarEnderecoAluno() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		/*
		 * List<GestaoEscolarAlunoIdentificacao> alunoIdentificacao = new
		 * ArrayList<GestaoEscolarAlunoIdentificacao>(); alunoIdentificacao.add(new
		 * GestaoEscolarAlunoIdentificacao(4287983));
		 * request.setAttribute("alunoIdentificacao", alunoIdentificacao);
		 * RequestDispatcher dispacher =
		 * request.getRequestDispatcher("/ALUNO/Temp/tempGEscolarAluno.jsp");
		 * dispacher.forward(request, response);
		 */
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String cepEnderecoEstudante = request.getParameter("cepEnderecoEstudante");
		System.out.println("CEP do endereço do Aluno : "+cepEnderecoEstudante);
		
		String complementoEnderecoEstudante = request.getParameter("complementoEnderecoEstudante");
		String ufEnderecoEstudante = request.getParameter("ufEnderecoEstudante");
		String zonaEnderecoEstudante = request.getParameter("zonaEnderecoEstudante");
		String numeroEnderecoEstudante = request.getParameter("numeroEnderecoEstudante");
		String bairroEnderecoEstudante = request.getParameter("bairroEnderecoEstudante");
		String municipioEnderecoEstudante = request.getParameter("municipioEnderecoEstudante");
		String codigoIbgePaisNacionalidadeEstudante = request.getParameter("codigoIbgePaisNacionalidadeEstudante");
		String emailEstudante = request.getParameter("emailEstudante");
		String ruaEnderecoEstudante = request.getParameter("ruaEnderecoEstudante");
		
		String indicadorLocalizacaoDiferenciadaResidenciaEstudante = request.getParameter("indicadorLocalizacaoDiferenciadaResidenciaEstudante");
		String telefoneEstudante = request.getParameter("telefoneEstudante");
		//response.sendRedirect("ALUNO/Temp/tempGEscolarAluno.jsp?cepEnderecoEstudante="+cepEnderecoEstudante+"&complementoEnderecoEstudante="+complementoEnderecoEstudante);
			
		
	}


	
}
