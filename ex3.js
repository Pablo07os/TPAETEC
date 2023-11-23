function Aniversario(){
    var numero = parseInt(document.getElementById("numero").value);
    var mes = parseInt(document.getElementById("numero").value);


   
    if (isNaN(numero)) {
        alert("Por favor, insira números válidos.");
    } else {
        
        switch (mes) {
            case 1:
              mes = alert ("O mês do seu aniversário é Janeiro")
              break;
            case 2:
              mes = alert ("O mês do seu aniversário é Fevereiro")
              break;
            case 3:
              mes = alert ("O mês do seu aniversário é Março")
              break;
            case 4:
              mes  = alert ("O mês do seu aniversário é Abril")
              break;
            case 5:
              mes = alert ("O mês do seu aniversário é Maio")
              break;
            case 6:
                mes = alert ("O mês do seu aniversário é Junho")
              break;
            case 7:
              mes = alert ("O mês do seu aniversário é Julho")
              break;
            case 8:
              mes  = alert ("O mês do seu aniversário é Agosto")
                break;
              case 9:
                mes = alert ("O mês do seu aniversário é Setembro")
                break;
              case 10:
                  mes = alert ("O mês do seu aniversário é Outubro")
                break;
              case 11:
                mes = alert ("O mês do seu aniversário é Novembro")
                break;
            case 12: alert ("O mês do seu aniversário é Dezembro")
            default:
              mes = alert ("Mês Inexistente")
          }
         }
    }

