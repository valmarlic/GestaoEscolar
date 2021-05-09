package br.com.gestaoEscolar.domainEscola;

import java.time.LocalDate;

public class GestaoEscolarCoordenadorDeAnexo {

	private Integer codigoCoordDeAnexo;
	private String nomeCoordDeAnexo;
	private String cpfCoordDeAnexo;
	private String emailCoordDeAnexo;
	private String criterioAcessoCoordDeAnexo;
	private String situacaoFuncionalCoordDeAnexo;
	private String cargaHorariaCoordDeAnexo;
	private String turnoCoordDeAnexo;
	private LocalDate dataCadrstralCoordDeAnexo;
	
	
	public GestaoEscolarCoordenadorDeAnexo() {
		super();
	}


	public GestaoEscolarCoordenadorDeAnexo(Integer codigoCoordDeAnexo, String nomeCoordDeAnexo, String cpfCoordDeAnexo,
			String emailCoordDeAnexo, String criterioAcessoCoordDeAnexo, String situacaoFuncionalCoordDeAnexo,
			String cargaHorariaCoordDeAnexo, String turnoCoordDeAnexo, LocalDate dataCadrstralCoordDeAnexo) {
		super();
		this.codigoCoordDeAnexo = codigoCoordDeAnexo;
		this.nomeCoordDeAnexo = nomeCoordDeAnexo;
		this.cpfCoordDeAnexo = cpfCoordDeAnexo;
		this.emailCoordDeAnexo = emailCoordDeAnexo;
		this.criterioAcessoCoordDeAnexo = criterioAcessoCoordDeAnexo;
		this.situacaoFuncionalCoordDeAnexo = situacaoFuncionalCoordDeAnexo;
		this.cargaHorariaCoordDeAnexo = cargaHorariaCoordDeAnexo;
		this.turnoCoordDeAnexo = turnoCoordDeAnexo;
		this.dataCadrstralCoordDeAnexo = dataCadrstralCoordDeAnexo;
	}


	public Integer getCodigoCoordDeAnexo() {
		return codigoCoordDeAnexo;
	}


	public void setCodigoCoordDeAnexo(Integer codigoCoordDeAnexo) {
		this.codigoCoordDeAnexo = codigoCoordDeAnexo;
	}


	public String getNomeCoordDeAnexo() {
		return nomeCoordDeAnexo;
	}


	public void setNomeCoordDeAnexo(String nomeCoordDeAnexo) {
		this.nomeCoordDeAnexo = nomeCoordDeAnexo;
	}


	public String getCpfCoordDeAnexo() {
		return cpfCoordDeAnexo;
	}


	public void setCpfCoordDeAnexo(String cpfCoordDeAnexo) {
		this.cpfCoordDeAnexo = cpfCoordDeAnexo;
	}


	public String getEmailCoordDeAnexo() {
		return emailCoordDeAnexo;
	}


	public void setEmailCoordDeAnexo(String emailCoordDeAnexo) {
		this.emailCoordDeAnexo = emailCoordDeAnexo;
	}


	public String getCriterioAcessoCoordDeAnexo() {
		return criterioAcessoCoordDeAnexo;
	}


	public void setCriterioAcessoCoordDeAnexo(String criterioAcessoCoordDeAnexo) {
		this.criterioAcessoCoordDeAnexo = criterioAcessoCoordDeAnexo;
	}


	public String getSituacaoFuncionalCoordDeAnexo() {
		return situacaoFuncionalCoordDeAnexo;
	}


	public void setSituacaoFuncionalCoordDeAnexo(String situacaoFuncionalCoordDeAnexo) {
		this.situacaoFuncionalCoordDeAnexo = situacaoFuncionalCoordDeAnexo;
	}


	public String getCargaHorariaCoordDeAnexo() {
		return cargaHorariaCoordDeAnexo;
	}


	public void setCargaHorariaCoordDeAnexo(String cargaHorariaCoordDeAnexo) {
		this.cargaHorariaCoordDeAnexo = cargaHorariaCoordDeAnexo;
	}


	public String getTurnoCoordDeAnexo() {
		return turnoCoordDeAnexo;
	}


	public void setTurnoCoordDeAnexo(String turnoCoordDeAnexo) {
		this.turnoCoordDeAnexo = turnoCoordDeAnexo;
	}


	public LocalDate getDataCadrstralCoordDeAnexo() {
		return dataCadrstralCoordDeAnexo;
	}


	public void setDataCadrstralCoordDeAnexo(LocalDate dataCadrstralCoordDeAnexo) {
		this.dataCadrstralCoordDeAnexo = dataCadrstralCoordDeAnexo;
	}

		
	
	
	
}
