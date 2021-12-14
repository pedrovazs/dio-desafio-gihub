## Conceitos de métodos
- Método é uma porção de código ou subrotina disponibilizada por uma classe  que executa
algo quando a mesma é requisitada. São responsáveis por realizar e definir um
determinado comportamento.

## Definindo um método
- Um método é definindo usando a seguinte sintaxe:

```Java
[visibilidade] tipo_retorno identificador ([argumentos]) {

//Corpo do método

}
```
- A visibilidade pode ser `public`, `protected` ou `private`.
- O tipo do retorno pode ser 'primitivo' ou uma 'classe' ou uma 'interface'.
- O identificador é o nome dado ao método.
- Um método pode ou não receber argumentos. Esses argumentos ficam dentro dos parênteses depois do seu nome.
- O corpo do método são as instruções que receberá para executar sua função.

#### Exemplos:
~~~Java
public static void main(String[] args) {...};

private int somar(int a, int b) return a + b;

protected String nomeCompleto(String nome, String sobrenome) {
	return "Nome completo: " + nome + sobrenome
}
~~~

## Utilização
- Sua chamada pode ser feito usando classes ou objetos.

#### Exemplos:
~~~Java
// Genérico
nome_da_classe.nome_do_metodo();

// Chamando o método getEmail() através do objeto usuario
usuario.getEmail();

// Chamando o método sqrt() através da classe Math
Math.sqrt(4);
~~~

## Boas práticas na criação de métodos
- Os nomes devem ser descritivos, mas curtos;
- A notação utilizada é o camelCase: verificarEndereco(), buscarIdade()...;
- O método deve possuir, no máximo, entre 80 a 120 linhas (quanto mais linhas, mais difícil seu entendimento);
- Evite lista de parâmetros longas;
- Visibilidade adequada.

***

## Links Úteis
- [Convenções de nomenclatura](https://www.javatpoint.com/pt/conven%C3%A7%C3%B5es-de-nomenclatura-java)
