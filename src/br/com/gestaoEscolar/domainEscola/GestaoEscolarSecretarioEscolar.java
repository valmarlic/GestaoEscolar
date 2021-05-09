package br.com.gestaoEscolar.domainEscola;

import java.time.LocalDate;

public class GestaoEscolarSecretarioEscolar {

	private Integer codigoSecretarioEscolar;
	private String nomeSecretarioEscolaro;
	private String cpfSecretarioEscolar;
	private String emailSecretarioEscolar;
	private String criterioAcessoSecretarioEscolar;
	private String situacaoFuncionalSecretarioEscolar;
	private String cargaHorariaSecretarioEscolar;
	private String turnoCoordSecretarioEscolar;
	private LocalDate dataCadrstralSecretarioEscolar;
	
	
	public GestaoEscolarSecretarioEscolar() {
		super();
	}


	public GestaoEscolarSecretarioEscolar(Integer codigoSecretarioEscolar, String nomeSecretarioEscolaro,
			String cpfSecretarioEscolar, String emailSecretarioEscolar, String criterioAcessoSecretarioEscolar,
			String situacaoFuncionalSecretarioEscolar, String cargaHorariaSecretarioEscolar,
			String turnoCoordSecretarioEscolar, LocalDate dataCadrstralSecretarioEscolar) {
		super();
		this.codigoSecretarioEscolar = codigoSecretarioEscolar;
		this.nomeSecretarioEscolaro = nomeSecretarioEscolaro;
		this.cpfSecretarioEscolar = cpfSecretarioEscolar;
		this.emailSecretarioEscolar = emailSecretarioEscolar;
		this.criterioAcessoSecretarioEscolar = criterioAcessoSecretarioEscolar;
		this.situacaoFuncionalSecretarioEscolar = situacaoFuncionalSecretarioEscolar;
		this.cargaHorariaSecretarioEscolar = cargaHorariaSecretarioEscolar;
		this.turnoCoordSecretarioEscolar = turnoCoordSecretarioEscolar;
		this.dataCadrstralSecretarioEscolar = dataCadrstralSecretarioEscolar;
	}


	public Integer getCodigoSecretarioEscolar() {
		return codigoSecretarioEscolar;
	}


	public void setCodigoSecretarioEscolar(Integer codigoSecretarioEscolar) {
		this.codigoSecretarioEscolar = codigoSecretarioEscolar;
	}


	public String getNomeSecretarioEscolaro() {
		return nomeSecretarioEscolaro;
	}


	public void setNomeSecretarioEscolaro(String nomeSecretarioEscolaro) {
		this.nomeSecretarioEscolaro = nomeSecretarioEscolaro;
	}


	public String getCpfSecretarioEscolar() {
		return cpfSecretarioEscolar;
	}


	public void setCpfSecretarioEscolar(String cpfSecretarioEscolar) {
		this.cpfSecretarioEscolar = cpfSecretarioEscolar;
	}


	public String getEmailSecretarioEscolar() {
		return emailSecretarioEscolar;
	}


	public void setEmailSecretarioEscolar(String emailSecretarioEscolar) {
		this.emailSecretarioEscolar = emailSecretarioEscolar;
	}


	public String getCriterioAcessoSecretarioEscolar() {
		return criterioAcessoSecretarioEscolar;
	}


	public void setCriterioAcessoSecretarioEscolar(String criterioAcessoSecretarioEscolar) {
		this.criterioAcessoSecretarioEscolar = criterioAcessoSecretarioEscolar;
	}


	public String getSituacaoFuncionalSecretarioEscolar() {
		return situacaoFuncionalSecretarioEscolar;
	}


	public void setSituacaoFuncionalSecretarioEscolar(String situacaoFuncionalSecretarioEscolar) {
		this.situacaoFuncionalSecretarioEscolar = situacaoFuncionalSecretarioEscolar;
	}


	public String getCargaHorariaSecretarioEscolar() {
		return cargaHorariaSecretarioEscolar;
	}


	public void setCargaHorariaSecretarioEscolar(String cargaHorariaSecretarioEscolar) {
		this.cargaHorariaSecretarioEscolar = cargaHorariaSecretarioEscolar;
	}


	public String getTurnoCoordSecretarioEscolar() {
		return turnoCoordSecretarioEscolar;
	}


	public void setTurnoCoordSecretarioEscolar(String turnoCoordSecretarioEscolar) {
		this.turnoCoordSecretarioEscolar = turnoCoordSecretarioEscolar;
	}


	public LocalDate getDataCadrstralSecretarioEscolar() {
		return dataCadrstralSecretarioEscolar;
	}


	public void setDataCadrstralSecretarioEscolar(LocalDate dataCadrstralSecretarioEscolar) {
		this.dataCadrstralSecretarioEscolar = dataCadrstralSecretarioEscolar;
	}


	
	
}
