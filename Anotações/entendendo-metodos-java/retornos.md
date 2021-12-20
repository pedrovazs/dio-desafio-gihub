## Retornos de métodos
- É uma instrução de interrupção;
- O método executa seu retorno quando:
	- Completa todas suas instruções internas
	- Chega a uma declaração explicita de retorno
	- Lança uma exceção
- O tipo de retorno do método é definido na sua criação e pode
ser um tipo primitivo ou um objeto;
- O tipo de dado do return deve ser compatível com o do método;
- Se o método for sem retorno(void), pode ou não ter um return
para encerrar sua execução.

#### Exemplos:

```Java
public String getMensagem() {
	return "Olá, Mundo!";
}

// Erro
public int soma(int a + int b) {
	return "Somou!";
}

public void setValor(double valor) {
	this.valor = valor;
}
```
