package br.com.gestaoEscolar.domainAluno;

import java.time.LocalDate;

public class GestaoEscolarAlunoIdentificacao {

	private Integer codigoEstudante;
	private Integer codigoInepEstudante;
	private String nomeEstudante;
	private String nomeSocialEstudante;
	private String sexoEstudante;
	private LocalDate dataNascimentoEstudante;
	
	private Integer codigoIbgePaisNacionalidadeEstudante;
	private Integer codigoIbgeUfNascimentoEstudante;
	private Integer codigoIbgeMunicipioNascimentoEstudante;
	
	private String nomePaiEstudante;
	private String nomeMaeEstudante;
	
	private String indicadorMaeFalecida;
	private String indicadorMaeDeclarada;
	
	private String indicadorPaiFalecido;
	private String indicadorPaiDeclarado;
	
	private String indicadorAlunoGemeo;
	private String ruaEnderecoEstudante;
	private String numeroEnderecoEstudante;
	
	private String complementoEnderecoEstudante;
	private String bairroEnderecoEstudante;
	private String municipioEnderecoEstudante;
	
	private String ufEnderecoEstudante;
	private String cepEnderecoEstudante;
	private String zonaEnderecoEstudante; //Zona U urbana ou R Rural
	
	private String indicadorLocalizacaoDiferenciadaResidenciaEstudante;//Terra Indigina área de acentamento kilombos
	private String telefoneEstudante;
	private String emailEstudante;
	
	private String indicadorBolsaFamilia;
	
	private String cpfEstudante;
	private Integer numeroNisEstudante;
	private String indicadorHistoricoEscolarApresentado;
	private String indicadorEstudanteAtividadeComplementar;
	
	
	
	public GestaoEscolarAlunoIdentificacao() {
		super();
	}



	public GestaoEscolarAlunoIdentificacao(Integer codigoInepEstudante) {
		super();
		this.codigoInepEstudante = codigoInepEstudante;
	}

	
	
	

	public GestaoEscolarAlunoIdentificacao(Integer codigoEstudante, Integer codigoInepEstudante, String nomeEstudante,
			String nomeSocialEstudante, String sexoEstudante, LocalDate dataNascimentoEstudante,
			Integer codigoIbgeUfNascimentoEstudante, Integer codigoIbgeMunicipioNascimentoEstudante,
			String indicadorAlunoGemeo, String cepEnderecoEstudante, String cpfEstudante, Integer numeroNisEstudante,
			String indicadorHistoricoEscolarApresentado, String indicadorEstudanteAtividadeComplementar) {
		super();
		this.codigoEstudante = codigoEstudante;
		this.codigoInepEstudante = codigoInepEstudante;
		this.nomeEstudante = nomeEstudante;
		this.nomeSocialEstudante = nomeSocialEstudante;
		this.sexoEstudante = sexoEstudante;
		this.dataNascimentoEstudante = dataNascimentoEstudante;
		this.codigoIbgeUfNascimentoEstudante = codigoIbgeUfNascimentoEstudante;
		this.codigoIbgeMunicipioNascimentoEstudante = codigoIbgeMunicipioNascimentoEstudante;
		this.indicadorAlunoGemeo = indicadorAlunoGemeo;
		this.cepEnderecoEstudante = cepEnderecoEstudante;
		this.cpfEstudante = cpfEstudante;
		this.numeroNisEstudante = numeroNisEstudante;
		this.indicadorHistoricoEscolarApresentado = indicadorHistoricoEscolarApresentado;
		this.indicadorEstudanteAtividadeComplementar = indicadorEstudanteAtividadeComplementar;
	}



	public GestaoEscolarAlunoIdentificacao(Integer codigoEstudante, Integer codigoInepEstudante, String nomeEstudante,
			String nomeSocialEstudante, String sexoEstudante, LocalDate dataNascimentoEstudante,
			Integer codigoIbgePaisNacionalidadeEstudante, Integer codigoIbgeUfNascimentoEstudante,
			Integer codigoIbgeMunicipioNascimentoEstudante, String nomePaiEstudante, String nomeMaeEstudante,
			String indicadorMaeFalecida, String indicadorMaeDeclarada, String indicadorPaiFalecido,
			String indicadorPaiDeclarado, String indicadorAlunoGemeo, String ruaEnderecoEstudante,
			String numeroEnderecoEstudante, String complementoEnderecoEstudante, String bairroEnderecoEstudante,
			String municipioEnderecoEstudante, String ufEnderecoEstudante, String cepEnderecoEstudante,
			String zonaEnderecoEstudante, String indicadorLocalizacaoDiferenciadaResidenciaEstudante,
			String telefoneEstudante, String emailEstudante, String indicadorBolsaFamilia, String cpfEstudante,
			Integer numeroNisEstudante, String indicadorHistoricoEscolarApresentado,
			String indicadorEstudanteAtividadeComplementar) {
		super();
		this.codigoEstudante = codigoEstudante;
		this.codigoInepEstudante = codigoInepEstudante;
		this.nomeEstudante = nomeEstudante;
		this.nomeSocialEstudante = nomeSocialEstudante;
		this.sexoEstudante = sexoEstudante;
		this.dataNascimentoEstudante = dataNascimentoEstudante;
		this.codigoIbgePaisNacionalidadeEstudante = codigoIbgePaisNacionalidadeEstudante;
		this.codigoIbgeUfNascimentoEstudante = codigoIbgeUfNascimentoEstudante;
		this.codigoIbgeMunicipioNascimentoEstudante = codigoIbgeMunicipioNascimentoEstudante;
		this.nomePaiEstudante = nomePaiEstudante;
		this.nomeMaeEstudante = nomeMaeEstudante;
		this.indicadorMaeFalecida = indicadorMaeFalecida;
		this.indicadorMaeDeclarada = indicadorMaeDeclarada;
		this.indicadorPaiFalecido = indicadorPaiFalecido;
		this.indicadorPaiDeclarado = indicadorPaiDeclarado;
		this.indicadorAlunoGemeo = indicadorAlunoGemeo;
		this.ruaEnderecoEstudante = ruaEnderecoEstudante;
		this.numeroEnderecoEstudante = numeroEnderecoEstudante;
		this.complementoEnderecoEstudante = complementoEnderecoEstudante;
		this.bairroEnderecoEstudante = bairroEnderecoEstudante;
		this.municipioEnderecoEstudante = municipioEnderecoEstudante;
		this.ufEnderecoEstudante = ufEnderecoEstudante;
		this.cepEnderecoEstudante = cepEnderecoEstudante;
		this.zonaEnderecoEstudante = zonaEnderecoEstudante;
		this.indicadorLocalizacaoDiferenciadaResidenciaEstudante = indicadorLocalizacaoDiferenciadaResidenciaEstudante;
		this.telefoneEstudante = telefoneEstudante;
		this.emailEstudante = emailEstudante;
		this.indicadorBolsaFamilia = indicadorBolsaFamilia;
		this.cpfEstudante = cpfEstudante;
		this.numeroNisEstudante = numeroNisEstudante;
		this.indicadorHistoricoEscolarApresentado = indicadorHistoricoEscolarApresentado;
		this.indicadorEstudanteAtividadeComplementar = indicadorEstudanteAtividadeComplementar;
	}



	public Integer getCodigoEstudante() {
		return codigoEstudante;
	}



	public void setCodigoEstudante(Integer codigoEstudante) {
		this.codigoEstudante = codigoEstudante;
	}



	public Integer getCodigoInepEstudante() {
		return codigoInepEstudante;
	}



	public void setCodigoInepEstudante(Integer codigoInepEstudante) {
		this.codigoInepEstudante = codigoInepEstudante;
	}



	public String getNomeEstudante() {
		return nomeEstudante;
	}



	public void setNomeEstudante(String nomeEstudante) {
		this.nomeEstudante = nomeEstudante;
	}



	public String getNomeSocialEstudante() {
		return nomeSocialEstudante;
	}



	public void setNomeSocialEstudante(String nomeSocialEstudante) {
		this.nomeSocialEstudante = nomeSocialEstudante;
	}



	public String getSexoEstudante() {
		return sexoEstudante;
	}



	public void setSexoEstudante(String sexoEstudante) {
		this.sexoEstudante = sexoEstudante;
	}



	public LocalDate getDataNascimentoEstudante() {
		return dataNascimentoEstudante;
	}



	public void setDataNascimentoEstudante(LocalDate dataNascimentoEstudante) {
		this.dataNascimentoEstudante = dataNascimentoEstudante;
	}



	public Integer getCodigoIbgePaisNacionalidadeEstudante() {
		return codigoIbgePaisNacionalidadeEstudante;
	}



	public void setCodigoIbgePaisNacionalidadeEstudante(Integer codigoIbgePaisNacionalidadeEstudante) {
		this.codigoIbgePaisNacionalidadeEstudante = codigoIbgePaisNacionalidadeEstudante;
	}



	public Integer getCodigoIbgeUfNascimentoEstudante() {
		return codigoIbgeUfNascimentoEstudante;
	}



	public void setCodigoIbgeUfNascimentoEstudante(Integer codigoIbgeUfNascimentoEstudante) {
		this.codigoIbgeUfNascimentoEstudante = codigoIbgeUfNascimentoEstudante;
	}



	public Integer getCodigoIbgeMunicipioNascimentoEstudante() {
		return codigoIbgeMunicipioNascimentoEstudante;
	}



	public void setCodigoIbgeMunicipioNascimentoEstudante(Integer codigoIbgeMunicipioNascimentoEstudante) {
		this.codigoIbgeMunicipioNascimentoEstudante = codigoIbgeMunicipioNascimentoEstudante;
	}



	public String getNomePaiEstudante() {
		return nomePaiEstudante;
	}



	public void setNomePaiEstudante(String nomePaiEstudante) {
		this.nomePaiEstudante = nomePaiEstudante;
	}



	public String getNomeMaeEstudante() {
		return nomeMaeEstudante;
	}



	public void setNomeMaeEstudante(String nomeMaeEstudante) {
		this.nomeMaeEstudante = nomeMaeEstudante;
	}



	public String getIndicadorMaeFalecida() {
		return indicadorMaeFalecida;
	}



	public void setIndicadorMaeFalecida(String indicadorMaeFalecida) {
		this.indicadorMaeFalecida = indicadorMaeFalecida;
	}



	public String getIndicadorMaeDeclarada() {
		return indicadorMaeDeclarada;
	}



	public void setIndicadorMaeDeclarada(String indicadorMaeDeclarada) {
		this.indicadorMaeDeclarada = indicadorMaeDeclarada;
	}



	public String getIndicadorPaiFalecido() {
		return indicadorPaiFalecido;
	}



	public void setIndicadorPaiFalecido(String indicadorPaiFalecido) {
		this.indicadorPaiFalecido = indicadorPaiFalecido;
	}



	public String getIndicadorPaiDeclarado() {
		return indicadorPaiDeclarado;
	}



	public void setIndicadorPaiDeclarado(String indicadorPaiDeclarado) {
		this.indicadorPaiDeclarado = indicadorPaiDeclarado;
	}



	public String getIndicadorAlunoGemeo() {
		return indicadorAlunoGemeo;
	}



	public void setIndicadorAlunoGemeo(String indicadorAlunoGemeo) {
		this.indicadorAlunoGemeo = indicadorAlunoGemeo;
	}



	public String getRuaEnderecoEstudante() {
		return ruaEnderecoEstudante;
	}



	public void setRuaEnderecoEstudante(String ruaEnderecoEstudante) {
		this.ruaEnderecoEstudante = ruaEnderecoEstudante;
	}



	public String getNumeroEnderecoEstudante() {
		return numeroEnderecoEstudante;
	}



	public void setNumeroEnderecoEstudante(String numeroEnderecoEstudante) {
		this.numeroEnderecoEstudante = numeroEnderecoEstudante;
	}



	public String getComplementoEnderecoEstudante() {
		return complementoEnderecoEstudante;
	}



	public void setComplementoEnderecoEstudante(String complementoEnderecoEstudante) {
		this.complementoEnderecoEstudante = complementoEnderecoEstudante;
	}



	public String getBairroEnderecoEstudante() {
		return bairroEnderecoEstudante;
	}



	public void setBairroEnderecoEstudante(String bairroEnderecoEstudante) {
		this.bairroEnderecoEstudante = bairroEnderecoEstudante;
	}



	public String getMunicipioEnderecoEstudante() {
		return municipioEnderecoEstudante;
	}



	public void setMunicipioEnderecoEstudante(String municipioEnderecoEstudante) {
		this.municipioEnderecoEstudante = municipioEnderecoEstudante;
	}



	public String getUfEnderecoEstudante() {
		return ufEnderecoEstudante;
	}



	public void setUfEnderecoEstudante(String ufEnderecoEstudante) {
		this.ufEnderecoEstudante = ufEnderecoEstudante;
	}



	public String getCepEnderecoEstudante() {
		return cepEnderecoEstudante;
	}



	public void setCepEnderecoEstudante(String cepEnderecoEstudante) {
		this.cepEnderecoEstudante = cepEnderecoEstudante;
	}



	public String getZonaEnderecoEstudante() {
		return zonaEnderecoEstudante;
	}



	public void setZonaEnderecoEstudante(String zonaEnderecoEstudante) {
		this.zonaEnderecoEstudante = zonaEnderecoEstudante;
	}



	public String getIndicadorLocalizacaoDiferenciadaResidenciaEstudante() {
		return indicadorLocalizacaoDiferenciadaResidenciaEstudante;
	}



	public void setIndicadorLocalizacaoDiferenciadaResidenciaEstudante(
			String indicadorLocalizacaoDiferenciadaResidenciaEstudante) {
		this.indicadorLocalizacaoDiferenciadaResidenciaEstudante = indicadorLocalizacaoDiferenciadaResidenciaEstudante;
	}



	public String getTelefoneEstudante() {
		return telefoneEstudante;
	}



	public void setTelefoneEstudante(String telefoneEstudante) {
		this.telefoneEstudante = telefoneEstudante;
	}



	public String getEmailEstudante() {
		return emailEstudante;
	}



	public void setEmailEstudante(String emailEstudante) {
		this.emailEstudante = emailEstudante;
	}



	public String getIndicadorBolsaFamilia() {
		return indicadorBolsaFamilia;
	}



	public void setIndicadorBolsaFamilia(String indicadorBolsaFamilia) {
		this.indicadorBolsaFamilia = indicadorBolsaFamilia;
	}



	public String getCpfEstudante() {
		return cpfEstudante;
	}



	public void setCpfEstudante(String cpfEstudante) {
		this.cpfEstudante = cpfEstudante;
	}



	public Integer getNumeroNisEstudante() {
		return numeroNisEstudante;
	}



	public void setNumeroNisEstudante(Integer numeroNisEstudante) {
		this.numeroNisEstudante = numeroNisEstudante;
	}



	public String getIndicadorHistoricoEscolarApresentado() {
		return indicadorHistoricoEscolarApresentado;
	}



	public void setIndicadorHistoricoEscolarApresentado(String indicadorHistoricoEscolarApresentado) {
		this.indicadorHistoricoEscolarApresentado = indicadorHistoricoEscolarApresentado;
	}



	public String getIndicadorEstudanteAtividadeComplementar() {
		return indicadorEstudanteAtividadeComplementar;
	}



	public void setIndicadorEstudanteAtividadeComplementar(String indicadorEstudanteAtividadeComplementar) {
		this.indicadorEstudanteAtividadeComplementar = indicadorEstudanteAtividadeComplementar;
	}

	
	
		}
