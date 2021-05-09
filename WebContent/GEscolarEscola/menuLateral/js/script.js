 
$('.escola').click(function(){
	$('.menuLateral ul .itensEscola').toggleClass('mostra');

});
$('.aluno').click(function(){
	$('.menuLateral ul .itensAluno').toggleClass('mostra');

});
$('.funcionario').click(function(){
	$('.menuLateral ul .itensFuncionario').toggleClass('mostra');

});
function abreLink(){
	window.open('../novoAluno/guiasNovoAluno.html');
}






