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

import br.com.gestaoEscolar.domainEscola.GestaoEscolarDadosEducaconaisEscola;
import br.com.gestaoEscolar.domainEscola.GestaoEscolarHecursosHumanosEscola;
import br.com.gestaoEscolar.model.daoEscola.GestaoEscoarDadosEducacionaisDao;
import br.com.gestaoEscolar.model.daoEscola.GestaoEscoarRecursosHumanosDao;


/**
 * Servlet implementation class visitanteServlet
 */
@WebServlet(urlPatterns = "/GestaoEscolaRecursosHumanosServlet")
public class GestaoEscolaRecursosHumanosServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private GestaoEscoarRecursosHumanosDao fornecedorDao = new GestaoEscoarRecursosHumanosDao();
	//private GestaoEscolarDadosEducaconaisEscola geDadosEducacionais = new GestaoEscolarDadosEducaconaisEscola();
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// CRUD - CREATE RETRIEVE UPDATE DELETE
		// System.out.println(" Chamou uma o método Serviço. ");
		// super.service(request, response);

		GestaoEscolarHecursosHumanosEscola fornecedor = criaFornecedor(request);

		try {

			String acao = request.getParameter("acao10");
			if (acao != null) {
				if (acao.equals("CREATE10")) {

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

					if (fornecedor.getCodigoCaracterizacaoRecursosHumanosAlimentacaoEscolarEsco() == null) {
						// fornecedorDao.salvar(fornecedor);
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

	private GestaoEscolarHecursosHumanosEscola criaFornecedor(HttpServletRequest request) {

		/*
		 * String codigoEscola = request.getParameter("256");// codigoEscola Integer
		 * codigoEscol = Integer.parseInt(codigoEscola);
		 */

		Integer codigoCaracterizacaoRecursosHumanosAlimentacaoEscolarEsco = null;

		String codigoEscolaRecursosHumanos = request.getParameter("codigoEscolaRecursosHumanos");
		
		Integer codigoEscolaRecursosHumano = Integer.parseInt(codigoEscolaRecursosHumanos);
		System.out.println(" Usuário Recusos Humanos : "+codigoEscolaRecursosHumano);
		

		String profissionaisEscolaQtdAuxiliaresSecretariaAuxiliare = request.getParameter("profissionaisEscolaQtdAuxiliaresSecretariaAuxiliare");
		
		Integer profissionaisEscolaQtdAuxiliaresSecretariaAuxiliar = Integer.parseInt(profissionaisEscolaQtdAuxiliaresSecretariaAuxiliare);
		System.out.println("Quantidade de Auxilires :  " + profissionaisEscolaQtdAuxiliaresSecretariaAuxiliar);

		
		String profissionaisEscolaQtdServicoGeraisPorteirosZelador = request
				.getParameter("profissionaisEscolaQtdServicoGeraisPorteirosZelador");
		Integer profissionaisEscolaQtdServicoGeraisPorteirosZelado = Integer.parseInt(profissionaisEscolaQtdServicoGeraisPorteirosZelador);
		System.out.println("Quantidade de Zelador : " + profissionaisEscolaQtdServicoGeraisPorteirosZelador);

		
		String profissionaisEscolaQtdBibliotecarioAuxiliarBiblioteca = request
				.getParameter("profissionaisEscolaQtdBibliotecarioAuxiliarBiblioteca");
		Integer profissionaisEscolaQtdBibliotecarioAuxiliarBibliotec = Integer.parseInt(profissionaisEscolaQtdBibliotecarioAuxiliarBiblioteca);


		String profissionaisEscolaQtdBombeiroBrigadistaProfissiona = request
				.getParameter("profissionaisEscolaQtdBombeiroBrigadistaProfissiona");
		Integer profissionaisEscolaQtdBombeiroBrigadistaProfission = Integer.parseInt(profissionaisEscolaQtdBombeiroBrigadistaProfissiona);
		
		
		String profissionaisEscolaQtdCoordenadorTurnoDisciplinar = request
				.getParameter("profissionaisEscolaQtdCoordenadorTurnoDisciplinar");
		Integer profissionaisEscolaQtdCoordenadorTurnoDisciplina = Integer.parseInt(profissionaisEscolaQtdCoordenadorTurnoDisciplinar);
		
		
		String profissionaisEscolaQtdFonoaudiologo = request
				.getParameter("profissionaisEscolaQtdFonoaudiologo");
		Integer profissionaisEscolaQtdFonoaudiolog = Integer.parseInt(profissionaisEscolaQtdFonoaudiologo);
		
		String profissionaisEscolaQtdNutricionista = request
				.getParameter("profissionaisEscolaQtdNutricionista");
				
		Integer profissionaisEscolaQtdNutricionist = Integer.parseInt(profissionaisEscolaQtdNutricionista);

		
		String profissionaisEscolaQtdPsicologoEscolar = request.getParameter("profissionaisEscolaQtdPsicologoEscolar");
		Integer profissionaisEscolaQtdPsicologoEscola = Integer.parseInt(profissionaisEscolaQtdPsicologoEscolar);

		
		
		String profissionaisEscolaQtdProfissionalPreparacaoSeguranca = request
				.getParameter("profissionaisEscolaQtdProfissionalPreparacaoSeguranca");
		Integer profissionaisEscolaQtdProfissionalPreparacaoSeguranc = Integer.parseInt(profissionaisEscolaQtdProfissionalPreparacaoSeguranca);

		
		
		String profissionaisEscolaQtdProfissionalApoioSupervisaoP = request
				.getParameter("profissionaisEscolaQtdProfissionalApoioSupervisaoP");
	
		Integer profissionaisEscolaQtdProfissionalApoioSupervisaop = Integer.parseInt(profissionaisEscolaQtdProfissionalApoioSupervisaoP);
		
		String profissionaisEscolaQtdSecretarioEscolar = request
				.getParameter("profissionaisEscolaQtdSecretarioEscolar");	
		Integer profissionaisEscolaQtdSecretarioEscola = Integer.parseInt(profissionaisEscolaQtdSecretarioEscolar);
		
		String profissionaisEscolaQtdSegurancaGuardaPatr = request
				.getParameter("profissionaisEscolaQtdSegurancaGuardaPatr");
		Integer profissionaisEscolaQtdSegurancaGuardaPat = Integer.parseInt(profissionaisEscolaQtdSegurancaGuardaPatr);

		
		String profissionaisEscolaQtdTecnicoMonitoresSupervisores = request.getParameter("profissionaisEscolaQtdTecnicoMonitoresSupervisores");
		Integer profissionaisEscolaQtdTecnicoMonitoresSupervisore = Integer.parseInt(profissionaisEscolaQtdTecnicoMonitoresSupervisores);
System.out.println("Quantidade de Técnico Monitores nsupervisores : "+profissionaisEscolaQtdTecnicoMonitoresSupervisore);
		
		String profissionaisEscolaQtdViceDiretorAdjuntoPr = request
				.getParameter("profissionaisEscolaQtdViceDiretorAdjuntoPr");
		Integer profissionaisEscolaQtdViceDiretorAdjuntoP = Integer.parseInt(profissionaisEscolaQtdViceDiretorAdjuntoPr);

		
		String profissionaisEscolaQtdOrientadorComunitarioAssisten = request
				.getParameter("profissionaisEscolaQtdOrientadorComunitarioAssisten");
		Integer profissionaisEscolaQtdOrientadorComunitarioAssiste = Integer.parseInt(profissionaisEscolaQtdOrientadorComunitarioAssisten);

		
		String indicadorAlimentacaoEscolaPnaeFnde = request.getParameter("indicadorAlimentacaoEscolaPnaeFnde");


		
		 String dataCriacaoRegistroTabela =
				  request.getParameter("dataCriacaoRegistroTabela");
				 
				  String dataRegistroTabelaDadosEducacionai[] =
						  dataCriacaoRegistroTabela.split("-");
				  LocalDate dataRegistroTabelaDadosEducacional = LocalDate.of(
				  Integer.parseInt(dataRegistroTabelaDadosEducacionai[0]),
				  Integer.parseInt(dataRegistroTabelaDadosEducacionai[1]),
				  Integer.parseInt(dataRegistroTabelaDadosEducacionai[2]));
				  System.out.println("Data de Cadastro : " +
				  dataRegistroTabelaDadosEducacional);
	
		
		String usuarioCriacaoRegistroTabela = request
				.getParameter("usuarioCriacaoRegistroTabela");
		Integer usuarioCriacaoRegistroTabel = Integer.parseInt(usuarioCriacaoRegistroTabela);

				
		GestaoEscolarHecursosHumanosEscola fornecedor = new GestaoEscolarHecursosHumanosEscola(null,
				codigoEscolaRecursosHumano, profissionaisEscolaQtdAuxiliaresSecretariaAuxiliar, profissionaisEscolaQtdServicoGeraisPorteirosZelado,
				profissionaisEscolaQtdBibliotecarioAuxiliarBibliotec, profissionaisEscolaQtdBombeiroBrigadistaProfission,
				profissionaisEscolaQtdCoordenadorTurnoDisciplina, profissionaisEscolaQtdFonoaudiolog,
				profissionaisEscolaQtdNutricionist, profissionaisEscolaQtdPsicologoEscola,
				profissionaisEscolaQtdProfissionalPreparacaoSeguranc, profissionaisEscolaQtdProfissionalApoioSupervisaop,
				profissionaisEscolaQtdSecretarioEscola, profissionaisEscolaQtdSegurancaGuardaPat,
				profissionaisEscolaQtdTecnicoMonitoresSupervisore, profissionaisEscolaQtdViceDiretorAdjuntoP,
				profissionaisEscolaQtdOrientadorComunitarioAssiste, indicadorAlimentacaoEscolaPnaeFnde,
				dataRegistroTabelaDadosEducacional, usuarioCriacaoRegistroTabel);

		return fornecedor;
	}

}
