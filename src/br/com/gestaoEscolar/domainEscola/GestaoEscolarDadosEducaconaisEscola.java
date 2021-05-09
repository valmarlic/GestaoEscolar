package br.com.gestaoEscolar.domainEscola;

import java.time.LocalDate;

public class GestaoEscolarDadosEducaconaisEscola {

	private Integer codigoCaracterizacaoEquipamentoEscola;
	private Integer codigoEscolaDadosEducacionais; // codigo da escola
	private LocalDate dataRegistroTabelaDadosEducacionais;
	private Integer usuarioUriacaoRegistroTabela;
	private String indicadorOrganizacaoEnsinoEscolaSerieAno;
	private String indicadorOrganizacaoEnsinoEscolaPeriodoSemestrais;
	private String indicadorOrganizacaoCiclosEnsinoFundamental;

	private String indicadorOrganizacaoEnsinoEscolaGruposNaoSeriados;
	private String indicadorOrganizacaoEnsinoEscolaModulos;/*
															 * Indicador da forma de organização do ensino na escola:
															 * módulos
															 */
	private String indicadorOrganizacaoEnsinoEscolaAlternanciaRegular;

	private String indicadorInstrumentosAcervoMultimidia;
	private String indicadorInstrumentosInstrumentosMusicais;
	private String indicadorInstrumentosMateriaisPedagogicosEducacacao;
	private String indicadorMateriaisPedagogicoEducacaoIndigina;//

	private String indicadorInstrumentosBrinquedosEducacaoInfantil;
	private String indicadorInstrumentosJogosEducativos;
	private String indicadorInstrumentosPedagogicosEtnicoSociais;

	private String indicadorInstrumentosMateriaisCientificos;

	private String indicadorInstrumentosCulturaisArtistic;
	private String indicadorInstrumentosPedagogicoEducacaoCampo; //
	private String indicadorInstrumentosAmplificacaoDifusaoSomAudio;

	private String indicadorInstrumentosPraticaDesportiva;
	private String indicadorInstrumentosEducacaoIndigena;

	private String indicadorLinguaEducacaoLinguaPortuguesa;
	private String indicadorLinguaEducacaoIndigena;// Código 1, Código 2 ......

	private Integer linguaIndigena01;
	private Integer linguaIndigena02;
	private Integer linguaIndigena03;

	private String indicadorExameSelecaoIngressoEscola;
	private String indicadorReservaVagaCotaPretoPardoIndigena;

	private String indicadorReservaVagaCotaPessoaComDeficiencia;
	private String indicadorReservaVagaCotaCondicaoRenda;

	private String indicadorReservaVagaCotaOutrasGrpQueNaoListados;

	private String indicadorReservaVagaCotaOriundoEscolaPublica;
	private String indicadorCotaSemReservaVaga;

	private String indicadorSiteBlogRedeSociaisEscola;
	private String indicadorCompartilhaEspacoComunidade;
	private String indicadorUsoEspacoEntornoEscola;

	private String indicadorOrgaoColegiadosFuncionamentoEscolaAssociacaoPais;
	private String indicadorOrgaoColegiadosFuncionamentoEscolaAssocPaisMest;
	private String indicadorOrgaoColegiadosFuncionamentoConselhoEscola;

	private String indicadorOrgaoColegiadosFuncionamentoGremioEstudant;
	private String indicadorOrgaoColegiadosFuncionamentoOutros;
	private String indicadorNaoHaorgaoColegiadosFuncionamento;

	private String indicadorProjetoPedagogicoAtualizado;/*
														 * O projeto político pedagógico ou a proposta pedagógica da
														 * escola (conforme art. 12 da LDB) foi atualizada nos últimos
														 * 12 meses até a data de referência?
														 */

	public GestaoEscolarDadosEducaconaisEscola() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GestaoEscolarDadosEducaconaisEscola(Integer codigoCaracterizacaoEquipamentoEscola,
			Integer codigoEscolaDadosEducacionais, LocalDate dataRegistroTabelaDadosEducacionais,
			Integer usuarioUriacaoRegistroTabela, String indicadorOrganizacaoEnsinoEscolaSerieAno,
			String indicadorOrganizacaoEnsinoEscolaPeriodoSemestrais,
			String indicadorOrganizacaoCiclosEnsinoFundamental,
			String indicadorOrganizacaoEnsinoEscolaGruposNaoSeriados, String indicadorOrganizacaoEnsinoEscolaModulos,
			String indicadorOrganizacaoEnsinoEscolaAlternanciaRegular, String indicadorInstrumentosAcervoMultimidia,
			String indicadorInstrumentosInstrumentosMusicais,
			String indicadorInstrumentosMateriaisPedagogicosEducacacao,
			String indicadorMateriaisPedagogicoEducacaoIndigina, String indicadorInstrumentosBrinquedosEducacaoInfantil,
			String indicadorInstrumentosJogosEducativos, String indicadorInstrumentosPedagogicosEtnicoSociais,
			String indicadorInstrumentosMateriaisCientificos, String indicadorInstrumentosCulturaisArtistic,
			String indicadorInstrumentosPedagogicoEducacaoCampo,
			String indicadorInstrumentosAmplificacaoDifusaoSomAudio, String indicadorInstrumentosPraticaDesportiva,
			String indicadorInstrumentosEducacaoIndigena, String indicadorLinguaEducacaoLinguaPortuguesa,
			String indicadorLinguaEducacaoIndigena, Integer linguaIndigena01, Integer linguaIndigena02,
			Integer linguaIndigena03, String indicadorExameSelecaoIngressoEscola,
			String indicadorReservaVagaCotaPretoPardoIndigena, String indicadorReservaVagaCotaPessoaComDeficiencia,
			String indicadorReservaVagaCotaCondicaoRenda, String indicadorReservaVagaCotaOutrasGrpQueNaoListados,
			String indicadorReservaVagaCotaOriundoEscolaPublica, String indicadorCotaSemReservaVaga,
			String indicadorSiteBlogRedeSociaisEscola, String indicadorCompartilhaEspacoComunidade,
			String indicadorUsoEspacoEntornoEscola, String indicadorOrgaoColegiadosFuncionamentoEscolaAssociacaoPais,
			String indicadorOrgaoColegiadosFuncionamentoEscolaAssocPaisMest,
			String indicadorOrgaoColegiadosFuncionamentoConselhoEscola,
			String indicadorOrgaoColegiadosFuncionamentoGremioEstudant,
			String indicadorOrgaoColegiadosFuncionamentoOutros, String indicadorNaoHaorgaoColegiadosFuncionamento,
			String indicadorProjetoPedagogicoAtualizado) {
		super();
		this.codigoCaracterizacaoEquipamentoEscola = codigoCaracterizacaoEquipamentoEscola;
		this.codigoEscolaDadosEducacionais = codigoEscolaDadosEducacionais;
		this.dataRegistroTabelaDadosEducacionais = dataRegistroTabelaDadosEducacionais;
		this.usuarioUriacaoRegistroTabela = usuarioUriacaoRegistroTabela;
		this.indicadorOrganizacaoEnsinoEscolaSerieAno = indicadorOrganizacaoEnsinoEscolaSerieAno;
		this.indicadorOrganizacaoEnsinoEscolaPeriodoSemestrais = indicadorOrganizacaoEnsinoEscolaPeriodoSemestrais;
		this.indicadorOrganizacaoCiclosEnsinoFundamental = indicadorOrganizacaoCiclosEnsinoFundamental;
		this.indicadorOrganizacaoEnsinoEscolaGruposNaoSeriados = indicadorOrganizacaoEnsinoEscolaGruposNaoSeriados;
		this.indicadorOrganizacaoEnsinoEscolaModulos = indicadorOrganizacaoEnsinoEscolaModulos;
		this.indicadorOrganizacaoEnsinoEscolaAlternanciaRegular = indicadorOrganizacaoEnsinoEscolaAlternanciaRegular;
		this.indicadorInstrumentosAcervoMultimidia = indicadorInstrumentosAcervoMultimidia;
		this.indicadorInstrumentosInstrumentosMusicais = indicadorInstrumentosInstrumentosMusicais;
		this.indicadorInstrumentosMateriaisPedagogicosEducacacao = indicadorInstrumentosMateriaisPedagogicosEducacacao;
		this.indicadorMateriaisPedagogicoEducacaoIndigina = indicadorMateriaisPedagogicoEducacaoIndigina;
		this.indicadorInstrumentosBrinquedosEducacaoInfantil = indicadorInstrumentosBrinquedosEducacaoInfantil;
		this.indicadorInstrumentosJogosEducativos = indicadorInstrumentosJogosEducativos;
		this.indicadorInstrumentosPedagogicosEtnicoSociais = indicadorInstrumentosPedagogicosEtnicoSociais;
		this.indicadorInstrumentosMateriaisCientificos = indicadorInstrumentosMateriaisCientificos;
		this.indicadorInstrumentosCulturaisArtistic = indicadorInstrumentosCulturaisArtistic;
		this.indicadorInstrumentosPedagogicoEducacaoCampo = indicadorInstrumentosPedagogicoEducacaoCampo;
		this.indicadorInstrumentosAmplificacaoDifusaoSomAudio = indicadorInstrumentosAmplificacaoDifusaoSomAudio;
		this.indicadorInstrumentosPraticaDesportiva = indicadorInstrumentosPraticaDesportiva;
		this.indicadorInstrumentosEducacaoIndigena = indicadorInstrumentosEducacaoIndigena;
		this.indicadorLinguaEducacaoLinguaPortuguesa = indicadorLinguaEducacaoLinguaPortuguesa;
		this.indicadorLinguaEducacaoIndigena = indicadorLinguaEducacaoIndigena;
		this.linguaIndigena01 = linguaIndigena01;
		this.linguaIndigena02 = linguaIndigena02;
		this.linguaIndigena03 = linguaIndigena03;
		this.indicadorExameSelecaoIngressoEscola = indicadorExameSelecaoIngressoEscola;
		this.indicadorReservaVagaCotaPretoPardoIndigena = indicadorReservaVagaCotaPretoPardoIndigena;
		this.indicadorReservaVagaCotaPessoaComDeficiencia = indicadorReservaVagaCotaPessoaComDeficiencia;
		this.indicadorReservaVagaCotaCondicaoRenda = indicadorReservaVagaCotaCondicaoRenda;
		this.indicadorReservaVagaCotaOutrasGrpQueNaoListados = indicadorReservaVagaCotaOutrasGrpQueNaoListados;
		this.indicadorReservaVagaCotaOriundoEscolaPublica = indicadorReservaVagaCotaOriundoEscolaPublica;
		this.indicadorCotaSemReservaVaga = indicadorCotaSemReservaVaga;
		this.indicadorSiteBlogRedeSociaisEscola = indicadorSiteBlogRedeSociaisEscola;
		this.indicadorCompartilhaEspacoComunidade = indicadorCompartilhaEspacoComunidade;
		this.indicadorUsoEspacoEntornoEscola = indicadorUsoEspacoEntornoEscola;
		this.indicadorOrgaoColegiadosFuncionamentoEscolaAssociacaoPais = indicadorOrgaoColegiadosFuncionamentoEscolaAssociacaoPais;
		this.indicadorOrgaoColegiadosFuncionamentoEscolaAssocPaisMest = indicadorOrgaoColegiadosFuncionamentoEscolaAssocPaisMest;
		this.indicadorOrgaoColegiadosFuncionamentoConselhoEscola = indicadorOrgaoColegiadosFuncionamentoConselhoEscola;
		this.indicadorOrgaoColegiadosFuncionamentoGremioEstudant = indicadorOrgaoColegiadosFuncionamentoGremioEstudant;
		this.indicadorOrgaoColegiadosFuncionamentoOutros = indicadorOrgaoColegiadosFuncionamentoOutros;
		this.indicadorNaoHaorgaoColegiadosFuncionamento = indicadorNaoHaorgaoColegiadosFuncionamento;
		this.indicadorProjetoPedagogicoAtualizado = indicadorProjetoPedagogicoAtualizado;
	}

	public Integer getCodigoCaracterizacaoEquipamentoEscola() {
		return codigoCaracterizacaoEquipamentoEscola;
	}

	public void setCodigoCaracterizacaoEquipamentoEscola(Integer codigoCaracterizacaoEquipamentoEscola) {
		this.codigoCaracterizacaoEquipamentoEscola = codigoCaracterizacaoEquipamentoEscola;
	}

	public Integer getCodigoEscolaDadosEducacionais() {
		return codigoEscolaDadosEducacionais;
	}

	public void setCodigoEscolaDadosEducacionais(Integer codigoEscolaDadosEducacionais) {
		this.codigoEscolaDadosEducacionais = codigoEscolaDadosEducacionais;
	}

	public LocalDate getDataRegistroTabelaDadosEducacionais() {
		return dataRegistroTabelaDadosEducacionais;
	}

	public void setDataRegistroTabelaDadosEducacionais(LocalDate dataRegistroTabelaDadosEducacionais) {
		this.dataRegistroTabelaDadosEducacionais = dataRegistroTabelaDadosEducacionais;
	}

	public Integer getUsuarioUriacaoRegistroTabela() {
		return usuarioUriacaoRegistroTabela;
	}

	public void setUsuarioUriacaoRegistroTabela(Integer usuarioUriacaoRegistroTabela) {
		this.usuarioUriacaoRegistroTabela = usuarioUriacaoRegistroTabela;
	}

	public String getIndicadorOrganizacaoEnsinoEscolaSerieAno() {
		return indicadorOrganizacaoEnsinoEscolaSerieAno;
	}

	public void setIndicadorOrganizacaoEnsinoEscolaSerieAno(String indicadorOrganizacaoEnsinoEscolaSerieAno) {
		this.indicadorOrganizacaoEnsinoEscolaSerieAno = indicadorOrganizacaoEnsinoEscolaSerieAno;
	}

	public String getIndicadorOrganizacaoEnsinoEscolaPeriodoSemestrais() {
		return indicadorOrganizacaoEnsinoEscolaPeriodoSemestrais;
	}

	public void setIndicadorOrganizacaoEnsinoEscolaPeriodoSemestrais(
			String indicadorOrganizacaoEnsinoEscolaPeriodoSemestrais) {
		this.indicadorOrganizacaoEnsinoEscolaPeriodoSemestrais = indicadorOrganizacaoEnsinoEscolaPeriodoSemestrais;
	}

	public String getIndicadorOrganizacaoCiclosEnsinoFundamental() {
		return indicadorOrganizacaoCiclosEnsinoFundamental;
	}

	public void setIndicadorOrganizacaoCiclosEnsinoFundamental(String indicadorOrganizacaoCiclosEnsinoFundamental) {
		this.indicadorOrganizacaoCiclosEnsinoFundamental = indicadorOrganizacaoCiclosEnsinoFundamental;
	}

	public String getIndicadorOrganizacaoEnsinoEscolaGruposNaoSeriados() {
		return indicadorOrganizacaoEnsinoEscolaGruposNaoSeriados;
	}

	public void setIndicadorOrganizacaoEnsinoEscolaGruposNaoSeriados(
			String indicadorOrganizacaoEnsinoEscolaGruposNaoSeriados) {
		this.indicadorOrganizacaoEnsinoEscolaGruposNaoSeriados = indicadorOrganizacaoEnsinoEscolaGruposNaoSeriados;
	}

	public String getIndicadorOrganizacaoEnsinoEscolaModulos() {
		return indicadorOrganizacaoEnsinoEscolaModulos;
	}

	public void setIndicadorOrganizacaoEnsinoEscolaModulos(String indicadorOrganizacaoEnsinoEscolaModulos) {
		this.indicadorOrganizacaoEnsinoEscolaModulos = indicadorOrganizacaoEnsinoEscolaModulos;
	}

	public String getIndicadorOrganizacaoEnsinoEscolaAlternanciaRegular() {
		return indicadorOrganizacaoEnsinoEscolaAlternanciaRegular;
	}

	public void setIndicadorOrganizacaoEnsinoEscolaAlternanciaRegular(
			String indicadorOrganizacaoEnsinoEscolaAlternanciaRegular) {
		this.indicadorOrganizacaoEnsinoEscolaAlternanciaRegular = indicadorOrganizacaoEnsinoEscolaAlternanciaRegular;
	}

	public String getIndicadorInstrumentosAcervoMultimidia() {
		return indicadorInstrumentosAcervoMultimidia;
	}

	public void setIndicadorInstrumentosAcervoMultimidia(String indicadorInstrumentosAcervoMultimidia) {
		this.indicadorInstrumentosAcervoMultimidia = indicadorInstrumentosAcervoMultimidia;
	}

	public String getIndicadorInstrumentosInstrumentosMusicais() {
		return indicadorInstrumentosInstrumentosMusicais;
	}

	public void setIndicadorInstrumentosInstrumentosMusicais(String indicadorInstrumentosInstrumentosMusicais) {
		this.indicadorInstrumentosInstrumentosMusicais = indicadorInstrumentosInstrumentosMusicais;
	}

	public String getIndicadorInstrumentosMateriaisPedagogicosEducacacao() {
		return indicadorInstrumentosMateriaisPedagogicosEducacacao;
	}

	public void setIndicadorInstrumentosMateriaisPedagogicosEducacacao(
			String indicadorInstrumentosMateriaisPedagogicosEducacacao) {
		this.indicadorInstrumentosMateriaisPedagogicosEducacacao = indicadorInstrumentosMateriaisPedagogicosEducacacao;
	}

	public String getIndicadorMateriaisPedagogicoEducacaoIndigina() {
		return indicadorMateriaisPedagogicoEducacaoIndigina;
	}

	public void setIndicadorMateriaisPedagogicoEducacaoIndigina(String indicadorMateriaisPedagogicoEducacaoIndigina) {
		this.indicadorMateriaisPedagogicoEducacaoIndigina = indicadorMateriaisPedagogicoEducacaoIndigina;
	}

	public String getIndicadorInstrumentosBrinquedosEducacaoInfantil() {
		return indicadorInstrumentosBrinquedosEducacaoInfantil;
	}

	public void setIndicadorInstrumentosBrinquedosEducacaoInfantil(
			String indicadorInstrumentosBrinquedosEducacaoInfantil) {
		this.indicadorInstrumentosBrinquedosEducacaoInfantil = indicadorInstrumentosBrinquedosEducacaoInfantil;
	}

	public String getIndicadorInstrumentosJogosEducativos() {
		return indicadorInstrumentosJogosEducativos;
	}

	public void setIndicadorInstrumentosJogosEducativos(String indicadorInstrumentosJogosEducativos) {
		this.indicadorInstrumentosJogosEducativos = indicadorInstrumentosJogosEducativos;
	}

	public String getIndicadorInstrumentosPedagogicosEtnicoSociais() {
		return indicadorInstrumentosPedagogicosEtnicoSociais;
	}

	public void setIndicadorInstrumentosPedagogicosEtnicoSociais(String indicadorInstrumentosPedagogicosEtnicoSociais) {
		this.indicadorInstrumentosPedagogicosEtnicoSociais = indicadorInstrumentosPedagogicosEtnicoSociais;
	}

	public String getIndicadorInstrumentosMateriaisCientificos() {
		return indicadorInstrumentosMateriaisCientificos;
	}

	public void setIndicadorInstrumentosMateriaisCientificos(String indicadorInstrumentosMateriaisCientificos) {
		this.indicadorInstrumentosMateriaisCientificos = indicadorInstrumentosMateriaisCientificos;
	}

	public String getIndicadorInstrumentosCulturaisArtistic() {
		return indicadorInstrumentosCulturaisArtistic;
	}

	public void setIndicadorInstrumentosCulturaisArtistic(String indicadorInstrumentosCulturaisArtistic) {
		this.indicadorInstrumentosCulturaisArtistic = indicadorInstrumentosCulturaisArtistic;
	}

	public String getIndicadorInstrumentosPedagogicoEducacaoCampo() {
		return indicadorInstrumentosPedagogicoEducacaoCampo;
	}

	public void setIndicadorInstrumentosPedagogicoEducacaoCampo(String indicadorInstrumentosPedagogicoEducacaoCampo) {
		this.indicadorInstrumentosPedagogicoEducacaoCampo = indicadorInstrumentosPedagogicoEducacaoCampo;
	}

	public String getIndicadorInstrumentosAmplificacaoDifusaoSomAudio() {
		return indicadorInstrumentosAmplificacaoDifusaoSomAudio;
	}

	public void setIndicadorInstrumentosAmplificacaoDifusaoSomAudio(
			String indicadorInstrumentosAmplificacaoDifusaoSomAudio) {
		this.indicadorInstrumentosAmplificacaoDifusaoSomAudio = indicadorInstrumentosAmplificacaoDifusaoSomAudio;
	}

	public String getIndicadorInstrumentosPraticaDesportiva() {
		return indicadorInstrumentosPraticaDesportiva;
	}

	public void setIndicadorInstrumentosPraticaDesportiva(String indicadorInstrumentosPraticaDesportiva) {
		this.indicadorInstrumentosPraticaDesportiva = indicadorInstrumentosPraticaDesportiva;
	}

	public String getIndicadorInstrumentosEducacaoIndigena() {
		return indicadorInstrumentosEducacaoIndigena;
	}
	
	/*
	 * public String getIndicadorInstrumentosEducacaoIndigena(String entrada) {
	 * switch (entrada) { case "": { if(entrada==null)
	 * indicadorInstrumentosEducacaoIndigena="N"; if(entrada !=null) {
	 * indicadorInstrumentosEducacaoIndigena="S"; } break; } default:
	 * 
	 * }
	 * 
	 * return indicadorInstrumentosEducacaoIndigena; }
	 */
	public void setIndicadorInstrumentosEducacaoIndigena(String indicadorInstrumentosEducacaoIndigena) {
		this.indicadorInstrumentosEducacaoIndigena = indicadorInstrumentosEducacaoIndigena;
	}

	public String getIndicadorLinguaEducacaoLinguaPortuguesa() {
		return indicadorLinguaEducacaoLinguaPortuguesa;
	}

	public void setIndicadorLinguaEducacaoLinguaPortuguesa(String indicadorLinguaEducacaoLinguaPortuguesa) {
		this.indicadorLinguaEducacaoLinguaPortuguesa = indicadorLinguaEducacaoLinguaPortuguesa;
	}

	public String getIndicadorLinguaEducacaoIndigena() {
		return indicadorLinguaEducacaoIndigena;
	}

	public void setIndicadorLinguaEducacaoIndigena(String indicadorLinguaEducacaoIndigena) {
		this.indicadorLinguaEducacaoIndigena = indicadorLinguaEducacaoIndigena;
	}

	public Integer getLinguaIndigena01() {
		return linguaIndigena01;
	}

	public void setLinguaIndigena01(Integer linguaIndigena01) {
		this.linguaIndigena01 = linguaIndigena01;
	}

	public Integer getLinguaIndigena02() {
		return linguaIndigena02;
	}

	public void setLinguaIndigena02(Integer linguaIndigena02) {
		this.linguaIndigena02 = linguaIndigena02;
	}

	public Integer getLinguaIndigena03() {
		return linguaIndigena03;
	}

	public void setLinguaIndigena03(Integer linguaIndigena03) {
		this.linguaIndigena03 = linguaIndigena03;
	}

	public String getIndicadorExameSelecaoIngressoEscola() {
		return indicadorExameSelecaoIngressoEscola;
	}

	public String getIndicadorExameSelecaoIngressoEscola(String entrada) {
		switch (entrada) {
		case "-Sim-":
			indicadorExameSelecaoIngressoEscola = "S";
			break;
		case "-Não-":
			indicadorExameSelecaoIngressoEscola = "N";
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + entrada);

		}
		return indicadorExameSelecaoIngressoEscola;
	}

	public void setIndicadorExameSelecaoIngressoEscola(String indicadorExameSelecaoIngressoEscola) {
		this.indicadorExameSelecaoIngressoEscola = indicadorExameSelecaoIngressoEscola;
	}

	public String getIndicadorReservaVagaCotaPretoPardoIndigena() {
		return indicadorReservaVagaCotaPretoPardoIndigena;
	}

	public void setIndicadorReservaVagaCotaPretoPardoIndigena(String indicadorReservaVagaCotaPretoPardoIndigena) {
		this.indicadorReservaVagaCotaPretoPardoIndigena = indicadorReservaVagaCotaPretoPardoIndigena;
	}

	public String getIndicadorReservaVagaCotaPessoaComDeficiencia() {
		return indicadorReservaVagaCotaPessoaComDeficiencia;
	}

	public void setIndicadorReservaVagaCotaPessoaComDeficiencia(String indicadorReservaVagaCotaPessoaComDeficiencia) {
		this.indicadorReservaVagaCotaPessoaComDeficiencia = indicadorReservaVagaCotaPessoaComDeficiencia;
	}

	public String getIndicadorReservaVagaCotaCondicaoRenda() {
		return indicadorReservaVagaCotaCondicaoRenda;
	}

	public void setIndicadorReservaVagaCotaCondicaoRenda(String indicadorReservaVagaCotaCondicaoRenda) {
		this.indicadorReservaVagaCotaCondicaoRenda = indicadorReservaVagaCotaCondicaoRenda;
	}

	public String getIndicadorReservaVagaCotaOutrasGrpQueNaoListados() {
		return indicadorReservaVagaCotaOutrasGrpQueNaoListados;
	}

	public void setIndicadorReservaVagaCotaOutrasGrpQueNaoListados(
			String indicadorReservaVagaCotaOutrasGrpQueNaoListados) {
		this.indicadorReservaVagaCotaOutrasGrpQueNaoListados = indicadorReservaVagaCotaOutrasGrpQueNaoListados;
	}

	public String getIndicadorReservaVagaCotaOriundoEscolaPublica() {
		return indicadorReservaVagaCotaOriundoEscolaPublica;
	}

	public void setIndicadorReservaVagaCotaOriundoEscolaPublica(String indicadorReservaVagaCotaOriundoEscolaPublica) {
		this.indicadorReservaVagaCotaOriundoEscolaPublica = indicadorReservaVagaCotaOriundoEscolaPublica;
	}

	public String getIndicadorCotaSemReservaVaga() {
		return indicadorCotaSemReservaVaga;
	}

	public void setIndicadorCotaSemReservaVaga(String indicadorCotaSemReservaVaga) {
		this.indicadorCotaSemReservaVaga = indicadorCotaSemReservaVaga;
	}

	public String getIndicadorSiteBlogRedeSociaisEscola() {
		return indicadorSiteBlogRedeSociaisEscola;
	}

	public void setIndicadorSiteBlogRedeSociaisEscola(String indicadorSiteBlogRedeSociaisEscola) {
		this.indicadorSiteBlogRedeSociaisEscola = indicadorSiteBlogRedeSociaisEscola;
	}

	public String getIndicadorCompartilhaEspacoComunidade() {
		return indicadorCompartilhaEspacoComunidade;
	}

	public void setIndicadorCompartilhaEspacoComunidade(String indicadorCompartilhaEspacoComunidade) {
		this.indicadorCompartilhaEspacoComunidade = indicadorCompartilhaEspacoComunidade;
	}

	public String getIndicadorUsoEspacoEntornoEscola() {
		return indicadorUsoEspacoEntornoEscola;
	}

	public void setIndicadorUsoEspacoEntornoEscola(String indicadorUsoEspacoEntornoEscola) {
		this.indicadorUsoEspacoEntornoEscola = indicadorUsoEspacoEntornoEscola;
	}

	public String getIndicadorOrgaoColegiadosFuncionamentoEscolaAssociacaoPais() {
		return indicadorOrgaoColegiadosFuncionamentoEscolaAssociacaoPais;
	}

	public void setIndicadorOrgaoColegiadosFuncionamentoEscolaAssociacaoPais(
			String indicadorOrgaoColegiadosFuncionamentoEscolaAssociacaoPais) {
		this.indicadorOrgaoColegiadosFuncionamentoEscolaAssociacaoPais = indicadorOrgaoColegiadosFuncionamentoEscolaAssociacaoPais;
	}

	public String getIndicadorOrgaoColegiadosFuncionamentoEscolaAssocPaisMest() {
		return indicadorOrgaoColegiadosFuncionamentoEscolaAssocPaisMest;
	}

	public void setIndicadorOrgaoColegiadosFuncionamentoEscolaAssocPaisMest(
			String indicadorOrgaoColegiadosFuncionamentoEscolaAssocPaisMest) {
		this.indicadorOrgaoColegiadosFuncionamentoEscolaAssocPaisMest = indicadorOrgaoColegiadosFuncionamentoEscolaAssocPaisMest;
	}

	public String getIndicadorOrgaoColegiadosFuncionamentoConselhoEscola() {
		return indicadorOrgaoColegiadosFuncionamentoConselhoEscola;
	}

	public void setIndicadorOrgaoColegiadosFuncionamentoConselhoEscola(
			String indicadorOrgaoColegiadosFuncionamentoConselhoEscola) {
		this.indicadorOrgaoColegiadosFuncionamentoConselhoEscola = indicadorOrgaoColegiadosFuncionamentoConselhoEscola;
	}

	public String getIndicadorOrgaoColegiadosFuncionamentoGremioEstudant() {
		return indicadorOrgaoColegiadosFuncionamentoGremioEstudant;
	}

	public void setIndicadorOrgaoColegiadosFuncionamentoGremioEstudant(
			String indicadorOrgaoColegiadosFuncionamentoGremioEstudant) {
		this.indicadorOrgaoColegiadosFuncionamentoGremioEstudant = indicadorOrgaoColegiadosFuncionamentoGremioEstudant;
	}

	public String getIndicadorOrgaoColegiadosFuncionamentoOutros() {
		return indicadorOrgaoColegiadosFuncionamentoOutros;
	}

	public void setIndicadorOrgaoColegiadosFuncionamentoOutros(String indicadorOrgaoColegiadosFuncionamentoOutros) {
		this.indicadorOrgaoColegiadosFuncionamentoOutros = indicadorOrgaoColegiadosFuncionamentoOutros;
	}

	public String getIndicadorNaoHaorgaoColegiadosFuncionamento() {
		return indicadorNaoHaorgaoColegiadosFuncionamento;
	}

	public void setIndicadorNaoHaorgaoColegiadosFuncionamento(String indicadorNaoHaorgaoColegiadosFuncionamento) {
		this.indicadorNaoHaorgaoColegiadosFuncionamento = indicadorNaoHaorgaoColegiadosFuncionamento;
	}

	public String getIndicadorProjetoPedagogicoAtualizado() {
		return indicadorProjetoPedagogicoAtualizado;
	}

	public String getIndicadorProjetoPedagogicoAtualizado(String entrada) {
		switch (entrada) {
		case "-Sim-":
			indicadorProjetoPedagogicoAtualizado = "S";
			break;
		case "-Não-":
			indicadorProjetoPedagogicoAtualizado = "N";
			break;
		default:

		}
		return indicadorProjetoPedagogicoAtualizado;
	}

	public void setIndicadorProjetoPedagogicoAtualizado(String indicadorProjetoPedagogicoAtualizado) {
		this.indicadorProjetoPedagogicoAtualizado = indicadorProjetoPedagogicoAtualizado;
	}

}
