package br.com.gestaoEscolar.domainEscola;

import java.time.LocalDate;

public class GestaoEscolarHecursosHumanosEscola {

	private Integer codigoCaracterizacaoRecursosHumanosAlimentacaoEscolarEsco;
	private Integer codigoEscolaRecursosHumanos; 
	private Integer profissionaisEscolaQtdAuxiliaresSecretariaAuxiliare;
	private Integer profissionaisEscolaQtdServicoGeraisPorteirosZelador;
	private Integer profissionaisEscolaQtdBibliotecarioAuxiliarBiblioteca;
	private Integer profissionaisEscolaQtdBombeiroBrigadistaProfissiona;
	private Integer profissionaisEscolaQtdCoordenadorTurnoDisciplinar;

	private Integer profissionaisEscolaQtdFonoaudiologo;
	private Integer profissionaisEscolaQtdNutricionista;
	private Integer profissionaisEscolaQtdPsicologoEscolar;

	private Integer profissionaisEscolaQtdProfissionalPreparacaoSeguranca;
	
	
	private Integer profissionaisEscolaQtdProfissionalApoioSupervisaoP;
	private Integer profissionaisEscolaQtdSecretarioEscolar;
	private Integer profissionaisEscolaQtdSegurancaGuardaPatr;//

	private Integer profissionaisEscolaQtdTecnicoMonitoresSupervisores;
	private Integer profissionaisEscolaQtdViceDiretorAdjuntoPr;
	private Integer profissionaisEscolaQtdOrientadorComunitarioAssisten;

	private String indicadorAlimentacaoEscolaPnaeFnde;
	private	LocalDate dataCriacaoRegistroTabela;
	private Integer usuarioCriacaoRegistroTabela; //
	
	
	
	

	public GestaoEscolarHecursosHumanosEscola() {
		super();
		// TODO Auto-generated constructor stub
	}


	public GestaoEscolarHecursosHumanosEscola(Integer codigoCaracterizacaoRecursosHumanosAlimentacaoEscolarEsco,
			Integer codigoEscolaRecursosHumanos, 
			Integer profissionaisEscolaQtdAuxiliaresSecretariaAuxiliare,
			Integer profissionaisEscolaQtdServicoGeraisPorteirosZelador,
			Integer profissionaisEscolaQtdBibliotecarioAuxiliarBiblioteca,
			Integer profissionaisEscolaQtdBombeiroBrigadistaProfissiona,
			Integer profissionaisEscolaQtdCoordenadorTurnoDisciplinar,
			Integer profissionaisEscolaQtdFonoaudiologo,
			Integer profissionaisEscolaQtdNutricionista,
			Integer profissionaisEscolaQtdPsicologoEscolar,
			Integer profissionaisEscolaQtdProfissionalPreparacaoSeguranca,
			Integer profissionaisEscolaQtdProfissionalApoioSupervisaoP, 
			Integer profissionaisEscolaQtdSecretarioEscolar,
			Integer profissionaisEscolaQtdSegurancaGuardaPatr,
			Integer profissionaisEscolaQtdTecnicoMonitoresSupervisores,
			Integer profissionaisEscolaQtdViceDiretorAdjuntoPr,
			Integer profissionaisEscolaQtdOrientadorComunitarioAssisten,
			String indicadorAlimentacaoEscolaPnaeFnde,
			LocalDate dataCriacaoRegistroTabela,
			Integer usuarioCriacaoRegistroTabela) {
		super();
		this.codigoCaracterizacaoRecursosHumanosAlimentacaoEscolarEsco = codigoCaracterizacaoRecursosHumanosAlimentacaoEscolarEsco;
		this.codigoEscolaRecursosHumanos = codigoEscolaRecursosHumanos;
		this.profissionaisEscolaQtdAuxiliaresSecretariaAuxiliare = profissionaisEscolaQtdAuxiliaresSecretariaAuxiliare;
		this.profissionaisEscolaQtdServicoGeraisPorteirosZelador = profissionaisEscolaQtdServicoGeraisPorteirosZelador;
		this.profissionaisEscolaQtdBibliotecarioAuxiliarBiblioteca = profissionaisEscolaQtdBibliotecarioAuxiliarBiblioteca;
		this.profissionaisEscolaQtdBombeiroBrigadistaProfissiona = profissionaisEscolaQtdBombeiroBrigadistaProfissiona;
		this.profissionaisEscolaQtdCoordenadorTurnoDisciplinar = profissionaisEscolaQtdCoordenadorTurnoDisciplinar;
		this.profissionaisEscolaQtdFonoaudiologo = profissionaisEscolaQtdFonoaudiologo;
		this.profissionaisEscolaQtdNutricionista = profissionaisEscolaQtdNutricionista;
		this.profissionaisEscolaQtdPsicologoEscolar = profissionaisEscolaQtdPsicologoEscolar;
		this.profissionaisEscolaQtdProfissionalPreparacaoSeguranca = profissionaisEscolaQtdProfissionalPreparacaoSeguranca;
		this.profissionaisEscolaQtdProfissionalApoioSupervisaoP = profissionaisEscolaQtdProfissionalApoioSupervisaoP;
		this.profissionaisEscolaQtdSecretarioEscolar = profissionaisEscolaQtdSecretarioEscolar;
		this.profissionaisEscolaQtdSegurancaGuardaPatr = profissionaisEscolaQtdSegurancaGuardaPatr;
		this.profissionaisEscolaQtdTecnicoMonitoresSupervisores = profissionaisEscolaQtdTecnicoMonitoresSupervisores;
		this.profissionaisEscolaQtdViceDiretorAdjuntoPr = profissionaisEscolaQtdViceDiretorAdjuntoPr;
		this.profissionaisEscolaQtdOrientadorComunitarioAssisten = profissionaisEscolaQtdOrientadorComunitarioAssisten;
		this.indicadorAlimentacaoEscolaPnaeFnde = indicadorAlimentacaoEscolaPnaeFnde;
		this.dataCriacaoRegistroTabela = dataCriacaoRegistroTabela;
		this.usuarioCriacaoRegistroTabela = usuarioCriacaoRegistroTabela;
	}


	public Integer getCodigoCaracterizacaoRecursosHumanosAlimentacaoEscolarEsco() {
		return codigoCaracterizacaoRecursosHumanosAlimentacaoEscolarEsco;
	}


	public void setCodigoCaracterizacaoRecursosHumanosAlimentacaoEscolarEsco(
			Integer codigoCaracterizacaoRecursosHumanosAlimentacaoEscolarEsco) {
		this.codigoCaracterizacaoRecursosHumanosAlimentacaoEscolarEsco = codigoCaracterizacaoRecursosHumanosAlimentacaoEscolarEsco;
	}


	public Integer getCodigoEscolaRecursosHumanos() {
		return codigoEscolaRecursosHumanos;
	}


	public void setCodigoEscolaRecursosHumanos(Integer codigoEscolaRecursosHumanos) {
		this.codigoEscolaRecursosHumanos = codigoEscolaRecursosHumanos;
	}


	public Integer getProfissionaisEscolaQtdAuxiliaresSecretariaAuxiliare() {
		return profissionaisEscolaQtdAuxiliaresSecretariaAuxiliare;
	}


	public void setProfissionaisEscolaQtdAuxiliaresSecretariaAuxiliare(
			Integer profissionaisEscolaQtdAuxiliaresSecretariaAuxiliare) {
		this.profissionaisEscolaQtdAuxiliaresSecretariaAuxiliare = profissionaisEscolaQtdAuxiliaresSecretariaAuxiliare;
	}


	public Integer getProfissionaisEscolaQtdServicoGeraisPorteirosZelador() {
		return profissionaisEscolaQtdServicoGeraisPorteirosZelador;
	}


	public void setProfissionaisEscolaQtdServicoGeraisPorteirosZelador(
			Integer profissionaisEscolaQtdServicoGeraisPorteirosZelador) {
		this.profissionaisEscolaQtdServicoGeraisPorteirosZelador = profissionaisEscolaQtdServicoGeraisPorteirosZelador;
	}


	public Integer getProfissionaisEscolaQtdBibliotecarioAuxiliarBiblioteca() {
		return profissionaisEscolaQtdBibliotecarioAuxiliarBiblioteca;
	}


	public void setProfissionaisEscolaQtdBibliotecarioAuxiliarBiblioteca(
			Integer profissionaisEscolaQtdBibliotecarioAuxiliarBiblioteca) {
		this.profissionaisEscolaQtdBibliotecarioAuxiliarBiblioteca = profissionaisEscolaQtdBibliotecarioAuxiliarBiblioteca;
	}


	public Integer getProfissionaisEscolaQtdBombeiroBrigadistaProfissiona() {
		return profissionaisEscolaQtdBombeiroBrigadistaProfissiona;
	}


	public void setProfissionaisEscolaQtdBombeiroBrigadistaProfissiona(
			Integer profissionaisEscolaQtdBombeiroBrigadistaProfissiona) {
		this.profissionaisEscolaQtdBombeiroBrigadistaProfissiona = profissionaisEscolaQtdBombeiroBrigadistaProfissiona;
	}


	public Integer getProfissionaisEscolaQtdCoordenadorTurnoDisciplinar() {
		return profissionaisEscolaQtdCoordenadorTurnoDisciplinar;
	}


	public void setProfissionaisEscolaQtdCoordenadorTurnoDisciplinar(
			Integer profissionaisEscolaQtdCoordenadorTurnoDisciplinar) {
		this.profissionaisEscolaQtdCoordenadorTurnoDisciplinar = profissionaisEscolaQtdCoordenadorTurnoDisciplinar;
	}


	public Integer getProfissionaisEscolaQtdFonoaudiologo() {
		return profissionaisEscolaQtdFonoaudiologo;
	}


	public void setProfissionaisEscolaQtdFonoaudiologo(Integer profissionaisEscolaQtdFonoaudiologo) {
		this.profissionaisEscolaQtdFonoaudiologo = profissionaisEscolaQtdFonoaudiologo;
	}


	public Integer getProfissionaisEscolaQtdNutricionista() {
		return profissionaisEscolaQtdNutricionista;
	}


	public void setProfissionaisEscolaQtdNutricionista(Integer profissionaisEscolaQtdNutricionista) {
		this.profissionaisEscolaQtdNutricionista = profissionaisEscolaQtdNutricionista;
	}


	public Integer getProfissionaisEscolaQtdPsicologoEscolar() {
		return profissionaisEscolaQtdPsicologoEscolar;
	}


	public void setProfissionaisEscolaQtdPsicologoEscolar(Integer profissionaisEscolaQtdPsicologoEscolar) {
		this.profissionaisEscolaQtdPsicologoEscolar = profissionaisEscolaQtdPsicologoEscolar;
	}


	public Integer getProfissionaisEscolaQtdProfissionalPreparacaoSeguranca() {
		return profissionaisEscolaQtdProfissionalPreparacaoSeguranca;
	}


	public void setProfissionaisEscolaQtdProfissionalPreparacaoSeguranca(
			Integer profissionaisEscolaQtdProfissionalPreparacaoSeguranca) {
		this.profissionaisEscolaQtdProfissionalPreparacaoSeguranca = profissionaisEscolaQtdProfissionalPreparacaoSeguranca;
	}


	public Integer getProfissionaisEscolaQtdProfissionalApoioSupervisaoP() {
		return profissionaisEscolaQtdProfissionalApoioSupervisaoP;
	}


	public void setProfissionaisEscolaQtdProfissionalApoioSupervisaoP(
			Integer profissionaisEscolaQtdProfissionalApoioSupervisaoP) {
		this.profissionaisEscolaQtdProfissionalApoioSupervisaoP = profissionaisEscolaQtdProfissionalApoioSupervisaoP;
	}


	public Integer getProfissionaisEscolaQtdSecretarioEscolar() {
		return profissionaisEscolaQtdSecretarioEscolar;
	}


	public void setProfissionaisEscolaQtdSecretarioEscolar(Integer profissionaisEscolaQtdSecretarioEscolar) {
		this.profissionaisEscolaQtdSecretarioEscolar = profissionaisEscolaQtdSecretarioEscolar;
	}


	public Integer getProfissionaisEscolaQtdSegurancaGuardaPatr() {
		return profissionaisEscolaQtdSegurancaGuardaPatr;
	}


	public void setProfissionaisEscolaQtdSegurancaGuardaPatr(Integer profissionaisEscolaQtdSegurancaGuardaPatr) {
		this.profissionaisEscolaQtdSegurancaGuardaPatr = profissionaisEscolaQtdSegurancaGuardaPatr;
	}


	public Integer getProfissionaisEscolaQtdTecnicoMonitoresSupervisores() {
		return profissionaisEscolaQtdTecnicoMonitoresSupervisores;
	}


	public void setProfissionaisEscolaQtdTecnicoMonitoresSupervisores(
			Integer profissionaisEscolaQtdTecnicoMonitoresSupervisores) {
		this.profissionaisEscolaQtdTecnicoMonitoresSupervisores = profissionaisEscolaQtdTecnicoMonitoresSupervisores;
	}


	public Integer getProfissionaisEscolaQtdViceDiretorAdjuntoPr() {
		return profissionaisEscolaQtdViceDiretorAdjuntoPr;
	}


	public void setProfissionaisEscolaQtdViceDiretorAdjuntoPr(Integer profissionaisEscolaQtdViceDiretorAdjuntoPr) {
		this.profissionaisEscolaQtdViceDiretorAdjuntoPr = profissionaisEscolaQtdViceDiretorAdjuntoPr;
	}


	public Integer getProfissionaisEscolaQtdOrientadorComunitarioAssisten() {
		return profissionaisEscolaQtdOrientadorComunitarioAssisten;
	}


	public void setProfissionaisEscolaQtdOrientadorComunitarioAssisten(
			Integer profissionaisEscolaQtdOrientadorComunitarioAssisten) {
		this.profissionaisEscolaQtdOrientadorComunitarioAssisten = profissionaisEscolaQtdOrientadorComunitarioAssisten;
	}


	public String getIndicadorAlimentacaoEscolaPnaeFnde() {
		return indicadorAlimentacaoEscolaPnaeFnde;
	}


	public void setIndicadorAlimentacaoEscolaPnaeFnde(String indicadorAlimentacaoEscolaPnaeFnde) {
		this.indicadorAlimentacaoEscolaPnaeFnde = indicadorAlimentacaoEscolaPnaeFnde;
	}


	public LocalDate getDataCriacaoRegistroTabela() {
		return dataCriacaoRegistroTabela;
	}


	public void setDataCriacaoRegistroTabela(LocalDate dataCriacaoRegistroTabela) {
		this.dataCriacaoRegistroTabela = dataCriacaoRegistroTabela;
	}


	public Integer getUsuarioCriacaoRegistroTabela() {
		return usuarioCriacaoRegistroTabela;
	}


	public void setUsuarioCriacaoRegistroTabela(Integer usuarioCriacaoRegistroTabela) {
		this.usuarioCriacaoRegistroTabela = usuarioCriacaoRegistroTabela;
	}

	
	
	
}
