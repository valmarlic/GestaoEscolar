package br.com.gestaoEscolar.domainEscola;

import java.time.LocalDate;

public class GestaoEscolasrDiretorAdjunto {

	private Integer codDiretorAdjunto;
	private String nomeDiretorAdjunto;
	private String cpfDiretorAdjunto;
	private String criterioAcessoDretAdjunto;
	private String emailDiretorAdjunto;
	private String situacaoFuncDiretorAdjunto;
	private LocalDate dataCadrstralDirAdjunto;
	
	
	public GestaoEscolasrDiretorAdjunto() {
		super();
	}


	public GestaoEscolasrDiretorAdjunto(Integer codDiretorAdjunto, String nomeDiretorAdjunto, String cpfDiretorAdjunto,
			String criterioAcessoDretAdjunto, String emailDiretorAdjunto, String situacaoFuncDiretorAdjunto,
			LocalDate dataCadrstralDirAdjunto) {
		super();
		this.codDiretorAdjunto = codDiretorAdjunto;
		this.nomeDiretorAdjunto = nomeDiretorAdjunto;
		this.cpfDiretorAdjunto = cpfDiretorAdjunto;
		this.criterioAcessoDretAdjunto = criterioAcessoDretAdjunto;
		this.emailDiretorAdjunto = emailDiretorAdjunto;
		this.situacaoFuncDiretorAdjunto = situacaoFuncDiretorAdjunto;
		this.dataCadrstralDirAdjunto = dataCadrstralDirAdjunto;
	}


	public Integer getCodDiretorAdjunto() {
		return codDiretorAdjunto;
	}


	public void setCodDiretorAdjunto(Integer codDiretorAdjunto) {
		this.codDiretorAdjunto = codDiretorAdjunto;
	}


	public String getNomeDiretorAdjunto() {
		return nomeDiretorAdjunto;
	}


	public void setNomeDiretorAdjunto(String nomeDiretorAdjunto) {
		this.nomeDiretorAdjunto = nomeDiretorAdjunto;
	}


	public String getCpfDiretorAdjunto() {
		return cpfDiretorAdjunto;
	}


	public void setCpfDiretorAdjunto(String cpfDiretorAdjunto) {
		this.cpfDiretorAdjunto = cpfDiretorAdjunto;
	}


	public String getCriterioAcessoDretAdjunto() {
		return criterioAcessoDretAdjunto;
	}


	public void setCriterioAcessoDretAdjunto(String criterioAcessoDretAdjunto) {
		this.criterioAcessoDretAdjunto = criterioAcessoDretAdjunto;
	}


	public String getEmailDiretorAdjunto() {
		return emailDiretorAdjunto;
	}


	public void setEmailDiretorAdjunto(String emailDiretorAdjunto) {
		this.emailDiretorAdjunto = emailDiretorAdjunto;
	}


	public String getSituacaoFuncDiretorAdjunto() {
		return situacaoFuncDiretorAdjunto;
	}


	public void setSituacaoFuncDiretorAdjunto(String situacaoFuncDiretorAdjunto) {
		this.situacaoFuncDiretorAdjunto = situacaoFuncDiretorAdjunto;
	}


	public LocalDate getDataCadrstralDirAdjunto() {
		return dataCadrstralDirAdjunto;
	}


	public void setDataCadrstralDirAdjunto(LocalDate dataCadrstralDirAdjunto) {
		this.dataCadrstralDirAdjunto = dataCadrstralDirAdjunto;
	}

	
	


	
}
