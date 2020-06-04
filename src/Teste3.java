

public class Teste3 {

	public static void main(String[] args) {
		OperacaoAritmetica soma = (x, y) -> {return x + y;};
		OperacaoAritmetica multiplicacao = (x, y) -> {return x * y;};
		fazOperacao (soma);
		fazOperacao(multiplicacao);
		fazOperacao ( (t, s) -> t / s);
	}
	
	public static void fazOperacao (OperacaoAritmetica op) {
		System.out.println(op.calcular(8, 2));
	}

}

interface OperacaoAritmetica{
	public int calcular (int a, int b);
}
