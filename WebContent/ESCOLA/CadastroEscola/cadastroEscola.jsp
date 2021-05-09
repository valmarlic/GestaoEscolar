<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt_BR">
<head>
<meta http-equiv="Content-Type" content="text/html" charset=UTF-8>

<link rel="stylesheet" href="cadastroescola.css">
<script src="https://use.fontawesome.com/62e43a72a9.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script>
	function hablilitarcampo(campo01) {
		campo01.nextElementSibling.disabled = !campo01.checked;
	}
</script>
<!-- Comentários  -->

<title>Escola</title>
</head>
<body>
	<h2>
		<c:out value="${mensagem}" />
	</h2>
	<nav class="nav_tabs">
	<ul>
		<li><input type="radio" id="tab1" class="rd_tab" name="tabs"
			checked> <label for="tab1" class="tab_label">DADOS
				GERAIS</label>
			<div class="tab-content">
				<div class="divisoria">
					<div class="quadro1-inf-gerais">
						<section class="titulo1"> Informaaçõesµes Gerais: </section>

						<form method="POST"
							action="/gestaoEscolar/gestaoEscolaDadosGeraisServlet">
							<input type="hidden" name="acao" value="CREATE" />

							<table style="width: 100%">

								<tr>
									<td>Secretaria: Secretaria municipal de educação:</td>
									<td><strong>Secretaria municipal de educação -
											São Luis</strong></td>
									<td>Sigla:</td>
									<td>SEMED</td>

									<td>Sigla:</td>
									<td>PMSL</td>
								</tr>
								<td>Codigo INEP:</td>
								<td><input type="numero" name="codInepEscola"
									value="${fornecedor.codInepEscola}" /></td>

								<td>Tipo:</td>
								<td><select name="tipoPoloAnexo"
									value="${fornecedor.tipoPoloAnexo}">
										<option>Polo</option>
										<option>Anexo</option>
								</select></td>

								<td>Núcleo:</td>
								<td><input type="numero" name="nucleo"
									value="${fornecedor.nucleo}"></td>
								</tr>

								<tr>
									<td>Nome da Escola:</td>
									<td><input type="text" name="nomeEscola"
										value="${fornecedor.nomeEscola}" /></td>

									<td>Dependência Administrativa:</td>
									<td><input name="indcdorDpciaAdmtvaEscola"
										value="${fornecedor.indcdorDpciaAdmtvaEscola}" /></td>
									<td>Cód Usuário:</td>
									<td><input type="numero"
										name="usuarioCriacaoRgistroTabela"
										value="${fornecedor.usuarioCriacaoRgistroTabela}"></td>

								</tr>


								<tr>
									<td>CNPJ da unidade:</td>
									<td><input type="text" name="cnpjEntidade"
										value="${fornecedor.cnpjEntidade}"></td>
									<td>Regulamentação/Autorização:</td>
									<td><input type="numero"
										name="indcdorReglantcaAutrzcaoEscola"
										value="${fornecedor.indcdorReglantcaAutrzcaoEscola}" /></td>
									<td>Cód Escola Polo:</td>
									<td><input type="numero" name="codEscolaPolo"
										value="${fornecedor.codEscolaPolo}"></td>

								</tr>
								<tr>
									<td>Data de registro:</td>
									<td><input type="date" name="dataCriacaoRegistroTabela"
										value="${fornecedor.dataCriacaoRegistroTabela}" /></td>
									<td>Estatus escola:</td>
									<td><input type="numero" name="codStatusEscola"
										value="${fornecedor.codStatusEscola}" /></td>
								</tr>
								<tr>
									<td>Situação de Funcionamento:</td>
									<td><select name="situcaoInstitucional"
										value="${fornecedor.situcaoInstitucional}">
											<option>-Selecione-</option>
											<option>Em funcionamento</option>
											<option>Paralisada</option>
											<option>Extinta</option>
									</select></td>
									<td>Escola Polo:</td>
									<td><input type="text" name="indicadorEscolaPolo"
										value="${fornecedor.indicadorEscolaPolo}" /></td>
								</tr>
								<tr>
									<td>Zona:</td>
									<td><input type="numero" name="zonaLoclizcaoEscola"
										value="${fornecedor.zonaLoclizcaoEscola}" /></td>

									<td>Escola anexo:</td>
									<td><input type="text" name="indicadorEscolaAnexo"
										value="${fornecedor.indicadorEscolaAnexo}"></td>


								</tr>
							</table>
					</div>
				</div>
				<div class="divisoria">
					<div class="quadro-endereco">
						<section class="titulo1"> Endereço </section>

						<table style="width: 100%">
							<tr>
								<td>CEP:</td>
								<td><input name="cepEscola" value="${fornecedor.cepEscola}"></td>
								<td>Distrito:</td>
								<td><input name="distrito" value="${fornecedor.distrito}"></td>
								<td>UF:</td>
								<td><input name="uf" value="${fornecedor.uf}"></td>

								<td>Longitude</td>
								<td><input type="text" name="longtudeEndEscola"
									value="${fornecedor.longtudeEndEscola}"></td>
							</tr>
							<tr>
								<td>Logradouro/Rua:</td>
								<td><input name="enderecoEscola"
									value="${fornecedor.enderecoEscola}"></td>
								<td>Número:</td>
								<td><input name="numeroEscola"
									value="${fornecedor.numeroEscola}"></td>
								<td>Latitude</td>
								<td><input type="text" name="latitudeEndEscola"
									value="${fornecedor.latitudeEndEscola}"></td>
							</tr>
							<tr>
								<td>Complemento:</td>
								<td><input name="complentEndercoEscola"
									value="${fornecedor.complentEndercoEscola}"></td>

								<td>Bairro:</td>
								<td><input name="bairroEscola"
									value="${fornecedor.bairroEscola}"></td>


								<td>E-mail institucional:</td>
								<td><input name="emailInstcnalEscola"
									value="${fornecedor.emailInstcnalEscola}"></td>

							</tr>
							<tr>
								<td>Município:</td>
								<td><input name="municipio" value="${fornecedor.municipio}"></td>
							</tr>

						</table>


					</div>
				</div>
				<div class="divisoria">
					<div class="quadro-contato">
						<section class="titulo1"> Contato </section>

						<table style="width: 100%">
							<tr>
								<td>Telefone Fixo::</td>
								<td><input name="telefoneEscola"
									value="${fornecedor.telefoneEscola}"></td>
								<td>Fax:</td>
								<td><input name="faxContato"
									value="${fornecedor.faxContato}"></td>
							</tr>
							<tr>
								<td>Telefone Celular:</td>
								<td><input name="telefoneCelelar"
									value="${fornecedor.telefoneCelelar}"></td>
								<td>Número contato:</td>
								<td><input name="numeroContato"
									value="${fornecedor.numeroContato}"></td>
							</tr>
							<tr>
						</table>

						<input type="submit" value="Enviar" />
						</form>
					</div>
				</div>

				<br>

			</div></li>


		<li><input type="radio" name="tabs" class="rd_tab" id="tab2">
			<label for="tab2" class="tab_label">DADOS DOS GESTORES</label>
			<div class="tab-content">
				<div class="divisoria">
					<div class="quadro1-inf-gerais">
						<section class="titulo3"> Diretor Geral: </section>

						<form action="/gestaoEscolar/gestaoEscolasrDadosGestoresServlet">
							<input type="hidden" name="acao1" value="CREATE1" />
							<table style="width: 100%">
								<tr>
									<td>Nome do Diretor:</td>
									<td><input size="50" name="nomeDiretorGeral"
										value="${fornecedorGestores.nomeDiretorGeral}"></td>

									<td>Email:</td>
									<td><input name="emailDiretorGeral"
										value="${fornecedorGestores.emailDiretorGeral}"></td>
								</tr>
								<tr>
									<td>CPF do Diretor:</td>
									<td><input name="cpfDiretorGeral"
										value="${fornecedorGestores.cpfDiretorGeral}"></td>
									<td>Situação Funcional:</td>
									<td><select name="situacaoFuncDiretorGeral"
										value="${fornecedorGestores.situacaoFuncDiretorGera}">
											<option>- Selecione -</option>
											<option>1- Concursado/Efetivo/Estável</option>
											<option>2- Contrato temporário</option>
											<option>3- Contrato terceirizado</option>
											<option>4- Contrato CLT</option>
									</select></td>
								</tr>
								<tr>
								</tr>
								<tr>
									<td>Critério de acesso ao cargo/função:</td>
									<td><select name="criterioAcessoDgeral"
										value="${fornecedorGestores.criterioAcessoDgeral}">
											<option>- Selecione -</option>
											<option>1- Exclusivamente por indicação/escolha da
												gestÃ£o</option>
											<option>2- Processo seletivo qualificado e
												escolha/nomeação da gestão</option>
											<option>3- Concurso público específico para o cargo
												de gestor escolar</option>
											<option>4- Exclusivamente por processo eleitoral com
												participação da comunidade escolar</option>
											<option>5- Processo seletivo qualificado e eleição
												com a participapação da comunidade escolar</option>
											<option>6- Outros</option>
									</select></td>
									<td>Data de cadastro:</td>
									<td><input type="date" name="dataCadastral"
										value="${fornecedorGestores.dataCadastral}" /></td>
								</tr>
							</table>
							<input type="submit" value="Enviar" />
						</form>


						<form action="/gestaoEscolar/GestaoEscolasrDiretorAdjuntoServlet">
							<input type="hidden" name="acao3" value="CREATE3" />

							<section class="titulo2"> Diretor Adjunto: </section>
							<table style="width: 100%">
								<tr>
									<td>Nome do Diretor Adjunto:</td>
									<td><input size="50" name="nomeDiretorAdjunto"
										value="${fornecedor.nomeDiretorAdjunto}"></td>
									<td>Email:</td>
									<td><input type="text" name="emailDiretorAdjunto"
										value="${fornecedor.emailDiretorAdjunto}"></td>
								</tr>
								<tr>
									<td>CPF do Diretor Adjunto:</td>
									<td><input type="text" name="cpfDiretorAdjunto"
										value="${fornecedor.cpfDiretorAdjunto}"></td>
									<td>Situação Funcional:</td>
									<td><select name="situacaoFuncDiretorAdjunto"
										value="${fornecedor.situacaoFuncDiretorAdjunto}">
											<option>- selecione -</option>
											<option>1- Concursado/Efetivo/Estável</option>
											<option>2- Contrato temporário</option>
											<option>3- Contrato terceirizado</option>
											<option>4- Contrato CLT</option>
									</select></td>
								</tr>
								<tr>
								</tr>
								<tr>
									<td>Critério de acesso ao cargo/função:</td>
									<td><select name="criterioAcessoDretAdjunto"
										value="${fornecedor.criterioAcessoDretAdjunto}">
											<option>- selecione -</option>
											<option>1- Exclusivamente por indicação/escolha da
												gestão</option>
											<option>2- Processo seletivo qualificado e
												escolha/nomeaçãoo da gestão</option>
											<option>3- Concurso público específico para o cargo
												de gestor escolar</option>
											<option>4- Exclusivamente por processo eleitoral com
												participação da comunidade escolar</option>
											<option>5- Processo seletivo qualificado e eleição
												com a participaçãoo da comunidade escolar</option>
											<option>6- Outros</option>
									</select></td>
									<td>Data de cadastro:</td>
									<td><input type="date" name="dataCadrstralDirAdjunto"
										value="${fornecedor.dataCadrstralDirAdjunto}" /></td>

								</tr>
							</table>
							<input type="submit" value="Enviar" />
						</form>

						<form
							action="/gestaoEscolar/GestaoEscolarCoordorPedagogicoServlet">
							<input type="hidden" name="acao4" value="CREATE4" />


							<section class="titulo2"> Coordenador Pedagógico: </section>
							<table style="width: 100%">
								<tr>
									<td>Nome do Coordenador:</td>
									<td><input size="50" name="nomeCoordPedagogico"
										value="${fornecedor.nomeCoordPedagogico}"></td>
									<td>Situação Funcional:</td>
									<td><select name="situacaoFuncionalCoordPedagogico"
										value="${fornecedor.situacaoFuncionalCoordPedagogico}">
											<option>- selecione -</option>
											<option>1- Concursado/Efetivo/Esttável</option>
											<option>2- Contrato temporário</option>
											<option>3- Contrato terceirizado</option>
											<option>4- Contrato CLT</option>
									</select></td>
								</tr>
								<tr>
									<td>CPF do Coordenador:</td>
									<td><input type="text" name="cpfCoordPedagogico"
										value="${fornecedor.cpfCoordPedagogico}"></td>
									<td>Carga horária:</td>
									<td><input size="3" name="cargaHorariaCoordPedagogico"
										value="${fornecedor.cargaHorariaCoordPedagogico}"></td>
								</tr>
								<tr>
									<td>Email:</td>
									<td><input type="text" name="emailCoordPedagogico"
										value="${fornecedor.emailCoordPedagogico}"></td>
									<td>Turno:</td>
									<td><select name="turnoCoordPedagogico"
										value="${fornecedor.turnoCoordPedagogico}">
											<option>- Selecione -</option>
											<option>-Matutino-</option>
											<option>-Vespertino</option>
											<option>-Noturno</option>
											<option>-Integral</option>
									</select></td>
								</tr>
								<tr>
									<td>Critério de acesso ao cargo/função:</td>
									<td><select name="criterioAcessoCoordCFunCordPedgco"
										value="${fornecedor.criterioAcessoCoordCFunCordPedgco}">
											<option>- selecione -</option>
											<option>1- Exclusivamente por indicação/escolha da
												gestão</option>
											<option>2- Processo seletivo qualificado e
												escolha/nomeação da gestão</option>
											<option>3- Concurso públicoblico específico para o
												cargo de gestor escolar</option>
											<option>4- Exclusivamente por processo eleitoral com
												participação da comunidade escolar</option>
											<option>5- Processo seletivo qualificado e eleição
												com a participação da comunidade escolar</option>
											<option>6- Outros</option>
									</select></td>
									<td>Data de cadastro:</td>
									<td><input type="date" name="dataCadrstralCoordPedagogico"
										value="${fornecedorGestores.dataCadrstralCoordPedagogico}" /></td>
								</tr>
							</table>

							<input type="submit" value="Enviar" />
						</form>
						<!-- CoordenadorDeAnexo  -->

						<form
							action="/gestaoEscolar/GestaoEscolarCoordenadorDeAnexoServlet">
							<input type="hidden" name="acao5" value="CREATE5" />

							<section class="titulo2"> Coordenador de Anexo: </section>
							<table style="width: 100%">
								<tr>
									<td>Nome do Coordenador de Anexo:</td>
									<td><input size="50" name="nomeCoordDeAnexo"
										value="${fornecedor.nomeCoordDeAnexo}"></td>
									<td>Situação Funcional:</td>
									<td><select name="situacaoFuncionalCoordDeAnexo"
										value="${fornecedor.situacaoFuncionalCoordDeAnexo}">
											<option>- selecione -</option>
											<option>1- Concursado/Efetivo/Estável</option>
											<option>2- Contrato temporário</option>
											<option>3- Contrato terceirizado</option>
											<option>4- Contrato CLT</option>
									</select></td>
								</tr>
								<tr>
									<td>CPF do Coordenador de Anexo:</td>
									<td><input type="text" name="cpfCoordDeAnexo"
										value="${fornecedor.cpfCoordDeAnexo}"></td>
									<td>Carga horária:</td>
									<td><input size="3" type="text"
										name="cargaHorariaCoordDeAnexo"
										value="${fornecedor.cargaHorariaCoordDeAnexo}"></td>
								</tr>
								<tr>
									<td>Email:</td>
									<td><input type="text" name="emailCoordDeAnexo"
										value="${fornecedor.emailCoordDeAnexo}"></td>
									<td>Turno:</td>
									<td><select name="turnoCoordDeAnexo"
										value="${fornecedor.turnoCoordDeAnexo}">
											<option>- Selecione -</option>
											<option>-Matutino-</option>
											<option>-Vespertino</option>
											<option>-Noturno</option>
											<option>-Integral</option>
									</select></td>
								</tr>
								<tr>
									<td>Critério de acesso ao cargo/função:</td>
									<td><select name="criterioAcessoCoordDeAnexo"
										value="${fornecedor.criterioAcessoCoordDeAnexo}">
											<option>- selecione -</option>
											<option>1- Exclusivamente por indicação/escolha da
												gestão</option>
											<option>2- Processo seletivo qualificado e
												escolha/nomeação da gestão</option>
											<option>3- Concurso público específico para o cargo
												de gestor escolar</option>
											<option>4- Exclusivamente por processo eleitoral com
												participação da comunidade escolar</option>
											<option>5- Processo seletivo qualificado e eleiçãoo
												com a participação da comunidade escolar</option>
											<option>6- Outros</option>
									</select></td>
									<td>Data de cadastro:</td>
									<td><input type="date" name="dataCadrstralCoordDeAnexo"
										value="${fornecedorGestores.dataCadrstralCoordDeAnexo}" /></td>
								</tr>
							</table>
							<input type="submit" value="Enviar" />
						</form>

						<form
							action="/gestaoEscolar/GestaoEscolarSecretarioEscolarServlet">
							<input type="hidden" name="acao6" value="CREATE6" />

							<section class="titulo2"> Secretário Escolar: </section>
							<table style="width: 100%">
								<tr>
									<td>Nome do Secretário Escolar:</td>
									<td><input size="50" name="nomeSecretarioEscolaro"
										value="${fornecedor.nomeSecretarioEscolaro}"></td>
									<td>Situação Funcional:</td>
									<td><select name="situacaoFuncionalSecretarioEscolar"
										value="${fornecedor.situacaoFuncionalSecretarioEscolar}">
											<option>- selecione -</option>
											<option>1- Concursado/Efetivo/Estável</option>
											<option>2- Contrato temporário</option>
											<option>3- Contrato terceirizado</option>
											<option>4- Contrato CLT</option>
									</select></td>
								</tr>
								<tr>
									<td>CPF do Secretário Escolar:</td>
									<td><input name="cpfSecretarioEscolar"
										value="${fornecedor.cpfSecretarioEscolar}"></td>
									<td>Carga horária:</td>
									<td><input size="3" name="cargaHorariaSecretarioEscolar"
										value="${fornecedor.cargaHorariaSecretarioEscolar}"></td>
								</tr>
								<tr>
									<td>Email:</td>
									<td><input name="emailSecretarioEscolar"
										value="${fornecedor.emailSecretarioEscolar}"></td>
									<td>Turno:</td>
									<td><select name="turnoCoordSecretarioEscolar"
										value="${fornecedor.turnoCoordSecretarioEscolar}">
											<option>- Selecione -</option>
											<option>-Matutino-</option>
											<option>-Vespertino</option>
											<option>-Noturno</option>
											<option>-Integral</option>
									</select></td>
								</tr>
								<tr>
									<td>Critério de acesso ao cargo/função:</td>
									<td><select name="criterioAcessoSecretarioEscolar"
										value="${fornecedor.criterioAcessoSecretarioEscolar}">
											<option>- selecione -</option>
											<option>1- Exclusivamente por indicação/escolha da
												gestãoo</option>
											<option>2- Processo seletivo qualificado e
												escolha/nomeação da gestãoo</option>
											<option>3- Concurso público específico para o cargo
												de gestor escolar</option>
											<option>4- Exclusivamente por processo eleitoral com
												participação da comunidade escolar</option>
											<option>5- Processo seletivo qualificado e eleição
												com a participação da comunidade escolar</option>
											<option>6- Outros</option>
									</select></td>
									<td>Data de cadastro:</td>
									<td><input type="date"
										name="dataCadrstralSecretarioEscolar"
										value="${fornecedorGestores.dataCadrstralSecretarioEscolar}" /></td>
								</tr>
							</table>

							<input type="submit" value="Enviar" />
						</form>

						<form action="/gestaoEscolar/GestaoEscolarDiretordeNucleoServlet">
							<input type="hidden" name="acao7" value="CREATE7" />


							<section class="titulo2"> Diretor(a) de Núcleo: </section>
							<table style="width: 100%">
								<tr>
									<td>Nome do(a) Diretor(a) de Núcleo:</td>
									<td><input size="50" name="nomeDiretorDeNucleo"
										value="${fornecedor.nomeDiretorDeNucleo}"></td>
									<td>Situação Funcional:</td>
									<td><select name="situacaoFuncionalcodigoDiretorDeNucleo"
										value="${fornecedor.situacaoFuncionalcodigoDiretorDeNucleo}">
											<option>- selecione -</option>
											<option>1- Concursado/Efetivo/Estável</option>
											<option>2- Contrato temporário</option>
											<option>3- Contrato terceirizado</option>
											<option>4- Contrato CLT</option>
									</select></td>
								</tr>
								<tr>
									<td>CPF do(a) Diretor(a) de Núcleo:</td>
									<td><input name="cpfcodigoDiretorDeNucleo"
										value="${fornecedor.cpfcodigoDiretorDeNucleo}"></td>
									<td>Carga horária:</td>
									<td><input size="3"
										name="cargaHorariacodigoDiretorDeNucleo"
										value="${fornecedor.cargaHorariacodigoDiretorDeNucleo}"></td>
								</tr>
								<tr>
									<td>Email:</td>
									<td><input name="emailcodigoDiretorDeNucleo"
										value="${fornecedor.emailcodigoDiretorDeNucleo}"></td>
									<td>Turno:</td>
									<td><select name="turnoCoordcodigoDiretorDeNucleor"
										value="${fornecedor.turnoCoordcodigoDiretorDeNucleor}">
											<option>- Selecione -</option>
											<option>-Matutino-</option>
											<option>-Vespertino</option>
											<option>-Noturno</option>
											<option>-Integral</option>
									</select></td>
								</tr>
								<tr>
									<td>Critério de acesso ao cargo/função:</td>
									<td><select name="criterioAcessocodigoDiretorDeNucleo"
										value="${fornecedor.criterioAcessocodigoDiretorDeNucleo}">
											<option>- selecione -</option>
											<option>1- Exclusivamente por indicação/escolha da
												gestão</option>
											<option>2- Processo seletivo qualificado e
												escolha/nomeação da gestão</option>
											<option>3- Concurso público específico para o cargo
												de gestor escolar</option>
											<option>4- Exclusivamente por processo eleitoral com
												participação da comunidade escolar</option>
											<option>5- Processo seletivo qualificado e eleição
												com a participação da comunidade escolar</option>
											<option>6- Outros</option>
									</select></td>
									<td>Data de cadastro:</td>
									<td><input type="date"
										name="dataCadrstralcodigoDiretorDeNucleo"
										value="${fornecedorGestores.dataCadrstralcodigoDiretorDeNucleo}" /></td>
								</tr>
							</table>

							<input type="submit" value="Enviar" />
						</form>

					</div>
				</div>
			</div></li>


		<li><input type="radio" name="tabs" class="rd_tab" id="tab3">

			<label for="tab3" class="tab_label">INFRAESTRUTURA</label>


			<div class="tab-content">
				<form
					action="/gestaoEscolar/GestaoEscolarCaracterizacaoInfraestruturaEscolaServlet">
					<input type="hidden" name="acao7" value="CREATE7" />
					<div class="divisoria">
						<div class="quadro-1">


							<section class="titulo1"> Estrutura da escola: </section>
							<table style="width: 100%">

								<tr>
									<td>Código da escola:</td>
									<td><input type="numero" name="codigoCarctzInfraEscola"
										value="${fornecedor.codigoCarctzInfraEscola}" /></td>
								</tr>
								<tr>
									<td>Código do Usuário:</td>
									<td><input type="numero"
										name="usuarioCriacaoRegistroTabela"
										value="${fornecedor.usuarioCriacaoRegistroTabela}"></td>
								</tr>
								<tr>
									<td>Local de funcionamento da escola:</td>
									<td><select name="indicadorLocalFuncionamentoEscola"
										value="${fornecedor.indicadorLocalFuncionamentoEscola}">
											<option>-selecione-</option>
											<option>-Unidade de internaçãoo socioeducativo-</option>
									</select></td>
								</tr>
								<tr>
									<td>Forma de ocupação do prédio escolar:</td>
									<td><select name="indicadorFormaOcupacaoPredio"
										value="${fornecedor.indicadorFormaOcupacaoPredio}">
											<option>-selecione-</option>
											<option>-Alugado-</option>
											<option>-Préprio-</option>
									</select></td>
								</tr>
								<tr>
									<td>Data de registro:</td>
									<td><input type="date" name="dataCriacaoRegistroTabela"
										value="${fornecedor.dataCriacaoRegistroTabela}" /></td>
								</tr>
							</table>
						</div>
						<div class="quadro-2">
							<section class="titulo1"> Predio compartilhado: </section>
							<table style="width: 100%">
								<tr>
									<div class="prediocomp">
										<input type="checkbox"
											name="indicadorPredioCompartilhadoOoutraEscola"
											value="${fornecedor.indicadorPredioCompartilhadoOoutraEscola}">
										<label>Caso o prédio seja compartilhado adicione o(s)
											código(s) da(s) escola(s).</label>

									</div>

									<div id="camposcodigo">
										<button type="submit">
											<i class="fa fa-plus-circle" aria-hidden="true"> </i>Adicionar
											código escola 1
										</button>
										<input type="text"
											name="codigoInepEscolaPredioPompartilhado_01"
											value="${fornecedor.codigoInepEscolaPredioPompartilhado_01}" />
									</div>

									<div id="camposcodigo">
										<button type="submit">
											<i class="fa fa-plus-circle" aria-hidden="true"> </i>Adicionar
											código escola 2
										</button>
										<input type="text"
											name="codigoInepEscolaPredioPompartilhado_02"
											value="${fornecedor.codigoInepEscolaPredioPompartilhado_02}" />
									</div>

									<div id="camposcodigo">
										<button type="submit">
											<i class="fa fa-plus-circle" aria-hidden="true"> </i>Adicionar
											código escola 3
										</button>
										<input type="text"
											name="codigoInepEscolaPredioPompartilhado_03"
											value="${fornecedor.codigoInepEscolaPredioPompartilhado_03}" />
									</div>
									<div id="camposcodigo">
										<button type="submit">
											<i class="fa fa-plus-circle" aria-hidden="true"> </i>Adicionar
											código escola 4
										</button>
										<input type="text"
											name="codigoInepEscolaPredioPompartilhado_04"
											value="${fornecedor.codigoInepEscolaPredioPompartilhado_04}" />
									</div>
									<div id="camposcodigo">
										<button type="submit">
											<i class="fa fa-plus-circle" aria-hidden="true"> </i>Adicionar
											código escola 5
										</button>
										<input type="text"
											name="codigoInepEscolaPredioPompartilhado_05"
											value="${fornecedor.codigoInepEscolaPredioPompartilhado_05}" />
									</div>
									<div id="camposcodigo">
										<button type="submit">
											<i class="fa fa-plus-circle" aria-hidden="true"> </i>Adicionar
											código escola 6
										</button>
										<input type="text"
											name="codigoInepEscolaPredioPompartilhado_06"
											value="${fornecedor.codigoInepEscolaPredioPompartilhado_06}" />
									</div>
								</tr>
							</table>
						</div>
					</div>
					<div class="divisoria">
						<div class="quadro-dependencia">
							<section class="titulo1"> Dependência existentes na
							escola: </section>
							<div id="campodependencia">
								<div>
									<input type="checkbox"
										name="indicadorDependenciaExistenteAlmoxarifado"
										value="${fornecedor.indicadorDependenciaExistenteAlmoxarifado}">
									<label>Almoxarifado</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorDependenciaExistenteAreaVerde"
										value="${fornecedor.indicadorDependenciaExistenteAreaVerde}">
									<label>Área verde</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorDependenciaExistenteAuditorio"
										value="${fornecedor.cpfcodigoDiindicadorDependenciaExistenteAuditorioretorDeNucleo}">
									<label>Auditório</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorDependenciaExistenteBiblioteca"
										value="${fornecedor.indicadorDependenciaExistenteBiblioteca}">
									<label>Biblioteca</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorDependenciaExistenteCozinha"
										value="${fornecedor.indicadorDependenciaExistenteCozinha}">
									<label>Cozinha</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorEependenciaExistenteBanheiro"
										value="${fornecedor.indicadorEependenciaExistenteBanheiro}">
									<label>Banheiro</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorDependenciaExistenteDespensa"
										value="${fornecedor.indicadorDependenciaExistenteDespensa}">
									<label>Despensa</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorDependenciaExistentePiscina"
										value="${fornecedor.indicadorDependenciaExistentePiscina}">
									<label>Piscina</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorDependenciaExistenteRefeitorio"
										value="${fornecedor.indicadorDependenciaExistenteRefeitorio}">
									<label>Refeitório</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorDependenciaExistentePatioCoberto"
										value="${fornecedor.indicadorDependenciaExistentePatioCoberto}">
									<label>Pátio coberto</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorDependenciaExistentePatioDescoberto"
										value="${fornecedor.indicadorDependenciaExistentePatioDescoberto}" />
									<label>Pátio descoberto</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorDependenciaExistenteSalaAtelieArte"
										value="${fornecedor.indicadorDependenciaExistenteSalaAtelieArte}" />
									<label>Sala/ateliê de artes</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorDependenciaExistenteSalaMusicaCoral"
										value="${fornecedor.indicadorDependenciaExistenteSalaMusicaCoral}" />
									<label>Sala de música/coral</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorDependenciaExistenteSalaEstudioDanca"
										value="${fornecedor.indicadorDependenciaExistenteSalaEstudioDanca}" />
									<label>Sala/estúdio de dança</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorDependenciaExistenteSalaDiretoria"
										value="${fornecedor.indicadorDependenciaExistenteSalaDiretoria}" />
									<label>Sala de diretoria</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorDependenciaExistenteSalaLeitura"
										value="${fornecedor.indicadorDependenciaExistenteSalaLeitura}">
									<label>Sala de leitura</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorDependenciaExistenteSalaProfessores"
										value="${fornecedor.indicadorDependenciaExistenteSalaProfessores}" />
									<label>Sala de professores</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorDependenciaExistenteSalaSecretaria"
										value="${fornecedor.indicadorDependenciaExistenteSalaSecretaria}" />
									<label>Sala de secretaria</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorDependenciaExistenteBanheiroEducacaoInfantil"
										value="${fornecedor.indicadorDependenciaExistenteBanheiroEducacaoInfantil}" />
									<label>Banheiro adequado à  educação infantil</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorDependenciaExistenteBanheiroAcessivel"
										value="${fornecedor.indicadorDependenciaExistenteBanheiroAcessivel}" />
									<label>Banheiro acessível(para Deficiente Físico)</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorDependenciaExistenteBanheiroExclusivoFuncionario"
										value="${fornecedor.indicadorDependenciaExistenteBanheiroExclusivoFuncionario}" />
									<label>Banheiro exclusivo para os funcionários</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorDependenciaExistenteBanheiroVestiarioComChuveiro"
										value="${fornecedor.indicadorDependenciaExistenteBanheiroVestiarioComChuveiro}" />
									<label>Banheiro ou vestiário com chuveiro</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorDependenciaExistenteQuadraEsporteCoberta"
										value="${fornecedor.indicadorDependenciaExistenteQuadraEsporteCoberta}" />
									<label>Quadra de esportes coberta</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorDependenciaExistenteQuadraEsporteDescoberta"
										value="${fornecedor.indicadorDependenciaExistenteQuadraEsporteDescoberta}" />
									<label>Quadra de esportes descoberta</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorDependenciaExistenteLaboratorioInformatica"
										value="${fornecedor.indicadorDependenciaExistenteLaboratorioInformatica}" />
									<label>Laboratório de informática</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorDependenciaExistenteLaboratorioCiencias"
										value="${fornecedor.indicadorDependenciaExistenteLaboratorioCiencias}" />
									<label>Laboratório de ciências</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorDependenciaExistenteDormitorioProfessor"
										value="${fornecedor.indicadorDependenciaExistenteDormitorioProfessor}" />
									<label>Dormitório de professor</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorDependenciaExistenteDormitorioAluno"
										value="${fornecedor.indicadorDependenciaExistenteDormitorioAluno}" />
									<label>Dormitório de aluno</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorDependenciaExistenteSalaMultiuso"
										value="${fornecedor.indicadorDependenciaExistenteSalaMultiuso}" />
									<label>Sala multiuso (música, dança e artes)</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorDependenciaExistenteViveiro"
										value="${fornecedor.indicadorDependenciaExistenteViveiro}" />
									<label>Viveiro/criação de animais</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorDependenciaExistenteTerreirao"
										value="${fornecedor.indicadorDependenciaExistenteTerreirao}" />
									<label>Terreirão (Área para prática recreativa)</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorDependenciaExistenteSalaRecursosMultifuncionais"
										value="${fornecedor.indicadorDependenciaExistenteSalaRecursosMultifuncionais}" />
									<label>Sala de recursos multifuncionais para
										Atendimento Educacional Especializado (AEE)</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorDependenciaExistenteAusente"
										value="${fornecedor.indicadorDependenciaExistenteAusente}" />
									<label>Nenhuma das dependências relacionadas</label>
								</div>
							</div>
							<section class="titulo1"> Recursos de acessibilidade: </section>
							<div id="campos02col">
								<div>
									<input type="checkbox"
										name="indicadorRecursosAcessibilidadeElevador"
										value="${fornecedor.indicadorRecursosAcessibilidadeElevador}" />
									<label>Elevador</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorRecursosAcessibilidadePisoTatil"
										value="${fornecedor.indicadorRecursosAcessibilidadePisoTatil}" />
									<label>Pisos táteis</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorRecursosAcessibilidadeRampa"
										value="${fornecedor.indicadorRecursosAcessibilidadeRampa}" />
									<label>Rampas</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorRecursosAcessibilidadeSinalizacaoSonora"
										value="${fornecedor.indicadorRecursosAcessibilidadeSinalizacaoSonora}" />
									<label>Sinalização sonora</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorRecursosAcessibilidadeSinalizacaoTatil"
										value="${fornecedor.indicadorRecursosAcessibilidadeSinalizacaoTatil}" />
									<label>Sinalização tátil (piso/paredes)</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorRecursosAcessibilidadeSinalizacaoVisual"
										value="${fornecedor.indicadorRecursosAcessibilidadeSinalizacaoVisual}" />
									<label>Sinalização visual (piso/paredes)</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorRecursosAcessibilidadeCorrimaoGuardaCorpo"
										value="${fornecedor.indicadorRecursosAcessibilidadeCorrimaoGuardaCorpo}" />
									<label>Corrimão e guarda-corpos</label>
								</div>

							</div>


							<div>
								<input type="checkbox" name="cpfcodigoDiretorDeNucleo"
									value="${fornecedor.cpfcodigoDiretorDeNucleo}" /> <label>Portas
									com vão livre de no mínimo 80 cm</label>
							</div>
							<div>
								<input type="checkbox"
									name="indicadorRecursosAcessibilidadeAusente"
									value="${fornecedor.indicadorRecursosAcessibilidadeAusente}" />
								<label>Nenhum dos recursos de acessibilidade listados</label>
							</div>


						</div>
						<div class="quadro-agua">
							<section class="titulo1"> Abastecimento de Água: </section>
							<div id="campos01">

								<div>
									<input type="checkbox"
										name=indicadorFormaAbastecimentoAguaRedePublica
										value="${fornecedor.indicadorFormaAbastecimentoAguaRedePublica}" />
									<label>Rede pública</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorFormaAbastecimentoAguaPocoPublico"
										value="${fornecedor.indicadorFormaAbastecimentoAguaPocoPublico}" />
									<label>Poço artesiano</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorFormaFbastecimentoFguaFacimbaCisternaPoco"
										value="${fornecedor.indicadorFormaFbastecimentoFguaFacimbaCisternaPoco}" />
									<label>Cacimba; Cisterna; Poçoo</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorFormaAbastecimentoAguaFonteRioIgarapeRiacho_cor"
										value="${fornecedor.indicadorFormaAbastecimentoAguaFonteRioIgarapeRiacho_cor}" />
									<label>Fonte; Rio; Igarapé; Córrego</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorForneceAguaPotavelConsumoHumano"
										value="${fornecedor.indicadorForneceAguaPotavelConsumoHumano}" />
									<label>Água potável ao consumo humano</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorFormaAbastecimentoAguaAusente"
										value="${fornecedor.indicadorFormaAbastecimentoAguaAusente}" />
									<label>Não existe abastecimento de Água</label>
								</div>
							</div>
							<section class="titulo1"> Esgotamento sanitário: </section>
							<div id="campos01">
								<div>
									<input type="checkbox"
										name="indicadorEsgotamentoSanitarioRedePublica"
										value="${fornecedor.indicadorEsgotamentoSanitarioRedePublica}" />
									<label>Rede pública</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorEsgotamentoSanitarioFossaSeptica"
										value="${fornecedor.indicadorEsgotamentoSanitarioFossaSeptica}" />
									<label>Fossa Óptica</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorEsgotamentoSanitarioFossaRudimentarComum"
										value="${fornecedor.indicadorEsgotamentoSanitarioFossaRudimentarComum}" />
									<label>Fossa rudimentar/comum</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorEsgotamentoSanitarioAusente"
										value="${fornecedor.indicadorEsgotamentoSanitarioAusente}" />
									<label>Não há esgotamento sanitário</label>
								</div>
							</div>

							<section class="titulo1"> Fonte de energia elétrica: </section>
							<div id="campos01">
								<div>
									<input type="checkbox"
										name="indicadorFonteEnergiaEletricaRedePublica"
										value="${fornecedor.indicadorFonteEnergiaEletricaRedePublica}" />
									<label>Rede pública</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorFonteEnergiaEletricaGeradorCombustivelFossil"
										value="${fornecedor.indicadorFonteEnergiaEletricaGeradorCombustivelFossil}" />
									<label>Gerador movido à  combustível fóssil</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorFonteEnergiaEletricaFontesRenovaveisAlternativas"
										value="${fornecedor.indicadorFonteEnergiaEletricaFontesRenovaveisAlternativas}" />
									<label>Fonte de energia renováveis ou alternativas</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorFonteEnergiaEletricaAusente"
										value="${fornecedor.indicadorFonteEnergiaEletricaAusente}" />
									<label>Não há energia elétrica</label>
								</div>
							</div>

							<section class="titulo1"> Tratamento de lixo/resíduos:
							</section>
							<div id="campos01">
								<div>
									<input type="checkbox"
										name="indicadorTratamentoLixoSeparacaoLixoResiduos"
										value="${fornecedor.indicadorTratamentoLixoSeparacaoLixoResiduos}" />
									<label> Separação do lixo/resíduos</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorTratamentoLixoReaproveitamentoReutilizacao"
										value="${fornecedor.indicadorTratamentoLixoReaproveitamentoReutilizacao}" />
									<label>Reaproveitamento/reutilização</label>
								</div>
								<div>
									<input type="checkbox" name="indicadorTratamentoLixoReciclagem"
										value="${fornecedor.indicadorTratamentoLixoReciclagem}" /> <label>Reciclagem</label>
								</div>
								<div>
									<input type="checkbox" name="indicadorTratamentoAusente"
										value="${fornecedor.indicadorTratamentoAusente}" /> <label>Não
										há tratamento</label>
								</div>
							</div>

							<section class="titulo1"> Destinação do lixo: </section>
							<div id="campos01">
								<div>
									<input type="checkbox"
										name="indicadorDestinacaoLixoServicoColeta"
										value="${fornecedor.indicadorDestinacaoLixoServicoColeta}" />
									<label>Serviço de coleta</label>
								</div>
								<div>
									<input type="checkbox" name="indicadorDestinacaoLixoQueima"
										value="${fornecedor.indicadorDestinacaoLixoQueima}" /> <label>Queima</label>
								</div>
								<div>
									<input type="checkbox" name="indicadorDestinacaoLixoEnterra"
										value="${fornecedor.indicadorDestinacaoLixoEnterra}" /> <label>Enterra</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorDestinacaoLixoLocalLicenciadoPoderPublico"
										value="${fornecedor.indicadorDestinacaoLixoLocalLicenciadoPoderPublico}" />
									<label>Leva para destinação final licenciada pelo poder
										público</label>
								</div>
								<div>
									<input type="checkbox" name="indicadorDestinacaoLixoOutraArea"
										value="${fornecedor.indicadorDestinacaoLixoOutraArea}" /> <label>Descarta
										em outras Áreas</label>
								</div>
							</div>
						</div>
					</div>
					<div class="divisoria">
						<div class="quadrosalas">
							<section class="titulo1"> Salas: </section>
							<div id="campos01">
								<table>
									<tr>
										<td>Número de salas de aula utilizadas na escola dentro
											do prédio escolar:</td>
										<td><input type="text"
											name="quantidadeSalaUtilizadaEscolaDentroPredio"
											value="${fornecedor.quantidadeSalaUtilizadaEscolaDentroPredio}" /></td>
									</tr>
									<tr>
										<td>Número de salas de aula utilizadas na escola fora do
											prédio escolar:</td>
										<td><input type="text"
											name="quantidadeSalaUtilizadaEscolaForaPredio"
											value="${fornecedor.quantidadeSalaUtilizadaEscolaForaPredio}" /></td>
									</tr>
									<tr>
										<td>Número de salas de aula com acessibilidade para
											pessoas com deficiência ou mobilidade reduzida:</td>
										<td><input type="text"
											name="quantidadeSalaComAcessibilidade"
											value="${fornecedor.quantidadeSalaComAcessibilidade}"></td>
									</tr>
									<tr>
										<td>Número de salas de aula climatizadas:</td>
										<td><input type="text" name="quantidadeSalaClimatizada"
											value="${fornecedor.quantidadeSalaClimatizada}"></td>
									</tr>
								</table>
							</div>
							<section class="titulo1"> Infraestrutura Organizacional
							</section>
							<div id="campos01">
								<table style="width: 100%">
									<tr>
										<td bgcolor="#DFDFDF">Esfera administrativa do conselho
											ou Órgão responsável pela Regulamentação/Autorização:</td>
										<td bgcolor="#DFDFDF"><select
											name="indicadorEsferaAdministrativaConselhoRegulamentacaoutoriz"
											value="${fornecedor.indicadorEsferaAdministrativaConselhoRegulamentacaoutoriz}">
												<option>-Selecione-</option>
												<option>-Municipal-</option>
												<option>-Estadual-</option>
												<option>-Federal</option>
										</select></td>
									</tr>
									<tr>
										<td>Escola abre aos finais de semana para a comunidade:</td>
										<td><select
											name="indicadorEscolaAbreFinaisSemanaComunidade"
											value="${fornecedor.indicadorEscolaAbreFinaisSemanaComunidade}">
												<option>-Selecione-</option>
												<option>-Sim-</option>
												<option>-Não-</option>
										</select></td>
									</tr>
									<tr>
										<td bgcolor="#DFDFDF">Escola com proposta pedagógica de
											formação por alternância:</td>
										<td bgcolor="#DFDFDF"><select
											name="indicadorEscolaPropostaPedagogicaFormacaoPorAlternancia"
											value="${fornecedor.indicadorEscolaPropostaPedagogicaFormacaoPorAlternancia}">
												<option>-Selecione-</option>
												<option>-Sim-</option>
												<option>-Não-</option>
										</select></td>
									</tr>
									<tr>
										<td>Escola conveniada com poder público:</td>
										<td><select name="indicadorConvenioPoderPublico"
											value="${fornecedor.indicadorConvenioPoderPublico}">
												<option>-Selecione-</option>
												<option>-Sim-</option>
												<option>-Não-</option>
										</select></td>
									</tr>
									<tr>
										<td bgcolor="#DFDFDF">Órgão a que a escola pública está
											vinculada:</td>
										<td bgcolor="#DFDFDF"><select
											name="indicadorOrgaoVinculoEscolaSecretariaSegurancaForcasArma"
											value="${fornecedor.indicadorOrgaoVinculoEscolaSecretariaSegurancaForcasArma}">
												<option>-Selecione-</option>
												<option>-Sec. de Educação-</option>
												<option>-Sec. Seg. Pública-</option>
												<option>-Sec. da Saúde-</option>
										</select></td>
									</tr>
									<tr>
										<td>Categoria de escola privada:</td>
										<td><select
											name="indicadorMantenedoraEscolaPrivadaInstituicoesSemFinsLucr"
											value="${fornecedor.indicadorMantenedoraEscolaPrivadaInstituicoesSemFinsLucr}">
												<option>-Selecione-</option>
												<option>-Confessional-</option>
												<option>-Comunitária-</option>
												<option>-Particular-</option>
												<option>-Filantrópica-</option>
										</select></td>
									</tr>

									<tr>
										<td bgcolor="#DFDFDF">Escola cede espaço para turmas do
											Brasil Alfabetizado:</td>
										<td bgcolor="#DFDFDF"><select
											name="indicadorEspacoCedidoBrasilAlfabetizado"
											value="${fornecedor.indicadorEspacoCedidoBrasilAlfabetizado}">
												<option>-Selecione-</option>
												<option>-Sim-</option>
												<option>-Não-</option>
										</select></td>
									</tr>
									<tr>
										<td>Mantenedora da escola privada:</td>
										<td><select
											name="indicadorMantenedoraEscolaPrivadaOrganizacaoDaSociedadeC"
											value="${fornecedor.indicadorMantenedoraEscolaPrivadaOrganizacaoDaSociedadeC}">
												<option>-Selecione-</option>
												<option>-Empresa, grupos empresariais do setor
													privado ou pessoa física-</option>
												<option>-Instituições sem fins lucrativos-</option>
												<option>-Organização não governamental (ONG)
													internacional ou nacional;-</option>
												<option>-Organização da Sociedade Civil de
													Interesse Público (OSCIP)-</option>
												<option>-Sindicatos de trabalhadores ou patronais,
													associaações, cooperativas-</option>
												<option>-Sistema S(Sesi, Senai, Sesc, outros)-</option>
										</select></td>
									</tr>
									<tr>
										<td bgcolor="#DFDFDF">Localização diferenciada:</td>
										<td bgcolor="#DFDFDF"><select
											name="indicadorLocalizacaoDiferenciadaEscola"
											value="${fornecedor.indicadorLocalizacaoDiferenciadaEscola}">
												<option>-Não está em Área de localização
													diferenciada-</option>
												<option>-Área remanescente de quilombos-</option>
												<option>-Terra indígigena-</option>
												<option>-Área de assentamento</option>
										</select></td>
									</tr>
								</table>


								<input type="submit" value="Enviar" />
				</form>


			</div>
			</div>
			</div>
			</div></li>



		<li><input type="radio" name="tabs" class="rd_tab" id="tab4">



			<label for="tab4" class="tab_label">EQUIPAMENTO</label>
			<div class="tab-content">
				<form action="/gestaoEscolar/GestaoEscolaEquipamentosServlet">
					<input type="hidden" name="acao8" value="CREATE8" />
					<div class="divisoria">
						<div class="quadro-1">


							<section class="titulo1"> Equipamentos existentes na
							escola para uso técnico e administrativo: </section>
							<div class="alinhamento1">

								<table style="width: 100%">
									<tr>
										<td>Código da escola:</td>
										<td><input type="numero"
											name="codigoCarctzEquipfraEscola"
											value="${fornecedor.codigoCarctzEquipfraEscola}"></td>
									</tr>
									<tr>
										<td>Código do Usuário:</td>
										<td><input type="numero"
											name="usuarioUriacaoRegistroTabela"
											value="${fornecedor.usuarioUriacaoRegistroTabela}"></td>
									</tr>
									<tr>
										<td>Quantidade de Antenas Parabólica:</td>
										<td><input type="numero"
											name="qtdAntenaParabolicaEquipamentoEscola"
											value="${fornecedor.qtdAntenaParabolicaEquipamentoEscola}"></td>
									</tr>
									<tr>
										<td>Quantidade de computadores:</td>
										<td><input type="numero"
											name="qtdComputadoresAdmEquipamentoEscola"
											value="${fornecedor.qtdComputadoresAdmEquipamentoEscola}"></td>
									</tr>
									<tr>
										<td>Quantidade de Copiadoras:</td>
										<td><input type="numero"
											name="qtdCopiadorasEquipamentoEscola"
											value="${fornecedor.qtdCopiadorasEquipamentoEscola}"></td>
									</tr>
									<tr>
										<td>Quantidade de Impressoras:</td>
										<td><input type="numero"
											name="qtdInpressorasEquipamentoEscola"
											value="${fornecedor.qtdInpressorasEquipamentoEscola}"></td>
									</tr>
									<tr>
										<td>Quantidade de impressoras multifuncionais:</td>
										<td><input type="numero"
											name="qtdInpressorasMultfuncionaisEquipamentoEscola"
											value="${fornecedor.qtdInpressorasMultfuncionaisEquipamentoEscola}"></td>
									</tr>
									<tr>
										<td>Quantidade de Scanner:</td>
										<td><input type="numero"
											name="qtdEscannersEquipamentoEscola"
											value="${fornecedor.qtdEscannersEquipamentoEscola}"></td>
									</tr>
									<tr>
										<td>Data de egistro:</td>
										<td><input type="Date" name="dataCriacaoRegistroTabela"
											value="${fornecedor.dataCriacaoRegistroTabela}"></td>

									</tr>
								</table>
							</div>
							<section class="titulo1"> Acesso à  internet: </section>
							<div class="alinhamento1">
								<div>
									<input type="checkbox" name="indicadorAcessoInternetUsoAluno"
										value="${fornecedor.indicadorAcessoInternetUsoAluno}">
									<label>Para uso dos alunos</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorAcessoInternetUsoAdministrativo"
										value="${fornecedor.indicadorAcessoInternetUsoAdministrativo}">
									<label>Para uso administrativo</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorAcessoInternetUsoProcessoEnsinoAprendizagem"
										value="${fornecedor.indicadorAcessoInternetUsoProcessoEnsinoAprendizagem}">
									<label>Para uso nos processos de ensino e aprendizagem</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorAcessoInternetUsoComunidade"
										value="${fornecedor.indicadorAcessoInternetUsoComunidade}">
									<label>Para uso da comunidade</label>
								</div>
								<div>
									<input type="checkbox" name="indicadorNaoPossuiacessoInternet"
										value="${fornecedor.indicadorNaoPossuiacessoInternet}">
									<label>Não possui acesso à internet</label>
								</div>
							</div>
						</div>
						<div class="quadro-2">
							<section class="titulo1"> Quantidade de equipamentos
							para o processo de ensino e aprendizagem: </section>
							<table style="width: 100%">
								<tr>
									<td>Aparelho de DVD/Blu-ray:</td>
									<td><input type="numero"
										name="qtdDvdBluRayEquipamentoEscola"
										value="${fornecedor.qtdDvdBluRayEquipamentoEscola}"></td>
								</tr>
								<tr>
									<td>Quantidade de Aparelhos de som:</td>
									<td><input type="numero"
										name="qtdAparelhoDeSomEquipamentoEscola"
										value="${fornecedor.qtdAparelhoDeSomEquipamentoEscola}"></td>
								</tr>
								<tr>
									<td>Quantidade de Aparelhos de Televisão:</td>
									<td><input type="numero"
										name="qtdAparelhoTVEquipamentoEscola"
										value="${fornecedor.qtdAparelhoTVEquipamentoEscola}"></td>
								</tr>
								<tr>
									<td>Lousa digital:</td>
									<td><input type="numero"
										name="qtdLousaDigitalEquipamentoEscola"
										value="${fornecedor.qtdLousaDigitalEquipamentoEscola}"></td>
								</tr>
								<tr>
									<td>Projetor Multimédia (Data show):</td>
									<td><input type="numero"
										name="qtdProjetorMultmidiaEquipamentoEscola"
										value="${fornecedor.qtdProjetorMultmidiaEquipamentoEscola}"></td>
								</tr>
							</table>
							<section class="titulo1"> Quantidade de computadores em
							uso pelos alunos </section>

							<table style="width: 100%">
								<tr>
									<td>Computadores de mesa (desktop):</td>
									<td><input type="numero"
										name="qtdComputadorDesktopEquipamentoEscola"
										value="${fornecedor.qtdComputadorDesktopEquipamentoEscola}"></td>
								</tr>
								<tr>
									<td>Computadores portáteis:</td>
									<td><input type="numero"
										name="qtdComputadoresPortateisEquipamentoEscola"
										value="${fornecedor.qtdComputadoresPortateisEquipamentoEscola}"></td>
								</tr>
								<tr>
									<td>Tablets:</td>
									<td><input type="numero"
										name="qtdComputadoresTabletsEquipamentoEscola"
										value="${fornecedor.qtdComputadoresTabletsEquipamentoEscola}"></td>
								</tr>
							</table>

							<section class="titulo1"> Rede e Internet: </section>
							<div class="alinhamento1">
								<table>
									<tr>
										<td>Possui Internet Banda Larga?</td>
										<td><select name="indicadorInternetBandaLarga"
											value="${fornecedor.indicadorInternetBandaLarga}">
												<option>-Selecione-</option>
												<option>-Sim-</option>
												<option>-Não-</option>
										</select></td>
									</tr>
									<tr>
										<td>Rede local de interligação de computadores</td>
										<td><select
											name="indicadorRedeLocalInterligacaoComputadoresCabo"
											value="${fornecedor.indicadorRedeLocalInterligacaoComputadoresCabo}">
												<option>-Selecione-</option>
												<option>-A cabo-</option>
												<option>-Wireless-</option>
												<option>-A cabo e Wireless-</option>
												<option>-Não há rede local-</option>
										</select></td>
									</tr>
								</table>
							</div>
						</div>
					</div>

					<div class="quadro-3">
						<section class="titulo1"> Equipamentos para acesso a
						internet: </section>
						<div class="alinhamento1">
							<table>
								<tr>
									<td>Computadores de mesa, portáteis e tablets próprio da
										escola (no laboratório de informática, biblioteca, sala de
										aula, etc.)</td>
									<td><input type="checkbox"
										name="indicadorEquipamentoAlunoAcessoInternetDispositivosPessoa"
										value="${fornecedor.indicadorEquipamentoAlunoAcessoInternetDispositivosPessoa}"></td>
								</tr>
								<tr>
									<td>São utilizados também dispositivos pessoais na
										intituição (computadores portáteis, celulares, tablets, etc.)</td>
									<td><input type="checkbox"
										name="indicadorEquipamentoAlunoAcessoInternetComputadoresMesaP"
										value="${fornecedor.indicadorEquipamentoAlunoAcessoInternetComputadoresMesaP}"></td>
								</tr>
							</table>


						</div>
						<input type="submit" value="Enviar" />
				</form>
			</div>

			</div></li>
		<li><input type="radio" name="tabs" class="rd_tab" id="tab5">

			<label for="tab5" class="tab_label">DADOS EDUCACIONAIS</label>
			<div class="tab-content">
				<form action="/gestaoEscolar/GestaoEscolaDadosEducacionaisServlet">
					<input type="hidden" name="acao9" value="CREATE9" />

					<div class="divisoria">
						<div class="quadro-1">
							<section class="titulo1"> Formas de organização do
							ensino: </section>
							<div class="alinhamento1">
								<div>
									<label>Cóigo da Escola: </label> <input type="numero"
										name="codigoEscolaDadosEducacionais"
										value="${fornecedor.codigoEscolaDadosEducacionais}"> <br>
									<label>Cóigo do Usuário: </label> <input type="numero"
										name="usuarioUriacaoRegistroTabela"
										value="${fornecedor.usuarioUriacaoRegistroTabela}"> <br>
									<label>Data de registro: </label> <input type="Date"
										name="dataRegistroTabelaDadosEducacionais"
										value="${fornecedor.dataRegistroTabelaDadosEducacionais}">
									<br> <input type="checkbox"
										name="indicadorOrganizacaoEnsinoEscolaSerieAno"
										value="${fornecedor.indicadorOrganizacaoEnsinoEscolaSerieAno}">
									<label>Série/Ano (séries anuais)</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorOrganizacaoEnsinoEscolaPeriodoSemestrais"
										value="${fornecedor.indicadorOrganizacaoEnsinoEscolaPeriodoSemestrais}">
									<label>Períodos semestrais</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorOrganizacaoCiclosEnsinoFundamental"
										value="${fornecedor.indicadorOrganizacaoCiclosEnsinoFundamental}">
									<label>Ciclo(s) do Ensino Fundamental</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorOrganizacaoEnsinoEscolaGruposNaoSeriados"
										value="${fornecedor.indicadorOrganizacaoEnsinoEscolaGruposNaoSeriados}">
									<label>Grupos não seriados com base na idade ou
										competência (art. 23 LDB)</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorOrganizacaoEnsinoEscolaModulos"
										value="${fornecedor.indicadorOrganizacaoEnsinoEscolaModulos}">
									<label>Forma de organização do ensino na escola:
										módulos </label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorOrganizacaoEnsinoEscolaAlternanciaRegular"
										value="${fornecedor.indicadorOrganizacaoEnsinoEscolaAlternanciaRegular}">
									<label>Módulos, Alternância regular de períodos de
										estudos (proposta pedagógica de formaçãoo por alternância:
										tempo-escola e tempo- comunidade)</label>
								</div>
							</div>
							<section class="titulo1"> Reserva de vagas por sistema
							de cota: </section>
							<div class="alinhamento1">
								<div>
									<input type="checkbox"
										name="indicadorReservaVagaCotaPretoPardoIndigena"
										value="${fornecedor.indicadorReservaVagaCotaPretoPardoIndigena}">
									<label>Autodeclarado preto, pardo ou indígena (PPI)</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorReservaVagaCotaPessoaComDeficiencia"
										value="${fornecedor.indicadorReservaVagaCotaPessoaComDeficiencia}">
									<label>Pessoa com deficiência (PCD)</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorReservaVagaCotaCondicaoRenda"
										value="${fornecedor.indicadorReservaVagaCotaCondicaoRenda}">
									<label>Condição de Renda</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorReservaVagaCotaOriundoEscolaPublica"
										value="${fornecedor.indicadorReservaVagaCotaOriundoEscolaPublica}">
									<label>Oriundo de escola pública</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorReservaVagaCotaOutrasGrpQueNaoListados"
										value="${fornecedor.indicadorReservaVagaCotaOutrasGrpQueNaoListados}">
									<label>Outros grupos que não são listados</label>
								</div>
								<div>
									<input type="checkbox" name="indicadorCotaSemReservaVaga"
										value="${fornecedor.indicadorCotaSemReservaVaga}"> <label>Sem
										reservas de vagas</label>
								</div>
							</div>
						</div>

						<div class="quadro-2">
							<section class="titulo1"> Seleção: </section>
							<div class="alinhamento1">
								<table>
									<tr>
										<td>Escola faz exame de seleçãoo para ingresso de alunos?</td>
										<td><select name="indicadorExameSelecaoIngressoEscola"
											value="${fornecedor.indicadorExameSelecaoIngressoEscola}">
												<option>-Selecione-</option>
												<option>-Sim-</option>
												<option>-Não-</option>
										</select></td>
									</tr>
								</table>
							</div>
							<section class="titulo1"> Órgãos colegiados em
							funcionamento na escola: </section>
							<div class="alinhamento1">
								<div>
									<input type="checkbox"
										name="indicadorCompartilhaEspacoComunidade"
										value="${fornecedor.indicadorCompartilhaEspacoComunidade}">
									<label>Compartilha espaço com comunidade</label>
								</div>
								<div>
									<input type="checkbox" name="indicadorUsoEspacoEntornoEscola"
										value="${fornecedor.indicadorUsoEspacoEntornoEscola}">
									<label>Compartilha espaço com comunidade entorno da
										escola</label>
								</div>

								<div>
									<input type="checkbox"
										name="indicadorOrgaoColegiadosFuncionamentoEscolaAssociacaoPais"
										value="${fornecedor.indicadorOrgaoColegiadosFuncionamentoEscolaAssociacaoPais}">
									<label>Associação de pais</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorOrgaoColegiadosFuncionamentoEscolaAssocPaisMest"
										value="${fornecedor.indicadorOrgaoColegiadosFuncionamentoEscolaAssocPaisMest}">
									<label>Associação de pais e mestres</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorOrgaoColegiadosFuncionamentoConselhoEscola"
										value="${fornecedor.indicadorOrgaoColegiadosFuncionamentoConselhoEscola}">
									<label>Conselho escolar</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorOrgaoColegiadosFuncionamentoGremioEstudant"
										value="${fornecedor.indicadorOrgaoColegiadosFuncionamentoGremioEstudant}">
									<label>Grêmio estudantil</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorOrgaoColegiadosFuncionamentoOutros"
										value="${fornecedor.indicadorOrgaoColegiadosFuncionamentoOutros}">
									<label>Outros</label>
								</div>
								<div>
									<input type="checkbox"
										name="indicadorNaoHaorgaoColegiadosFuncionamento"
										value="${fornecedor.indicadorNaoHaorgaoColegiadosFuncionamento}">
									<label>Não há Órgãos colegiados em funcionamento</label>
								</div>
							</div>
							<section class="titulo1"> Educação indígena: </section>
							<div class="alinhamento1">
								<div class="alinhamento1">
									<form id="form1">
										<input type="radio"
											name="indicadorInstrumentosEducacaoIndigena" id="S" value="S"
											${fornecedor.indicadorInstrumentosEducacaoIndigena}>
										<label>Sim</label> <input type="radio"
											name="indicadorInstrumentosEducacaoIndigena" id="N" value="N"
											${fornecedor.indicadorInstrumentosEducacaoIndigena}>

										<label>Não</label></br> <label>Lingua Portuguesa:</label> <input
											type="checkbox"
											name="indicadorLinguaEducacaoLinguaPortuguesa"
											value="${fornecedor.indicadorLinguaEducacaoLinguaPortuguesa}"><br>

										<label>Lingua indígena:</label> <input type="checkbox"
											name="indicadorLinguaEducacaoIndigena"
											value="${fornecedor.indicadorLinguaEducacaoIndigena}"
											onchange="hablilitarcampo(this);"> <br> <input
											type="checkbox" onchange="hablilitarcampo(this);" /> <input
											placeholder="Adicionar código língua indígina 01"
											type="numero" disabled="true" name="linguaIndigena01"
											value="${fornecedor.linguaIndigena01}"> <input
											type="checkbox" onchange="hablilitarcampo(this);" /> <input
											placeholder="Adicionar código língua indígina 02"
											type="numero" disabled="true" name="linguaIndigena02"
											value="${fornecedor.linguaIndigena02}"> <input
											type="checkbox" onchange="hablilitarcampo(this);" /> <input
											placeholder="Adicionar código língua indígina 03"
											type="numero" disabled="true" name="linguaIndigena03"
											value="${fornecedor.linguaIndigena03}">
								</div>
							</div>
							<section class="titulo1"> A escola possui site ou blog
							ou página em redes sociais para comunicação institucional? </section>
							<div class="alinhamento1">
								<div class="form2">

									<input type="radio" name="indicadorSiteBlogRedeSociaisEscola"
										value="S" ${fornecedor.indicadorSiteBlogRedeSociaisEscola}>
									<label>Sim</label> <input type="radio"
										name="indicadorSiteBlogRedeSociaisEscola" value="N"
										${fornecedor.indicadorSiteBlogRedeSociaisEscola}> <label>Não</label>

								</div>
							</div>
						</div>
					</div>
					<div class="quadro-3">
						<section class="titulo1"> Instrumentos e materiais
						socioculturais e/ou pedagógicos em uso na escola para
						desenvolvimento de atividades de ensino aprendizagem </section>
						<div id="campos02col">
							<div>
								<input type="checkbox"
									name="indicadorInstrumentosAcervoMultimidia"
									value="${fornecedor.indicadorInstrumentosAcervoMultimidia}">
								<label>Acervo multimédia</label>
							</div>
							<div>
								<input type="checkbox"
									name="indicadorInstrumentosInstrumentosMusicais"
									value="${fornecedor.indicadorInstrumentosInstrumentosMusicais}">
								<label>Instrumentos musicais para conjunto,
									banda/fanfarra e/ou aulas de música</label>
							</div>
							<div>
								<input type="checkbox"
									name="indicadorInstrumentosMateriaisPedagogicosEducacacao"
									value="${fornecedor.indicadorInstrumentosMateriaisPedagogicosEducacacao}">
								<label>Instrumentos, materiais pedagógicos para educação</label>
							</div>
							<div>
								<input type="checkbox"
									name="indicadorMateriaisPedagogicoEducacaoIndigina"
									value="${fornecedor.indicadorMateriaisPedagogicoEducacaoIndigina}">
								<label>Materiais pedagógicos para a educação escolar
									indígena</label>
							</div>
							<div>
								<input type="checkbox" name="qtdEscannersEquipamentoEscola"
									value="${fornecedor.qtdEscannersEquipamentoEscola}"> <label>Brinquedos
									para educação infantil</label>
							</div>
							<div>
								<input type="checkbox" name="qtdEscannersEquipamentoEscola"
									value="${fornecedor.qtdEscannersEquipamentoEscola}"> <label>Jogos
									educativos</label>
							</div>
							<div>
								<input type="checkbox" name="qtdEscannersEquipamentoEscola"
									value="${fornecedor.qtdEscannersEquipamentoEscola}"> <label>Materiais
									pedagógicos para a educação das relaçõees étnicos raciais</label>
							</div>
							<div>
								<input type="checkbox" name="qtdEscannersEquipamentoEscola"
									value="${fornecedor.qtdEscannersEquipamentoEscola}"> <label>Materiais
									para atividades culturais e artísticas</label>
							</div>
							<div>
								<input type="checkbox" name="qtdEscannersEquipamentoEscola"
									value="${fornecedor.qtdEscannersEquipamentoEscola}"> <label>Materiais
									pedagógicos para a educação do campo</label>
							</div>
							<div>
								<input type="checkbox" name="qtdEscannersEquipamentoEscola"
									value="${fornecedor.qtdEscannersEquipamentoEscola}"> <label>Equipamento
									para amplificação e difusão de som/áudio</label>
							</div>
							<div>
								<input type="checkbox" name="qtdEscannersEquipamentoEscola"
									value="${fornecedor.qtdEscannersEquipamentoEscola}"> <label>Materiais
									para prática desportiva e recreação</label>
							</div>
							<div>
								<input type="checkbox" name="qtdEscannersEquipamentoEscola"
									value="${fornecedor.qtdEscannersEquipamentoEscola}"> <label>Conjunto
									de materiais científicos</label>
							</div>
						</div>

						<section class="titulo1"> O projeto político pedagógico
						ou a proposta pedagógica da escola (conforme art. 12 da LDB) foi
						atualizada nos últimos 12 meses até a data de referência? </section>
						<div class="alinhamento1">
							<table>
								<tr>
									<td><select name="indicadorProjetoPedagogicoAtualizado"
										value="${fornecedor.indicadorProjetoPedagogicoAtualizado}">
											<option>-Selecione-</option>
											<option>-Sim-</option>
											<option>-Não-</option>
									</select></td>
								</tr>
							</table>

							<input type="submit" value="Enviar" />
				</form>
			</div>
			</div>

			</div></li>


		<li><input type="radio" name="tabs" class="rd_tab" id="tab6">
			<label for="tab6" class="tab_label">RECURSOS HUMANOS</label>
			<div class="tab-content">
				<div class="divisoria">
					<div class="quadro-3">
						<section class="titulo1"> Total de profissionais que
						atuam nas seguintes funções na escola: </section>

						<form action="/gestaoEscolar/GestaoEscolaRecursosHumanosServlet">
							<input type="hidden" name="acao10" value="CREATE10" />
							<table style="width: 100%">
								<tr>
									<td>Código do usuário:</td>
									<td><input type="número" size="5"
										name="usuarioCriacaoRegistroTabela"
										value="${fornecedor.usuarioCriacaoRegistroTabela}"></td>
								</tr>
								<tr>
									<td>Código da Escola:</td>
									<td><input type="número" size="5"
										name="codigoEscolaRecursosHumanos"
										value="${fornecedor.codigoEscolaRecursosHumanos}"></td>
								</tr>
								<tr>
									<td>Data de Registro:</td>
									<td><input type="Date" name="dataCriacaoRegistroTabela"
										value="${fornecedor.dataCriacaoRegistroTabela}"></td>
								</tr>
								<tr>
									<td>*Auxiliares de secretaria ou auxiliares
										administrativos, atendentes:</td>
									<td><input type="text" size="5"
										name="profissionaisEscolaQtdAuxiliaresSecretariaAuxiliare"
										value="${fornecedor.profissionaisEscolaQtdAuxiliaresSecretariaAuxiliare}"></td>
								</tr>
								<tr>
									<td bgcolor="#DFDFDF">*Auxiliar de serviços gerais,
										porteiro(a), zelador(a), faxineiro(a), horticultor(a),
										jardineiro(a):</td>
									<td><input type="text" size="5"
										name="profissionaisEscolaQtdServicoGeraisPorteirosZelador"
										value="${fornecedor.profissionaisEscolaQtdServicoGeraisPorteirosZelador}"></td>
								</tr>
								<tr>
									<td>*Bibliotecário(a), auxiliar de biblioteca ou
										monitor(a) da sala de leitura:</td>
									<td><input type="text" size="5"
										name="profissionaisEscolaQtdBibliotecarioAuxiliarBiblioteca"
										value="${fornecedor.profissionaisEscolaQtdBibliotecarioAuxiliarBiblioteca}"></td>
								</tr>
								<tr>
									<td bgcolor="#DFDFDF">*Coordenador(a) de
										turno/disciplinar:</td>
									<td><input type="text" size="5"
										name="profissionaisEscolaQtdCoordenadorTurnoDisciplinar"
										value="${fornecedor.profissionaisEscolaQtdCoordenadorTurnoDisciplinar}"></td>
								</tr>
								<tr>
									<td>*Nutricionista:</td>
									<td><input type="text" size="5"
										name="profissionaisEscolaQtdNutricionista"
										value="${fornecedor.profissionaisEscolaQtdNutricionista}"></td>
								</tr>

								<tr>
									<td>*Fonodiólogo:</td>
									<td><input type="text" size="5"
										name="profissionaisEscolaQtdFonoaudiologo"
										value="${fornecedor.profissionaisEscolaQtdFonoaudiologo}"></td>
								</tr>
								<tr>
									<td bgcolor="#DFDFDF">*Psicólogo(a) Escolar:</td>
									<td><input type="text" size="5"
										name="profissionaisEscolaQtdPsicologoEscolar"
										value="${fornecedor.profissionaisEscolaQtdPsicologoEscolar}"></td>
								</tr>
								<tr>
									<td>*Secretário(a) escolar:</td>
									<td><input type="text" size="5"
										name="profissionaisEscolaQtdSecretarioEscolar"
										value="${fornecedor.profissionaisEscolaQtdSecretarioEscolar}"></td>
								</tr>
								<tr>
									<td bgcolor="#DFDFDF">*Seguranças, guarda ou segurança
										patrimonial:</td>
									<td><input type="text" size="5"
										name="profissionaisEscolaQtdSegurancaGuardaPatr"
										value="${fornecedor.profissionaisEscolaQtdSegurancaGuardaPatr}"></td>
								</tr>
								<tr>
									<td>*Orientador(a) comunitário(a) ou assistente social:</td>
									<td><input type="text" size="5"
										name="profissionaisEscolaQtdOrientadorComunitarioAssisten"
										value="${fornecedor.profissionaisEscolaQtdOrientadorComunitarioAssisten}"></td>
								</tr>
								<tr>
									<td bgcolor="#DFDFDF">*Bombeiro(a) brigadista,
										profissionais de assistência à  saúde (urgência e emergência),
										Enfermeiro(a), Técnico(a) de enfermagem e socorrista:</td>
									<td><input type="text" size="5"
										name="profissionaisEscolaQtdBombeiroBrigadistaProfissiona"
										value="${fornecedor.profissionaisEscolaQtdBombeiroBrigadistaProfissiona}"></td>
								</tr>
								<tr>
									<td>*Profissionais de preparação e segurança alimentar,
										cozinheiro(a), merendeira e auxiliar de cozinha:</td>
									<td><input type="text" size="5"
										name="profissionaisEscolaQtdNutricionista"
										value="${fornecedor.profissionaisEscolaQtdNutricionista}"></td>
								</tr>
								<tr>
									<td>*Profissionais de preparação e segurança :</td>
									<td><input type="text" size="5"
										name="profissionaisEscolaQtdProfissionalPreparacaoSeguranca"
										value="${fornecedor.profissionaisEscolaQtdProfissionalPreparacaoSeguranca}"></td>
								</tr>
								<tr>
									<td bgcolor="#DFDFDF">*Vice-diretor(a) ou diretor(a)
										adjunto(a), profissionais responsáveis pela gestão
										administrativa e/ou financeira:</td>
									<td><input type="text" size="5"
										name="profissionaisEscolaQtdViceDiretorAdjuntoPr"
										value="${fornecedor.profissionaisEscolaQtdViceDiretorAdjuntoPr}"></td>
								</tr>
								<tr>
									<td>*Técnicos(as), monitores(as), supervisores(as) ou
										auxiliares de laboratório(s), de apoio a tecnologias
										educacionais multimeios/multimédias eletrônico-digitais:</td>
									<td><input type="numero" size="5"
										name="profissionaisEscolaQtdTecnicoMonitoresSupervisores"
										value="${fornecedor.profissionaisEscolaQtdTecnicoMonitoresSupervisores}"></td>
								</tr>
								<tr>
									<td bgcolor="#DFDFDF">*Profissionais de apoio e
										supervissão pedagógica: (pedagogo(a), coordenador(a),
										orientador(a) educacional, supervisor(a) escolar e
										coordenador(a) de área de ensino:</td>
									<td><input type="text" size="5"
										name="profissionaisEscolaQtdProfissionalApoioSupervisaoP"
										value="${fornecedor.profissionaisEscolaQtdProfissionalApoioSupervisaoP}"></td>
								</tr>
								
								<tr>
								<td>
								<section class="titulo1"> Alimentação escolar: </section><br>
								<input type="radio" name="indicadorAlimentacaoEscolaPnaeFnde"
									value="S" ${fornecedor.indicadorAlimentacaoEscolaPnaeFnde}>
								<label>Sim</label>
								
								<br>
								
								<input type="radio" name="indicadorAlimentacaoEscolaPnaeFnde"
									value="N" ${fornecedor.indicadorAlimentacaoEscolaPnaeFnde}>
								<label>Não</label>
								<br>
								</td>
								</tr>

							</table>
							<input type="submit" value="Enviar" />

						</form>
					</div>
				</div>
			</div></li>
		<li><input type="radio" name="tabs" class="rd_tab" id="tab7">
			<label for="tab7" class="tab_label">PNAE / FNDE </label>
			<div class="tab-content">
				<div class="quadro-4">
					<section class="titulo1"> Alimentação escolar: </section>
					<div class="alinhamento1">
						<form>
							<input type="radio" name="indicadorAlimentacaoEscolaPnaeFnde"
								value="S" ${fornecedor.indicadorAlimentacaoEscolaPnaeFnde}>
							<label>Sim</label><br> <input type="radio"
								name="indicadorAlimentacaoEscolaPnaeFnde" value="N"
								${fornecedor.indicadorAlimentacaoEscolaPnaeFnde}> <label>Não</label><br>
							<input type="submit" value="Enviar" />

						</form>
					</div>
				</div>
			</div></li>
	</ul>
	</nav>

</body>
</html>