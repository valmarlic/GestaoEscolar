<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <title>Novo aluno - Dados de Endereço</title>
    
   <link rel="stylesheet" href="styles.css">
            
</head>
 <body>
   <div id="id_001"><!-- Conteiner de Conteúdo -->
        	
		  <div id="id_002">Novo aluno - Dados de Endereço<!-- Barra de endereço --></div>
		

    <form method="post" action="/gestaoEscolar/servGuardarEnderecoAluno">
	
    
          <span class="cls_001">CEP</span>  
          <span class="cep_asterico">*</span>   
          <span class="cls_002 "><input type="text" id="cep"  name="cepEnderecoEstudante" value="${fornecedor.cepEnderecoEstudante}" /> </span>
          <span class="cls_003">Complemento:</span>
          <span class="cls_004 "><input type="text"  name="complementoEnderecoEstudante" value="${fornecedor.complementoEnderecoEstudante}"/> </span>
          <span class="cls_005">UF:</span>
          <span class="cls_006 ">
            <select name="codigoIbgeUfNascimentoEstudante"  value="${fornecedor.codigoIbgeUfNascimentoEstudante}">
             <option nonce="UF">
					<option value="12">Acre</option>
					<option value="27">Alagoas</option>
					<option value="16">Amapá</option>
					<option value="13">Amazonas</option>
					<option value="29">Bahia</option>
					<option value="23">Ceará</option>
					<option value="53">Distrito Federal</option>
					<option value="32">Espírito Santo</option>
					<option value="52">Goiás</option>
					<option value="21">Maranhão</option>
					<option value="51">Mato Grosso</option>
					<option value="50">Mato Grosso do Sul</option>
					<option value="31">Minas Gerais</option>
					<option value="15">Pará</option>
					<option value="25">Paraíba</option>
					<option value="41">Paraná</option>
					<option value="26">Pernambuco</option>
					<option value="22">Piauí</option>
					<option value="33">Rio de Janeiro</option>
					<option value="24">Rio Grande do Norte</option>
					<option value="43">Rio Grande do Sul</option>
					<option value="11">Rondônia</option>
					<option value="14">Roraima</option>
					<option value="42">Santa Catarina</option>
					<option value="35">São Paulo</option>
					<option value="28">Sergipe</option>
					<option value="17">Tocantins</option>
					</option>
            </select>
          </span>
            <span class="cls_007">Zona Residencial:</span>
            <span class="cls_008">
              <select>
                <option name="codigoInepEstudante" value="${fornecedor.codigoInepEstudante}"> Selecione
                    <option value="R">
                      Zona Rural
                    </option>
                    <option value="U">
                      Zona Urbana
                    </option>
                </option>
              </select>
            </span>
            <span class="cls_009">Número:</span> 
            <span class="numero_asterico">*</span> 
            <span class="cls_010 "><input type="text" id="numero" name="codigoInepEstudante" value="${fornecedor.codigoInepEstudante}" /></span>
            <span class="cls_011">Bairro:</span>  
            <span class="bairro_asterico">*</span> 
            <span class="cls_012 "><input type="text" id="bairro" name="codigoInepEstudante" value="${fornecedor.codigoInepEstudante}" /></span>
            <span class="cls_013">Município:</span> 
            <span class="cls_014"><input type="text" name="codigoInepEstudante" value="${fornecedor.codigoInepEstudante}"/></span>
            <span class="cls_015">Nacionalidade:</span> 
            <span class="cls_016">
              <select name="codigoInepEstudante" value="${fornecedor.codigoInepEstudante}">
                <option value="Selecione"> Selecione
                    <option>
                      BR
                    </option>
                    <option>
                      EUA
                    </option>
                </option>
              </select>
            </span>
            <span class="cls_017">E-mail do aluno:</span> 
            <span class="cls_018"><input type="text" name="codigoInepEstudante" value="${fornecedor.codigoInepEstudante}" /> </span>
            <span class="cls_019">Município de nascimento:</span> 
            <span class="cls_020">
              <select name="codigoInepEstudante" value="${fornecedor.codigoInepEstudante}">
                <option value="Selecione"> Selecione
                    <option>
                      São Luis
                    </option>
                    <option>
                      São José de Ribamar
                    </option>
                </option>
              </select>
            </span>
            <span class="cls_021">Logradouro:</span> 
            <span class="cls_022"><input type="text" name="codigoInepEstudante" value="${fornecedor.codigoInepEstudante}"/> </span>
            <span class="cls_023">Distrito:</span> 
            <span class="cls_024"><input type="text" name="codigoInepEstudante" value="${fornecedor.codigoInepEstudante}" /></span>
            <span class="cls_025"> Localização diferenciada de residência:</span> 

            <span class="cls_026">
              <select name="codigoInepEstudante" value="${fornecedor.codigoInepEstudante}">
                <option value="Selecione"> Selecione
                    <option>
                      1-Terra indígena;
                    </option>
                    <option>
                      2-Área de assentamento;
                    </option>
                    <option>
                      3-Área remanescente de
                      quilombos;
                    </option>
                    <option>
                      4-Não está em área de 
                      localização diferenciada
                    </option>
                </option>
              </select>
            </span>
           <div id="e295_1943"><!-- Barra de Rodapé -->
						
				<span class="cls_29"><input type="submit" class="cls_027" value="Salvar" /> </span>	
						 
 				<span class="cls_29"><input type="submit" class="cls_028" value="Cancelar" onclick="" /></span>
 				
 		</div>
 		</form>   
		</div>
		<script type="text/javascript" src="confirma.js"></script>
   </body>
</html>