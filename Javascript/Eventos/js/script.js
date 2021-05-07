document.getElementById("but").onclick = function(){
    alert("Olá!")
};

document.getElementById("fun").onclick = function () {
    document.body.style.backgroundColor = "green"    
};

document.getElementById("img").onmouseover = function () {
    console.log("Estou vendo a imagem!")
};

document.getElementById("img2").addEventListener("click", function (event) {
 console.log("Estou clicando na imagem!")   
 console.log(event.clientX, event.clientY)
});

function red (event){
    this.style.backgroundColor = "red"
}

document.body.addEventListener("click", red);

document.body.removeEventListener("click", red);

/*

Eventos


Criar um formulário básico com um action que redirecione para www.google.com.br. Usando JavaScript, fazer com que, quando o usuário clicar em Enviar, o formulário não seja enviado, mas sim que seja exibido um alert dizendo “Não é possível enviar”. 

Fazer com que o addEventListener criado na imagem imprima em linha de comando a localização do mouse em x e y.

let imagem = document.getElementById("img");

imagem.onclick = function() {msg()}
function msg() {
    alert("Estou clicando na imagem!");
}
document.getElementById("fundo").addEventListener("click", function ()) {
    document.body.style.backgroundColor = "green";
}
let fundo = document.getElementById("fundo");

fundo.onclick = function() {alterarFundo()}
function alterarFundo() {
    fundo.style.backgroundColor = "green";
}
document.getElementById("img").addEventListener("click", function () {
    alert("Estou clicando na imagem");
)}
*/