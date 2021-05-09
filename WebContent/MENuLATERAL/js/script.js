 
$('.escola').click(function(){
	$('.menuLateral ul .itensEscola').toggleClass('mostra');

});

$('.escola_Cadastro').click(function(){
	$('.menuLateral ul .itensEscola_Cadastro').toggleClass('mostra');

});
$('.aluno').click(function(){
	$('.menuLateral ul .itensAluno').toggleClass('mostra');

});

$('.aluno_Cadastro').click(function(){
	$('.menuLateral ul .itensAluno_Cadastro').toggleClass('mostra');

});

$('.funcionario').click(function(){
	$('.menuLateral ul .itensFuncionario').toggleClass('mostra');

});

$('.func_cadastro').click(function(){
	$('.menuLateral ul .itensFunc_Cadastro').toggleClass('mostra');

});


function abreLink(){
	window.open('../novoAluno/guiasNovoAluno.html');
}

$('.itensEscola').click(function(){
	$('.menuLateral ul .itensEscola li a').toggleClass('novo');

});
