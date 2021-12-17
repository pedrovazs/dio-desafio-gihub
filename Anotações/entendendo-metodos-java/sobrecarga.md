## Sobrecarga (Overload) de métodos
- A sobrecarga de método é um coneito utilizado no polimorfismo.
É a capacidade de definir métodos para diferentes contextos,
mas mantendo o seu nome e mudando seus parâmetros.

#### Exemplo:

```Java
public class Calculadora {
	public int calcula(int a, int b){
		return a + b;	
	}
	public double calcula(double a, double b){
		return a + b;
	}
	public String calcula(String a, String b){
		return a + b;
	}

}
```
- A classe calculadora tem três métodos com o mesmo nome e
fazendo a mesma ação, mas os seus parâmetros são diferentes.
