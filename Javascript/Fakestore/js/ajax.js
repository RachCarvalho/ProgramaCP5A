const divprodt = document.getElementById("produtos");
const preencform = document.getElementById("id-produto");
const prodtDetail = document.getElementById("prodtDetail")

document.addEventListener("DOMContentLoaded", function() {
    fetch("https://fakestoreapi.com/products/")
    .then(response => response.json())
    .then(response => {
        const produtos = response;
        for(var i=0; i<produtos.length; i++){
            divprodt.innerHTML +=`<div class="prev"><h3>${produtos[i].title}</h3>$ ${produtos[i].price}<div>`
        }
        produtos.forEach (produto => {
            preencform.innerHTML +=`<option value="${produto.id}">${produto.title}</option>`
            })
        
        console.log(produtos);
  });
});

preencform.addEventListener('change', event => {
     let detalhe = event.target.value;
     console.log(detalhe)
      fetch("https://fakestoreapi.com/products/" + detalhe)
      .then(response => response.json())
      .then(response => {
        const selectProdt = response;
        console.log(selectProdt);
        prodtDetail.innerHTML +=`<card>
          <h4>${selectProdt.title}</h4>
          <p>${selectProdt.description}</p>
          <p>${selectProdt.category}</p>
          $ ${selectProdt.price}
          <img src=${selectProdt.image}>
          <button id="btnSelect">Selecionar</button>
          </card>`
       
      })
});

document.getElementById("btn").addEventListener("click", displayForm);
function displayForm() {
    document.getElementById("form").style.display = 'block';
}