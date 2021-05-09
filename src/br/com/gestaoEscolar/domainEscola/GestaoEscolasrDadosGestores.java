package br.com.gestaoEscolar.domainEscola;

import java.time.LocalDate;

public class GestaoEscolasrDadosGestores {

	private Integer codDiretorGeral;
	private String nomeDiretorGeral;
	private String cpfDiretorGeral;
	private String criterioAcessoDgeral;
	private String emailDiretorGeral;
	private String situacaoFuncDiretorGeral;
	private LocalDate dataCadastral;
	
	
	public GestaoEscolasrDadosGestores() {
		super();
	}


	public GestaoEscolasrDadosGestores(Integer codDiretorGeral, String nomeDiretorGeral, String cpfDiretorGeral,
			String criterioAcessoDgeral, String emailDiretorGeral, String situacaoFuncDiretorGeral,
			LocalDate datCadastralDirt) {
		super();
		this.codDiretorGeral = codDiretorGeral;
		this.nomeDiretorGeral = nomeDiretorGeral;
		this.cpfDiretorGeral = cpfDiretorGeral;
		this.criterioAcessoDgeral = criterioAcessoDgeral;
		this.emailDiretorGeral = emailDiretorGeral;
		this.situacaoFuncDiretorGeral = situacaoFuncDiretorGeral;
		this.dataCadastral = datCadastralDirt;
	}


	public Integer getCodDiretorGeral() {
		return codDiretorGeral;
	}


	public void setCodDiretorGeral(Integer codDiretorGeral) {
		this.codDiretorGeral = codDiretorGeral;
	}


	public String getNomeDiretorGeral() {
		return nomeDiretorGeral;
	}


	public void setNomeDiretorGeral(String nomeDiretorGeral) {
		this.nomeDiretorGeral = nomeDiretorGeral;
	}


	public String getCpfDiretorGeral() {
		return cpfDiretorGeral;
	}


	public void setCpfDiretorGeral(String cpfDiretorGeral) {
		this.cpfDiretorGeral = cpfDiretorGeral;
	}


	public String getCriterioAcessoDgeral() {
		return criterioAcessoDgeral;
	}


	public void setCriterioAcessoDgeral(String criterioAcessoDgeral) {
		this.criterioAcessoDgeral = criterioAcessoDgeral;
	}


	public String getEmailDiretorGeral() {
		return emailDiretorGeral;
	}


	public void setEmailDiretorGeral(String emailDiretorGeral) {
		this.emailDiretorGeral = emailDiretorGeral;
	}


	public String getSituacaoFuncDiretorGeral() {
		return situacaoFuncDiretorGeral;
	}


	public void setSituacaoFuncDiretorGeral(String situacaoFuncDiretorGeral) {
		this.situacaoFuncDiretorGeral = situacaoFuncDiretorGeral;
	}


	public LocalDate getDataCadastral() {
		return dataCadastral;
	}


	public void setDataCadastral(LocalDate dataCadastral) {
		this.dataCadastral = dataCadastral;
	}

	
}
