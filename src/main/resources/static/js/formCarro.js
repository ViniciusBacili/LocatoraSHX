var buttonAdicionaCarro = document.querySelector("#buttonAdicionaCarro");
buttonAdicionaCarro.addEventListener('click', function (event) {
    event.preventDefault();
    var formularioPreechido = document.querySelector("#formAdicionaCarro");
    var carro = obterDadosDoForm(formularioPreechido);
    addDadosNaTabela(carro);
}, false);

function obterDadosDoForm(formularioPreechido) {
    var carro = {
		marca:formularioPreechido.marca.value,
        nome: formularioPreechido.nome.value,
        dataAno: formularioPreechido.dataAno.value,
		dataModelo: formularioPreechido.dataModelo.value,
		combustivel: formularioPreechido.combustivel.value,
		diaria: formularioPreechido.diaria.value,
        status: 1,
    }
    return carro;
}
function addDadosNaTabela(carro) {
    var carroTr = criarTr(carro)
    var tabela = document.querySelector("#tabelaDeCarros");
    tabela.appendChild(carroTr)

}
function criarTr(carro) {
    var tr = document.createElement("tr");
    tr.classList.add("carro")
    tr.appendChild(criarTd(carro.marca))
    tr.appendChild(criarTd(carro.nome))
    tr.appendChild(criarTd(carro.dataAno))
	tr.appendChild(criarTd(carro.dataModelo))
	tr.appendChild(criarTd(carro.combustivel))
	tr.appendChild(criarTd(carro.diaria))
    tr.appendChild(criarTd(carro.status))
    return tr;

}
function criarTd(dadoRecebido) {
    var td = document.createElement("td");
    td.textContent = dadoRecebido;
    return td;
}
 function validarAno(ano){

 if (ano.validity.patternMismatch) {
   ano.setCustomValidity("Deveria ter apenas números aqui =)");
   btnEnviar.disabled = true;
   } else {
     ano.setCustomValidity("");
     btnEnviar.disabled = false;
   }
}
botaoAlugar.addEventListener('click', function(){
            var tr = this.parentNode;       

        for(var i =0; i< tr.children.length -2; i++){
                var td = tr.children[i];
            if(td.children[0].tagName = 'textarea')
            td.children[0].disabled = false;
        }
    });
