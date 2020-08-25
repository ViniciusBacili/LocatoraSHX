window.onload = function(){
			
			obterDadosBanco();

		}

		function obterDadosBanco(){

				$.ajax({
					url : "http://localhost:8080/restClientes", // getContextPath()???
					type: "get",
					success: function(response) {

						var clientesRest = response._embedded.clientes;
				
						clientesRest.forEach(function(item){
						addDadosNaTabela(item);
						});

					},
					error: function(e) {
						// ERROR 
					}
				});

			}