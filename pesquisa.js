//function addCard(string, string, string){
var pai = document.body;
var cardEl = document.createElement('div');
var img = document.createElement('img');
img.src = 'imagens/leme.png';
//var nome= document.creatElement('p');
 

///nome.innerHTML = 'Doris';
//var  cpf = document.creatElement('p');
//cpf.value = "oi";
cardEl.textContent = "Olá, cumprimentos!";
//cardEl.appendChild(nome);
cardEl.appendChild(img);
//cardEl.appendChild(cpf);
//cardEl.appendChild(nome);
pai.appendChild(cardEl);

//}
