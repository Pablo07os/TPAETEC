function Fibonacci() {
    var n = parseInt(document.getElementById("numero").value);

    var atual = 1;  
    var a = 0; 
    var b = 1;  
    
    if (isNaN(n)) {
        alert("Por favor, insira números válidos.");
    } else {
    document.write("<h2>A sequência com " + n + " números é essa:</h2>");
    document.write(atual+ " ");  
    for(i=1; i<n; i++){

    
    atual = a + b; 
    a = b;
    b = atual;
    
    

    document.write(atual+ " "); 
    } 
 
    }
}
    
