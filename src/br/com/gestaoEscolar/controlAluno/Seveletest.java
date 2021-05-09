package br.com.gestaoEscolar.controlAluno;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gestaoEscolar.domainAluno.Cliente;

/**
 * Servlet implementation class Seveletest
 */
@WebServlet("/Seveletest")
public class Seveletest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Seveletest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 
		        String nome = request.getParameter("nome");
		 
		        Cliente c1 = new Cliente();
		        c1.setNome(nome);
		 
		        request.setAttribute("cliente1", c1);
		        request.getRequestDispatcher("ALUNO/Temp/Pagina2.jsp").forward(request, response);
		    }
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
