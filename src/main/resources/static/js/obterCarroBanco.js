		window.onload = function(){
			
			obterDadosBanco();

		}

		function obterDadosBanco(){

				$.ajax({
					url : "http://localhost:8080/restCarros", // getContextPath()???
					type: "get",
					success: function(response) {

						var carrosRest = response._embedded.carroes;
				
						carrosRest.forEach(function(item){
						addDadosNaTabela(item);
						});

					},
					error: function(e) {
						// ERROR 
					}
				});

			}
