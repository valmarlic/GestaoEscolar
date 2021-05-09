/**
 * 
 */



function validarCampos(frm){
	var erros = 0;
	var mgs = '';
	
	
	if(frm.cep.value == '')
		mgs += 'Informe o CEP.\n';
		erros++;
		
	

	if(frm.numero.value == '')
		mgs += 'Informe o número.\n';
		erros++;
	

	if(frm.bairro.value == '')
		mgs += 'Informe o  bairro.\n';
		erros++;

	if(erros>0)
		alert(mgs);
		return false;
		

	frm.submit();
}

function confirma(){
	confirm("Deseja Salvar as Alteraçoes")
	
}