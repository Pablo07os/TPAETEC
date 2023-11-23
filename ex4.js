function Potencia() {
    
    var base = parseInt(document.getElementById("base").value);
    var expoente = parseInt(document.getElementById("expoente").value);

    if (isNaN (base) || isNaN (expoente)) {
        alert("Por favor, insira números válidos.");
    } else {
        resultado = 1; 
        document.write("<h2> Potência de " + base + ":</h2>");
        for( var i = expoente; i>0; i--)
        resultado = resultado * base;
            document.write(base + " elevado a " + expoente + " é = " + resultado + "<br>");

        }
    }


