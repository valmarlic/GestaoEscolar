/**
 * 
 */



function validarCampos(frm){
	var erros = 0;
	var mgs = '';
	var Nome = '';
	var dtNascimento = '';
	var UF = '';
	var sexo = '';
	
	if(frm.Nome.value == ''){
		mgs += 'Informe o nome.\n';
		erros++;
		
	}

	if(frm.dtNascimento.value == ''){
		mgs += 'Informe a Data de Nascimento.\n';
		erros++;
	}		

	if(frm.UF.value == ''){
		mgs += 'Informe o UF do Estado.\n';
		erros++;
	}

	if(frm.sexo.value == ''){
		mgs += 'Informe o Sexo.\n';
		erros++;
	}
	
	
	if(erros>0){
		alert(mgs);
		return false;
	}	

	frm.submit();
}
