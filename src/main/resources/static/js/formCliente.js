var buttonAdicionaCliente = document.querySelector("#buttonAdicionaCliente");
buttonAdicionaCliente.addEventListener('click', function (event) {
    event.preventDefault();
    var formularioPreechido = document.querySelector("#formAdicionaCliente");
    var cliente = obterDadosDoForm(formularioPreechido);
    addDadosNaTabela(cliente);
}, false);

function obterDadosDoForm(formularioPreechido) {
    var cliente = {
        nome: formularioPreechido.nome.value,
        cpf: formularioPreechido.cpf.value,
        dataNasc: formularioPreechido.dataNasc.value,
        status: 1,
    }
    return cliente;
}
function addDadosNaTabela(cliente) {
    var clienteTr = criarTr(cliente)
    var tabela = document.querySelector("#tabelaDeClientes");
    tabela.appendChild(clienteTr)

}
function criarTr(cliente) {
    var tr = document.createElement("tr");
    tr.classList.add("cliente")
    tr.appendChild(criarTd(cliente.nome))
    tr.appendChild(criarTd(cliente.cpf))
    tr.appendChild(criarTd(cliente.dataNasc))
    tr.appendChild(criarTd(cliente.status))
    return tr;

}
function criarTd(dadoRecebido) {
    var td = document.createElement("td");
    td.textContent = dadoRecebido;
    return td;
}
 function validarCpf(cpf){

 if (cpf.validity.patternMismatch) {
   cpf.setCustomValidity("Deveria ter apenas números aqui =) ");
   btnEnviar.disabled = true;
   } else {
     cpf.setCustomValidity("");
     btnEnviar.disabled = false;
   }
}

