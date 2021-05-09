<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" content="htmlGenerator">
<link rel="stylesheet" href="stylesNovoAluno.css">
<title>Novo aluno - Identificação</title>
</head>
<body>
	<div id="e295_1880">
		<!-- Conteiner inerno -->
		<div id="e295_1940">
			<!-- Barra Identificação -->
			<span id="e295_1962">Novo aluno - Identificação</span>
		</div>
		<form method="post" action="/gestaoEscolar/servIndetificacaoAluno">
			<input type="hidden" name="acao11" value="CREATE11" />
			
			<div id="e295_1941">
				<!-- Quadro de Conteúdo -->

				<div id="e295_1932">
					  <span class="cls_001">CEP</span>  
          <span class="cep_asterico">*</span>   
          <span><input type="text" id="cep"  name="cepEnderecoEstudante" value="${fornecedor.cepEnderecoEstudante}" /> </span>
					<span >Código INEP</span> <input id="e295_1934"
					name="codigoInepEstudante"
					value="${fornecedor.codigoInepEstudante}" /> <span
					id="e295_1932CPF">CPF</span> <input type="numero" id="e295_1934CPF"
					name="cpfEstudante" value="${fornecedor.cpfEstudante}" /> <span
					id="e295_1932NIS">NIS</span> <input id="e295_1934NIS"
					name="numeroNisEstudante" value="${fornecedor.numeroNisEstudante}" />
				</div>
				
				<span id="e295_1933">Nome</span> <span id="e295_1904"> <!-- Nome -->
					*
				</span> <input id="e295_1931" name="nomeEstudante"
					value="${fornecedor.nomeEstudante}">
				<!-- Caixa de texto Nome -->
				</input> <span id="e295_1927">Sexo</span> <span id="e295_1902"> <!-- Sexo -->
					*
				</span> <select id="e295_1928" name="sexoEstudante"
					value="${fornecedor.sexoEstudante}">
					<option value="M">Msculino</option>
					<option value="F">Femenino</option>
					<!-- Caixa de Texto input Masculino -->
				</select> <span id="e295_1926">Nome social</span> <input id="e295_1924"
					type="text" name="nomeSocialEstudante"
					value="${fornecedor.nomeSocialEstudante}">
				<!--Input Caixa de Texto de Nome social -->
				</input> <span id="e295_1916">Aluno Gêmeo</span> <input id="e295_1918"
					type="radio" name="indicadorAlunoGemeo" value="S"
					${fornecedor.indicadorAlunoGemeo}>
				<!-- Caixa ChekcBox Sim -->
				</input> <span id="e295_1917">Sim </span> <input id="e295_1920" type="radio"
					name="indicadorAlunoGemeo" value="N"
					${fornecedor.indicadorAlunoGemeo}>
				<!-- Caixa CheckBox Não -->
				</input> <span id="e295_1919">Não </span> <span id="e295_1921">Data
					de nascimento</span> <span id="e295_1901"> <!-- Data de Nascimento -->*
				</span> <input id="e295_1922" name="dataNascimentoEstudante" type="date"
					value="${fornecedor.dataNascimentoEstudante}">
				<!-- Caixa de Texto Data de Nascimento -->
				</input>


				<div id="e295_1927_HIST">
					Histórico Escolar <input type="radio" name="campo-radio2"
						value="S" ${fornecedor.codInepEscola}>
					<!-- Caixa ChekcBox Sim -->
					</input> <span>Sim </span> <input type="radio" name="campo-radio2"
						value="N" ${fornecedor.codInepEscola}>
					<!-- Caixa ChekcBox Não -->
					</input> <span>Não </span>

				</div>

				<div id="e295_1927ATVCOMPL">
					Atividade Complementar <input type="radio" name="campo-radio3"
						value="S" ${fornecedor.codInepEscola}>
					<!-- Caixa ChekcBox Sim -->
					</input> <span>Sim </span> <input type="radio" name="campo-radio3"
						value="N" ${fornecedor.codInepEscola}>
					<!-- Caixa ChekcBox Não -->
					</input> <span>Não </span>
				</div>

				<span id="e295_1905">UF de nascimento</span> <span id="e295_1903">
					<!-- UF de Nascimento -->*
				</span> <select id="e295_1906" name="codigoIbgeUfNascimentoEstudante"
					value="${fornecedor.codigoIbgeUfNascimentoEstudante}">
					<option nonce="UF">
					<option value="12" ${fornecedor.codigoIbgeUfNascimentoEstudante}>Acre</option>
					<option value="27" ${fornecedor.codigoIbgeUfNascimentoEstudante}>Alagoas</option>
					<option value="16" ${fornecedor.codigoIbgeUfNascimentoEstudante}>Amapá</option>
					<option value="13" ${fornecedor.codigoIbgeUfNascimentoEstudante}>Amazonas</option>
					<option value="29" ${fornecedor.codigoIbgeUfNascimentoEstudante}>Bahia</option>
					<option value="23" ${fornecedor.codigoIbgeUfNascimentoEstudante}>Ceará</option>
					<option value="53" ${fornecedor.codigoIbgeUfNascimentoEstudante}>Distrito Federal</option>
					<option value="32" ${fornecedor.codigoIbgeUfNascimentoEstudante}>Espírito Santo</option>
					<option value="52" ${fornecedor.codigoIbgeUfNascimentoEstudante}>Goiás</option>
					<option value="21" ${fornecedor.codigoIbgeUfNascimentoEstudante}>Maranhão</option>
					<option value="51" ${fornecedor.codigoIbgeUfNascimentoEstudante}>Mato Grosso</option>
					<option value="50" ${fornecedor.codigoIbgeUfNascimentoEstudante}>Mato Grosso do Sul</option>
					<option value="31" ${fornecedor.codigoIbgeUfNascimentoEstudante}>Minas Gerais</option>
					<option value="15" ${fornecedor.codigoIbgeUfNascimentoEstudante}>Pará</option>
					<option value="25" ${fornecedor.codigoIbgeUfNascimentoEstudante}>Paraíba</option>
					<option value="41" ${fornecedor.codigoIbgeUfNascimentoEstudante}>Paraná</option>
					<option value="26" ${fornecedor.codigoIbgeUfNascimentoEstudante}>Pernambuco</option>
					<option value="22" ${fornecedor.codigoIbgeUfNascimentoEstudante}>Piauí</option>
					<option value="33" ${fornecedor.codigoIbgeUfNascimentoEstudante}>Rio de Janeiro</option>
					<option value="24" ${fornecedor.codigoIbgeUfNascimentoEstudante}>Rio Grande do Norte</option>
					<option value="43" ${fornecedor.codigoIbgeUfNascimentoEstudante}>Rio Grande do Sul</option>
					<option value="11" ${fornecedor.codigoIbgeUfNascimentoEstudante}>Rondônia</option>
					<option value="14" ${fornecedor.codigoIbgeUfNascimentoEstudante}>Roraima</option>
					<option value="42" ${fornecedor.codigoIbgeUfNascimentoEstudante}>Santa Catarina</option>
					<option value="35" ${fornecedor.codigoIbgeUfNascimentoEstudante}>São Paulo</option>
					<option value="28" ${fornecedor.codigoIbgeUfNascimentoEstudante}>Sergipe</option>
					<option value="17" ${fornecedor.codigoIbgeUfNascimentoEstudante}>Tocantins</option>
					</option>

				</select> <span id="e295_1942">Município de nascimento</span> <input
					type="text" id="e295_1909"
					name="codigoIbgeMunicipioNascimentoEstudante"
					value="${fornecedor.codigoIbgeMunicipioNascimentoEstudante}" />

				<div id="e295_1943">
					<!-- Barra de Rodapé -->


					</span> <span class="cls_29">
					 <input type="submit" class="cls_028"
						value="Enviar" onclick="redirecioneComHistorico()"></input></span>

				</div>

			</div>

		</form>
	</div>
	<script type="text/javascript" src="confirma.js"></script>


</body>
</html>