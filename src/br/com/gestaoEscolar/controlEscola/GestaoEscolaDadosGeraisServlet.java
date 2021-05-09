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
import br.com.gestaoEscolar.model.daoEscola.GestaoEscoarDadosGeraisDao;


/**
 * Servlet implementation class visitanteServlet
 */
@WebServlet(urlPatterns = "/gestaoEscolaDadosGeraisServlet")
public class GestaoEscolaDadosGeraisServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private GestaoEscoarDadosGeraisDao fornecedorDao = new GestaoEscoarDadosGeraisDao();

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// CRUD - CREATE RETRIEVE UPDATE DELETE
		// System.out.println(" Chamou uma o método Serviço. ");
		// super.service(request, response);

		GestaoEscolarDadosGerais fornecedor = criaFornecedor(request);

		try {

			String acao = request.getParameter("acao");
			if (acao != null) {
				if (acao.equals("CREATE")) {

					try {
						//fornecedorDao.salvar(fornecedor);
						System.out.println("Dados Enviados com sucesso..  ");
					} catch (Exception e) {
						System.out.println("Erro ao tratar com o banco  de Dados ..  " + e.getMessage());
					}

					/*
					 * try { fornecedor.valida(); } catch (ValidacaoException e) {
					 * request.setAttribute("mensagem", "Erro de Validacao dos Campos: " +
					 * e.getMessage()); request.setAttribute("fornecedor", fornecedor); }
					 */

					if (fornecedor.getCodigoEscola() == null) {
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

	private GestaoEscolarDadosGerais criaFornecedor(HttpServletRequest request) {

		/*
		 * String codigoEscola = request.getParameter("256");// codigoEscola Integer
		 * codigoEscol = Integer.parseInt(codigoEscola);
		 */

		Integer codigoEscola = null;
		
		String nucleo = request.getParameter("nucleo");
		System.out.println(nucleo);
		Integer nuc = Integer.parseInt(nucleo);

		String codInepEscola = request.getParameter("codInepEscola");
		 Integer.parseInt(codInepEscola);
		Integer codInep = Integer.parseInt(codInepEscola);
		
		System.out.println("Código Inepe :  "+codInep);

		String nomeEscola = request.getParameter("nomeEscola");
		System.out.println("Nome da Escola : "+nomeEscola);

		String cnpjEntidade = request.getParameter("cnpjEntidade");
		//Integer cnpj = Integer.parseInt(cnpjEntidade);
		
		System.out.println("CNPJ Recebido "+cnpjEntidade);
		
		String dataCriacaoRegistroTabela = request.getParameter("dataCriacaoRegistroTabela");
		String dataLocal[] = dataCriacaoRegistroTabela.split("-");
		LocalDate dataCricaoRegisto = LocalDate.of(Integer.parseInt(dataLocal[0]), Integer.parseInt(dataLocal[1]),
				Integer.parseInt(dataLocal[2]));
		System.out.println(dataCricaoRegisto);
		/*
		 * //LocalDate dataCricaoRegisto= new Locale(dataCriacaoRegistroTabela) ;
		 * DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/uuuu");
		 * LocalDate dataCricaoRegisto = LocalDate.parse(dataCriacaoRegistroTabela,
		 * formato);
		 */

		String situcaoInstitucional = request.getParameter("situcaoInstitucional");
		String tipoPoloAnexo = request.getParameter("tipoPoloAnexo");

		String inddorDpciaAdmtvEscola = request.getParameter("indcdorDpciaAdmtvaEscola");
		Integer inddorDpciaAdmtvEscol = Integer.parseInt(inddorDpciaAdmtvEscola);
		System.out.println("Vindo do formulário:  " + inddorDpciaAdmtvEscol);

		String usuarioCriacaoRgistroTabela = request.getParameter("usuarioCriacaoRgistroTabela");
		Integer usuarioCriacaoRgistroTabel = Integer.parseInt(usuarioCriacaoRgistroTabela);

		String indcdorReglantcaAutrzcaoEscola = request.getParameter("indcdorReglantcaAutrzcaoEscola");
		Integer indRegulAutorizEscola = Integer.parseInt(indcdorReglantcaAutrzcaoEscola);

		String zonaLoclizcaoEscola = request.getParameter("zonaLoclizcaoEscola");
		Integer zonaLocalizcao = Integer.parseInt(zonaLoclizcaoEscola);

		String indicadorEscolaPolo = request.getParameter("indicadorEscolaPolo");
		String indicadorEscolaAnexo = request.getParameter("indicadorEscolaAnexo");

		String datAtulizcaoRegistroTabela = request.getParameter("dataCriacaoRegistroTabela");

		String dataLocalAtz[] = datAtulizcaoRegistroTabela.split("-");
		LocalDate datAtulizcaoRegistroTabel = LocalDate.of(Integer.parseInt(dataLocalAtz[0]),
				Integer.parseInt(dataLocalAtz[1]), Integer.parseInt(dataLocalAtz[2]));
		System.out.println(datAtulizcaoRegistroTabel);

		String usuarioAtulizcaoRegistroTabela = request.getParameter("usuarioCriacaoRgistroTabela");
		Integer usuarioAtulizcaoRegistroTabel = Integer.parseInt(usuarioAtulizcaoRegistroTabela);

		String codStatusEscola = request.getParameter("codStatusEscola");
		Integer codStatuEscla = Integer.parseInt(codStatusEscola);

		String cepEscola = request.getParameter("cepEscola");
		Integer cepEscla = Integer.parseInt(cepEscola);

		String enderecoEscola = request.getParameter("enderecoEscola");
		String complentEndercoEscola = request.getParameter("complentEndercoEscola");
		String municipio = request.getParameter("municipio");

		String distrito = request.getParameter("distrito");
		String numeroEscola = request.getParameter("numeroEscola");
		String bairroEscola = request.getParameter("bairroEscola");
		String uf = request.getParameter("uf");
		String latitudeEndEscola = request.getParameter("latitudeEndEscola");
		String longtudeEndEscola = request.getParameter("longtudeEndEscola");
		String telefoneEscola = request.getParameter("telefoneEscola");
		String telefoneCelelar = request.getParameter("telefoneCelelar");
		String faxContato = request.getParameter("faxContato");
		String numeroContato = request.getParameter("numeroContato");
		String emailInstcnalEscola = request.getParameter("emailInstcnalEscola");
		String codEscolaPolo = request.getParameter("codEscolaPolo");
		Integer coDEscolaPolo =Integer.parseInt(codEscolaPolo);

		GestaoEscolarDadosGerais fornecedor = new GestaoEscolarDadosGerais(codigoEscola, coDEscolaPolo,Integer.parseInt(codInepEscola),nuc,nomeEscola,cnpjEntidade,dataCricaoRegisto,
				situcaoInstitucional,tipoPoloAnexo,inddorDpciaAdmtvEscol,usuarioCriacaoRgistroTabel,indRegulAutorizEscola,
				zonaLocalizcao,indicadorEscolaPolo,indicadorEscolaAnexo,datAtulizcaoRegistroTabel,usuarioAtulizcaoRegistroTabel,
				codStatuEscla,cepEscla,enderecoEscola,complentEndercoEscola,municipio,distrito,numeroEscola,bairroEscola,
				uf,latitudeEndEscola,longtudeEndEscola,telefoneEscola,telefoneCelelar,faxContato,numeroContato,emailInstcnalEscola);

		/*
		 * if (codigoEscola != null && !codigoEscola.equals("")) {
		 * //fornecedor.setCodigoEscola(Integer.parseInt(codigoEscola));
		 * 
		 * }
		 */

		return fornecedor;
	}

}
