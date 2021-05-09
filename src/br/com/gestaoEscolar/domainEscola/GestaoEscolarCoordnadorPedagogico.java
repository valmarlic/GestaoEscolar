package br.com.gestaoEscolar.domainEscola;

import java.time.LocalDate;

public class GestaoEscolarCoordnadorPedagogico {

	private Integer codigoCoordPedagogico;
	private String nomeCoordPedagogico;
	private String cpfCoordPedagogico;
	private String emailCoordPedagogico;
	private String criterioAcessoCoordCFunCordPedgco;
	private String situacaoFuncionalCoordPedagogico;
	private String cargaHorariaCoordPedagogico;
	private String turnoCoordPedagogico;
	private LocalDate dataCadrstralCoordPedagogico;
	
	
	public GestaoEscolarCoordnadorPedagogico() {
		super();
	}


	public GestaoEscolarCoordnadorPedagogico(Integer codigoCoordPedagogico, String nomeCoordPedagogico,
			String cpfCoordPedagogico, String emailCoordPedagogico, String criterioAcessoCoordCFunCordPedgco,
			String situacaoFuncionalCoordPedagogico, String cargaHorariaCoordPedagogico, String turnoCoordPedagogico,
			LocalDate dataCadrstralCoordPedagogico) {
		super();
		this.codigoCoordPedagogico = codigoCoordPedagogico;
		this.nomeCoordPedagogico = nomeCoordPedagogico;
		this.cpfCoordPedagogico = cpfCoordPedagogico;
		this.emailCoordPedagogico = emailCoordPedagogico;
		this.criterioAcessoCoordCFunCordPedgco = criterioAcessoCoordCFunCordPedgco;
		this.situacaoFuncionalCoordPedagogico = situacaoFuncionalCoordPedagogico;
		this.cargaHorariaCoordPedagogico = cargaHorariaCoordPedagogico;
		this.turnoCoordPedagogico = turnoCoordPedagogico;
		this.dataCadrstralCoordPedagogico = dataCadrstralCoordPedagogico;
	}


	public Integer getCodigoCoordPedagogico() {
		return codigoCoordPedagogico;
	}


	public void setCodigoCoordPedagogico(Integer codigoCoordPedagogico) {
		this.codigoCoordPedagogico = codigoCoordPedagogico;
	}


	public String getNomeCoordPedagogico() {
		return nomeCoordPedagogico;
	}


	public void setNomeCoordPedagogico(String nomeCoordPedagogico) {
		this.nomeCoordPedagogico = nomeCoordPedagogico;
	}


	public String getCpfCoordPedagogico() {
		return cpfCoordPedagogico;
	}


	public void setCpfCoordPedagogico(String cpfCoordPedagogico) {
		this.cpfCoordPedagogico = cpfCoordPedagogico;
	}


	public String getEmailCoordPedagogico() {
		return emailCoordPedagogico;
	}


	public void setEmailCoordPedagogico(String emailCoordPedagogico) {
		this.emailCoordPedagogico = emailCoordPedagogico;
	}


	public String getCriterioAcessoCoordCFunCordPedgco() {
		return criterioAcessoCoordCFunCordPedgco;
	}


	public void setCriterioAcessoCoordCFunCordPedgco(String criterioAcessoCoordCFunCordPedgco) {
		this.criterioAcessoCoordCFunCordPedgco = criterioAcessoCoordCFunCordPedgco;
	}


	public String getSituacaoFuncionalCoordPedagogico() {
		return situacaoFuncionalCoordPedagogico;
	}


	public void setSituacaoFuncionalCoordPedagogico(String situacaoFuncionalCoordPedagogico) {
		this.situacaoFuncionalCoordPedagogico = situacaoFuncionalCoordPedagogico;
	}


	public String getCargaHorariaCoordPedagogico() {
		return cargaHorariaCoordPedagogico;
	}


	public void setCargaHorariaCoordPedagogico(String cargaHorariaCoordPedagogico) {
		this.cargaHorariaCoordPedagogico = cargaHorariaCoordPedagogico;
	}


	public String getTurnoCoordPedagogico() {
		return turnoCoordPedagogico;
	}


	public void setTurnoCoordPedagogico(String turnoCoordPedagogico) {
		this.turnoCoordPedagogico = turnoCoordPedagogico;
	}


	public LocalDate getDataCadrstralCoordPedagogico() {
		return dataCadrstralCoordPedagogico;
	}


	public void setDataCadrstralCoordPedagogico(LocalDate dataCadrstralCoordPedagogico) {
		this.dataCadrstralCoordPedagogico = dataCadrstralCoordPedagogico;
	}


	
	
}
