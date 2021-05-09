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

<title>Escola</title>
</head>
<body>
<h2><c:out value="${mensagem}" /></h2>
	<nav class="nav_tabs">
	<ul>
		<li><input type="radio" id="tab1" class="rd_tab" name="tabs"
			checked> <label for="tab1" class="tab_label">DADOS
				GERAIS</label>
			<div class="tab-content">
				<div class="divisoria">
					<div class="quadro1-inf-gerais">
						<section class="titulo1"> Informaaçõesµes Gerais: </section>

						<form method="POST" action="/gestaoEscolar/visitanteServlet">
							<input type="hidden" name="acao" value="CREATE" />
							
							<table style="width: 100%">
								<tr>
									<td>Secretaria: Secretaria municipal de educação:</td>
									<td><strong>Secretaria municipal de educação -
											São Luis</strong></td>
									<td>Sigla:</td>
									<td>SEMED</td>
								</tr>
								<tr>
									<td>Núcleo:</td>
									<td><input value="123458"></td>
									<td>Sigla:</td>
									<td>PMSL</td>
								</tr>
								<tr>
									<td>Codigo INEP:</td>
									<td><input type="number" name="codInep"
										value="${fornecedor.nomeEscola}" /></td>
									<td>Tipo:</td>
									<td><select>
											<option>Polo</option>
											<option>Anexo</option>
									</select></td>
								</tr>
								<tr>
									<td>Nome da Escola:</td>
									<td><input type="text"></td>
									<td>Dependência Administrativa:</td>
									<td><select>
											<option>Municipal</option>
											<option>Estadual</option>
											<option>Federal</option>
											<option>Privada</option>
									</select></td>
								</tr>
								<tr>
									<td>CNPJ da unidade:</td>
									<td><input></td>
									<td>Regulamentação/Autorização:</td>
									<td><select>
											<option>-Selecione-</option>
											<option>Em tramitação</option>
											<option>Sim</option>
											<option>Não</option>
									</select></td>
								</tr>
								<tr>
									<td>Situação de Funcionamento:</td>
									<td><select>
											<option>-Selecione-</option>
											<option>Em funcionamento</option>
											<option>Paralisada</option>
											<option>Extinta</option>
									</select></td>
									<td>Zona:</td>
									<td><select>
											<option>-Selecione-</option>
											<option>Rural</option>
											<option>Urbana</option>
									</select></td>
								</tr>
							</table>
							<br> <input type="submit" value="Enviar" /><br>
						</form>
					</div>
				</div>
				<div class="divisoria">
					<div class="quadro-endereco">
						<section class="titulo1"> Endereço </section>
						<table style="width: 100%">
							<tr>
								<td>CEP:</td>
								<td><input></td>
								<td>Distrito:</td>
								<td><input></td>
								<td>UF:</td>
								<td><input></td>
							</tr>
							<tr>
								<td>Logradouro/Rua:</td>
								<td><input></td>
								<td>Número:</td>
								<td><input></td>
								<td>Latitude</td>
								<td><input type="text" value=" 911232130' " disabled></td>
							</tr>
							<tr>
								<td>Complemento:</td>
								<td><input></td>
								<td>Bairro:</td>
								<td><input></td>
								<td>Longitude</td>
								<td><input type="text" value="  23211234422' " disabled>
								</td>
							</tr>
							<tr>
								<td>Município:</td>
								<td><input></td>
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
								<td><input></td>
								<td>Fax:</td>
								<td><input></td>
							</tr>
							<tr>
								<td>Telefone Celular::</td>
								<td><input></td>
								<td>Número:</td>
								<td><input></td>
							</tr>
							<tr>
						</table>
					</div>
				</div>
			</div></li>
		<li><input type="radio" name="tabs" class="rd_tab" id="tab2">
			<label for="tab2" class="tab_label">DADOS DOS GESTORES</label>
			<div class="tab-content">
				<div class="divisoria">
					<div class="quadro1-inf-gerais">
						<section class="titulo3"> Diretor Geral: </section>
						<table style="width: 100%">
							<tr>
								<td>Nome do Diretor:</td>
								<td><input size="50"></td>
								<td>Email:</td>
								<td><input></td>
							</tr>
							<tr>
								<td>CPF do Diretor:</td>
								<td><input></td>
								<td>SituaÃ§Ã£o Funcional:</td>
								<td><select>
										<option>- Selecione -</option>
										<option>1- Concursado/Efetivo/EstÃ¡vel</option>
										<option>2- Contrato temporÃ¡rio</option>
										<option>3- Contrato terceirizado</option>
										<option>4- Contrato CLT</option>
								</select></td>
							</tr>
							<tr>
							</tr>
							<tr>
								<td>CritÃ©rio de acesso ao cargo/funÃ§Ã£o:</td>
								<td><select>
										<option>- Selecione -</option>
										<option>1- Exclusivamente por indicaÃ§Ã£o/escolha da
											gestÃ£o</option>
										<option>2- Processo seletivo qualificado e
											escolha/nomeaÃ§Ã£o da gestÃ£o</option>
										<option>3- Concurso pÃºblico especÃ­fico para o cargo
											de gestor escolar</option>
										<option>4- Exclusivamente por processo eleitoral com
											participaÃ§Ã£o da comunidade escolar</option>
										<option>5- Processo seletivo qualificado e eleiÃ§Ã£o
											com a participaÃ§Ã£o da comunidade escolar</option>
										<option>6- Outros</option>
								</select></td>
							</tr>
						</table>
						<section class="titulo2"> Diretor Adjunto: </section>
						<table style="width: 100%">
							<tr>
								<td>Nome do Diretor Adjunto:</td>
								<td><input size="50"></td>
								<td>Email:</td>
								<td><input></td>
							</tr>
							<tr>
								<td>CPF do Diretor Adjunto:</td>
								<td><input></td>
								<td>SituaÃ§Ã£o Funcional:</td>
								<td><select>
										<option>- selecione -</option>
										<option>1- Concursado/Efetivo/EstÃ¡vel</option>
										<option>2- Contrato temporÃ¡rio</option>
										<option>3- Contrato terceirizado</option>
										<option>4- Contrato CLT</option>
								</select></td>
							</tr>
							<tr>
							</tr>
							<tr>
								<td>CritÃ©rio de acesso ao cargo/funÃ§Ã£o:</td>
								<td><select>
										<option>- selecione -</option>
										<option>1- Exclusivamente por indicaÃ§Ã£o/escolha da
											gestÃ£o</option>
										<option>2- Processo seletivo qualificado e
											escolha/nomeaÃ§Ã£o da gestÃ£o</option>
										<option>3- Concurso pÃºblico especÃ­fico para o cargo
											de gestor escolar</option>
										<option>4- Exclusivamente por processo eleitoral com
											participaÃ§Ã£o da comunidade escolar</option>
										<option>5- Processo seletivo qualificado e eleiÃ§Ã£o
											com a participaÃ§Ã£o da comunidade escolar</option>
										<option>6- Outros</option>
								</select></td>
							</tr>
						</table>
						<section class="titulo2"> Coordenador PedagÃ³gico: </section>
						<table style="width: 100%">
							<tr>
								<td>Nome do Coordenador:</td>
								<td><input size="50"></td>
								<td>SituaÃ§Ã£o Funcional:</td>
								<td><select>
										<option>- selecione -</option>
										<option>1- Concursado/Efetivo/EstÃ¡vel</option>
										<option>2- Contrato temporÃ¡rio</option>
										<option>3- Contrato terceirizado</option>
										<option>4- Contrato CLT</option>
								</select></td>
							</tr>
							<tr>
								<td>CPF do Coordenador:</td>
								<td><input></td>
								<td>Carga horÃ¡ria:</td>
								<td><input size="3"></td>
							</tr>
							<tr>
								<td>Email:</td>
								<td><input></td>
								<td>Turno:</td>
								<td><select>
										<option>- Selecione -</option>
										<option>-Matutino-</option>
										<option>-Vespertino</option>
										<option>-Noturno</option>
										<option>-Integral</option>
								</select></td>
							</tr>
							<tr>
								<td>CritÃ©rio de acesso ao cargo/funÃ§Ã£o:</td>
								<td><select>
										<option>- selecione -</option>
										<option>1- Exclusivamente por indicaÃ§Ã£o/escolha da
											gestÃ£o</option>
										<option>2- Processo seletivo qualificado e
											escolha/nomeaÃ§Ã£o da gestÃ£o</option>
										<option>3- Concurso pÃºblico especÃ­fico para o cargo
											de gestor escolar</option>
										<option>4- Exclusivamente por processo eleitoral com
											participaÃ§Ã£o da comunidade escolar</option>
										<option>5- Processo seletivo qualificado e eleiÃ§Ã£o
											com a participaÃ§Ã£o da comunidade escolar</option>
										<option>6- Outros</option>
								</select></td>
							</tr>
						</table>
						<section class="titulo2"> Coordenador de Anexo: </section>
						<table style="width: 100%">
							<tr>
								<td>Nome do Coordenador de Anexo:</td>
								<td><input size="50"></td>
								<td>SituaÃ§Ã£o Funcional:</td>
								<td><select>
										<option>- selecione -</option>
										<option>1- Concursado/Efetivo/EstÃ¡vel</option>
										<option>2- Contrato temporÃ¡rio</option>
										<option>3- Contrato terceirizado</option>
										<option>4- Contrato CLT</option>
								</select></td>
							</tr>
							<tr>
								<td>CPF do Coordenador de Anexo:</td>
								<td><input></td>
								<td>Carga horÃ¡ria:</td>
								<td><input size="3"></td>
							</tr>
							<tr>
								<td>Email:</td>
								<td><input></td>
								<td>Turno:</td>
								<td><select>
										<option>- Selecione -</option>
										<option>-Matutino-</option>
										<option>-Vespertino</option>
										<option>-Noturno</option>
										<option>-Integral</option>
								</select></td>
							</tr>
							<tr>
								<td>CritÃ©rio de acesso ao cargo/funÃ§Ã£o:</td>
								<td><select>
										<option>- selecione -</option>
										<option>1- Exclusivamente por indicaÃ§Ã£o/escolha da
											gestÃ£o</option>
										<option>2- Processo seletivo qualificado e
											escolha/nomeaÃ§Ã£o da gestÃ£o</option>
										<option>3- Concurso pÃºblico especÃ­fico para o cargo
											de gestor escolar</option>
										<option>4- Exclusivamente por processo eleitoral com
											participaÃ§Ã£o da comunidade escolar</option>
										<option>5- Processo seletivo qualificado e eleiÃ§Ã£o
											com a participaÃ§Ã£o da comunidade escolar</option>
										<option>6- Outros</option>
								</select></td>
							</tr>
						</table>
						<section class="titulo2"> SecretÃ¡rio Escolar: </section>
						<table style="width: 100%">
							<tr>
								<td>Nome do SecretÃ¡rio Escolar:</td>
								<td><input size="50"></td>
								<td>SituaÃ§Ã£o Funcional:</td>
								<td><select>
										<option>- selecione -</option>
										<option>1- Concursado/Efetivo/EstÃ¡vel</option>
										<option>2- Contrato temporÃ¡rio</option>
										<option>3- Contrato terceirizado</option>
										<option>4- Contrato CLT</option>
								</select></td>
							</tr>
							<tr>
								<td>CPF do SecretÃ¡rio Escolar:</td>
								<td><input></td>
								<td>Carga horÃ¡ria:</td>
								<td><input size="3"></td>
							</tr>
							<tr>
								<td>Email:</td>
								<td><input></td>
								<td>Turno:</td>
								<td><select>
										<option>- Selecione -</option>
										<option>-Matutino-</option>
										<option>-Vespertino</option>
										<option>-Noturno</option>
										<option>-Integral</option>
								</select></td>
							</tr>
							<tr>
								<td>CritÃ©rio de acesso ao cargo/funÃ§Ã£o:</td>
								<td><select>
										<option>- selecione -</option>
										<option>1- Exclusivamente por indicaÃ§Ã£o/escolha da
											gestÃ£o</option>
										<option>2- Processo seletivo qualificado e
											escolha/nomeaÃ§Ã£o da gestÃ£o</option>
										<option>3- Concurso pÃºblico especÃ­fico para o cargo
											de gestor escolar</option>
										<option>4- Exclusivamente por processo eleitoral com
											participaÃ§Ã£o da comunidade escolar</option>
										<option>5- Processo seletivo qualificado e eleiÃ§Ã£o
											com a participaÃ§Ã£o da comunidade escolar</option>
										<option>6- Outros</option>
								</select></td>
							</tr>
						</table>
						<section class="titulo2"> Diretor(a) de NÃºcleo: </section>
						<table style="width: 100%">
							<tr>
								<td>Nome do(a) Diretor(a) de NÃºcleo:</td>
								<td><input size="50"></td>
								<td>SituaÃ§Ã£o Funcional:</td>
								<td><select>
										<option>- selecione -</option>
										<option>1- Concursado/Efetivo/EstÃ¡vel</option>
										<option>2- Contrato temporÃ¡rio</option>
										<option>3- Contrato terceirizado</option>
										<option>4- Contrato CLT</option>
								</select></td>
							</tr>
							<tr>
								<td>CPF do(a) Diretor(a) de NÃºcleo:</td>
								<td><input></td>
								<td>Carga horÃ¡ria:</td>
								<td><input size="3"></td>
							</tr>
							<tr>
								<td>Email:</td>
								<td><input></td>
								<td>Turno:</td>
								<td><select>
										<option>- Selecione -</option>
										<option>-Matutino-</option>
										<option>-Vespertino</option>
										<option>-Noturno</option>
										<option>-Integral</option>
								</select></td>
							</tr>
							<tr>
								<td>CritÃ©rio de acesso ao cargo/funÃ§Ã£o:</td>
								<td><select>
										<option>- selecione -</option>
										<option>1- Exclusivamente por indicaÃ§Ã£o/escolha da
											gestÃ£o</option>
										<option>2- Processo seletivo qualificado e
											escolha/nomeaÃ§Ã£o da gestÃ£o</option>
										<option>3- Concurso pÃºblico especÃ­fico para o cargo
											de gestor escolar</option>
										<option>4- Exclusivamente por processo eleitoral com
											participaÃ§Ã£o da comunidade escolar</option>
										<option>5- Processo seletivo qualificado e eleiÃ§Ã£o
											com a participaÃ§Ã£o da comunidade escolar</option>
										<option>6- Outros</option>
								</select></td>
							</tr>
						</table>
					</div>
				</div>
			</div></li>
		<li><input type="radio" name="tabs" class="rd_tab" id="tab3">
			<label for="tab3" class="tab_label">INFRAESTRUTURA</label>
			<div class="tab-content">
				<div class="divisoria">
					<div class="quadro-1">
						<section class="titulo1"> Estrutura da escola: </section>
						<table style="width: 100%">
							<tr>
								<td>Local de funcionamento da escola:</td>
								<td><select>
										<option>-selecione-</option>
										<option>-Unidade de internaÃ§Ã£o socioeducativo-</option>
								</select></td>
							</tr>
							<tr>
								<td>Forma de ocupaÃ§Ã£o do prÃ©dio escolar:</td>
								<td><select>
										<option>-selecione-</option>
										<option>-Alugado-</option>
										<option>-PrÃ³prio-</option>
								</select></td>
							</tr>
						</table>
					</div>
					<div class="quadro-2">
						<section class="titulo1"> Predio compartilhado: </section>
						<table style="width: 100%">
							<tr>
								<div class="prediocomp">Caso o prÃ©dio seja compartilhado
									adicione o(s) cÃ³digo(s) da(s) escola(s).</div>
								<div id="camposcodigo">
									<button type="submit">
										<i class="fa fa-plus-circle" aria-hidden="true"></i>Adicionar
									</button>
									<input type="text" disabled />
								</div>
							</tr>
						</table>
					</div>
				</div>
				<div class="divisoria">
					<div class="quadro-dependencia">
						<section class="titulo1"> DependÃªncia existentes na
						escola: </section>
						<div id="campodependencia">
							<div>
								<input type="checkbox"> <label>Almoxarifado</label>
							</div>
							<div>
								<input type="checkbox"> <label>Ã�rea verde</label>
							</div>
							<div>
								<input type="checkbox"> <label>AuditÃ³rio</label>
							</div>
							<div>
								<input type="checkbox"> <label>Biblioteca</label>
							</div>
							<div>
								<input type="checkbox"> <label>Cozinha</label>
							</div>
							<div>
								<input type="checkbox"> <label>Banheiro</label>
							</div>
							<div>
								<input type="checkbox"> <label>Despensa</label>
							</div>
							<div>
								<input type="checkbox"> <label>Piscina</label>
							</div>
							<div>
								<input type="checkbox"> <label>RefeitÃ³rio</label>
							</div>
							<div>
								<input type="checkbox"> <label>PÃ¡tio coberto</label>
							</div>
							<div>
								<input type="checkbox"> <label>PÃ¡tio descoberto</label>
							</div>
							<div>
								<input type="checkbox"> <label>Sala/ateliÃª de
									artes</label>
							</div>
							<div>
								<input type="checkbox"> <label>Sala de
									mÃºsica/coral</label>
							</div>
							<div>
								<input type="checkbox"> <label>Sala/estÃºdio de
									danÃ§a</label>
							</div>
							<div>
								<input type="checkbox"> <label>Sala de diretoria</label>
							</div>
							<div>
								<input type="checkbox"> <label>Sala de leitura</label>
							</div>
							<div>
								<input type="checkbox"> <label>Sala de
									professores</label>
							</div>
							<div>
								<input type="checkbox"> <label>Sala de
									secretaria</label>
							</div>
							<div>
								<input type="checkbox"> <label>Banheiro adequado
									Ã  educaÃ§Ã£o infantil</label>
							</div>
							<div>
								<input type="checkbox"> <label>Banheiro
									acessÃ­vel(para Deficiente FÃ­sico)</label>
							</div>
							<div>
								<input type="checkbox"> <label>Banheiro
									exclusivo para os funcionÃ¡rios</label>
							</div>
							<div>
								<input type="checkbox"> <label>Banheiro ou
									vestiÃ¡rio com chuveiro</label>
							</div>
							<div>
								<input type="checkbox"> <label>Quadra de
									esportes coberta</label>
							</div>
							<div>
								<input type="checkbox"> <label>Quadra de
									esportes descoberta</label>
							</div>
							<div>
								<input type="checkbox"> <label>LaboratÃ³rio de
									informÃ¡tica</label>
							</div>
							<div>
								<input type="checkbox"> <label>LaboratÃ³rio de
									ciÃªncias</label>
							</div>
							<div>
								<input type="checkbox"> <label>DormitÃ³rio de
									professor</label>
							</div>
							<div>
								<input type="checkbox"> <label>DormitÃ³rio de
									aluno</label>
							</div>
							<div>
								<input type="checkbox"> <label>Sala multiuso
									(mÃºsica, danÃ§a e artes)</label>
							</div>
							<div>
								<input type="checkbox"> <label>Viveiro/criaÃ§Ã£o
									de animais</label>
							</div>
							<div>
								<input type="checkbox"> <label>TerreirÃ£o (Ã¡rea
									para prÃ¡tica recreativa)</label>
							</div>
							<div>
								<input type="checkbox"> <label>Sala de recursos
									multifuncionais para Atendimento Educacional Especializado
									(AEE)</label>
							</div>
							<div>
								<input type="checkbox"> <label>Nenhuma das
									dependÃªncias relacionadas</label>
							</div>
						</div>
						<section class="titulo1"> Recursos de acessibilidade: </section>
						<div id="campos02col">
							<div>
								<input type="checkbox"> <label>Elevador</label>
							</div>
							<div>
								<input type="checkbox"> <label>Pisos tÃ¡teis</label>
							</div>
							<div>
								<input type="checkbox"> <label>Rampas</label>
							</div>
							<div>
								<input type="checkbox"> <label>SinalizaÃ§Ã£o
									sonora</label>
							</div>
							<div>
								<input type="checkbox"> <label>SinalizaÃ§Ã£o
									tÃ¡til (piso/paredes)</label>
							</div>
							<div>
								<input type="checkbox"> <label>SinalizaÃ§Ã£o
									visual (piso/paredes)</label>
							</div>
							<div>
								<input type="checkbox"> <label>CorrimÃ£o e
									guarda-corpos</label>
							</div>
							<div>
								<input type="checkbox"> <label>Portas com vÃ£o
									livre de no mÃ­nimo 80 cm</label>
							</div>
							<div>
								<input type="checkbox"> <label>Nenhum dos
									recursos de acessibilidade listados</label>
							</div>
						</div>
					</div>
					<div class="quadro-agua">
						<section class="titulo1"> Abastecimento de Ã¡gua: </section>
						<div id="campos01">
							<div>
								<input type="checkbox"> <label>Rede pÃºblica</label>
							</div>
							<div>
								<input type="checkbox"> <label>PoÃ§o artesiano</label>
							</div>
							<div>
								<input type="checkbox"> <label>Cacimba;
									Cisterna; PoÃ§o</label>
							</div>
							<div>
								<input type="checkbox"> <label>Fonte; Rio;
									IgarapÃ©; CÃ³rrego</label>
							</div>
							<div>
								<input type="checkbox"> <label>NÃ£o existe
									abastecimento de Ã¡gua</label>
							</div>
						</div>
						<section class="titulo1"> Esgotamento sanitÃ¡rio: </section>
						<div id="campos01">
							<div>
								<input type="checkbox"> <label>Rede pÃºblica</label>
							</div>
							<div>
								<input type="checkbox"> <label>Fossa sÃ©ptica</label>
							</div>
							<div>
								<input type="checkbox"> <label>Fossa
									rudimentar/comum</label>
							</div>
							<div>
								<input type="checkbox"> <label>NÃ£o hÃ¡
									esgotamento sanitÃ¡rio</label>
							</div>
						</div>

						<section class="titulo1"> Fonte de energia elÃ©trica: </section>
						<div id="campos01">
							<div>
								<input type="checkbox"> <label>Rede pÃºblica</label>
							</div>
							<div>
								<input type="checkbox"> <label>Gerador movido Ã 
									combustÃ­vel fÃ³ssil</label>
							</div>
							<div>
								<input type="checkbox"> <label>Fonte de energia
									renovÃ¡veis ou alternativas</label>
							</div>
							<div>
								<input type="checkbox"> <label>NÃ£o hÃ¡ energia
									elÃ©trica</label>
							</div>
						</div>

						<section class="titulo1"> Tratamento de lixo/resÃ­duos:
						</section>
						<div id="campos01">
							<div>
								<input type="checkbox"> <label> SeparaÃ§Ã£o do
									lixo/resÃ­duos</label>
							</div>
							<div>
								<input type="checkbox"> <label>Reaproveitamento/reutilizaÃ§Ã£o</label>
							</div>
							<div>
								<input type="checkbox"> <label>Reciclagem</label>
							</div>
							<div>
								<input type="checkbox"> <label>NÃ£o hÃ¡
									tratamento</label>
							</div>
						</div>

						<section class="titulo1"> DestinaÃ§Ã£o do lixo: </section>
						<div id="campos01">
							<div>
								<input type="checkbox"> <label>ServiÃ§o de
									coleta</label>
							</div>
							<div>
								<input type="checkbox"> <label>Queima</label>
							</div>
							<div>
								<input type="checkbox"> <label>Enterra</label>
							</div>
							<div>
								<input type="checkbox"> <label>Leva para
									destinaÃ§Ã£o final licenciada pelo poder pÃºblico</label>
							</div>
							<div>
								<input type="checkbox"> <label>Descarta em
									outras Ã¡reas</label>
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
									<td>NÃºmero de salas de aula utilizadas na escola dentro
										do prÃ©dio escolar:</td>
									<td><input type="text"></td>
								</tr>
								<tr>
									<td>NÃºmero de salas de aula utilizadas na escola fora do
										prÃ©dio escolar:</td>
									<td><input type="text"></td>
								</tr>
								<tr>
									<td>NÃºmero de salas de aula com acessibilidade para
										pessoas com deficiÃªncia ou mobilidade reduzida:</td>
									<td><input type="text"></td>
								</tr>
								<tr>
									<td>NÃºmero de salas de aula climatizadas:</td>
									<td><input type="text"></td>
								</tr>
							</table>
						</div>
						<section class="titulo1"> Infraestrutura Organizacional
						</section>
						<div id="campos01">
							<table style="width: 100%">
								<tr>
									<td bgcolor="#DFDFDF">Esfera administrativa do conselho ou
										Ã³rgÃ£o responsÃ¡vel pela RegulamentaÃ§Ã£o/AutorizaÃ§Ã£o:</td>
									<td bgcolor="#DFDFDF"><select>
											<option>-Selecione-</option>
											<option>-Municipal-</option>
											<option>-Estadual-</option>
											<option>-Federal</option>
									</select></td>
								</tr>
								<tr>
									<td>Escola abre aos finais de semana para a comunidade:</td>
									<td><select>
											<option>-Selecione-</option>
											<option>-Sim-</option>
											<option>-NÃ£o-</option>
									</select></td>
								</tr>
								<tr>
									<td bgcolor="#DFDFDF">Escola com proposta pedagÃ³gica de
										formaÃ§Ã£o por alternÃ¢ncia:</td>
									<td bgcolor="#DFDFDF"><select>
											<option>-Selecione-</option>
											<option>-Sim-</option>
											<option>-NÃ£o-</option>
									</select></td>
								</tr>
								<tr>
									<td>Escola conveniada com poder pÃºblico:</td>
									<td><select>
											<option>-Selecione-</option>
											<option>-Sim-</option>
											<option>-NÃ£o-</option>
									</select></td>
								</tr>
								<tr>
									<td bgcolor="#DFDFDF">Ã“rgÃ£o a que a escola pÃºblica
										estÃ¡ vinculada:</td>
									<td bgcolor="#DFDFDF"><select>
											<option>-Selecione-</option>
											<option>-Sec. de EducaÃ§Ã£o-</option>
											<option>-Sec. Seg. PÃºblica-</option>
											<option>-Sec. da SaÃºde-</option>
									</select></td>
								</tr>
								<tr>
									<td>Categoria de escola privada:</td>
									<td><select>
											<option>-Selecione-</option>
											<option>-Confessional-</option>
											<option>-ComunitÃ¡ria-</option>
											<option>-Particular-</option>
											<option>-FilantrÃ³pica-</option>
									</select></td>
								</tr>

								<tr>
									<td bgcolor="#DFDFDF">Escola cede espaÃ§o para turmas do
										Brasil Alfabetizado:</td>
									<td bgcolor="#DFDFDF"><select>
											<option>-Selecione-</option>
											<option>-Sim-</option>
											<option>-NÃ£o-</option>
									</select></td>
								</tr>
								<tr>
									<td>Mantenedora da escola privada:</td>
									<td><select>
											<option>-Selecione-</option>
											<option>-Empresa, grupos empresariais do setor
												privado ou pessoa fÃ­sica-</option>
											<option>-InstituiÃ§Ãµes sem fins lucrativos-</option>
											<option>-OrganizaÃ§Ã£o nÃ£o governamental (ONG)
												internacional ou nacional;-</option>
											<option>-OrganizaÃ§Ã£o da Sociedade Civil de
												Interesse PÃºblico (OSCIP)-</option>
											<option>-Sindicatos de trabalhadores ou patronais,
												associaÃ§Ãµes, cooperativas-</option>
											<option>-Sistema S(Sesi, Senai, Sesc, outros)-</option>
									</select></td>
								</tr>
								<tr>
									<td bgcolor="#DFDFDF">LocalizaÃ§Ã£o diferenciada:</td>
									<td bgcolor="#DFDFDF"><select>
											<option>-NÃ£o estÃ¡ em Ã¡rea de localizaÃ§Ã£o
												diferenciada-</option>
											<option>-Ã�rea remanescente de quilombos-</option>
											<option>-Terra indÃ­gena-</option>
											<option>-Ã�rea de assentamento</option>
									</select></td>
								</tr>
							</table>
						</div>
					</div>
				</div>
			</div></li>
		<li><input type="radio" name="tabs" class="rd_tab" id="tab4">
			<label for="tab4" class="tab_label">EQUIPAMENTO</label>
			<div class="tab-content">
				<div class="divisoria">
					<div class="quadro-1">
						<section class="titulo1"> Equipamentos existentes na
						escola para uso tÃ©cnico e administrativo: </section>
						<div class="alinhamento1">
							<table style="width: 100%">
								<tr>
									<td>Quantidade de Antenas ParabÃ³lica:</td>
									<td><input type="text"></td>
								</tr>
								<tr>
									<td>Quantidade de computadores:</td>
									<td><input type="text"></td>
								</tr>
								<tr>
									<td>Quantidade de Copiadoras:</td>
									<td><input type="text"></td>
								</tr>
								<tr>
									<td>Quantidade de Impressoras:</td>
									<td><input type="text"></td>
								</tr>
								<tr>
									<td>Quantidade de impressoras multifuncionais:</td>
									<td><input type="text"></td>
								</tr>
								<tr>
									<td>Quantidade de Scanner:</td>
									<td><input type="text"></td>
								</tr>
							</table>
						</div>
						<section class="titulo1"> Acesso Ã  internet: </section>
						<div class="alinhamento1">
							<div>
								<input type="checkbox"> <label>Para uso dos
									alunos</label>
							</div>
							<div>
								<input type="checkbox"> <label>Para uso
									administrativo</label>
							</div>
							<div>
								<input type="checkbox"> <label>Para uso nos
									processos de ensino e aprendizagem</label>
							</div>
							<div>
								<input type="checkbox"> <label>Para uso da
									comunidade</label>
							</div>
							<div>
								<input type="checkbox"> <label>NÃ£o possui
									acesso Ã  internet</label>
							</div>
						</div>
					</div>
					<div class="quadro-2">
						<section class="titulo1"> Quantidade de equipamentos
						para o processo de ensino e aprendizagem: </section>
						<table style="width: 100%">
							<tr>
								<td>Aparelho de DVD/Blu-ray:</td>
								<td><input type="text"></td>
							</tr>
							<tr>
								<td>Quantidade de Aparelhos de som:</td>
								<td><input type="text"></td>
							</tr>
							<tr>
								<td>Quantidade de Aparelhos de TelevisÃ£o:</td>
								<td><input type="text"></td>
							</tr>
							<tr>
								<td>Lousa digital:</td>
								<td><input type="text"></td>
							</tr>
							<tr>
								<td>Projetor MultimÃ­dia (Data show):</td>
								<td><input type="text"></td>
							</tr>
						</table>
						<section class="titulo1"> Quantidade de computadores em
						uso pelos alunos </section>

						<table style="width: 100%">
							<tr>
								<td>Computadores de mesa (desktop):</td>
								<td><input type="text"></td>
							</tr>
							<tr>
								<td>Computadores portÃ¡teis:</td>
								<td><input type="text"></td>
							</tr>
							<tr>
								<td>Tablets:</td>
								<td><input type="text"></td>
							</tr>
						</table>

						<section class="titulo1"> Rede e Internet: </section>
						<div class="alinhamento1">
							<table>
								<tr>
									<td>Possui Internet Banda Larga?</td>
									<td><select>
											<option>-Selecione-</option>
											<option>-Sim-</option>
											<option>-NÃ£o-</option>
									</select></td>
								</tr>
								<tr>
									<td>Rede local de interligaÃ§Ã£o de computadores</td>
									<td><select>
											<option>-Selecione-</option>
											<option>-A cabo-</option>
											<option>-Wireless-</option>
											<option>-A cabo e Wireless-</option>
											<option>-NÃ£o hÃ¡ rede local-</option>
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
								<td>Computadores de mesa, portÃ¡teis e tablets prÃ³prio da
									escola (no laboratÃ³rio de informÃ¡tica, biblioteca, sala de
									aula, etc.)</td>
								<td><input type="checkbox"></td>
							</tr>
							<tr>
								<td>SÃ£o utilizados tambÃ©m dispositivos pessoais na
									intituiÃ§Ã£o (computadores portÃ¡teis, celulares, tablets,
									etc.)</td>
								<td><input type="checkbox"></td>
							</tr>
						</table>
					</div>
				</div>
			</div></li>
		<li><input type="radio" name="tabs" class="rd_tab" id="tab5">
			<label for="tab5" class="tab_label">DADOS EDUCACIONAIS</label>
			<div class="tab-content">
				<div class="divisoria">
					<div class="quadro-1">
						<section class="titulo1"> Formas de organizaÃ§Ã£o do
						ensino: </section>
						<div class="alinhamento1">
							<div>
								<input type="checkbox"> <label>SÃ©rie/Ano
									(sÃ©ries anuais)</label>
							</div>
							<div>
								<input type="checkbox"> <label>PerÃ­odos
									semestrais</label>
							</div>
							<div>
								<input type="checkbox"> <label>Ciclo(s) do
									Ensino Fundamental</label>
							</div>
							<div>
								<input type="checkbox"> <label>Grupos
									nÃ£o-seriados com base na idade ou competÃªncia (art. 23 LDB)</label>
							</div>
							<div>
								<input type="checkbox"> <label>MÃ³dulos,
									AlternÃ¢ncia regular de perÃ­odos de estudos (proposta
									pedagÃ³gica de formaÃ§Ã£o por alternÃ¢ncia: tempo-escola e
									tempo- comunidade)</label>
							</div>
						</div>
						<section class="titulo1"> Reserva de vagas por sistema
						de cota: </section>
						<div class="alinhamento1">
							<div>
								<input type="checkbox"> <label>Autodeclarado
									preto, pardo ou indÃ­gena (PPI)</label>
							</div>
							<div>
								<input type="checkbox"> <label>Pessoa com
									deficiÃªncia (PCD)</label>
							</div>
							<div>
								<input type="checkbox"> <label>CondiÃ§Ã£o de
									Renda</label>
							</div>
							<div>
								<input type="checkbox"> <label>Oriundo de escola
									pÃºblica</label>
							</div>
							<div>
								<input type="checkbox"> <label>Outros grupos que
									nÃ£o os listados</label>
							</div>
							<div>
								<input type="checkbox"> <label>Sem reservas de
									vagas</label>
							</div>
						</div>
					</div>

					<div class="quadro-2">
						<section class="titulo1"> SeleÃ§Ã£o: </section>
						<div class="alinhamento1">
							<table>
								<tr>
									<td>Escola faz exame de seleÃ§Ã£o para ingresso de alunos?</td>
									<td><select>
											<option>-Selecione-</option>
											<option>-Sim-</option>
											<option>-NÃ£o-</option>
									</select></td>
								</tr>
							</table>
						</div>
						<section class="titulo1"> Ã“rgÃ£os colegiados em
						funcionamento na escola: </section>
						<div class="alinhamento1">
							<div>
								<input type="checkbox"> <label>AssociaÃ§Ã£o de
									pais</label>
							</div>
							<div>
								<input type="checkbox"> <label>AssociaÃ§Ã£o de
									pais e mestres</label>
							</div>
							<div>
								<input type="checkbox"> <label>Conselho escolar</label>
							</div>
							<div>
								<input type="checkbox"> <label>GrÃªmio
									estudantil</label>
							</div>
							<div>
								<input type="checkbox"> <label>Outros</label>
							</div>
							<div>
								<input type="checkbox"> <label>NÃ£o hÃ¡ Ã³rgÃ£os
									colegiados em funcionamento</label>
							</div>
						</div>
						<section class="titulo1"> EducaÃ§Ã£o indÃ­gena: </section>
						<div class="alinhamento1">
							<div class="alinhamento1">
								<form class="form1">
									<input type="radio" name="gender"> <label>Sim</label> <input
										type="radio" name="gender"> <label>NÃ£o</label>
								</form>
								<form>
									<label>Lingua Portuguesa:</label> <input type="checkbox">
								</form>
								<label>Lingua indÃ­gena:</label> <input type="checkbox"
									onchange="hablilitarcampo(this);"> <input
									placeholder="insira o cÃ³digo" type="text" disabled="true">
							</div>
						</div>
						<section class="titulo1"> A escola possui site ou blog
						ou pÃ¡gina em redes sociais para comunicaÃ§Ã£o institucional? </section>
						<div class="alinhamento1">
							<form class="form2">
								<input type="radio" name="gender"> <label>Sim</label> <input
									type="radio" name="gender"> <label>NÃ£o</label>
							</form>
						</div>
					</div>
				</div>
				<div class="quadro-3">
					<section class="titulo1"> Instrumentos e materiais
					socioculturais e/ou pedagÃ³gicos em uso na escola para
					desenvolvimento de atividades de ensino aprendizagem </section>
					<div id="campos02col">
						<div>
							<input type="checkbox"> <label>Acervo multimÃ­dia</label>
						</div>
						<div>
							<input type="checkbox"> <label>Instrumentos
								musicais para conjunto, banda/fanfarra e/ou aulas de mÃºsica</label>
						</div>
						<div>
							<input type="checkbox"> <label>Materiais
								pedagÃ³gicos para a educaÃ§Ã£o escolar indÃ­gena</label>
						</div>
						<div>
							<input type="checkbox"> <label>Brinquedos para
								educaÃ§Ã£o infantil</label>
						</div>
						<div>
							<input type="checkbox"> <label>Jogos educativos</label>
						</div>
						<div>
							<input type="checkbox"> <label>Materiais
								pedagÃ³gicos para a educaÃ§Ã£o das relaÃ§Ãµes Ã©tnicos raciais</label>
						</div>
						<div>
							<input type="checkbox"> <label>Materiais para
								atividades culturais e artÃ­sticas</label>
						</div>
						<div>
							<input type="checkbox"> <label>Materiais
								pedagÃ³gicos para a educaÃ§Ã£o do campo</label>
						</div>
						<div>
							<input type="checkbox"> <label>Equipamento para
								amplificaÃ§Ã£o e difusÃ£o de som/Ã¡udio</label>
						</div>
						<div>
							<input type="checkbox"> <label>Materiais para
								prÃ¡tica desportiva e recreaÃ§Ã£o</label>
						</div>
						<div>
							<input type="checkbox"> <label>Conjunto de
								materiais cientÃ­ficos</label>
						</div>
					</div>

					<section class="titulo1"> O projeto polÃ­tico pedagÃ³gico
					ou a proposta pedagÃ³gica da escola (conforme art. 12 da LDB) foi
					atualizada nos Ãºltimos 12 meses atÃ© a data de referÃªncia? </section>
					<div class="alinhamento1">
						<table>
							<tr>
								<td><select>
										<option>-Selecione-</option>
										<option>-Sim-</option>
										<option>-NÃ£o-</option>
								</select></td>
							</tr>
						</table>
					</div>
				</div>
			</div></li>
		<li><input type="radio" name="tabs" class="rd_tab" id="tab6">
			<label for="tab6" class="tab_label">RECURSOS HUMANOS</label>
			<div class="tab-content">
				<div class="divisoria">
					<div class="quadro-3">
						<section class="titulo1"> Total de profissionais que
						atuam nas seguintes funÃ§Ãµes na escola: </section>
						<table style="width: 100%">
							<tr>
								<td>*Auxiliares de secretaria ou auxiliares
									administrativos, atendentes:</td>
								<td><input type="text" size="5"></td>
							</tr>
							<tr>
								<td bgcolor="#DFDFDF">*Auxiliar de serviÃ§os gerais,
									porteiro(a), zelador(a), faxineiro(a), horticultor(a),
									jardineiro(a):</td>
								<td><input type="text" size="5"></td>
							</tr>
							<tr>
								<td>*BibliotecÃ¡rio(a), auxiliar de biblioteca ou
									monitor(a) da sala de leitura:</td>
								<td><input type="text" size="5"></td>
							</tr>
							<tr>
								<td bgcolor="#DFDFDF">*Coordenador(a) de turno/disciplinar:</td>
								<td><input type="text" size="5"></td>
							</tr>
							<tr>
								<td>*Nutricionista:</td>
								<td><input type="text" size="5"></td>
							</tr>
							<tr>
								<td bgcolor="#DFDFDF">*PsicÃ³logo(a) Escolar:</td>
								<td><input type="text" size="5"></td>
							</tr>
							<tr>
								<td>*SecretÃ¡rio(a) escolar:</td>
								<td><input type="text" size="5"></td>
							</tr>
							<tr>
								<td bgcolor="#DFDFDF">*SeguranÃ§as, guarda ou seguranÃ§a
									patrimonial:</td>
								<td><input type="text" size="5"></td>
							</tr>
							<tr>
								<td>*Orientador(a) comunitÃ¡rio(a) ou assistente social:</td>
								<td><input type="text" size="5"></td>
							</tr>
							<tr>
								<td bgcolor="#DFDFDF">*Bombeiro(a) brigadista,
									profissionais de assistÃªncia Ã  saÃºde (urgÃªncia e
									emergÃªncia), Enfermeiro(a), TÃ©cnico(a) de enfermagem e
									socorrista:</td>
								<td><input type="text" size="5"></td>
							</tr>
							<tr>
								<td>*Profissionais de preparaÃ§Ã£o e seguranÃ§a alimentar,
									cozinheiro(a), merendeira e auxiliar de cozinha:</td>
								<td><input type="text" size="5"></td>
							</tr>
							<tr>
								<td bgcolor="#DFDFDF">*Vice-diretor(a) ou diretor(a)
									adjunto(a), profissionais responsÃ¡veis pela gestÃ£o
									administrativa e/ou financeira:</td>
								<td><input type="text" size="5"></td>
							</tr>
							<tr>
								<td>*TÃ©cnicos(as), monitores(as), supervisores(as) ou
									auxiliares de laboratÃ³rio(s), de apoio a tecnologias
									educacionais multimeios/multimÃ­dias eletrÃ´nico-digitais:</td>
								<td><input type="text" size="5"></td>
							</tr>
							<tr>
								<td bgcolor="#DFDFDF">*Profissionais de apoio e supervisÃ£o
									pedagÃ³gica: (pedagogo(a), coordenador(a), orientador(a)
									educacional, supervisor(a) escolar e coordenador(a) de Ã¡rea de
									ensino:</td>
								<td><input type="text" size="5"></td>
							</tr>
						</table>
					</div>
				</div>
			</div></li>
		<li><input type="radio" name="tabs" class="rd_tab" id="tab7">
			<label for="tab7" class="tab_label">PNAE / FNDE </label>
			<div class="tab-content">
				<div class="quadro-4">
					<section class="titulo1"> AlimentaÃ§Ã£o escolar: </section>
					<div class="alinhamento1">
						<form>
							<input type="radio" name="gender"> <label>Sim</label><br>
							<input type="radio" name="gender"> <label>NÃ£o</label><br>
						</form>
					</div>
				</div>
			</div></li>
	</ul>
	</nav>

</body>
</html>