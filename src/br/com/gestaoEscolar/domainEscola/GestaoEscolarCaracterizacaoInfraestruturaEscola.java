package br.com.gestaoEscolar.domainEscola;

import java.time.LocalDate;

public class GestaoEscolarCaracterizacaoInfraestruturaEscola {

	private Integer codigoCaracterizacaoInfraestruturaEscola;
	private Integer codigoCarctzInfraEscola; // codigo da escola
	private String indicadorLocalFuncionamentoEscola;

	private String indicadorFormaOcupacaoPredio;
	private String indicadorPredioCompartilhadoOoutraEscola;
	private Integer codigoInepEscolaPredioPompartilhado_01;

	private Integer codigoInepEscolaPredioPompartilhado_02;
	private Integer codigoInepEscolaPredioPompartilhado_03;
	private Integer codigoInepEscolaPredioPompartilhado_04;

	private Integer codigoInepEscolaPredioPompartilhado_05;
	private Integer codigoInepEscolaPredioPompartilhado_06;
	private String indicadorForneceAguaPotavelConsumoHumano; // Não existe água potável ao consumo humano

	private String indicadorFormaAbastecimentoAguaRedePublica;
	private String indicadorFormaAbastecimentoAguaPocoPublico;
	private String indicadorFormaFbastecimentoFguaFacimbaCisternaPoco;

	private String indicadorFormaAbastecimentoAguaFonteRioIgarapeRiacho_cor;
	private String indicadorFormaAbastecimentoAguaAusente; // Não existe Abastecimento de água
	private String indicadorFonteEnergiaEletricaRedePublica;

	private String indicadorFonteEnergiaEletricaGeradorCombustivelFossil;
	private String indicadorFonteEnergiaEletricaFontesRenovaveisAlternativas;
	private String indicadorFonteEnergiaEletricaAusente;

	private String indicadorEsgotamentoSanitarioRedePublica;
	private String indicadorEsgotamentoSanitarioFossaSeptica;
	private String indicadorEsgotamentoSanitarioFossaRudimentarComum;

	private String indicadorEsgotamentoSanitarioAusente;
	private String indicadorDestinacaoLixoServicoColeta;
	private String indicadorDestinacaoLixoQueima;

	private String indicadorDestinacaoLixoEnterra;
	private String indicadorDestinacaoLixoLocalLicenciadoPoderPublico;
	private String indicadorDestinacaoLixoOutraArea;

	private String indicadorTratamentoLixoSeparacaoLixoResiduos;
	private String indicadorTratamentoLixoReaproveitamentoReutilizacao;
	private String indicadorTratamentoLixoReciclagem;

	private String indicadorTratamentoAusente; // Não ha tratamento separação lixo
	private String indicadorDependenciaExistenteAlmoxarifado;
	private String indicadorDependenciaExistenteAreaVerde;

	private String indicadorDependenciaExistenteAuditorio;
	private String indicadorEependenciaExistenteBanheiro;
	private String indicadorDependenciaExistenteBanheiroAcessivel;// Banheiro acessível(para Deficiente Físico)

	private String indicadorDependenciaExistenteBanheiroEducacaoInfantil;
	private String indicadorDependenciaExistenteBanheiroExclusivoFuncionario;
	private String indicadorDependenciaExistenteBanheiroVestiarioComChuveiro;

	private String indicadorDependenciaExistenteBiblioteca;
	private String indicadorDependenciaExistenteCozinha;
	private String indicadorDependenciaExistenteDespensa;

	private String indicadorDependenciaExistenteDormitorioAluno;
	private String indicadorDependenciaExistenteDormitorioProfessor;
	private String indicadorDependenciaExistenteLaboratorioCiencias;

	private String indicadorDependenciaExistenteLaboratorioInformatica;
	private String indicadorDependenciaExistenteParqueInfantil;
	private String indicadorDependenciaExistentePatioCoberto;

	private String indicadorDependenciaExistentePatioDescoberto;
	private String indicadorDependenciaExistentePiscina;
	private String indicadorDependenciaExistenteQuadraEsporteCoberta;

	private String indicadorDependenciaExistenteQuadraEsporteDescoberta;
	private String indicadorDependenciaExistenteRefeitorio;
	private String indicadorDependenciaExistenteSalaRepousoAluno;

	private String indicadorDependenciaExistenteSalaAtelieArte;
	private String indicadorDependenciaExistenteSalaMusicaCoral;
	private String indicadorDependenciaExistenteSalaEstudioDanca;// Sala estúdio dança Multuso

	private String indicadorDependenciaExistenteSalaMultiuso; // Sala multuso, música, dança e arte
	private String indicadorDependenciaExistenteTerreirao;
	private String indicadorDependenciaExistenteViveiro;

	private String indicadorDependenciaExistenteSalaDiretoria;
	private String indicadorDependenciaExistenteSalaLeitura;
	private String indicadorDependenciaExistenteSalaProfessores;

	private String indicadorDependenciaExistenteSalaRecursosMultifuncionais; // Sala de recursos multifuncionais para
																				// Atendimento Educacional Especializado
																				// (AEE)
	private String indicadorDependenciaExistenteSalaSecretaria;
	private String indicadorDependenciaExistenteAusente;

	private String indicadorRecursosAcessibilidadeCorrimaoGuardaCorpo;
	private String indicadorRecursosAcessibilidadeElevador;
	private String indicadorRecursosAcessibilidadePisoTatil;

	private String indicadorRecursosAcessibilidadePortaVaoLivre;
	private String indicadorRecursosAcessibilidadeRampa;
	private String indicadorRecursosAcessibilidadeSinalizacaoSonora;

	private String indicadorRecursosAcessibilidadeSinalizacaoTatil;
	private String indicadorRecursosAcessibilidadeSinalizacaoVisual;
	private String indicadorRecursosAcessibilidadeAusente;

	private Integer quantidadeSalaUtilizadaEscolaDentroPredio;
	private Integer quantidadeSalaUtilizadaEscolaForaPredio;
	private Integer quantidadeSalaClimatizada;

	private Integer quantidadeSalaComAcessibilidade;
	private String indicadorEspacoCedidoBrasilAlfabetizado;
	private String indicadorEscolaAbreFinaisSemanaComunidade;

	private String indicadorEscolaPropostaPedagogicaFormacaoPorAlternancia;
	private String indicadorLocalizacaoDiferenciadaEscola;
	private String indicadorOrgaoVinculoEscolaSecretariaMinisterioEducacao;

	private String indicadorOrgaoVinculoEscolaSecretariaSegurancaForcasArma;
	private String indicadorOrgaoVinculoEscolaSecretariaMinisterioSaude;
	private String indicadorOrgaoVinculoOutroOrgao;

	private String indicadorCategoriaEscola;
	private String indicadorConvenioPoderPublico;
	private String indicadorMantenedoraEscolaPrivadaEmpresaPrivadaGrupoEmpr;

	private String indicadorMantenedoraEscolaPrivadaInstituicoesSemFinsLucr;
	private String indicadorMantenedoraEscolaPrivadaOrganizacaoNaoGovernamen;
	private String indicadorMantenedoraEscolaPrivadaOrganizacaoDaSociedadeC;

	private String indicadorMantenedoraEscolaPrivadaSindicatoTrabalhadoresPa;
	private String indicadorMantenedoraEscolaPrivadaSistemaS;
	private String indicadorEsferaAdministrativaConselhoRegulamentacaoutoriz;

	private LocalDate dataCriacaoRegistroTabela;
	private Integer usuarioCriacaoRegistroTabela;
	private LocalDate dataAtualizacaoRegistroTabela;

	private Integer usuarioAtualizacaoRegistroTabela;

	public GestaoEscolarCaracterizacaoInfraestruturaEscola() {
		super();
	}

	public GestaoEscolarCaracterizacaoInfraestruturaEscola(Integer codigoCaracterizacaoInfraestruturaEscola,
			Integer codigoCarctzInfraEscola, String indicadorLocalFuncionamentoEscola,
			String indicadorFormaOcupacaoPredio, String indicadorPredioCompartilhadoOoutraEscola,
			Integer codigoInepEscolaPredioPompartilhado_01, Integer codigoInepEscolaPredioPompartilhado_02,
			Integer codigoInepEscolaPredioPompartilhado_03, Integer codigoInepEscolaPredioPompartilhado_04,
			Integer codigoInepEscolaPredioPompartilhado_05, Integer codigoInepEscolaPredioPompartilhado_06,
			String indicadorForneceAguaPotavelConsumoHumano, String indicadorFormaAbastecimentoAguaRedePublica,
			String indicadorFormaAbastecimentoAguaPocoPublico,
			String indicadorFormaFbastecimentoFguaFacimbaCisternaPoco,
			String indicadorFormaAbastecimentoAguaFonteRioIgarapeRiacho_cor,
			String indicadorFormaAbastecimentoAguaAusente, String indicadorFonteEnergiaEletricaRedePublica,
			String indicadorFonteEnergiaEletricaGeradorCombustivelFossil,
			String indicadorFonteEnergiaEletricaFontesRenovaveisAlternativas,
			String indicadorFonteEnergiaEletricaAusente, String indicadorEsgotamentoSanitarioRedePublica,
			String indicadorEsgotamentoSanitarioFossaSeptica, String indicadorEsgotamentoSanitarioFossaRudimentarComum,
			String indicadorEsgotamentoSanitarioAusente, String indicadorDestinacaoLixoServicoColeta,
			String indicadorDestinacaoLixoQueima, String indicadorDestinacaoLixoEnterra,
			String indicadorDestinacaoLixoLocalLicenciadoPoderPublico, String indicadorDestinacaoLixoOutraArea,
			String indicadorTratamentoLixoSeparacaoLixoResiduos,
			String indicadorTratamentoLixoReaproveitamentoReutilizacao, String indicadorTratamentoLixoReciclagem,
			String indicadorTratamentoAusente, String indicadorDependenciaExistenteAlmoxarifado,
			String indicadorDependenciaExistenteAreaVerde, String indicadorDependenciaExistenteAuditorio,
			String indicadorEependenciaExistenteBanheiro, String indicadorDependenciaExistenteBanheiroAcessivel,
			String indicadorDependenciaExistenteBanheiroEducacaoInfantil,
			String indicadorDependenciaExistenteBanheiroExclusivoFuncionario,
			String indicadorDependenciaExistenteBanheiroVestiarioComChuveiro,
			String indicadorDependenciaExistenteBiblioteca, String indicadorDependenciaExistenteCozinha,
			String indicadorDependenciaExistenteDespensa, String indicadorDependenciaExistenteDormitorioAluno,
			String indicadorDependenciaExistenteDormitorioProfessor,
			String indicadorDependenciaExistenteLaboratorioCiencias,
			String indicadorDependenciaExistenteLaboratorioInformatica,
			String indicadorDependenciaExistenteParqueInfantil, String indicadorDependenciaExistentePatioCoberto,
			String indicadorDependenciaExistentePatioDescoberto, String indicadorDependenciaExistentePiscina,
			String indicadorDependenciaExistenteQuadraEsporteCoberta,
			String indicadorDependenciaExistenteQuadraEsporteDescoberta, String indicadorDependenciaExistenteRefeitorio,
			String indicadorDependenciaExistenteSalaRepousoAluno, String indicadorDependenciaExistenteSalaAtelieArte,
			String indicadorDependenciaExistenteSalaMusicaCoral, String indicadorDependenciaExistenteSalaEstudioDanca,
			String indicadorDependenciaExistenteSalaMultiuso, String indicadorDependenciaExistenteTerreirao,
			String indicadorDependenciaExistenteViveiro, String indicadorDependenciaExistenteSalaDiretoria,
			String indicadorDependenciaExistenteSalaLeitura, String indicadorDependenciaExistenteSalaProfessores,
			String indicadorDependenciaExistenteSalaRecursosMultifuncionais,
			String indicadorDependenciaExistenteSalaSecretaria, String indicadorDependenciaExistenteAusente,
			String indicadorRecursosAcessibilidadeCorrimaoGuardaCorpo, String indicadorRecursosAcessibilidadeElevador,
			String indicadorRecursosAcessibilidadePisoTatil, String indicadorRecursosAcessibilidadePortaVaoLivre,
			String indicadorRecursosAcessibilidadeRampa, String indicadorRecursosAcessibilidadeSinalizacaoSonora,
			String indicadorRecursosAcessibilidadeSinalizacaoTatil,
			String indicadorRecursosAcessibilidadeSinalizacaoVisual, String indicadorRecursosAcessibilidadeAusente,
			Integer quantidadeSalaUtilizadaEscolaDentroPredio, Integer quantidadeSalaUtilizadaEscolaForaPredio,
			Integer quantidadeSalaClimatizada, Integer quantidadeSalaComAcessibilidade,
			String indicadorEspacoCedidoBrasilAlfabetizado, String indicadorEscolaAbreFinaisSemanaComunidade,
			String indicadorEscolaPropostaPedagogicaFormacaoPorAlternancia,
			String indicadorLocalizacaoDiferenciadaEscola,
			String indicadorOrgaoVinculoEscolaSecretariaMinisterioEducacao,
			String indicadorOrgaoVinculoEscolaSecretariaSegurancaForcasArma,
			String indicadorOrgaoVinculoEscolaSecretariaMinisterioSaude, String indicadorOrgaoVinculoOutroOrgao,
			String indicadorCategoriaEscola, String indicadorConvenioPoderPublico,
			String indicadorMantenedoraEscolaPrivadaEmpresaPrivadaGrupoEmpr,
			String indicadorMantenedoraEscolaPrivadaInstituicoesSemFinsLucr,
			String indicadorMantenedoraEscolaPrivadaOrganizacaoNaoGovernamen,
			String indicadorMantenedoraEscolaPrivadaOrganizacaoDaSociedadeC,
			String indicadorMantenedoraEscolaPrivadaSindicatoTrabalhadoresPa,
			String indicadorMantenedoraEscolaPrivadaSistemaS,
			String indicadorEsferaAdministrativaConselhoRegulamentacaoutoriz, LocalDate dataCriacaoRegistroTabela,
			Integer usuarioCriacaoRegistroTabela
	/* LocalDate dataAtualizacaoRegistroTabela */
	/* Integer usuarioAtualizacaoRegistroTabela */) {
		super();
		this.codigoCaracterizacaoInfraestruturaEscola = codigoCaracterizacaoInfraestruturaEscola;
		this.codigoCarctzInfraEscola = codigoCarctzInfraEscola;
		this.indicadorLocalFuncionamentoEscola = indicadorLocalFuncionamentoEscola;
		this.indicadorFormaOcupacaoPredio = indicadorFormaOcupacaoPredio;
		this.indicadorPredioCompartilhadoOoutraEscola = indicadorPredioCompartilhadoOoutraEscola;
		this.codigoInepEscolaPredioPompartilhado_01 = codigoInepEscolaPredioPompartilhado_01;
		this.codigoInepEscolaPredioPompartilhado_02 = codigoInepEscolaPredioPompartilhado_02;
		this.codigoInepEscolaPredioPompartilhado_03 = codigoInepEscolaPredioPompartilhado_03;
		this.codigoInepEscolaPredioPompartilhado_04 = codigoInepEscolaPredioPompartilhado_04;
		this.codigoInepEscolaPredioPompartilhado_05 = codigoInepEscolaPredioPompartilhado_05;
		this.codigoInepEscolaPredioPompartilhado_06 = codigoInepEscolaPredioPompartilhado_06;
		this.indicadorForneceAguaPotavelConsumoHumano = indicadorForneceAguaPotavelConsumoHumano;
		this.indicadorFormaAbastecimentoAguaRedePublica = indicadorFormaAbastecimentoAguaRedePublica;
		this.indicadorFormaAbastecimentoAguaPocoPublico = indicadorFormaAbastecimentoAguaPocoPublico;
		this.indicadorFormaFbastecimentoFguaFacimbaCisternaPoco = indicadorFormaFbastecimentoFguaFacimbaCisternaPoco;
		this.indicadorFormaAbastecimentoAguaFonteRioIgarapeRiacho_cor = indicadorFormaAbastecimentoAguaFonteRioIgarapeRiacho_cor;
		this.indicadorFormaAbastecimentoAguaAusente = indicadorFormaAbastecimentoAguaAusente;
		this.indicadorFonteEnergiaEletricaRedePublica = indicadorFonteEnergiaEletricaRedePublica;
		this.indicadorFonteEnergiaEletricaGeradorCombustivelFossil = indicadorFonteEnergiaEletricaGeradorCombustivelFossil;
		this.indicadorFonteEnergiaEletricaFontesRenovaveisAlternativas = indicadorFonteEnergiaEletricaFontesRenovaveisAlternativas;
		this.indicadorFonteEnergiaEletricaAusente = indicadorFonteEnergiaEletricaAusente;
		this.indicadorEsgotamentoSanitarioRedePublica = indicadorEsgotamentoSanitarioRedePublica;
		this.indicadorEsgotamentoSanitarioFossaSeptica = indicadorEsgotamentoSanitarioFossaSeptica;
		this.indicadorEsgotamentoSanitarioFossaRudimentarComum = indicadorEsgotamentoSanitarioFossaRudimentarComum;
		this.indicadorEsgotamentoSanitarioAusente = indicadorEsgotamentoSanitarioAusente;
		this.indicadorDestinacaoLixoServicoColeta = indicadorDestinacaoLixoServicoColeta;
		this.indicadorDestinacaoLixoQueima = indicadorDestinacaoLixoQueima;
		this.indicadorDestinacaoLixoEnterra = indicadorDestinacaoLixoEnterra;
		this.indicadorDestinacaoLixoLocalLicenciadoPoderPublico = indicadorDestinacaoLixoLocalLicenciadoPoderPublico;
		this.indicadorDestinacaoLixoOutraArea = indicadorDestinacaoLixoOutraArea;
		this.indicadorTratamentoLixoSeparacaoLixoResiduos = indicadorTratamentoLixoSeparacaoLixoResiduos;
		this.indicadorTratamentoLixoReaproveitamentoReutilizacao = indicadorTratamentoLixoReaproveitamentoReutilizacao;
		this.indicadorTratamentoLixoReciclagem = indicadorTratamentoLixoReciclagem;
		this.indicadorTratamentoAusente = indicadorTratamentoAusente;
		this.indicadorDependenciaExistenteAlmoxarifado = indicadorDependenciaExistenteAlmoxarifado;
		this.indicadorDependenciaExistenteAreaVerde = indicadorDependenciaExistenteAreaVerde;
		this.indicadorDependenciaExistenteAuditorio = indicadorDependenciaExistenteAuditorio;
		this.indicadorEependenciaExistenteBanheiro = indicadorEependenciaExistenteBanheiro;
		this.indicadorDependenciaExistenteBanheiroAcessivel = indicadorDependenciaExistenteBanheiroAcessivel;
		this.indicadorDependenciaExistenteBanheiroEducacaoInfantil = indicadorDependenciaExistenteBanheiroEducacaoInfantil;
		this.indicadorDependenciaExistenteBanheiroExclusivoFuncionario = indicadorDependenciaExistenteBanheiroExclusivoFuncionario;
		this.indicadorDependenciaExistenteBanheiroVestiarioComChuveiro = indicadorDependenciaExistenteBanheiroVestiarioComChuveiro;
		this.indicadorDependenciaExistenteBiblioteca = indicadorDependenciaExistenteBiblioteca;
		this.indicadorDependenciaExistenteCozinha = indicadorDependenciaExistenteCozinha;
		this.indicadorDependenciaExistenteDespensa = indicadorDependenciaExistenteDespensa;
		this.indicadorDependenciaExistenteDormitorioAluno = indicadorDependenciaExistenteDormitorioAluno;
		this.indicadorDependenciaExistenteDormitorioProfessor = indicadorDependenciaExistenteDormitorioProfessor;
		this.indicadorDependenciaExistenteLaboratorioCiencias = indicadorDependenciaExistenteLaboratorioCiencias;
		this.indicadorDependenciaExistenteLaboratorioInformatica = indicadorDependenciaExistenteLaboratorioInformatica;
		this.indicadorDependenciaExistenteParqueInfantil = indicadorDependenciaExistenteParqueInfantil;
		this.indicadorDependenciaExistentePatioCoberto = indicadorDependenciaExistentePatioCoberto;
		this.indicadorDependenciaExistentePatioDescoberto = indicadorDependenciaExistentePatioDescoberto;
		this.indicadorDependenciaExistentePiscina = indicadorDependenciaExistentePiscina;
		this.indicadorDependenciaExistenteQuadraEsporteCoberta = indicadorDependenciaExistenteQuadraEsporteCoberta;
		this.indicadorDependenciaExistenteQuadraEsporteDescoberta = indicadorDependenciaExistenteQuadraEsporteDescoberta;
		this.indicadorDependenciaExistenteRefeitorio = indicadorDependenciaExistenteRefeitorio;
		this.indicadorDependenciaExistenteSalaRepousoAluno = indicadorDependenciaExistenteSalaRepousoAluno;
		this.indicadorDependenciaExistenteSalaAtelieArte = indicadorDependenciaExistenteSalaAtelieArte;
		this.indicadorDependenciaExistenteSalaMusicaCoral = indicadorDependenciaExistenteSalaMusicaCoral;
		this.indicadorDependenciaExistenteSalaEstudioDanca = indicadorDependenciaExistenteSalaEstudioDanca;
		this.indicadorDependenciaExistenteSalaMultiuso = indicadorDependenciaExistenteSalaMultiuso;
		this.indicadorDependenciaExistenteTerreirao = indicadorDependenciaExistenteTerreirao;
		this.indicadorDependenciaExistenteViveiro = indicadorDependenciaExistenteViveiro;
		this.indicadorDependenciaExistenteSalaDiretoria = indicadorDependenciaExistenteSalaDiretoria;
		this.indicadorDependenciaExistenteSalaLeitura = indicadorDependenciaExistenteSalaLeitura;
		this.indicadorDependenciaExistenteSalaProfessores = indicadorDependenciaExistenteSalaProfessores;
		this.indicadorDependenciaExistenteSalaRecursosMultifuncionais = indicadorDependenciaExistenteSalaRecursosMultifuncionais;
		this.indicadorDependenciaExistenteSalaSecretaria = indicadorDependenciaExistenteSalaSecretaria;
		this.indicadorDependenciaExistenteAusente = indicadorDependenciaExistenteAusente;
		this.indicadorRecursosAcessibilidadeCorrimaoGuardaCorpo = indicadorRecursosAcessibilidadeCorrimaoGuardaCorpo;
		this.indicadorRecursosAcessibilidadeElevador = indicadorRecursosAcessibilidadeElevador;
		this.indicadorRecursosAcessibilidadePisoTatil = indicadorRecursosAcessibilidadePisoTatil;
		this.indicadorRecursosAcessibilidadePortaVaoLivre = indicadorRecursosAcessibilidadePortaVaoLivre;
		this.indicadorRecursosAcessibilidadeRampa = indicadorRecursosAcessibilidadeRampa;
		this.indicadorRecursosAcessibilidadeSinalizacaoSonora = indicadorRecursosAcessibilidadeSinalizacaoSonora;
		this.indicadorRecursosAcessibilidadeSinalizacaoTatil = indicadorRecursosAcessibilidadeSinalizacaoTatil;
		this.indicadorRecursosAcessibilidadeSinalizacaoVisual = indicadorRecursosAcessibilidadeSinalizacaoVisual;
		this.indicadorRecursosAcessibilidadeAusente = indicadorRecursosAcessibilidadeAusente;
		this.quantidadeSalaUtilizadaEscolaDentroPredio = quantidadeSalaUtilizadaEscolaDentroPredio;
		this.quantidadeSalaUtilizadaEscolaForaPredio = quantidadeSalaUtilizadaEscolaForaPredio;
		this.quantidadeSalaClimatizada = quantidadeSalaClimatizada;
		this.quantidadeSalaComAcessibilidade = quantidadeSalaComAcessibilidade;
		this.indicadorEspacoCedidoBrasilAlfabetizado = indicadorEspacoCedidoBrasilAlfabetizado;
		this.indicadorEscolaAbreFinaisSemanaComunidade = indicadorEscolaAbreFinaisSemanaComunidade;
		this.indicadorEscolaPropostaPedagogicaFormacaoPorAlternancia = indicadorEscolaPropostaPedagogicaFormacaoPorAlternancia;
		this.indicadorLocalizacaoDiferenciadaEscola = indicadorLocalizacaoDiferenciadaEscola;
		this.indicadorOrgaoVinculoEscolaSecretariaMinisterioEducacao = indicadorOrgaoVinculoEscolaSecretariaMinisterioEducacao;
		this.indicadorOrgaoVinculoEscolaSecretariaSegurancaForcasArma = indicadorOrgaoVinculoEscolaSecretariaSegurancaForcasArma;
		this.indicadorOrgaoVinculoEscolaSecretariaMinisterioSaude = indicadorOrgaoVinculoEscolaSecretariaMinisterioSaude;
		this.indicadorOrgaoVinculoOutroOrgao = indicadorOrgaoVinculoOutroOrgao;
		this.indicadorCategoriaEscola = indicadorCategoriaEscola;
		this.indicadorConvenioPoderPublico = indicadorConvenioPoderPublico;
		this.indicadorMantenedoraEscolaPrivadaEmpresaPrivadaGrupoEmpr = indicadorMantenedoraEscolaPrivadaEmpresaPrivadaGrupoEmpr;
		this.indicadorMantenedoraEscolaPrivadaInstituicoesSemFinsLucr = indicadorMantenedoraEscolaPrivadaInstituicoesSemFinsLucr;
		this.indicadorMantenedoraEscolaPrivadaOrganizacaoNaoGovernamen = indicadorMantenedoraEscolaPrivadaOrganizacaoNaoGovernamen;
		this.indicadorMantenedoraEscolaPrivadaOrganizacaoDaSociedadeC = indicadorMantenedoraEscolaPrivadaOrganizacaoDaSociedadeC;
		this.indicadorMantenedoraEscolaPrivadaSindicatoTrabalhadoresPa = indicadorMantenedoraEscolaPrivadaSindicatoTrabalhadoresPa;
		this.indicadorMantenedoraEscolaPrivadaSistemaS = indicadorMantenedoraEscolaPrivadaSistemaS;
		this.indicadorEsferaAdministrativaConselhoRegulamentacaoutoriz = indicadorEsferaAdministrativaConselhoRegulamentacaoutoriz;
		this.dataCriacaoRegistroTabela = dataCriacaoRegistroTabela;
		this.usuarioCriacaoRegistroTabela = usuarioCriacaoRegistroTabela;
		// this.dataAtualizacaoRegistroTabela = dataAtualizacaoRegistroTabela;
		// this.usuarioAtualizacaoRegistroTabela = usuarioAtualizacaoRegistroTabela;
	}

	public Integer getCodigoCaracterizacaoInfraestruturaEscola() {
		return codigoCaracterizacaoInfraestruturaEscola;
	}

	public void setCodigoCaracterizacaoInfraestruturaEscola(Integer codigoCaracterizacaoInfraestruturaEscola) {
		this.codigoCaracterizacaoInfraestruturaEscola = codigoCaracterizacaoInfraestruturaEscola;
	}

	public Integer getCodigoCarctzInfraEscola() {
		return codigoCarctzInfraEscola;
	}

	public void setCodigoCarctzInfraEscola(Integer codigoCarctzInfraEscola) {
		this.codigoCarctzInfraEscola = codigoCarctzInfraEscola;
	}

	public String getIndicadorLocalFuncionamentoEscola() {
		return indicadorLocalFuncionamentoEscola;
	}

	public void setIndicadorLocalFuncionamentoEscola(String indicadorLocalFuncionamentoEscola) {
		this.indicadorLocalFuncionamentoEscola = indicadorLocalFuncionamentoEscola;
	}

	public String getIndicadorFormaOcupacaoPredio() {
		return indicadorFormaOcupacaoPredio;
	}

	public void setIndicadorFormaOcupacaoPredio(String indicadorFormaOcupacaoPredio) {

		this.indicadorFormaOcupacaoPredio = indicadorFormaOcupacaoPredio;
	}

	public String getIndicadorPredioCompartilhadoOoutraEscola() {

		return indicadorPredioCompartilhadoOoutraEscola;
	}

	public void setIndicadorPredioCompartilhadoOoutraEscola(String indicadorPredioCompartilhadoOoutraEscola) {
		this.indicadorPredioCompartilhadoOoutraEscola = indicadorPredioCompartilhadoOoutraEscola;
	}

	public Integer getCodigoInepEscolaPredioPompartilhado_01() {
		return codigoInepEscolaPredioPompartilhado_01;
	}

	public void setCodigoInepEscolaPredioPompartilhado_01(Integer codigoInepEscolaPredioPompartilhado_01) {
		this.codigoInepEscolaPredioPompartilhado_01 = codigoInepEscolaPredioPompartilhado_01;
	}

	public Integer getCodigoInepEscolaPredioPompartilhado_02() {
		return codigoInepEscolaPredioPompartilhado_02;
	}

	public void setCodigoInepEscolaPredioPompartilhado_02(Integer codigoInepEscolaPredioPompartilhado_02) {
		this.codigoInepEscolaPredioPompartilhado_02 = codigoInepEscolaPredioPompartilhado_02;
	}

	public Integer getCodigoInepEscolaPredioPompartilhado_03() {
		return codigoInepEscolaPredioPompartilhado_03;
	}

	public void setCodigoInepEscolaPredioPompartilhado_03(Integer codigoInepEscolaPredioPompartilhado_03) {
		this.codigoInepEscolaPredioPompartilhado_03 = codigoInepEscolaPredioPompartilhado_03;
	}

	public Integer getCodigoInepEscolaPredioPompartilhado_04() {
		return codigoInepEscolaPredioPompartilhado_04;
	}

	public void setCodigoInepEscolaPredioPompartilhado_04(Integer codigoInepEscolaPredioPompartilhado_04) {
		this.codigoInepEscolaPredioPompartilhado_04 = codigoInepEscolaPredioPompartilhado_04;
	}

	public Integer getCodigoInepEscolaPredioPompartilhado_05() {
		return codigoInepEscolaPredioPompartilhado_05;
	}

	public void setCodigoInepEscolaPredioPompartilhado_05(Integer codigoInepEscolaPredioPompartilhado_05) {
		this.codigoInepEscolaPredioPompartilhado_05 = codigoInepEscolaPredioPompartilhado_05;
	}

	public Integer getCodigoInepEscolaPredioPompartilhado_06() {
		return codigoInepEscolaPredioPompartilhado_06;
	}

	public void setCodigoInepEscolaPredioPompartilhado_06(Integer codigoInepEscolaPredioPompartilhado_06) {
		this.codigoInepEscolaPredioPompartilhado_06 = codigoInepEscolaPredioPompartilhado_06;
	}

	public String getIndicadorForneceAguaPotavelConsumoHumano() {
		return indicadorForneceAguaPotavelConsumoHumano;
	}

	public void setIndicadorForneceAguaPotavelConsumoHumano(String indicadorForneceAguaPotavelConsumoHumano) {
		this.indicadorForneceAguaPotavelConsumoHumano = indicadorForneceAguaPotavelConsumoHumano;
	}

	public String getIndicadorFormaAbastecimentoAguaRedePublica() {
		return indicadorFormaAbastecimentoAguaRedePublica;
	}

	public void setIndicadorFormaAbastecimentoAguaRedePublica(String indicadorFormaAbastecimentoAguaRedePublica) {
		this.indicadorFormaAbastecimentoAguaRedePublica = indicadorFormaAbastecimentoAguaRedePublica;
	}

	public String getIndicadorFormaAbastecimentoAguaPocoPublico() {
		return indicadorFormaAbastecimentoAguaPocoPublico;
	}

	public void setIndicadorFormaAbastecimentoAguaPocoPublico(String indicadorFormaAbastecimentoAguaPocoPublico) {
		this.indicadorFormaAbastecimentoAguaPocoPublico = indicadorFormaAbastecimentoAguaPocoPublico;
	}

	public String getIndicadorFormaFbastecimentoFguaFacimbaCisternaPoco() {
		return indicadorFormaFbastecimentoFguaFacimbaCisternaPoco;
	}

	public void setIndicadorFormaFbastecimentoFguaFacimbaCisternaPoco(
			String indicadorFormaFbastecimentoFguaFacimbaCisternaPoco) {
		this.indicadorFormaFbastecimentoFguaFacimbaCisternaPoco = indicadorFormaFbastecimentoFguaFacimbaCisternaPoco;
	}

	public String getIndicadorFormaAbastecimentoAguaFonteRioIgarapeRiacho_cor() {
		return indicadorFormaAbastecimentoAguaFonteRioIgarapeRiacho_cor;
	}

	public void setIndicadorFormaAbastecimentoAguaFonteRioIgarapeRiacho_cor(
			String indicadorFormaAbastecimentoAguaFonteRioIgarapeRiacho_cor) {
		this.indicadorFormaAbastecimentoAguaFonteRioIgarapeRiacho_cor = indicadorFormaAbastecimentoAguaFonteRioIgarapeRiacho_cor;
	}

	public String getIndicadorFormaAbastecimentoAguaAusente() {
		return indicadorFormaAbastecimentoAguaAusente;
	}

	public void setIndicadorFormaAbastecimentoAguaAusente(String indicadorFormaAbastecimentoAguaAusente) {
		this.indicadorFormaAbastecimentoAguaAusente = indicadorFormaAbastecimentoAguaAusente;
	}

	public String getIndicadorEependenciaExistenteBanheiro() {
		return indicadorEependenciaExistenteBanheiro;
	}

	public void setIndicadorEependenciaExistenteBanheiro(String indicadorEependenciaExistenteBanheiro) {
		this.indicadorEependenciaExistenteBanheiro = indicadorEependenciaExistenteBanheiro;
	}

	public String getIndicadorDependenciaExistenteBanheiroAcessivel() {
		return indicadorDependenciaExistenteBanheiroAcessivel;
	}

	public void setIndicadorDependenciaExistenteBanheiroAcessivel(
			String indicadorDependenciaExistenteBanheiroAcessivel) {
		this.indicadorDependenciaExistenteBanheiroAcessivel = indicadorDependenciaExistenteBanheiroAcessivel;
	}

	public String getIndicadorFonteEnergiaEletricaRedePublica() {
		return indicadorFonteEnergiaEletricaRedePublica;
	}

	public void setIndicadorFonteEnergiaEletricaRedePublica(String indicadorFonteEnergiaEletricaRedePublica) {
		this.indicadorFonteEnergiaEletricaRedePublica = indicadorFonteEnergiaEletricaRedePublica;
	}

	public String getIndicadorFonteEnergiaEletricaGeradorCombustivelFossil() {
		return indicadorFonteEnergiaEletricaGeradorCombustivelFossil;
	}

	public void setIndicadorFonteEnergiaEletricaGeradorCombustivelFossil(
			String indicadorFonteEnergiaEletricaGeradorCombustivelFossil) {
		this.indicadorFonteEnergiaEletricaGeradorCombustivelFossil = indicadorFonteEnergiaEletricaGeradorCombustivelFossil;
	}

	public String getIndicadorFonteEnergiaEletricaFontesRenovaveisAlternativas() {
		return indicadorFonteEnergiaEletricaFontesRenovaveisAlternativas;
	}

	public void setIndicadorFonteEnergiaEletricaFontesRenovaveisAlternativas(
			String indicadorFonteEnergiaEletricaFontesRenovaveisAlternativas) {
		this.indicadorFonteEnergiaEletricaFontesRenovaveisAlternativas = indicadorFonteEnergiaEletricaFontesRenovaveisAlternativas;
	}

	public String getIndicadorFonteEnergiaEletricaAusente() {
		return indicadorFonteEnergiaEletricaAusente;
	}

	public void setIndicadorFonteEnergiaEletricaAusente(String indicadorFonteEnergiaEletricaAusente) {
		this.indicadorFonteEnergiaEletricaAusente = indicadorFonteEnergiaEletricaAusente;
	}

	public String getIndicadorEsgotamentoSanitarioRedePublica() {
		return indicadorEsgotamentoSanitarioRedePublica;
	}

	public void setIndicadorEsgotamentoSanitarioRedePublica(String indicadorEsgotamentoSanitarioRedePublica) {
		this.indicadorEsgotamentoSanitarioRedePublica = indicadorEsgotamentoSanitarioRedePublica;
	}

	public String getIndicadorEsgotamentoSanitarioFossaSeptica() {
		return indicadorEsgotamentoSanitarioFossaSeptica;
	}

	public void setIndicadorEsgotamentoSanitarioFossaSeptica(String indicadorEsgotamentoSanitarioFossaSeptica) {
		this.indicadorEsgotamentoSanitarioFossaSeptica = indicadorEsgotamentoSanitarioFossaSeptica;
	}

	public String getIndicadorEsgotamentoSanitarioFossaRudimentarComum() {
		return indicadorEsgotamentoSanitarioFossaRudimentarComum;
	}

	public void setIndicadorEsgotamentoSanitarioFossaRudimentarComum(
			String indicadorEsgotamentoSanitarioFossaRudimentarComum) {
		this.indicadorEsgotamentoSanitarioFossaRudimentarComum = indicadorEsgotamentoSanitarioFossaRudimentarComum;
	}

	public String getIndicadorEsgotamentoSanitarioAusente() {
		return indicadorEsgotamentoSanitarioAusente;
	}

	public void setIndicadorEsgotamentoSanitarioAusente(String indicadorEsgotamentoSanitarioAusente) {
		this.indicadorEsgotamentoSanitarioAusente = indicadorEsgotamentoSanitarioAusente;
	}

	public String getIndicadorDestinacaoLixoServicoColeta() {
		return indicadorDestinacaoLixoServicoColeta;
	}

	public void setIndicadorDestinacaoLixoServicoColeta(String indicadorDestinacaoLixoServicoColeta) {
		this.indicadorDestinacaoLixoServicoColeta = indicadorDestinacaoLixoServicoColeta;
	}

	public String getIndicadorDestinacaoLixoQueima() {
		return indicadorDestinacaoLixoQueima;
	}

	public void setIndicadorDestinacaoLixoQueima(String indicadorDestinacaoLixoQueima) {
		this.indicadorDestinacaoLixoQueima = indicadorDestinacaoLixoQueima;
	}

	public String getIndicadorDestinacaoLixoEnterra() {
		return indicadorDestinacaoLixoEnterra;
	}

	public void setIndicadorDestinacaoLixoEnterra(String indicadorDestinacaoLixoEnterra) {
		this.indicadorDestinacaoLixoEnterra = indicadorDestinacaoLixoEnterra;
	}

	public String getIndicadorDestinacaoLixoLocalLicenciadoPoderPublico() {
		return indicadorDestinacaoLixoLocalLicenciadoPoderPublico;
	}

	public void setIndicadorDestinacaoLixoLocalLicenciadoPoderPublico(
			String indicadorDestinacaoLixoLocalLicenciadoPoderPublico) {
		this.indicadorDestinacaoLixoLocalLicenciadoPoderPublico = indicadorDestinacaoLixoLocalLicenciadoPoderPublico;
	}

	public String getIndicadorDestinacaoLixoOutraArea() {
		return indicadorDestinacaoLixoOutraArea;
	}

	public void setIndicadorDestinacaoLixoOutraArea(String indicadorDestinacaoLixoOutraArea) {
		this.indicadorDestinacaoLixoOutraArea = indicadorDestinacaoLixoOutraArea;
	}

	public String getIndicadorTratamentoLixoSeparacaoLixoResiduos() {
		return indicadorTratamentoLixoSeparacaoLixoResiduos;
	}

	public void setIndicadorTratamentoLixoSeparacaoLixoResiduos(String indicadorTratamentoLixoSeparacaoLixoResiduos) {
		this.indicadorTratamentoLixoSeparacaoLixoResiduos = indicadorTratamentoLixoSeparacaoLixoResiduos;
	}

	public String getIndicadorTratamentoLixoReaproveitamentoReutilizacao() {
		return indicadorTratamentoLixoReaproveitamentoReutilizacao;
	}

	public void setIndicadorTratamentoLixoReaproveitamentoReutilizacao(
			String indicadorTratamentoLixoReaproveitamentoReutilizacao) {
		this.indicadorTratamentoLixoReaproveitamentoReutilizacao = indicadorTratamentoLixoReaproveitamentoReutilizacao;
	}

	public String getIndicadorTratamentoLixoReciclagem() {
		return indicadorTratamentoLixoReciclagem;
	}

	public void setIndicadorTratamentoLixoReciclagem(String indicadorTratamentoLixoReciclagem) {
		this.indicadorTratamentoLixoReciclagem = indicadorTratamentoLixoReciclagem;
	}

	public String getIndicadorTratamentoAusente() {
		return indicadorTratamentoAusente;
	}

	public void setIndicadorTratamentoAusente(String indicadorTratamentoAusente) {
		this.indicadorTratamentoAusente = indicadorTratamentoAusente;
	}

	public String getIndicadorDependenciaExistenteAlmoxarifado() {
		return indicadorDependenciaExistenteAlmoxarifado;
	}

	public void setIndicadorDependenciaExistenteAlmoxarifado(String indicadorDependenciaExistenteAlmoxarifado) {
		this.indicadorDependenciaExistenteAlmoxarifado = indicadorDependenciaExistenteAlmoxarifado;
	}

	public String getIndicadorDependenciaExistenteAreaVerde() {
		return indicadorDependenciaExistenteAreaVerde;
	}

	public void setIndicadorDependenciaExistenteAreaVerde(String indicadorDependenciaExistenteAreaVerde) {
		this.indicadorDependenciaExistenteAreaVerde = indicadorDependenciaExistenteAreaVerde;
	}

	public String getIndicadorDependenciaExistenteAuditorio() {
		return indicadorDependenciaExistenteAuditorio;
	}

	public void setIndicadorDependenciaExistenteAuditorio(String indicadorDependenciaExistenteAuditorio) {
		this.indicadorDependenciaExistenteAuditorio = indicadorDependenciaExistenteAuditorio;
	}

	public String getIndicadorDependenciaExistenteBanheiroEducacaoInfantil() {
		return indicadorDependenciaExistenteBanheiroEducacaoInfantil;
	}

	public void setIndicadorDependenciaExistenteBanheiroEducacaoInfantil(
			String indicadorDependenciaExistenteBanheiroEducacaoInfantil) {
		this.indicadorDependenciaExistenteBanheiroEducacaoInfantil = indicadorDependenciaExistenteBanheiroEducacaoInfantil;
	}

	public String getIndicadorDependenciaExistenteBanheiroExclusivoFuncionario() {
		return indicadorDependenciaExistenteBanheiroExclusivoFuncionario;
	}

	public void setIndicadorDependenciaExistenteBanheiroExclusivoFuncionario(
			String indicadorDependenciaExistenteBanheiroExclusivoFuncionario) {
		this.indicadorDependenciaExistenteBanheiroExclusivoFuncionario = indicadorDependenciaExistenteBanheiroExclusivoFuncionario;
	}

	public String getIndicadorDependenciaExistenteBanheiroVestiarioComChuveiro() {
		return indicadorDependenciaExistenteBanheiroVestiarioComChuveiro;
	}

	public void setIndicadorDependenciaExistenteBanheiroVestiarioComChuveiro(
			String indicadorDependenciaExistenteBanheiroVestiarioComChuveiro) {
		this.indicadorDependenciaExistenteBanheiroVestiarioComChuveiro = indicadorDependenciaExistenteBanheiroVestiarioComChuveiro;
	}

	public String getIndicadorDependenciaExistenteBiblioteca() {
		return indicadorDependenciaExistenteBiblioteca;
	}

	public void setIndicadorDependenciaExistenteBiblioteca(String indicadorDependenciaExistenteBiblioteca) {
		this.indicadorDependenciaExistenteBiblioteca = indicadorDependenciaExistenteBiblioteca;
	}

	public String getIndicadorDependenciaExistenteCozinha() {
		return indicadorDependenciaExistenteCozinha;
	}

	public void setIndicadorDependenciaExistenteCozinha(String indicadorDependenciaExistenteCozinha) {
		this.indicadorDependenciaExistenteCozinha = indicadorDependenciaExistenteCozinha;
	}

	public String getIndicadorDependenciaExistenteDespensa() {
		return indicadorDependenciaExistenteDespensa;
	}

	public void setIndicadorDependenciaExistenteDespensa(String indicadorDependenciaExistenteDespensa) {
		this.indicadorDependenciaExistenteDespensa = indicadorDependenciaExistenteDespensa;
	}

	public String getIndicadorDependenciaExistenteDormitorioAluno() {
		return indicadorDependenciaExistenteDormitorioAluno;
	}

	public void setIndicadorDependenciaExistenteDormitorioAluno(String indicadorDependenciaExistenteDormitorioAluno) {
		this.indicadorDependenciaExistenteDormitorioAluno = indicadorDependenciaExistenteDormitorioAluno;
	}

	public String getIndicadorDependenciaExistenteDormitorioProfessor() {
		return indicadorDependenciaExistenteDormitorioProfessor;
	}

	public void setIndicadorDependenciaExistenteDormitorioProfessor(
			String indicadorDependenciaExistenteDormitorioProfessor) {
		this.indicadorDependenciaExistenteDormitorioProfessor = indicadorDependenciaExistenteDormitorioProfessor;
	}

	public String getIndicadorDependenciaExistenteLaboratorioCiencias() {
		return indicadorDependenciaExistenteLaboratorioCiencias;
	}

	public void setIndicadorDependenciaExistenteLaboratorioCiencias(
			String indicadorDependenciaExistenteLaboratorioCiencias) {
		this.indicadorDependenciaExistenteLaboratorioCiencias = indicadorDependenciaExistenteLaboratorioCiencias;
	}

	public String getIndicadorDependenciaExistenteLaboratorioInformatica() {
		return indicadorDependenciaExistenteLaboratorioInformatica;
	}

	public void setIndicadorDependenciaExistenteLaboratorioInformatica(
			String indicadorDependenciaExistenteLaboratorioInformatica) {
		this.indicadorDependenciaExistenteLaboratorioInformatica = indicadorDependenciaExistenteLaboratorioInformatica;
	}

	public String getIndicadorDependenciaExistenteParqueInfantil() {
		return indicadorDependenciaExistenteParqueInfantil;
	}

	public void setIndicadorDependenciaExistenteParqueInfantil(String indicadorDependenciaExistenteParqueInfantil) {
		this.indicadorDependenciaExistenteParqueInfantil = indicadorDependenciaExistenteParqueInfantil;
	}

	public String getIndicadorDependenciaExistentePatioCoberto() {
		return indicadorDependenciaExistentePatioCoberto;
	}

	public void setIndicadorDependenciaExistentePatioCoberto(String indicadorDependenciaExistentePatioCoberto) {
		this.indicadorDependenciaExistentePatioCoberto = indicadorDependenciaExistentePatioCoberto;
	}

	public String getIndicadorDependenciaExistentePatioDescoberto() {
		return indicadorDependenciaExistentePatioDescoberto;
	}

	public void setIndicadorDependenciaExistentePatioDescoberto(String indicadorDependenciaExistentePatioDescoberto) {
		this.indicadorDependenciaExistentePatioDescoberto = indicadorDependenciaExistentePatioDescoberto;
	}

	public String getIndicadorDependenciaExistentePiscina() {
		return indicadorDependenciaExistentePiscina;
	}

	public void setIndicadorDependenciaExistentePiscina(String indicadorDependenciaExistentePiscina) {
		this.indicadorDependenciaExistentePiscina = indicadorDependenciaExistentePiscina;
	}

	public String getIndicadorDependenciaExistenteQuadraEsporteCoberta() {
		return indicadorDependenciaExistenteQuadraEsporteCoberta;
	}

	public void setIndicadorDependenciaExistenteQuadraEsporteCoberta(
			String indicadorDependenciaExistenteQuadraEsporteCoberta) {
		this.indicadorDependenciaExistenteQuadraEsporteCoberta = indicadorDependenciaExistenteQuadraEsporteCoberta;
	}

	public String getIndicadorDependenciaExistenteQuadraEsporteDescoberta() {
		return indicadorDependenciaExistenteQuadraEsporteDescoberta;
	}

	public void setIndicadorDependenciaExistenteQuadraEsporteDescoberta(
			String indicadorDependenciaExistenteQuadraEsporteDescoberta) {
		this.indicadorDependenciaExistenteQuadraEsporteDescoberta = indicadorDependenciaExistenteQuadraEsporteDescoberta;
	}

	public String getIndicadorDependenciaExistenteRefeitorio() {
		return indicadorDependenciaExistenteRefeitorio;
	}

	public void setIndicadorDependenciaExistenteRefeitorio(String indicadorDependenciaExistenteRefeitorio) {
		this.indicadorDependenciaExistenteRefeitorio = indicadorDependenciaExistenteRefeitorio;
	}

	public String getIndicadorDependenciaExistenteSalaRepousoAluno() {
		return indicadorDependenciaExistenteSalaRepousoAluno;
	}

	public void setIndicadorDependenciaExistenteSalaRepousoAluno(String indicadorDependenciaExistenteSalaRepousoAluno) {
		this.indicadorDependenciaExistenteSalaRepousoAluno = indicadorDependenciaExistenteSalaRepousoAluno;
	}

	public String getIndicadorDependenciaExistenteSalaAtelieArte() {
		return indicadorDependenciaExistenteSalaAtelieArte;
	}

	public void setIndicadorDependenciaExistenteSalaAtelieArte(String indicadorDependenciaExistenteSalaAtelieArte) {
		this.indicadorDependenciaExistenteSalaAtelieArte = indicadorDependenciaExistenteSalaAtelieArte;
	}

	public String getIndicadorDependenciaExistenteSalaMusicaCoral() {
		return indicadorDependenciaExistenteSalaMusicaCoral;
	}

	public void setIndicadorDependenciaExistenteSalaMusicaCoral(String indicadorDependenciaExistenteSalaMusicaCoral) {
		this.indicadorDependenciaExistenteSalaMusicaCoral = indicadorDependenciaExistenteSalaMusicaCoral;
	}

	public String getIndicadorDependenciaExistenteSalaEstudioDanca() {
		return indicadorDependenciaExistenteSalaEstudioDanca;
	}

	public void setIndicadorDependenciaExistenteSalaEstudioDanca(String indicadorDependenciaExistenteSalaEstudioDanca) {
		this.indicadorDependenciaExistenteSalaEstudioDanca = indicadorDependenciaExistenteSalaEstudioDanca;
	}

	public String getIndicadorDependenciaExistenteSalaMultiuso() {
		return indicadorDependenciaExistenteSalaMultiuso;
	}

	public void setIndicadorDependenciaExistenteSalaMultiuso(String indicadorDependenciaExistenteSalaMultiuso) {
		this.indicadorDependenciaExistenteSalaMultiuso = indicadorDependenciaExistenteSalaMultiuso;
	}

	public String getIndicadorDependenciaExistenteTerreirao() {
		return indicadorDependenciaExistenteTerreirao;
	}

	public void setIndicadorDependenciaExistenteTerreirao(String indicadorDependenciaExistenteTerreirao) {
		this.indicadorDependenciaExistenteTerreirao = indicadorDependenciaExistenteTerreirao;
	}

	public String getIndicadorDependenciaExistenteViveiro() {
		return indicadorDependenciaExistenteViveiro;
	}

	public void setIndicadorDependenciaExistenteViveiro(String indicadorDependenciaExistenteViveiro) {
		this.indicadorDependenciaExistenteViveiro = indicadorDependenciaExistenteViveiro;
	}

	public String getIndicadorDependenciaExistenteSalaDiretoria() {
		return indicadorDependenciaExistenteSalaDiretoria;
	}

	public void setIndicadorDependenciaExistenteSalaDiretoria(String indicadorDependenciaExistenteSalaDiretoria) {
		this.indicadorDependenciaExistenteSalaDiretoria = indicadorDependenciaExistenteSalaDiretoria;
	}

	public String getIndicadorDependenciaExistenteSalaLeitura() {
		return indicadorDependenciaExistenteSalaLeitura;
	}

	public void setIndicadorDependenciaExistenteSalaLeitura(String indicadorDependenciaExistenteSalaLeitura) {
		this.indicadorDependenciaExistenteSalaLeitura = indicadorDependenciaExistenteSalaLeitura;
	}

	public String getIndicadorDependenciaExistenteSalaProfessores() {
		return indicadorDependenciaExistenteSalaProfessores;
	}

	public void setIndicadorDependenciaExistenteSalaProfessores(String indicadorDependenciaExistenteSalaProfessores) {
		this.indicadorDependenciaExistenteSalaProfessores = indicadorDependenciaExistenteSalaProfessores;
	}

	public String getIndicadorDependenciaExistenteSalaRecursosMultifuncionais() {
		return indicadorDependenciaExistenteSalaRecursosMultifuncionais;
	}

	public void setIndicadorDependenciaExistenteSalaRecursosMultifuncionais(
			String indicadorDependenciaExistenteSalaRecursosMultifuncionais) {
		this.indicadorDependenciaExistenteSalaRecursosMultifuncionais = indicadorDependenciaExistenteSalaRecursosMultifuncionais;
	}

	public String getIndicadorDependenciaExistenteSalaSecretaria() {
		return indicadorDependenciaExistenteSalaSecretaria;
	}

	public void setIndicadorDependenciaExistenteSalaSecretaria(String indicadorDependenciaExistenteSalaSecretaria) {
		this.indicadorDependenciaExistenteSalaSecretaria = indicadorDependenciaExistenteSalaSecretaria;
	}

	public String getIndicadorDependenciaExistenteAusente() {
		return indicadorDependenciaExistenteAusente;
	}

	public void setIndicadorDependenciaExistenteAusente(String indicadorDependenciaExistenteAusente) {
		this.indicadorDependenciaExistenteAusente = indicadorDependenciaExistenteAusente;
	}

	public String getIndicadorRecursosAcessibilidadeCorrimaoGuardaCorpo() {
		return indicadorRecursosAcessibilidadeCorrimaoGuardaCorpo;
	}

	public void setIndicadorRecursosAcessibilidadeCorrimaoGuardaCorpo(
			String indicadorRecursosAcessibilidadeCorrimaoGuardaCorpo) {
		this.indicadorRecursosAcessibilidadeCorrimaoGuardaCorpo = indicadorRecursosAcessibilidadeCorrimaoGuardaCorpo;
	}

	public String getIndicadorRecursosAcessibilidadeElevador() {
		return indicadorRecursosAcessibilidadeElevador;
	}

	public void setIndicadorRecursosAcessibilidadeElevador(String indicadorRecursosAcessibilidadeElevador) {
		this.indicadorRecursosAcessibilidadeElevador = indicadorRecursosAcessibilidadeElevador;
	}

	public String getIndicadorRecursosAcessibilidadePisoTatil() {
		return indicadorRecursosAcessibilidadePisoTatil;
	}

	public void setIndicadorRecursosAcessibilidadePisoTatil(String indicadorRecursosAcessibilidadePisoTatil) {
		this.indicadorRecursosAcessibilidadePisoTatil = indicadorRecursosAcessibilidadePisoTatil;
	}

	public String getIndicadorRecursosAcessibilidadePortaVaoLivre() {
		return indicadorRecursosAcessibilidadePortaVaoLivre;
	}

	public void setIndicadorRecursosAcessibilidadePortaVaoLivre(String indicadorRecursosAcessibilidadePortaVaoLivre) {
		this.indicadorRecursosAcessibilidadePortaVaoLivre = indicadorRecursosAcessibilidadePortaVaoLivre;
	}

	public String getIndicadorRecursosAcessibilidadeRampa() {
		return indicadorRecursosAcessibilidadeRampa;
	}

	public void setIndicadorRecursosAcessibilidadeRampa(String indicadorRecursosAcessibilidadeRampa) {
		this.indicadorRecursosAcessibilidadeRampa = indicadorRecursosAcessibilidadeRampa;
	}

	public String getIndicadorRecursosAcessibilidadeSinalizacaoSonora() {
		return indicadorRecursosAcessibilidadeSinalizacaoSonora;
	}

	public void setIndicadorRecursosAcessibilidadeSinalizacaoSonora(
			String indicadorRecursosAcessibilidadeSinalizacaoSonora) {
		this.indicadorRecursosAcessibilidadeSinalizacaoSonora = indicadorRecursosAcessibilidadeSinalizacaoSonora;
	}

	public String getIndicadorRecursosAcessibilidadeSinalizacaoTatil() {
		return indicadorRecursosAcessibilidadeSinalizacaoTatil;
	}

	public void setIndicadorRecursosAcessibilidadeSinalizacaoTatil(
			String indicadorRecursosAcessibilidadeSinalizacaoTatil) {
		this.indicadorRecursosAcessibilidadeSinalizacaoTatil = indicadorRecursosAcessibilidadeSinalizacaoTatil;
	}

	public String getIndicadorRecursosAcessibilidadeSinalizacaoVisual() {
		return indicadorRecursosAcessibilidadeSinalizacaoVisual;
	}

	public void setIndicadorRecursosAcessibilidadeSinalizacaoVisual(
			String indicadorRecursosAcessibilidadeSinalizacaoVisual) {
		this.indicadorRecursosAcessibilidadeSinalizacaoVisual = indicadorRecursosAcessibilidadeSinalizacaoVisual;
	}

	public String getIndicadorRecursosAcessibilidadeAusente() {
		return indicadorRecursosAcessibilidadeAusente;
	}

	public void setIndicadorRecursosAcessibilidadeAusente(String indicadorRecursosAcessibilidadeAusente) {
		this.indicadorRecursosAcessibilidadeAusente = indicadorRecursosAcessibilidadeAusente;
	}

	public Integer getQuantidadeSalaUtilizadaEscolaDentroPredio() {
		return quantidadeSalaUtilizadaEscolaDentroPredio;
	}

	public void setQuantidadeSalaUtilizadaEscolaDentroPredio(Integer quantidadeSalaUtilizadaEscolaDentroPredio) {
		this.quantidadeSalaUtilizadaEscolaDentroPredio = quantidadeSalaUtilizadaEscolaDentroPredio;
	}

	public Integer getQuantidadeSalaUtilizadaEscolaForaPredio() {
		return quantidadeSalaUtilizadaEscolaForaPredio;
	}

	public void setQuantidadeSalaUtilizadaEscolaForaPredio(Integer quantidadeSalaUtilizadaEscolaForaPredio) {
		this.quantidadeSalaUtilizadaEscolaForaPredio = quantidadeSalaUtilizadaEscolaForaPredio;
	}

	public Integer getQuantidadeSalaClimatizada() {
		return quantidadeSalaClimatizada;
	}

	public void setQuantidadeSalaClimatizada(Integer quantidadeSalaClimatizada) {
		this.quantidadeSalaClimatizada = quantidadeSalaClimatizada;
	}

	public Integer getQuantidadeSalaComAcessibilidade() {
		return quantidadeSalaComAcessibilidade;
	}

	public void setQuantidadeSalaComAcessibilidade(Integer quantidadeSalaComAcessibilidade) {
		this.quantidadeSalaComAcessibilidade = quantidadeSalaComAcessibilidade;
	}

	public String getIndicadorEspacoCedidoBrasilAlfabetizado() {
		return indicadorEspacoCedidoBrasilAlfabetizado;
	}
	
	public String IndicadorEspacoCedidoBrasilAlfabetizado(String entrada) {
		
		switch(entrada) {
		  case "-Sim-":
			  indicadorEspacoCedidoBrasilAlfabetizado = "S";
		    break;  
		  case "-Não-":
			  indicadorEspacoCedidoBrasilAlfabetizado = "N";
		    break;  
		}
		return indicadorEspacoCedidoBrasilAlfabetizado;
	
	}

	public void setIndicadorEspacoCedidoBrasilAlfabetizado(String indicadorEspacoCedidoBrasilAlfabetizado) {
		this.indicadorEspacoCedidoBrasilAlfabetizado = indicadorEspacoCedidoBrasilAlfabetizado;
	}

	public String getIndicadorEscolaAbreFinaisSemanaComunidade() {
		return indicadorEscolaAbreFinaisSemanaComunidade;
	}
	
	public String getIndicadorEscolaAbreFinaisSemanaComunidade(String entrada) {
		
		switch(entrada) {
		  case "-Sim-":
			  indicadorEscolaAbreFinaisSemanaComunidade = "S";
		    break;  
		  case "-Não-":
			  indicadorEscolaAbreFinaisSemanaComunidade = "N";
		    break;  
		}
		return indicadorEscolaAbreFinaisSemanaComunidade;
	}

	public void setIndicadorEscolaAbreFinaisSemanaComunidade(String indicadorEscolaAbreFinaisSemanaComunidade) {
		this.indicadorEscolaAbreFinaisSemanaComunidade = indicadorEscolaAbreFinaisSemanaComunidade;
	}

	public String getIndicadorEscolaPropostaPedagogicaFormacaoPorAlternancia() {

		return indicadorEscolaPropostaPedagogicaFormacaoPorAlternancia;
	}

	
	
	public String getIndicadorEscolaPropostaPedagogicaFormacaoPorAlternancia(String entrada) {
		
		switch(entrada) {
		  case "-Sim-":
			  indicadorEscolaPropostaPedagogicaFormacaoPorAlternancia = "S";
		    break;  
		  case "-Não-":
			  indicadorEscolaPropostaPedagogicaFormacaoPorAlternancia = "N";
		    break;  
		}
		return indicadorEscolaPropostaPedagogicaFormacaoPorAlternancia;
	}
	
	
	public void setIndicadorEscolaPropostaPedagogicaFormacaoPorAlternancia(
			String indicadorEscolaPropostaPedagogicaFormacaoPorAlternancia) {

		this.indicadorEscolaPropostaPedagogicaFormacaoPorAlternancia = indicadorEscolaPropostaPedagogicaFormacaoPorAlternancia;
	}

	public String getIndicadorLocalizacaoDiferenciadaEscola() {
		return indicadorLocalizacaoDiferenciadaEscola;
	}

	public void setIndicadorLocalizacaoDiferenciadaEscola(String indicadorLocalizacaoDiferenciadaEscola) {
		this.indicadorLocalizacaoDiferenciadaEscola = indicadorLocalizacaoDiferenciadaEscola;
	}

	public String getIndicadorOrgaoVinculoEscolaSecretariaMinisterioEducacao() {
		return indicadorOrgaoVinculoEscolaSecretariaMinisterioEducacao;
	}

	public void setIndicadorOrgaoVinculoEscolaSecretariaMinisterioEducacao(
			String indicadorOrgaoVinculoEscolaSecretariaMinisterioEducacao) {
		this.indicadorOrgaoVinculoEscolaSecretariaMinisterioEducacao = indicadorOrgaoVinculoEscolaSecretariaMinisterioEducacao;
	}

	public String getIndicadorOrgaoVinculoEscolaSecretariaSegurancaForcasArma() {
		return indicadorOrgaoVinculoEscolaSecretariaSegurancaForcasArma;
	}

	public void setIndicadorOrgaoVinculoEscolaSecretariaSegurancaForcasArma(
			String indicadorOrgaoVinculoEscolaSecretariaSegurancaForcasArma) {
		this.indicadorOrgaoVinculoEscolaSecretariaSegurancaForcasArma = indicadorOrgaoVinculoEscolaSecretariaSegurancaForcasArma;
	}

	public String getIndicadorOrgaoVinculoEscolaSecretariaMinisterioSaude() {
		return indicadorOrgaoVinculoEscolaSecretariaMinisterioSaude;
	}

	public void setIndicadorOrgaoVinculoEscolaSecretariaMinisterioSaude(
			String indicadorOrgaoVinculoEscolaSecretariaMinisterioSaude) {
		this.indicadorOrgaoVinculoEscolaSecretariaMinisterioSaude = indicadorOrgaoVinculoEscolaSecretariaMinisterioSaude;
	}

	public String getIndicadorOrgaoVinculoOutroOrgao() {
		return indicadorOrgaoVinculoOutroOrgao;
	}

	public void setIndicadorOrgaoVinculoOutroOrgao(String indicadorOrgaoVinculoOutroOrgao) {
		this.indicadorOrgaoVinculoOutroOrgao = indicadorOrgaoVinculoOutroOrgao;
	}

	public String getIndicadorCategoriaEscola() {
		return indicadorCategoriaEscola;
	}

	public void setIndicadorCategoriaEscola(String indicadorCategoriaEscola) {
		this.indicadorCategoriaEscola = indicadorCategoriaEscola;
	}

	public String getIndicadorConvenioPoderPublico() {
		return indicadorConvenioPoderPublico;
	}
	
	public String getIndicadorConvenioPoderPublico(String entrada) {
		
		switch(entrada) {
		  case "-Sim-":
			  indicadorConvenioPoderPublico = "S";
		    break;  
		  case "-Não-":
			  indicadorConvenioPoderPublico = "N";
		    break;  
		}
		
		return indicadorConvenioPoderPublico;
	}

	public void setIndicadorConvenioPoderPublico(String indicadorConvenioPoderPublico) {
		this.indicadorConvenioPoderPublico = indicadorConvenioPoderPublico;
	}

	public String getIndicadorMantenedoraEscolaPrivadaEmpresaPrivadaGrupoEmpr() {
		return indicadorMantenedoraEscolaPrivadaEmpresaPrivadaGrupoEmpr;
	}

	public void setIndicadorMantenedoraEscolaPrivadaEmpresaPrivadaGrupoEmpr(
			String indicadorMantenedoraEscolaPrivadaEmpresaPrivadaGrupoEmpr) {
		this.indicadorMantenedoraEscolaPrivadaEmpresaPrivadaGrupoEmpr = indicadorMantenedoraEscolaPrivadaEmpresaPrivadaGrupoEmpr;
	}

	public String getIndicadorMantenedoraEscolaPrivadaInstituicoesSemFinsLucr() {
		return indicadorMantenedoraEscolaPrivadaInstituicoesSemFinsLucr;
	}

	public void setIndicadorMantenedoraEscolaPrivadaInstituicoesSemFinsLucr(
			String indicadorMantenedoraEscolaPrivadaInstituicoesSemFinsLucr) {
		this.indicadorMantenedoraEscolaPrivadaInstituicoesSemFinsLucr = indicadorMantenedoraEscolaPrivadaInstituicoesSemFinsLucr;
	}

	public String getIndicadorMantenedoraEscolaPrivadaOrganizacaoNaoGovernamen() {
		return indicadorMantenedoraEscolaPrivadaOrganizacaoNaoGovernamen;
	}

	public void setIndicadorMantenedoraEscolaPrivadaOrganizacaoNaoGovernamen(
			String indicadorMantenedoraEscolaPrivadaOrganizacaoNaoGovernamen) {
		this.indicadorMantenedoraEscolaPrivadaOrganizacaoNaoGovernamen = indicadorMantenedoraEscolaPrivadaOrganizacaoNaoGovernamen;
	}

	public String getIndicadorMantenedoraEscolaPrivadaOrganizacaoDaSociedadeC() {
		return indicadorMantenedoraEscolaPrivadaOrganizacaoDaSociedadeC;
	}

	public void setIndicadorMantenedoraEscolaPrivadaOrganizacaoDaSociedadeC(
			String indicadorMantenedoraEscolaPrivadaOrganizacaoDaSociedadeC) {
		this.indicadorMantenedoraEscolaPrivadaOrganizacaoDaSociedadeC = indicadorMantenedoraEscolaPrivadaOrganizacaoDaSociedadeC;
	}

	public String getIndicadorMantenedoraEscolaPrivadaSindicatoTrabalhadoresPa() {
		return indicadorMantenedoraEscolaPrivadaSindicatoTrabalhadoresPa;
	}

	public void setIndicadorMantenedoraEscolaPrivadaSindicatoTrabalhadoresPa(
			String indicadorMantenedoraEscolaPrivadaSindicatoTrabalhadoresPa) {
		this.indicadorMantenedoraEscolaPrivadaSindicatoTrabalhadoresPa = indicadorMantenedoraEscolaPrivadaSindicatoTrabalhadoresPa;
	}

	public String getIndicadorMantenedoraEscolaPrivadaSistemaS() {
		return indicadorMantenedoraEscolaPrivadaSistemaS;
	}

	public void setIndicadorMantenedoraEscolaPrivadaSistemaS(String indicadorMantenedoraEscolaPrivadaSistemaS) {
		this.indicadorMantenedoraEscolaPrivadaSistemaS = indicadorMantenedoraEscolaPrivadaSistemaS;
	}

	public String getIndicadorEsferaAdministrativaConselhoRegulamentacaoutoriz() {
		return indicadorEsferaAdministrativaConselhoRegulamentacaoutoriz;
	}

	public void setIndicadorEsferaAdministrativaConselhoRegulamentacaoutoriz(
			String indicadorEsferaAdministrativaConselhoRegulamentacaoutoriz) {
		this.indicadorEsferaAdministrativaConselhoRegulamentacaoutoriz = indicadorEsferaAdministrativaConselhoRegulamentacaoutoriz;
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

	public LocalDate getDataAtualizacaoRegistroTabela() {
		return dataAtualizacaoRegistroTabela;
	}

	public void setDataAtualizacaoRegistroTabela(LocalDate dataAtualizacaoRegistroTabela) {
		this.dataAtualizacaoRegistroTabela = dataAtualizacaoRegistroTabela;
	}

	public Integer getUsuarioAtualizacaoRegistroTabela() {
		return usuarioAtualizacaoRegistroTabela;
	}

	public void setUsuarioAtualizacaoRegistroTabela(Integer usuarioAtualizacaoRegistroTabela) {
		this.usuarioAtualizacaoRegistroTabela = usuarioAtualizacaoRegistroTabela;
	}

}
