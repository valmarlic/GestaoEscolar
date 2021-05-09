package br.com.gestaoEscolar.domainEscola;

import java.time.LocalDate;
import java.util.Date;

public class GestaoEscolarDadosGerais {
	/*
	 * private Integer numerocartao; private String nome; private String cpf;
	 * private String rg; private String dataentrada; private String datasaida;
	 * private String setorvisitado; private String foto;
	 */
	
		
	private Integer codigoEscola;
	private Integer	nucleo;//Interger no Banco
	private Integer codInepEscola;//Interger no banco
	private String  nomeEscola;// Integer no banco
	private String cnpjEntidade;
	private LocalDate dataCriacaoRegistroTabela;	 // Date no Banco
	private String situcaoInstitucional;
	private String tipoPoloAnexo;
	
	private Integer usuarioCriacaoRgistroTabela;//Interger no Bnaco - Código do usuario Responsável por fazer redgistro
	private Integer indcdorReglantcaAutrzcaoEscola; //Interger no Banco
	
	private Integer zonaLoclizcaoEscola;//Interger no Banco
	private String indicadorEscolaPolo;
	private String indicadorEscolaAnexo;
	
	private LocalDate datAtulizcaoRegistroTabela;//Date de atualização no Banco
	private Integer usuarioAtulizcaoRegistroTabela;//Usuario de atualização do registro no Banco
	
	private Integer codStatusEscola;
	private Integer cepEscola;//Interger no banco
	private String enderecoEscola; //Rua Logradouro
	private String complentEndercoEscola;
	private String municipio;
	private String distrito;
	private String numeroEscola;
	private String bairroEscola;
	private String uf;
	private String latitudeEndEscola;
	private String longtudeEndEscola;
	private String telefoneEscola;
	private String telefoneCelelar;
	private String faxContato;
	private String numeroContato;
	private String  emailInstcnalEscola;
	private Integer codEscolaPolo;
	private Integer inddorDpciaAdmtvEscola;
	
	
	public GestaoEscolarDadosGerais() {
		super();

	}

	
	
	
	public GestaoEscolarDadosGerais(Integer codigoEscola, Integer codEscolaPolo, Integer codInepEscola, Integer nucleo, String nomeEscola,
			String cnpjEntidade, LocalDate dataCriacaoRegistroTabela, String situcaoInstitucional,
			String tipoPoloAnexo, Integer inddorDpciaAdmtvEscola, Integer usuarioCriacaoRgistroTabela,
			Integer indcdorReglantcaAutrzcaoEscola, Integer zonaLoclizcaoEscola, String indicadorEscolaPolo,
			String indicadorEscolaAnexo, LocalDate datAtulizcaoRegistroTabela, Integer usuarioAtulizcaoRegistroTabela,
			Integer codStatusEscola, Integer cepEscola, String enderecoEscola, String complentEndercoEscola,
			String municipio, String distrito, String numeroEscola, String bairroEscola, String uf,
			String latitudeEndEscola, String longtudeEndEscola, String telefoneEscola, String telefoneCelelar,
			String faxContato, String numeroContato, String emailInstcnalEscola) {
		super();
		this.codigoEscola = codigoEscola;
		this.nucleo = nucleo;
		this.codInepEscola = codInepEscola;
		this.nomeEscola = nomeEscola;
		this.cnpjEntidade = cnpjEntidade;
		this.dataCriacaoRegistroTabela = dataCriacaoRegistroTabela;
		this.situcaoInstitucional = situcaoInstitucional;
		this.tipoPoloAnexo = tipoPoloAnexo;
		this.inddorDpciaAdmtvEscola = inddorDpciaAdmtvEscola;
		this.usuarioCriacaoRgistroTabela = usuarioCriacaoRgistroTabela;
		this.indcdorReglantcaAutrzcaoEscola = indcdorReglantcaAutrzcaoEscola;
		this.zonaLoclizcaoEscola = zonaLoclizcaoEscola;
		this.indicadorEscolaPolo = indicadorEscolaPolo;
		this.indicadorEscolaAnexo = indicadorEscolaAnexo;
		this.datAtulizcaoRegistroTabela = datAtulizcaoRegistroTabela;
		this.usuarioAtulizcaoRegistroTabela = usuarioAtulizcaoRegistroTabela;
		this.codStatusEscola = codStatusEscola;
		this.cepEscola = cepEscola;
		this.enderecoEscola = enderecoEscola;
		this.complentEndercoEscola = complentEndercoEscola;
		this.municipio = municipio;
		this.distrito = distrito;
		this.numeroEscola = numeroEscola;
		this.bairroEscola = bairroEscola;
		this.uf = uf;
		this.latitudeEndEscola = latitudeEndEscola;
		this.longtudeEndEscola = longtudeEndEscola;
		this.telefoneEscola = telefoneEscola;
		this.telefoneCelelar = telefoneCelelar;
		this.faxContato = faxContato;
		this.numeroContato = numeroContato;
		this.emailInstcnalEscola = emailInstcnalEscola;
		this.codEscolaPolo = codEscolaPolo;
	}




	public Integer getCodigoEscola() {
		return codigoEscola;
	}


	public void setCodigoEscola(Integer codigoEscola) {
		this.codigoEscola = codigoEscola;
	}


	public Integer getNucleo() {
		return nucleo;
	}


	public void setNucleo(Integer nucleo) {
		this.nucleo = nucleo;
	}


	public String getNomeEscola() {
		return nomeEscola;
	}


	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	
	
	
	public String getCnpjEntidade() {
	
		return cnpjEntidade;
	}




	public void setCnpjEntidade(String cnpjEntidade) {
		this.cnpjEntidade = cnpjEntidade;
	}




	public String getSitucaoInstitucional() {
		return situcaoInstitucional;
	}


	public void setSitucaoInstitucional(String situcaoInstitucional) {
		this.situcaoInstitucional = situcaoInstitucional;
	}


	public String getTipoPoloAnexo() {
		return tipoPoloAnexo;
	}


	public void setTipoPoloAnexo(String tipoPoloAnexo) {
		this.tipoPoloAnexo = tipoPoloAnexo;
	}


	public Integer getCodInepEscola() {
		return codInepEscola;
	}


	public void setCodInepEscola(Integer codInepEscola) {
		this.codInepEscola = codInepEscola;
	}

	
	public Integer getCepEscola() {
		return cepEscola;
	}


	public void setCepEscola(Integer cepEscola) {
		this.cepEscola = cepEscola;
	}


	public String getEnderecoEscola() {
		return enderecoEscola;
	}


	public void setEnderecoEscola(String enderecoEscola) {
		this.enderecoEscola = enderecoEscola;
	}


	public String getBairroEscola() {
		return bairroEscola;
	}


	public void setBairroEscola(String bairroEscola) {
		this.bairroEscola = bairroEscola;
	}


	public String getUf() {
		return uf;
	}


	public void setUf(String uf) {
		this.uf = uf;
	}


	public String getNumeroEscola() {
		return numeroEscola;
	}


	public void setNumeroEscola(String numeroEscola) {
		this.numeroEscola = numeroEscola;
	}


	public String getComplentEndercoEscola() {
		return complentEndercoEscola;
	}


	public void setComplentEndercoEscola(String complentEndercoEscola) {
		this.complentEndercoEscola = complentEndercoEscola;
	}


	public String getMunicipio() {
		return municipio;
	}


	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}


	public String getDistrito() {
		return distrito;
	}


	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}




	public String getLatitudeEndEscola() {
		return latitudeEndEscola;
	}


	public void setLatitudeEndEscola(String latitudeEndEscola) {
		this.latitudeEndEscola = latitudeEndEscola;
	}


	public String getLongtudeEndEscola() {
		return longtudeEndEscola;
	}


	public void setLongtudeEndEscola(String longtudeEndEscola) {
		this.longtudeEndEscola = longtudeEndEscola;
	}


	public String getTelefoneEscola() {
		return telefoneEscola;
	}


	public void setTelefoneEscola(String telefoneEscola) {
		this.telefoneEscola = telefoneEscola;
	}

	
	public String getTelefoneCelelar() {
		return telefoneCelelar;
	}


	public void setTelefoneCelelar(String telefoneCelelar) {
		this.telefoneCelelar = telefoneCelelar;
	}

	public String getFaxContato() {
		return faxContato;
	}


	public void setFaxContato(String faxContato) {
		this.faxContato = faxContato;
	}


	public String getNumeroContato() {
		return numeroContato;
	}


	public void setNumeroContato(String numeroContato) {
		this.numeroContato = numeroContato;
	}


	

	public String getIndicadorEscolaPolo() {
		return indicadorEscolaPolo;
	}


	public void setIndicadorEscolaPolo(String indicadorEscolaPolo) {
		this.indicadorEscolaPolo = indicadorEscolaPolo;
	}


	public String getIndicadorEscolaAnexo() {
		return indicadorEscolaAnexo;
	}


	public void setIndicadorEscolaAnexo(String indicadorEscolaAnexo) {
		this.indicadorEscolaAnexo = indicadorEscolaAnexo;
	}


	public Integer getCodStatusEscola() {
		return codStatusEscola;
	}


	public void setCodStatusEscola(Integer codStatusEscola) {
		this.codStatusEscola = codStatusEscola;
	}


	public Integer getIndcdorReglantcaAutrzcaoEscola() {
		return indcdorReglantcaAutrzcaoEscola;
	}

	public void setIndcdorReglantcaAutrzcaoEscola(Integer indcdorReglantcaAutrzcaoEscola) {
		this.indcdorReglantcaAutrzcaoEscola = indcdorReglantcaAutrzcaoEscola;
	}

	public String getEmailInstcnalEscola() {
		return emailInstcnalEscola;
	}


	public void setEmailInstcnalEscola(String emailInstcnalEscola) {
		this.emailInstcnalEscola = emailInstcnalEscola;
	}
	
	public Integer getCodEscolaPolo() {
		return codEscolaPolo;
	}

	public void setCodEscolaPolo(Integer codEscolaPolo) {
		this.codEscolaPolo = codEscolaPolo;
	}

	public Integer getZonaLoclizcaoEscola() {
		return zonaLoclizcaoEscola;
	}

	public void setZonaLoclizcaoEscola(Integer zonaLoclizcaoEscola) {
		this.zonaLoclizcaoEscola = zonaLoclizcaoEscola;
	}

	public LocalDate getDataCriacaoRegistroTabela() {
		return dataCriacaoRegistroTabela;
	}

	public void setDataCriacaoRegistroTabela(LocalDate dataCriacaoRegistroTabela) {
		this.dataCriacaoRegistroTabela = dataCriacaoRegistroTabela;
	}

	

	public Integer getUsuarioCriacaoRgistroTabela() {
		return usuarioCriacaoRgistroTabela;
	}

	public void setUsuarioCriacaoRgistroTabela(Integer usuarioCriacaoRgistroTabela) {
		this.usuarioCriacaoRgistroTabela = usuarioCriacaoRgistroTabela;
	}

	public Integer getInddorDpciaAdmtvEscola() {
		return inddorDpciaAdmtvEscola;
	}




	public void setInddorDpciaAdmtvEscola(Integer inddorDpciaAdmtvEscola) {
		this.inddorDpciaAdmtvEscola = inddorDpciaAdmtvEscola;
	}


	public LocalDate getDatAtulizcaoRegistroTabela() {
		return datAtulizcaoRegistroTabela;
	}

	public void setDatAtulizcaoRegistroTabela(LocalDate datAtulizcaoRegistroTabela) {
		this.datAtulizcaoRegistroTabela = datAtulizcaoRegistroTabela;
	}

	public Integer getUsuarioAtulizcaoRegistroTabela() {
		return usuarioAtulizcaoRegistroTabela;
	}

	public void setUsuarioAtulizcaoRegistroTabela(Integer usuarioAtulizcaoRegistroTabela) {
		this.usuarioAtulizcaoRegistroTabela = usuarioAtulizcaoRegistroTabela;
	}

	

	
}