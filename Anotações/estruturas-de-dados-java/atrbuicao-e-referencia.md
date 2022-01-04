## Atribuição e Referência

- As atribuições em Java são cópias de valor, sempre;
- Com tipo primitivo, copiamos o valor em memória, ou seja,
quando falamos que a variável a é igual a b estamos copiando
o valor de a e colocando em b;
- Com objetos, copiamos o valor de referência em memória,
sem duplicar o objeto, assim se tivermos um objeto a e dizer
que o objeto b é igual ao objeto a, estamos referênciando o
endereço de a para b. Se houver mudança no objeto a o objeto b
também irá mudar pois ele está com a referência em a, sendo o
mesmo objeto.