package br.com.gestaoEscolar.domainEscola;

import java.time.LocalDate;

public class GestaoEscolarDiretordeNucleo {

	private Integer codigoDiretorDeNucleo;
	private String nomeDiretorDeNucleo;
	private String cpfcodigoDiretorDeNucleo;
	private String emailcodigoDiretorDeNucleo;
	private String criterioAcessocodigoDiretorDeNucleo;
	private String situacaoFuncionalcodigoDiretorDeNucleo;
	private String cargaHorariacodigoDiretorDeNucleo;
	private String turnoCoordcodigoDiretorDeNucleor;
	private LocalDate dataCadrstralcodigoDiretorDeNucleo;
	
	
	public GestaoEscolarDiretordeNucleo() {
		super();
	}


	public GestaoEscolarDiretordeNucleo(Integer codigoDiretorDeNucleo, String nomeDiretorDeNucleo,
			String cpfcodigoDiretorDeNucleo, String emailcodigoDiretorDeNucleo,
			String criterioAcessocodigoDiretorDeNucleo, String situacaoFuncionalcodigoDiretorDeNucleo,
			String cargaHorariacodigoDiretorDeNucleo, String turnoCoordcodigoDiretorDeNucleor,
			LocalDate dataCadrstralcodigoDiretorDeNucleo) {
		super();
		this.codigoDiretorDeNucleo = codigoDiretorDeNucleo;
		this.nomeDiretorDeNucleo = nomeDiretorDeNucleo;
		this.cpfcodigoDiretorDeNucleo = cpfcodigoDiretorDeNucleo;
		this.emailcodigoDiretorDeNucleo = emailcodigoDiretorDeNucleo;
		this.criterioAcessocodigoDiretorDeNucleo = criterioAcessocodigoDiretorDeNucleo;
		this.situacaoFuncionalcodigoDiretorDeNucleo = situacaoFuncionalcodigoDiretorDeNucleo;
		this.cargaHorariacodigoDiretorDeNucleo = cargaHorariacodigoDiretorDeNucleo;
		this.turnoCoordcodigoDiretorDeNucleor = turnoCoordcodigoDiretorDeNucleor;
		this.dataCadrstralcodigoDiretorDeNucleo = dataCadrstralcodigoDiretorDeNucleo;
	}


	public Integer getCodigoDiretorDeNucleo() {
		return codigoDiretorDeNucleo;
	}


	public void setCodigoDiretorDeNucleo(Integer codigoDiretorDeNucleo) {
		this.codigoDiretorDeNucleo = codigoDiretorDeNucleo;
	}


	public String getNomecodigoDiretorDeNucleo() {
		return nomeDiretorDeNucleo;
	}


	public void setNomecodigoDiretorDeNucleo(String nomeDiretorDeNucleo) {
		this.nomeDiretorDeNucleo = nomeDiretorDeNucleo;
	}


	public String getCpfcodigoDiretorDeNucleo() {
		return cpfcodigoDiretorDeNucleo;
	}


	public void setCpfcodigoDiretorDeNucleo(String cpfcodigoDiretorDeNucleo) {
		this.cpfcodigoDiretorDeNucleo = cpfcodigoDiretorDeNucleo;
	}


	public String getEmailcodigoDiretorDeNucleo() {
		return emailcodigoDiretorDeNucleo;
	}


	public void setEmailcodigoDiretorDeNucleo(String emailcodigoDiretorDeNucleo) {
		this.emailcodigoDiretorDeNucleo = emailcodigoDiretorDeNucleo;
	}


	public String getCriterioAcessocodigoDiretorDeNucleo() {
		return criterioAcessocodigoDiretorDeNucleo;
	}


	public void setCriterioAcessocodigoDiretorDeNucleo(String criterioAcessocodigoDiretorDeNucleo) {
		this.criterioAcessocodigoDiretorDeNucleo = criterioAcessocodigoDiretorDeNucleo;
	}


	public String getSituacaoFuncionalcodigoDiretorDeNucleo() {
		return situacaoFuncionalcodigoDiretorDeNucleo;
	}


	public void setSituacaoFuncionalcodigoDiretorDeNucleo(String situacaoFuncionalcodigoDiretorDeNucleo) {
		this.situacaoFuncionalcodigoDiretorDeNucleo = situacaoFuncionalcodigoDiretorDeNucleo;
	}


	public String getCargaHorariacodigoDiretorDeNucleo() {
		return cargaHorariacodigoDiretorDeNucleo;
	}


	public void setCargaHorariacodigoDiretorDeNucleo(String cargaHorariacodigoDiretorDeNucleo) {
		this.cargaHorariacodigoDiretorDeNucleo = cargaHorariacodigoDiretorDeNucleo;
	}


	public String getTurnoCoordcodigoDiretorDeNucleor() {
		return turnoCoordcodigoDiretorDeNucleor;
	}


	public void setTurnoCoordcodigoDiretorDeNucleor(String turnoCoordcodigoDiretorDeNucleor) {
		this.turnoCoordcodigoDiretorDeNucleor = turnoCoordcodigoDiretorDeNucleor;
	}


	public LocalDate getDataCadrstralcodigoDiretorDeNucleo() {
		return dataCadrstralcodigoDiretorDeNucleo;
	}


	public void setDataCadrstralcodigoDiretorDeNucleo(LocalDate dataCadrstralcodigoDiretorDeNucleo) {
		this.dataCadrstralcodigoDiretorDeNucleo = dataCadrstralcodigoDiretorDeNucleo;
	}


	}
