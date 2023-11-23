function Tabuada() {

    var numero = parseInt(document.getElementById("numero").value);


   
    if (isNaN(numero)) {
        alert("Por favor, insira números válidos.");
    } else {
        document.write("<h2>Tabuada do " + numero + ":</h2>");
        for (var i = 1; i <= 10; i++) {
         
            var resultado = numero * i;
            document.write(numero + "x" + i + "=" + resultado + "<br>");

        }
    }
}