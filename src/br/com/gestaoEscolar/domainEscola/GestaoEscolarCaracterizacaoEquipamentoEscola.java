package br.com.gestaoEscolar.domainEscola;

import java.time.LocalDate;

public class GestaoEscolarCaracterizacaoEquipamentoEscola {

	private Integer codigoCaracterizacaoEquipamentoEscola;
	private Integer codigoCarctzEquipfraEscola; // codigo da escola
	private Integer qtdAntenaParabolicaEquipamentoEscola;

	private Integer qtdComputadoresAdmEquipamentoEscola;
	private Integer qtdCopiadorasEquipamentoEscola;
	private Integer qtdInpressorasEquipamentoEscola;

	private Integer qtdInpressorasMultfuncionaisEquipamentoEscola;
	private Integer qtdEscannersEquipamentoEscola;
	private Integer qtdDvdBluRayEquipamentoEscola;

	private Integer qtdAparelhoDeSomEquipamentoEscola;
	private Integer qtdAparelhoTVEquipamentoEscola;
	private Integer qtdLousaDigitalEquipamentoEscola; // 

	private Integer qtdProjetorMultmidiaEquipamentoEscola;
	private Integer qtdComputadorDesktopEquipamentoEscola;
	private Integer qtdComputadoresPortateisEquipamentoEscola;

	private Integer qtdComputadoresTabletsEquipamentoEscola;
	private String indicadorAcessoInternetUsoAluno; // 
	private String indicadorAcessoInternetUsoAdministrativo;
	private String indicadorAcessoInternetUsoProcessoEnsinoAprendizagem;
	
	private String indicadorAcessoInternetUsoComunidade;
	private String indicadorNaoPossuiacessoInternet;
	private String indicadorEquipamentoAlunoAcessoInternetComputadoresMesaP;//São utilizados também dispositivos pessoais na intituição (computadores portáteis, celulares, tablets, etc.)
	
	private String indicadorEquipamentoAlunoAcessoInternetDispositivosPessoa; //Computadores de mesa, portáteis e tablets próprio da escola (no laboratório de informática, biblioteca, sala de

	private String indicadorInternetBandaLarga;
	private String indicadorRedeLocalInterligacaoComputadoresCabo;
	
	private LocalDate dataCriacaoRegistroTabela;
	private Integer usuarioUriacaoRegistroTabela;
	
	
	public GestaoEscolarCaracterizacaoEquipamentoEscola() {
		super();
		// TODO Auto-generated constructor stub
	}


	public GestaoEscolarCaracterizacaoEquipamentoEscola(Integer codigoCaracterizacaoEquipamentoEscola,
			Integer codigoCarctzEquipfraEscola, Integer qtdAntenaParabolicaEquipamentoEscola,
			Integer qtdComputadoresAdmEquipamentoEscola, Integer qtdCopiadorasEquipamentoEscola,
			Integer qtdInpressorasEquipamentoEscola, Integer qtdInpressorasMultfuncionaisEquipamentoEscola,
			Integer qtdEscannersEquipamentoEscola, Integer qtdDvdBluRayEquipamentoEscola,
			Integer qtdAparelhoDeSomEquipamentoEscola, Integer qtdAparelhoTVEquipamentoEscola,
			Integer qtdLousaDigitalEquipamentoEscola, Integer qtdProjetorMultmidiaEquipamentoEscola,
			Integer qtdComputadorDesktopEquipamentoEscola, Integer qtdComputadoresPortateisEquipamentoEscola,
			Integer qtdComputadoresTabletsEquipamentoEscola, String indicadorAcessoInternetUsoAluno,
			String indicadorAcessoInternetUsoAdministrativo,
			String indicadorAcessoInternetUsoProcessoEnsinoAprendizagem, String indicadorAcessoInternetUsoComunidade,
			String indicadorNaoPossuiacessoInternet, String indicadorEquipamentoAlunoAcessoInternetComputadoresMesaP,
			String indicadorEquipamentoAlunoAcessoInternetDispositivosPessoa, String indicadorInternetBandaLarga,
			String indicadorRedeLocalInterligacaoComputadoresCabo, LocalDate dataCriacaoRegistroTabela,
			Integer usuarioUriacaoRegistroTabela) {
		super();
		this.codigoCaracterizacaoEquipamentoEscola = codigoCaracterizacaoEquipamentoEscola;
		this.codigoCarctzEquipfraEscola = codigoCarctzEquipfraEscola;
		this.qtdAntenaParabolicaEquipamentoEscola = qtdAntenaParabolicaEquipamentoEscola;
		this.qtdComputadoresAdmEquipamentoEscola = qtdComputadoresAdmEquipamentoEscola;
		this.qtdCopiadorasEquipamentoEscola = qtdCopiadorasEquipamentoEscola;
		this.qtdInpressorasEquipamentoEscola = qtdInpressorasEquipamentoEscola;
		this.qtdInpressorasMultfuncionaisEquipamentoEscola = qtdInpressorasMultfuncionaisEquipamentoEscola;
		this.qtdEscannersEquipamentoEscola = qtdEscannersEquipamentoEscola;
		this.qtdDvdBluRayEquipamentoEscola = qtdDvdBluRayEquipamentoEscola;
		this.qtdAparelhoDeSomEquipamentoEscola = qtdAparelhoDeSomEquipamentoEscola;
		this.qtdAparelhoTVEquipamentoEscola = qtdAparelhoTVEquipamentoEscola;
		this.qtdLousaDigitalEquipamentoEscola = qtdLousaDigitalEquipamentoEscola;
		this.qtdProjetorMultmidiaEquipamentoEscola = qtdProjetorMultmidiaEquipamentoEscola;
		this.qtdComputadorDesktopEquipamentoEscola = qtdComputadorDesktopEquipamentoEscola;
		this.qtdComputadoresPortateisEquipamentoEscola = qtdComputadoresPortateisEquipamentoEscola;
		this.qtdComputadoresTabletsEquipamentoEscola = qtdComputadoresTabletsEquipamentoEscola;
		this.indicadorAcessoInternetUsoAluno = indicadorAcessoInternetUsoAluno;
		this.indicadorAcessoInternetUsoAdministrativo = indicadorAcessoInternetUsoAdministrativo;
		this.indicadorAcessoInternetUsoProcessoEnsinoAprendizagem = indicadorAcessoInternetUsoProcessoEnsinoAprendizagem;
		this.indicadorAcessoInternetUsoComunidade = indicadorAcessoInternetUsoComunidade;
		this.indicadorNaoPossuiacessoInternet = indicadorNaoPossuiacessoInternet;
		this.indicadorEquipamentoAlunoAcessoInternetComputadoresMesaP = indicadorEquipamentoAlunoAcessoInternetComputadoresMesaP;
		this.indicadorEquipamentoAlunoAcessoInternetDispositivosPessoa = indicadorEquipamentoAlunoAcessoInternetDispositivosPessoa;
		this.indicadorInternetBandaLarga = indicadorInternetBandaLarga;
		this.indicadorRedeLocalInterligacaoComputadoresCabo = indicadorRedeLocalInterligacaoComputadoresCabo;
		this.dataCriacaoRegistroTabela = dataCriacaoRegistroTabela;
		this.usuarioUriacaoRegistroTabela = usuarioUriacaoRegistroTabela;
	}


	public Integer getCodigoCaracterizacaoEquipamentoEscola() {
		return codigoCaracterizacaoEquipamentoEscola;
	}


	public void setCodigoCaracterizacaoEquipamentoEscola(Integer codigoCaracterizacaoEquipamentoEscola) {
		this.codigoCaracterizacaoEquipamentoEscola = codigoCaracterizacaoEquipamentoEscola;
	}


	public Integer getCodigoCarctzEquipfraEscola() {
		return codigoCarctzEquipfraEscola;
	}


	public void setCodigoCarctzEquipfraEscola(Integer codigoCarctzEquipfraEscola) {
		this.codigoCarctzEquipfraEscola = codigoCarctzEquipfraEscola;
	}


	public Integer getQtdAntenaParabolicaEquipamentoEscola() {
		return qtdAntenaParabolicaEquipamentoEscola;
	}


	public void setQtdAntenaParabolicaEquipamentoEscola(Integer qtdAntenaParabolicaEquipamentoEscola) {
		this.qtdAntenaParabolicaEquipamentoEscola = qtdAntenaParabolicaEquipamentoEscola;
	}


	public Integer getQtdComputadoresAdmEquipamentoEscola() {
		return qtdComputadoresAdmEquipamentoEscola;
	}


	public void setQtdComputadoresAdmEquipamentoEscola(Integer qtdComputadoresAdmEquipamentoEscola) {
		this.qtdComputadoresAdmEquipamentoEscola = qtdComputadoresAdmEquipamentoEscola;
	}


	public Integer getQtdCopiadorasEquipamentoEscola() {
		return qtdCopiadorasEquipamentoEscola;
	}


	public void setQtdCopiadorasEquipamentoEscola(Integer qtdCopiadorasEquipamentoEscola) {
		this.qtdCopiadorasEquipamentoEscola = qtdCopiadorasEquipamentoEscola;
	}


	public Integer getQtdInpressorasEquipamentoEscola() {
		return qtdInpressorasEquipamentoEscola;
	}


	public void setQtdInpressorasEquipamentoEscola(Integer qtdInpressorasEquipamentoEscola) {
		this.qtdInpressorasEquipamentoEscola = qtdInpressorasEquipamentoEscola;
	}


	public Integer getQtdInpressorasMultfuncionaisEquipamentoEscola() {
		return qtdInpressorasMultfuncionaisEquipamentoEscola;
	}


	public void setQtdInpressorasMultfuncionaisEquipamentoEscola(Integer qtdInpressorasMultfuncionaisEquipamentoEscola) {
		this.qtdInpressorasMultfuncionaisEquipamentoEscola = qtdInpressorasMultfuncionaisEquipamentoEscola;
	}


	public Integer getQtdEscannersEquipamentoEscola() {
		return qtdEscannersEquipamentoEscola;
	}


	public void setQtdEscannersEquipamentoEscola(Integer qtdEscannersEquipamentoEscola) {
		this.qtdEscannersEquipamentoEscola = qtdEscannersEquipamentoEscola;
	}


	public Integer getQtdDvdBluRayEquipamentoEscola() {
		return qtdDvdBluRayEquipamentoEscola;
	}


	public void setQtdDvdBluRayEquipamentoEscola(Integer qtdDvdBluRayEquipamentoEscola) {
		this.qtdDvdBluRayEquipamentoEscola = qtdDvdBluRayEquipamentoEscola;
	}


	public Integer getQtdAparelhoDeSomEquipamentoEscola() {
		return qtdAparelhoDeSomEquipamentoEscola;
	}


	public void setQtdAparelhoDeSomEquipamentoEscola(Integer qtdAparelhoDeSomEquipamentoEscola) {
		this.qtdAparelhoDeSomEquipamentoEscola = qtdAparelhoDeSomEquipamentoEscola;
	}


	public Integer getQtdAparelhoTVEquipamentoEscola() {
		return qtdAparelhoTVEquipamentoEscola;
	}


	public void setQtdAparelhoTVEquipamentoEscola(Integer qtdAparelhoTVEquipamentoEscola) {
		this.qtdAparelhoTVEquipamentoEscola = qtdAparelhoTVEquipamentoEscola;
	}


	public Integer getQtdLousaDigitalEquipamentoEscola() {
		return qtdLousaDigitalEquipamentoEscola;
	}


	public void setQtdLousaDigitalEquipamentoEscola(Integer qtdLousaDigitalEquipamentoEscola) {
		this.qtdLousaDigitalEquipamentoEscola = qtdLousaDigitalEquipamentoEscola;
	}


	public Integer getQtdProjetorMultmidiaEquipamentoEscola() {
		return qtdProjetorMultmidiaEquipamentoEscola;
	}


	public void setQtdProjetorMultmidiaEquipamentoEscola(Integer qtdProjetorMultmidiaEquipamentoEscola) {
		this.qtdProjetorMultmidiaEquipamentoEscola = qtdProjetorMultmidiaEquipamentoEscola;
	}


	public Integer getQtdComputadorDesktopEquipamentoEscola() {
		return qtdComputadorDesktopEquipamentoEscola;
	}


	public void setQtdComputadorDesktopEquipamentoEscola(Integer qtdComputadorDesktopEquipamentoEscola) {
		this.qtdComputadorDesktopEquipamentoEscola = qtdComputadorDesktopEquipamentoEscola;
	}


	public Integer getQtdComputadoresPortateisEquipamentoEscola() {
		return qtdComputadoresPortateisEquipamentoEscola;
	}


	public void setQtdComputadoresPortateisEquipamentoEscola(Integer qtdComputadoresPortateisEquipamentoEscola) {
		this.qtdComputadoresPortateisEquipamentoEscola = qtdComputadoresPortateisEquipamentoEscola;
	}


	public Integer getQtdComputadoresTabletsEquipamentoEscola() {
		return qtdComputadoresTabletsEquipamentoEscola;
	}


	public void setQtdComputadoresTabletsEquipamentoEscola(Integer qtdComputadoresTabletsEquipamentoEscola) {
		this.qtdComputadoresTabletsEquipamentoEscola = qtdComputadoresTabletsEquipamentoEscola;
	}


	public String getIndicadorAcessoInternetUsoAluno() {
		return indicadorAcessoInternetUsoAluno;
	}


	public void setIndicadorAcessoInternetUsoAluno(String indicadorAcessoInternetUsoAluno) {
		this.indicadorAcessoInternetUsoAluno = indicadorAcessoInternetUsoAluno;
	}


	public String getIndicadorAcessoInternetUsoAdministrativo() {
		return indicadorAcessoInternetUsoAdministrativo;
	}


	public void setIndicadorAcessoInternetUsoAdministrativo(String indicadorAcessoInternetUsoAdministrativo) {
		this.indicadorAcessoInternetUsoAdministrativo = indicadorAcessoInternetUsoAdministrativo;
	}


	public String getIndicadorAcessoInternetUsoProcessoEnsinoAprendizagem() {
		return indicadorAcessoInternetUsoProcessoEnsinoAprendizagem;
	}


	public void setIndicadorAcessoInternetUsoProcessoEnsinoAprendizagem(
			String indicadorAcessoInternetUsoProcessoEnsinoAprendizagem) {
		this.indicadorAcessoInternetUsoProcessoEnsinoAprendizagem = indicadorAcessoInternetUsoProcessoEnsinoAprendizagem;
	}


	public String getIndicadorAcessoInternetUsoComunidade() {
		return indicadorAcessoInternetUsoComunidade;
	}


	public void setIndicadorAcessoInternetUsoComunidade(String indicadorAcessoInternetUsoComunidade) {
		this.indicadorAcessoInternetUsoComunidade = indicadorAcessoInternetUsoComunidade;
	}


	public String getIndicadorNaoPossuiacessoInternet() {
		return indicadorNaoPossuiacessoInternet;
	}


	public void setIndicadorNaoPossuiacessoInternet(String indicadorNaoPossuiacessoInternet) {
		this.indicadorNaoPossuiacessoInternet = indicadorNaoPossuiacessoInternet;
	}


	public String getIndicadorEquipamentoAlunoAcessoInternetComputadoresMesaP() {
		return indicadorEquipamentoAlunoAcessoInternetComputadoresMesaP;
	}


	public void setIndicadorEquipamentoAlunoAcessoInternetComputadoresMesaP(
			String indicadorEquipamentoAlunoAcessoInternetComputadoresMesaP) {
		this.indicadorEquipamentoAlunoAcessoInternetComputadoresMesaP = indicadorEquipamentoAlunoAcessoInternetComputadoresMesaP;
	}


	public String getIndicadorEquipamentoAlunoAcessoInternetDispositivosPessoa() {
		return indicadorEquipamentoAlunoAcessoInternetDispositivosPessoa;
	}


	public void setIndicadorEquipamentoAlunoAcessoInternetDispositivosPessoa(
			String indicadorEquipamentoAlunoAcessoInternetDispositivosPessoa) {
		this.indicadorEquipamentoAlunoAcessoInternetDispositivosPessoa = indicadorEquipamentoAlunoAcessoInternetDispositivosPessoa;
	}


	public String getIndicadorInternetBandaLarga() {
		return indicadorInternetBandaLarga;
	}

	public String getIndicadorInternetBandaLarga(String entrada) {
		switch(entrada) {
		  case "-Sim-":
			  indicadorInternetBandaLarga = "S";
		    break;  
		  case "-Não-":
			  indicadorInternetBandaLarga = "N";
		    break;  
		}
		
		return indicadorInternetBandaLarga;
	}

	
	
	public void setIndicadorInternetBandaLarga(String indicadorInternetBandaLarga) {
		this.indicadorInternetBandaLarga = indicadorInternetBandaLarga;
	}


	public String getIndicadorRedeLocalInterligacaoComputadoresCabo() {
		return indicadorRedeLocalInterligacaoComputadoresCabo;
	}



	public void setIndicadorRedeLocalInterligacaoComputadoresCabo(String indicadorRedeLocalInterligacaoComputadoresCabo) {
		this.indicadorRedeLocalInterligacaoComputadoresCabo = indicadorRedeLocalInterligacaoComputadoresCabo;
	}


	public LocalDate getDataCriacaoRegistroTabela() {
		return dataCriacaoRegistroTabela;
	}


	public void setDataCriacaoRegistroTabela(LocalDate dataCriacaoRegistroTabela) {
		this.dataCriacaoRegistroTabela = dataCriacaoRegistroTabela;
	}


	public Integer getUsuarioUriacaoRegistroTabela() {
		return usuarioUriacaoRegistroTabela;
	}


	public void setUsuarioUriacaoRegistroTabela(Integer usuarioUriacaoRegistroTabela) {
		this.usuarioUriacaoRegistroTabela = usuarioUriacaoRegistroTabela;
	}

	
	
	}
